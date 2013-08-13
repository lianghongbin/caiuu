<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
    <meta content="美食之家 " name="keywords"/>
    <meta content="美食之家食谱" name="description"/>
    <title>美食之家</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input,i,a,span');  //EvPNG.fix('包含透明PNG图片的标签'); 多个标签之间用英文逗号隔开。
    </script>
    <![endif]-->
</head>

<body>
<!--min导航-->
<div class="min-cont">
    <div class="min-logo"><a href="#">
        <img src="images/logo.jpg" width="201" height="60"/></a></div>
    <div class="min-right">
        <div class="min-nav">
            您好, 欢迎光临，<a href="#">注册</a><a href="#">登录</a>|<a href="#">加入收藏</a><a href="#">反馈</a>
                <span id="header-more" class="more-span">
                    <a href="#">更多<i class="more-arrow"></i></a>
                    <div class="more-pop">
                        <ul>
                            <li><a href="#">更更多</a></li>
                            <li><a href="#">更更多</a></li>
                            <li><a href="#">更更多</a></li>
                            <li><a href="#">更更多</a></li>
                        </ul>
                    </div>
                </span>
        </div>
        <div class="min-search-wrap">
                <span class="inp-txt-wrap">
                    <input name="" type="text" class="inp-txt" placeholder="输入美食名称搜索"/>
                    <a href="#" class="submit-second-btn">搜美食</a>
                </span>
                <span class="min-weibo-wrap"><span class="icon-weibo1"></span><span class="fl"><a
                        href="#">美食之家网站</a></span><span class="icon-weibo2"></span></span>
        </div>
    </div>
</div>
<!--end min导航-->
<!--导航-->
<div id="nav-fix" class="nav-fix">
    <div class="nav-wrap">
        <div class="nav">
            <ul id="jsddm">
                <li><a href="#" class="home"><i class="icon-home"></i>主页</a></li>
                <li><a href="#">菜系<i class="nav-arrow"></i></a>
                    <ul class="nav-pop">
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                    </ul>
                </li>
                <li><a href="#">人群</a></li>
                <li><a href="#">调理</a></li>
                <li><a href="#">食材</a></li>
                <li><a href="#">家常<i class="nav-arrow"></i></a>
                    <ul class="nav-pop">
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">凉菜</a></li>
                    </ul>
                </li>
                <li><a href="#">专题</a></li>
            </ul>
        </div>
    </div>
</div>
<div id="nav-fix-clone" class="nav-fix" style="display:none;"></div>
<!--end导航-->
<!--star内容-->
<div class="wrap">
<div class="part-a">
    <!--star焦点图-->
    <div id="focus" class="foucs-wrap">
        <ul class="focus-item">
        <#list focuses as focus>
            <li><a href="#"><img src="${focus.bigPhoto}" width="732" height="360"/></a></li>
        </#list>
        </ul>
        <span class="foucs-shadow"></span>
        <ul class="foucs-tx">
        <#list focuses as focus>
            <#if focus_index == 0>
                <li class="foucs-hover"><a href="#"><img src="${focus.smallPhoto}" width="122" height="60"/></a></li>
            <#else>
                <li><a href="#"><img src="${focus.smallPhoto}" width="122" height="60"/></a></li>
            </#if>
        </#list>
        </ul>
    </div>
    <!--end焦点图-->
    <div class="f-r-food">
        <ul class="r-food-up">
            <li class="bor">
                <span class="cup-icon"></span>
                        <span class="cup-r">
                            <p><span class="ftw-red">32312</span><a href="#">道传统美食精选美食频道</a></p>
                        </span>
            </li>
            <li>
                <span class="fork-icon"></span>
                        <span class="cup-r">
                            <p><span class="ftw-red">32312</span><a href="#">道美食作品讲述你的美食故事</a></p>
                        </span>

                <div class="clear"></div>
                <div class="cup-mt12">与 <span class="red">17,969,008</span> 菜友分享你的美食</div>
            </li>
        </ul>
        <div class="project"><a href="#"><i class="pen-icon"></i>发表我的美食作品</a></div>
        <div class="weibo-wrap">
            <span class="weibo-icon"></span>

            <div>跟 <a href="#">美食之家网站</a> 互动</div>
            <div class="mt08"><a href="#" class="btn-weibo"></a></div>
        </div>
    </div>
    <div style="clear:both;"></div>
</div>
<!--star当季食材-->
<div class="part-b">
    <h2>
        <a href="#" class="fr">更多&gt;&gt;</a>
        <ul>
            <li><a href="#" class="cur">当季食材</a></li>
            <li><a href="#">最受关注</a></li>
            <li><a href="#">蔬果类</a></li>
            <li><a href="#">生鲜类</a></li>
            <li><a href="#">五谷</a></li>
            <li><a href="#">维生素</a></li>
            <li><a href="#">食品与饮品</a></li>
        </ul>
    </h2>
    <div id="topFocus" class="scroll-focus-w">
        <span class="btnprev"><a href="javascript:void(0);"></a></span>
        <span class="btnnex"><a href="javascript:void(0);"></a></span>

        <div class="scroll-focus">
            <ul class="scroll-item">
            <li>
            <ul class="ul-pic">
            <#list materials as material>
                <#if material_index%8==0 && (material_index/8)%2!=0>
                </ul>
                </li>
                <li>
                <ul class="ul-pic">
                </#if>
                <li>
                    <a href="#"><img src="${material.pic}" width="117" height="117"/></a>
                    <span class="scroll-pic-shadow"></span>
                    <span class="scroll-pic-tx"><a href="#">${material.name}</a></span>
                </li>

            </#list>
            </ul>
            </li>
            </ul>
        </div>
    </div>
</div>
<!--end当季食材-->
<!--star孕妇食谱-->
<div class="part-a">
    <div class="gravida-wrap">
        <div class="hd">
            <h2><i></i><a href="#">孕妇食谱</a></h2>

            <p class="target fr">
            <#list hyCrowds as crowd>
                <a href="#">${crowd.name}</a>
            </#list>
            </p>
        </div>
        <div class="gravida-pic-wrap">
        <#list cookbooks as cookbook>
            <#if cookbook_index == 0>
                <div class="gravida-pic">
                    <a href="#">
                        <img src="${cookbook.headPic}" width="386" height="240"/></a>
                    <span class="gravida-pop-shadow"></span>
                    <span class="gravida-pop-tx"><a href="#">${cookbook.name}</a></span>
                </div>
                <p class="gravida-pic-tx">${cookbook.profile}</p>
            </#if>
        </#list>
        </div>
        <ul class="ul-gravida">
        <#list cookbooks as cookbook>
            <#if cookbook_index != 0>
                <li>
                    <a href="#">
                        <img src="${cookbook.headPic}" width="160" height="120"/></a>

                    <p class="gravida-tx"><a href="#">${cookbook.name}</a></p>
                </li>
            </#if>
        </#list>
        </ul>
        <div class="g-foodstuff">
            <a href="#" class="a-l-food">孕妇食材</a>
            <ul>
            <#list yfMaterials as material>
                <li>
                    <a href="#">
                        <img src="${material.pic}" width="117" height="117"/></a>
                    <span class="scroll-pic-shadow"></span>
                    <span class="scroll-pic-tx"><a href="#">${material.name}</a></span>
                </li>
            </#list>
            </ul>
            <a href="#" class="a-r-more">更多</a>
        </div>
    </div>
    <div class="delicious">
        <div class="delicious-nav">
            <ul id="orderTab">
                <li class="cur"><a href="javascript:void(0);">美食排行榜</a></li>
                <li><a href="javascript:void(0);">食材排行榜</a></li>
            </ul>
        </div>
        <ul class="delicious-ul" id="orderTab_0">

        <#list hotCookbooks as cookbook>
            <#if cookbook_index == 0>
                <li class="spread">
                    <dl class="spread-dl">
                        <dt>
                            <img src="${cookbook.headPic}" width="105" height="79"/></dt>
                        <dd>
                            <h3 class="spr-h3"><a href="#">${cookbook.name}</a></h3>

                            <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>

                            <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
                        </dd>
                    </dl>
                </li>
            <#else>
                <li>
                    <div class="cutout-ul">
                        <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
                        <span class="<#if cookbook_index < 3>cut-num red<#else>cut-num</#if>">${cookbook_index+1}</span><a href="#">${cookbook.name}</a>
                    </div>
                </li>
            </#if>
        </#list>
        </ul>
        <ul class="delicious-ul" id="orderTab_1" style="display: none;">

        <#list hotMaterials as material>
            <#if material_index==0>
                <li class="spread">
                    <dl class="spread-dl">
                        <dt>
                            <img src="${material.pic}" width="105" height="79"/></dt>
                        <dd>
                            <h3 class="spr-h3"><a href="#">${material.name}</a></h3>

                            <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>

                            <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
                        </dd>
                    </dl>
                </li>
            <#else>
                <li>
                    <div class="cutout-ul">
                        <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
                        <span class="<#if material_index < 3>cut-num red<#else>cut-num</#if>">${material_index + 1}</span><a
                            href="#">${material.name}</a>
                    </div>
                </li>
            </#if>
        </#list>
        </ul>
    </div>
</div>
<!--end孕妇食谱-->
<!--star精品食谱-->
<div class="scorll-cul-wrap">
    <a href="#" class="a-l-food">精选做法</a>

    <div id="bottomFocus" class="scorll-cul">
        <span class="btnprev"><a href="javascript:void(0);"></a></span>

        <div class="scorll-cul-ul">
            <ul class="scorll-cul-ul-item">
            <li>
            <ul>

            <#list betterCookbooks as cookbook>
                <#if cookbook_index%5==0 && (cookbook_index/5)%2!=0>
                </ul>
                </li>
                <li>
                <ul>
                </#if>
                <li>
                    <a href="#"><img src="${cookbook.headPic}" width="160" height="120"/></a>

                    <p class="text"><a href="#">${cookbook.name}</a></p>
                </li>
            </#list>

            </ul>
            </li>
            </ul>

        </div>
        <span class="btnnex"><a href="javascript:void(0);"></a></span>
    </div>
</div>
<!--end精品食谱-->
<!--star瀑布流菜单-->
<div class="part-c" id="waterfallContent">
    <div id="waterfallContent_0" class="goods_wall">
        <div class="recmore_nav">
            <h3><a href="#">菜系</a></h3>

            <p>
            <#list categories as category>
                <a href="#">${category.name}</a>
            </#list>
            </p>

            <h3><a href="#">家常</a></h3>

            <p>
                <a href="#">凉菜</a><a href="#">汤羹</a><a href="#">小吃</a><a href="#">主食</a><a href="#">素食</a><a
                    href="#">火锅</a><a href="#">饮品</a><a href="#">泡菜</a><a href="#">甜品</a><a href="#">糕点</a>
            </p>

            <h3><a href="#">人群</a></h3>

            <p>
            <#list crowds as crowd>
                <#if crowd.pid==0>
                    <a href="#">${crowd.name}</a>
                </#if>
            </#list>
            </p>
        </div>
    </div>
    <div id="waterfallContent_1" class="goods_wall ml10"></div>
    <div id="waterfallContent_2" class="goods_wall ml10"></div>
    <div id="waterfallContent_3" class="goods_wall ml10"></div>
</div>
<!--end瀑布流菜单-->
<div id="loading" class="more-food">查看更多美食</div>
<!--star友情链接-->
<div class="food-link">
    <ul>
        <li><span class="food-titl">推荐地址：</span><a href="#">川菜</a>|<a href="#">鲁菜</a>|<a
                href="#">闽菜</a>|<a href="#">粤菜</a>|<a href="#">苏菜</a>|<a href="#">浙菜</a>|<a href="#">湘菜</a>|<a
                href="#">徽菜</a>|<a href="#">山西菜</a>|<a href="#">贵州菜</a>|<a href="#">上海菜</a>|<a href="#">河南菜</a>|<a
                href="#">江西菜</a>|<a href="#">东北菜</a>|<a href="#">西北菜</a></li>
        <li><span class="food-titl">友情链接：</span><a href="#">百度美食知道</a>|<a href="#">饭菜网</a>|<a
                href="#">餐饮连锁</a>|<a href="#">北京大闸蟹</a>|<a href="#">扒饭美食网</a>|<a href="#">粥</a>|<a
                href="#">我兴鑫美食坊</a>|<a href="#">食谱珠海</a>|<a href="#">美食指南</a>|<a href="#">福州美食网</a>|<a
                href="#">湘菜加盟</a>|<a href="#">芝士</a></li>
        <li><span class="food-titl">特别鸣谢：</span><a href="#">中国烹饪协会</a>|<a href="#">中国营养学会</a>|<a
                href="#">中国营养师协会</a></li>
    </ul>
</div>
<!--star友情链接-->
<div class="copy-bor"></div>
<div class="copy">
    <p>本站部分内容来自互联网，如果内容侵犯您的版权请 告知 ，我们将在我们第一时间处理，谢谢。<a href="#">关于菜友网</a>|<a href="#">网站地图</a>|<a
            href="#">联系我们</a></p>

    <p>Copyright@ 2007-2013 CAIUU Ltd, 京ICP备08005029号，All Rights Reserved,Email:nathen[at]163.com
    </p>
</div>
</div>
<div class="flwcli">
    <a href="#" class="turnask"><i class="icon-eye"></i>意见反馈</a>
    <a id="gotop" onclick="window.scrollTo(0,0);" href="javascript:void(0);" class="turntop"><i
            class="icon-triangle"></i>返回顶部</a>
</div>

<!--end内容-->
<script src="js/tools.js" type="text/javascript"></script>
<script type="text/javascript">
function showdesc(o) {
    var txt = F.byClass('goods-pic-pop', o, 'div');
    txt[0] && (txt[0].style.display = 'block');
}
;

function hidedesc(o) {
    var txt = F.byClass('goods-pic-pop', o, 'div');
    txt[0] && (txt[0].style.display = 'none');
}
;

(function () {

    //初始化头部更多下拉菜单
    function initTopMoreNav(id) {
        var nav = document.getElementById(id),
                a = F.getChildNodes(nav, 'a'),
                pop = F.byClass('more-pop', nav, 'div');

        F.addEvent(nav, 'mouseenter', function () {
            a[0] && F.addClass(a[0], 'more-a');
            pop[0] && (pop[0].style.display = 'block');
        });
        F.addEvent(nav, 'mouseleave', function () {
            a[0] && F.removeClass(a[0], 'more-a');
            pop[0] && (pop[0].style.display = 'none');
        });
    };

    initTopMoreNav('header-more');

    //初始化导航
    function initNav(id) {
        var nav = document.getElementById(id),
                li = F.getChildNodes(nav),
                len = li.length, i = 0;

        for (; i < len; i++) {
            (function (i) {
                F.addEvent(li[i], 'mouseenter', function () {
                    var ul = F.byClass('nav-pop', li[i], 'ul'),
                            a = F.getChildNodes(li[i], 'a');
                    a[0] && F.addClass(a[0], 'cur');
                    ul[0] && (ul[0].style.display = 'block');
                });
                F.addEvent(li[i], 'mouseleave', function () {
                    var ul = F.byClass('nav-pop', li[i], 'ul'),
                            a = F.getChildNodes(li[i], 'a');
                    a[0] && F.removeClass(a[0], 'cur');
                    ul[0] && (ul[0].style.display = 'none');
                });
            })(i);
        }

    };

    initNav('jsddm');

    //固定导航
    function navFixed(id, cloneid) {
        var obj = document.getElementById(id),
                cloneObj = document.getElementById(cloneid),
                isIE6 = !!(window.attachEvent && !window.opera && navigator.userAgent.indexOf("MSIE 6") > -1),
                set = function () {
                    var wT = document["documentElement"].scrollTop + document["body"].scrollTop;
                    if (wT > 80) {
                        obj.style.cssText = 'position: fixed; _position:absolute;top:' + (isIE6 ? wT + 'px' : 0);
                        cloneObj.style.display = 'block';
                    }
                    else {
                        obj.style.cssText = 'position:static';
                        cloneObj.style.display = 'none';
                    }
                };

        set();
        F.addEvent(window, 'scroll', set);
    }

    navFixed('nav-fix', 'nav-fix-clone');

    //初始化焦点图
    new F.AutoPlay('focus', {
        item: 'focus-item',
        nav: 'foucs-tx',
        active: 'foucs-hover',
        sleep: 5000,
        size: 732,
        auto: true,
        onInit: function () {
            //初始化时触发
        },
        onBefore: function (index) {
            //切换之前，可以用于懒加载
        }
    });

    //初始化选项卡
    F.tab('orderTab', 0, 'click', 0, null, 'li', 'cur');

    //初始化头部滚动
    new F.AutoPlay('topFocus', {
        item: 'scroll-item',
        prev: 'btnprev',
        next: 'btnnex',
        sleep: 5000,
        size: 960,
        speed: 1000,
        auto: false,
        onInit: function () {
            //初始化时触发
        },
        onBefore: function (index) {
            //切换之前，可以用于懒加载
        }
    });

    //初始化尾部滚动
    new F.AutoPlay('bottomFocus', {
        item: 'scorll-cul-ul-item',
        prev: 'btnprev',
        next: 'btnnex',
        sleep: 5000,
        size: 870,
        auto: false,
        onInit: function () {
            //初始化时触发
        },
        onBefore: function (index) {
            //切换之前，可以用于懒加载
        }
    });

    //初始化返回顶部
    function initGoTop(id) {
        var obj = document.getElementById(id),
                isIE6 = !!(window.attachEvent && !window.opera && navigator.userAgent.indexOf("MSIE 6") > -1),
                set = function () {
                    var wT = document["documentElement"].scrollTop + document["body"].scrollTop;
                    if (wT > 0) {
                        obj.style.display = 'block';
                    }
                    else {
                        obj.style.display = 'none';
                    }
                };
        if (isIE6) {
            var div = document.createElement('div'),
                    fix = function () {
                        div.innerHTML = '';
                        setTimeout(arguments.callee, 200);
                    };
            div.style.cssText = 'width:1px;height:1px;overflow:hiden;position:absolute;top:-1px;';
            div.id = 'gotopIE6Fix';
            document.body.appendChild(div);
            div = null;
            div = document.getElementById('gotopIE6Fix');
            fix();
        }
        set();
        F.addEvent(window, 'scroll', set);
    };
    initGoTop('gotop');

    var page = 1;

    //初始化瀑布流
    new F.waterfall({
        container: 'waterfallContent', //容器ID
        columnIds: ['waterfallContent_0', 'waterfallContent_1', 'waterfallContent_2', 'waterfallContent_3'],//列容器ID
        columnNumber: 4,    //列数
        surplusHeight: 200, //敏感度，越大敏感
        getDate: function () {
            var that = this;
            $.ajax({
                type: "GET",
                url: "waterfall.htm",
                data: {pageNum: page++},
                contentType: "application/json;charset=UTF-8",
                dataType: "json"
            }).done(function (data) {
                        $.each(data, function (i, item) {
                            var tpl = '<div onmouseout="hidedesc(this);" onmouseover="showdesc(this);" class="goods-pic">\
                                <a href="#"><img width="240" height="409" src="' + item.headPic + '"></a>\
                                <div class="goods-pic-pop">\
                                    <div class="goods-pop-shadow"></div>\
                                    <div class="goods-pop-tx">\
                                        <span class="fr"><i class="icon-eye"></i>23</span>\
                                        <span><i class="icon-clock"></i>昨天 12：31</span>\
                                    </div>\
                                </div>\
                                <div class="goods-txt">\
                                    <h3><a href="#">' + item.name + '</a></h3>\
                                    <p><a href="#">' + item.profile + '</a></p>\
                                </div>\
                            </div>';

                            var div = document.createElement('div');
                            div.className = 'goods-wrap';
                            div.innerHTML = tpl;
                            that.addBox(div);

                            div = null;
                        });


                        that.buzy = false;
                    }).error(function () {
                        alert("error!");
                    });


        }
    });

})();

</script>
<!------>
</body>
</html>
