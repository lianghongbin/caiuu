(function (namespace, win, undef) {

    var doc = win.document;

    var F = {
        byClass: function (name, content, tag) {
            var arr = [], nodes = (content || doc).getElementsByTagName((tag || '*')),
                len = nodes.length, pattern = new RegExp("(\\s|^)" + name + "($|\\s)"), i = 0;
            for (; i < len; i++) pattern.test(nodes[i].className) && arr.push(nodes[i]);
            return arr;
        },
        hasClass: function (elem, name) {
            var className = ' ' + name + ' ';
            if ((' ' + elem.className + ' ').replace(/[\n\t]/g, ' ').indexOf(className) > -1) return true;
            return false;
        },
        addClass: function (elem, name) {
            if (elem.length) {
                for (var i = 0, len = elem.length; i < len; i++) {
                    !this.hasClass(elem[i], name) && (elem[i].className += (elem[i].className ? ' ' : '') + name);
                }
            }
            else !this.hasClass(elem, name) && (elem.className += (elem.className ? ' ' : '') + name);
        },
        removeClass: function (elem, name) {
            if (elem.length) {
                for (var i = 0, len = elem.length; i < len; i++) {
                    this.hasClass(elem[i], name) && (elem[i].className = elem[i].className.replace(name, ''));
                }
            }
            else this.hasClass(elem, name) && (elem.className = elem.className.replace(name, ''));
        },
        withoutChildFunction: function (func) {
            return function (e) {
                var parent = e.relatedTarget;
                while (parent != this && parent) {
                    try {
                        parent = parent.parentNode;
                    } 
                    catch (e) {
                        break;
                    }
                }
                if (parent != this)
                    func(e); 
            };
        },
        getCoords: function (elem) {
            var box = elem.getBoundingClientRect(),
            doc = elem.ownerDocument,
            body = doc.body,
            html = doc.documentElement,
            clientTop = html.clientTop || body.clientTop || 0,
            clientLeft = html.clientLeft || body.clientLeft || 0,
            top = box.top + (self.pageYOffset || html.scrollTop || body.scrollTop) - clientTop,
            left = box.left + (self.pageXOffset || html.scrollLeft || body.scrollLeft) - clientLeft
            return { 'top': top, 'left': left };
        },
        addEvent: function (elem, type, fn) {
            if (elem.addEventListener) {
                if (type === 'mouseenter')
                    elem.addEventListener('mouseover', this.withoutChildFunction(fn), false);
                else if (type === 'mouseleave')
                    elem.addEventListener('mouseout', this.withoutChildFunction(fn), false);
                else
                    elem.addEventListener(type, fn, false);
            }
            else {
                elem.attachEvent('on' + type, fn);
            }
        },
        removeEvent: function (elem, type, fn) {
            elem.removeEventListener ? elem.removeEventListener(type, fn, false) : elem.detachEvent('on' + type, fn);
        },

        getChildNodes: function () {
            var node = new Array(),
                elem = typeof arguments[0] === 'string' ? doc.getElementById(arguments[0]) : arguments[0];
            if (arguments.length == 1) {   
                var temp = elem.childNodes;
                for (var i = 0; i < temp.length; i++) {
                    if (temp[i].nodeType == 1 && temp[i].tagName) {   
                        node.push(temp[i]);   
                    }
                }
                return node;    
            }
            else if (arguments.length == 2) {     
                return elem.getElementsByTagName(arguments[1]);
            }
        },
        extend: function (desc, source) {
            for (key in source) desc[key] = source[key];
            return desc;
        },
        bind: function (obj, fn, parame) {
            return function () {
                return fn.apply(obj, [].concat(arguments).concat(parame));
            };
        }
    };

    /*  简易选项卡，ID命名规则： 标题为：tab ，那么内容列表的ID为 tab_0,tab_1,tab_2,tab_3....
     *  @param {String} 标题ID
     *  @param {Number} 初始索引，从0开始
     *  @param {String} 事件类型，mouse,click ,默认 click
     *  @param {Number} 延迟时间
     *  @param {Function} 激活后的回调函数
     *  @param {String} 选项卡标签，默认 li
     *  @param {String} 激活样式名称，默认 current
     */
    F.tab = function (id, index, type, sleep, onactive, tag, active) {
        var that = this,
            obj = doc.getElementById(id),
            list = obj.getElementsByTagName(tag || 'li'),
            len = list.length,
            timer, temp;

        active = active === undef ? 'current' : active;

        var set = function (n) {
            for (var i = 0; i < len; i++) {
                temp = doc.getElementById(id + '_' + i);
                if (i == n) {
                    that.addClass(list[i], active);
                    temp && (temp.style.display = 'block');
                }
                else {
                    that.removeClass(list[i], active);
                    temp && (temp.style.display = 'none');
                }
            }
            onactive && onactive(n);
        },
        addEvent = function (obj, n) {
            switch (type) {
                case 'mouse':
                    that.addEvent(obj, 'mouseover', function () {
                        timer = setTimeout(function () {
                            set(n);
                        }, (sleep || 0));
                    });
                    that.addEvent(obj, 'mouseout', function () { timer && clearTimeout(timer); });
                    break;
                case 'click':
                default:
                    that.addEvent(obj, 'click', function () { set(n); });
                    break;
            }
        },
        init = function () {
            for (var i = 0; i < len; i++) addEvent(list[i], i);
            set(index === undef ? 0 : index);
        };

        init();
    };

    if (!win[namespace]) win[namespace] = win.F = F;

})('food', window);

(function (food, win) {

    /*
        new AutoPlay('容器ID', {
            item: 'item',        //内容容器样式名称     默认：item  （可选）
            nav: 'nav',        //导航容器样式名称     默认：nav   （可选）
            text: 'text',      //标题容器样式名称     默认：text  （可选）
            active: 'active',  //导航激活样式名称     默认: active（可选）
            prev: 'prev',        //上一页的按钮样式名称 默认: prev  （可选）
            next: 'next',        //下一页的按钮样式名称 默认: next  （可选）
            sleep: 5000,        //自动播放间隔时间     默认：5000  （可选）
            speed: 600,         //动画持续时间         默认：600   （可选）
            size: 640,          //移动步长（一般为图片宽度）       （必须）
            auto: true,         // 是否自动播放        默认：true  （可选）
            animate: true,     //是否动画效果         默认：true  （可选）
            effect: 'Sine',     //效果['Sine','Bounce']默认: Sine  （可选）
            keyboard: false,    //是否启用快捷键       默认：不启用（可选）
            onBefore: null      //切换之前事件         
        });
     */
    var AutoPlay = function (id) {

        this.opt = food.extend({
            parent: document.getElementById(id),
            item: 'item',
            nav: 'nav',
            child: '',
            text: 'text',
            active: 'active',
            prev: 'prev',
            next: 'next',
            size: 0,
            sleep: 5000,
            speed: 600,
            auto: true,
            animate: true,
            effect: 'Sine',
            keyboard: false,
            onBefore: null,
            onInit: null
        }, arguments[1] || {});

        var opt = this.opt;

        if (!opt.parent) return;

        this.dom = {
            item: food.byClass(opt.item, opt.parent)[0],
            nav: food.byClass(opt.nav, opt.parent)[0],
            navChild: [],
            prev: food.byClass(opt.prev, opt.parent)[0],
            next: food.byClass(opt.next, opt.parent)[0],
            text: food.byClass(opt.text, opt.parent)[0]
        };

        this.opt.curNum = 2;
        this.opt.busy = false;

        this.init();
    };

    AutoPlay.prototype = {
        init: function () {
            var that = this,
                dom = that.dom;

            that.cloned();

            if (that.len < 1) return;

            that.opt.onInit && that.opt.onInit.call(that);

            dom.prev && (dom.prev.onclick = food.bind(that, that.prev));

            dom.next && (dom.next.onclick = food.bind(that, that.next));

            if (dom.nav) {
                var j = 0;
                for (var i = 0, li = dom.nav.getElementsByTagName('li'), len = li.length; i < len; i++) {
                    if (li[i].className.indexOf(that.opt.child) != -1) {
                        (function (i, j) {
                            li[i].onclick = function () {
                                that.goto(j + 1);
                            };
                        })(i, j);
                        j++;
                        dom.navChild.push(li[i]);
                    }
                }
            }
            dom.nav && (dom.nav.onclick = function (e) {
                e = e || win.event;
                var el = e.target || e.srcElement;
                if (el.tagName.toLowerCase() === 'li') that.goto(parseInt(el.innerHTML));
            });

            if (document.hasOwnProperty && document.hasOwnProperty('ontouchstart')) {

                dom.item.ontouchstart = function (e) {
                    that.__touch_isDrag = true;
                    if (e.targetTouches) {
                        that.__touch_startX = e.targetTouches[0].clientX;
                        that.__touch_startY = e.targetTouches[0].clientY;
                    }
                    else {
                        that.__touch_startX = e.clientX;
                        that.__touch_startY = e.clientY;
                    }
                };

                dom.item.ontouchmove = function (e) {
                    if (that.__touch_isDrag) {
                        if (e.targetTouches) {
                            that.__touch_endX = e.targetTouches[0].clientX;
                            that.__touch_endY = e.targetTouches[0].clientY;
                        }
                        else {
                            that.__touch_endX = e.clientX;
                            that.__touch_endY = e.clientY;
                        }

                        if (Math.abs(that.__touch_endX - that.__touch_startX) > Math.abs(that.__touch_endY - that.__touch_startY)) {
                            that.__touch_horizontal = true;
                            e.preventDefault();
                        }
                        else {
                            that.__touch_horizontal = false;
                        }
                    }
                };

                dom.item.ontouchend = function () {
                    if (that.__touch_horizontal) {
                        that.__touch_endX - that.__touch_startX > 0 ? food.bind(that, that.prev)() : food.bind(that, that.next)();
                    }
                    that.__touch_isDrag = false;
                };
            }

            dom.item.onmouseover = function () {
                that.timer && clearTimeout(that.timer);
            };

            dom.item.onmouseout = function () {
                that.timer = setTimeout(food.bind(that, that.play), that.opt.sleep);
            };

            that.opt.keyboard && (document.onkeydown = function (e) {
                e = e || win.event;
                switch (e.keyCode) {
                    case 37:
                        that.prev();
                        break;
                    case 39:
                        that.next();
                        break;
                }
            });

            that.play();
        },
        prev: function () {
            if (!this.opt.busy) {
                this.timer && clearTimeout(this.timer);
                this.opt.busy = true;
                this.opt.curNum = this.opt.curNum - 2;
                this.play();
            }
        },
        next: function () {
            if (!this.opt.busy) {
                this.timer && clearTimeout(this.timer);
                this.opt.busy = true;
                this.play();
            }
        },
        goto: function (num) {
            if (!this.opt.busy) {
                this.timer && clearTimeout(this.timer);
                this.opt.busy = true;
                this.opt.curNum = num + 1;
                this.play();
            }
        },
        cloned: function () {
            var ul = this.dom.item,
                li = food.getChildNodes(ul),
                firstNode, lastNode;

            this.len = li.length;

            if (li.length > 1) {
                firstNode = li[0].cloneNode(true);
                lastNode = li[this.len - 1].cloneNode(true);
                ul.insertBefore(lastNode, li[0]);
                ul.appendChild(firstNode);
                firstNode = lastNode = null;
                ul.style.left = -this.opt.size + 'px';
            }
        },
        play: function () {
            this.set();
            this.opt.onBefore && this.opt.onBefore.call(this, this.opt.curNum - 2);
            this.opt.auto && (this.timer = setTimeout(food.bind(this, this.play), this.opt.sleep));
        },
        set: function () {

            var that = this,
                opt = that.opt,
                dom = that.dom,
                len = that.len,
                li, text,
                i = 0;

            if (opt.curNum > len + 1) {
                dom.item.style.left = '0px';
                opt.curNum = 2;
            }

            if (opt.curNum < 2) {
                dom.item.style.left = -(len + 1) * opt.size + 'px';
                opt.curNum = len + 1;
            }

            if (dom.text) text = dom.text.getElementsByTagName('li');

            for (; i < len; i++) {
                if (opt.curNum - 2 == i) {
                    that.dom.navChild[i] && food.addClass(that.dom.navChild[i], opt.active);
                    text && text[i] && (text[i].style.display = 'block');
                }
                else {
                    that.dom.navChild[i] && food.removeClass(that.dom.navChild[i], opt.active);
                    text && text[i] && (text[i].style.display = 'none');
                }
            }

            if (opt.animate)
                that.doMove(dom.item, -((opt.curNum - 1) * opt.size));
            else
                dom.item.style.left = -((opt.curNum - 1) * opt.size) + 'px';

            opt.curNum++;
        },
        doMove: function (el, to) {
            var that = this,
                t = +new Date(),
                d = that.opt.speed,
                cur = parseInt(el.style.left == '' ? 0 : el.style.left),
                style = el.style,
                effect = AutoPlay.easing[that.opt.effect];

            (function run() {
                var s = +new Date(),
                    step = Math.ceil(effect(s - t, cur, to - cur, d));
                style.left = step + 'px';
                if (s - t >= d) {
                    style.left = to + 'px';
                    that.opt.busy = false;
                    return;
                }
                setTimeout(run, 13);
            }());
        }
    };

    AutoPlay.easing = {
        Sine: function (t, b, c, d) {
            return c * Math.sin(t / d * (Math.PI / 2)) + b;
        },
        Bounce: function (t, b, c, d) {
            if ((t /= d) < (1 / 2.75)) {
                return c * (7.5625 * t * t) + b;
            } else if (t < (2 / 2.75)) {
                return c * (7.5625 * (t -= (1.5 / 2.75)) * t + .75) + b;
            } else if (t < (2.5 / 2.75)) {
                return c * (7.5625 * (t -= (2.25 / 2.75)) * t + .9375) + b;
            } else {
                return c * (7.5625 * (t -= (2.625 / 2.75)) * t + .984375) + b;
            }
        }
    };

    food.AutoPlay = AutoPlay;

})(food, window);

(function (F) {
    function $(id) {
        return document.getElementById(id);
    };

    F.waterfall = function (arg) {
        this.buzy = false;
        this.options = F.extend({}, arg);
        this.options.container = $(this.options.container);
        for (var i = 0; i < this.options.columnIds.length; i++) {
            this.options.columnIds[i] = $(this.options.columnIds[i]);
        }

        this.init();
    };

    F.waterfall.prototype = {
        start: 0,
        init: function () {
            F.addEvent(window, 'scroll', F.bind(this, this.scroll));
        },
        addBox: function (o) {
            if (this.start >= this.options.columnNumber) this.start = 0;
            this.options.columnIds[this.start++].appendChild(o);
        },
        scroll: function () {
            var that = this;
            if (that.buzy) return;
            var bh = Math.max(document.documentElement.scrollHeight, document.body.scrollHeight);
            var st = document.documentElement.scrollTop + document.body.scrollTop + (document.documentElement.clientWidth / 2);
            var result = bh - st;
            if (result < that.options.surplusHeight) {
                that.buzy = true;
                that.options.getDate.call(this);
            }
        }
    };

})(food);