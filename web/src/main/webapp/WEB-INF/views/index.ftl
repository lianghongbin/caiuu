<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
    <meta content="美食之家 " name="keywords" />
    <meta content="美食之家食谱" name="description" />
    <title>美食之家</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script src="js/iepng.js" type="text/javascript"></script>
    <!--插入图片透明方法-->
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input,i,a,span');  //EvPNG.fix('包含透明PNG图片的标签'); 多个标签之间用英文逗号隔开。
    </script>
    <script type="text/javascript">
        function nTabs(thisObj, Num) {
            if (thisObj.className == "cur") return;
            var tabList = document.getElementById("myTab").getElementsByTagName("a");
            for (i = 0; i < tabList.length; i++) {//点击之后，其他tab变成灰色，内容隐藏，只有点击的tab和内容有属性
                if (i == Num) {
                    thisObj.className = "cur";
                    document.getElementById("myTab_Content" + i).style.display = "block";
                } else {
                    tabList[i].className = "";
                    document.getElementById("myTab_Content" + i).style.display = "none";
                }
            }
        }
    </script>
</head>

<body>
<!--min导航-->
<div class="min-cont">
    <div class="min-logo"><a href="#"><img src="images/logo.jpg" width="201" height="60" /></a></div>
    <div class="min-right">
        <div class="min-nav">
            您好, 欢迎光临，<a href="#">注册</a><a href="#">登录</a>|<a href="#">加入收藏</a><a href="#">反馈</a>
            <span class="more-span"><a href="#" class="more-a">更多<i class="more-arrow"></i></a>
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
            	<input name="" type="text"  class="inp-txt" value="输入美食名称搜索"/>
                <a href="#" class="submit-second-btn">搜美食</a>
            </span>
            <span class="min-weibo-wrap"><span class="icon-weibo1"></span><span class="fl"><a href="#">美食之家网站</a></span><span class="icon-weibo2"></span></span>
        </div>
    </div>
</div>
<!--end min导航-->
<!--导航-->
<div class="nav-fix" style="position:relative;_position: absolute;left:0;">
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
<!--end导航-->
<!--star内容-->
<div class="wrap">
<div class="part-a">
    <!--star焦点图-->
    <div class="foucs-wrap">
        <a href="#"><img src="images/pic01.jpg" width="732" height="360" /></a>
        <span class="foucs-shadow"></span>
        <ul class="foucs-tx">
            <li class="foucs-hover"><a href="#"><img src="images/pic02.jpg" width="122" height="60" /></a></li>
            <li><a href="#"><img src="images/pic02.jpg" width="122" height="60" /></a></li>
            <li><a href="#"><img src="images/pic02.jpg" width="122" height="60" /></a></li>
            <li><a href="#"><img src="images/pic02.jpg" width="122" height="60" /></a></li>
            <li><a href="#"><img src="images/pic02.jpg" width="122" height="60" /></a></li>
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
    <div class="scroll-focus-w">
        <span class="btnprev"><a href="#"></a></span>
        <span class="btnnex"><a href="#"></a></span>
        <div class="scroll-focus">
            <ul>
                <li>
                    <ul class="ul-pic">
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
                        <li>
                            <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                            <span class="scroll-pic-shadow"></span>
                            <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
                        </li>
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
        <p class="target fr"><a href="#">孕早期（1-3个月）</a><a href="#">孕早期（1-3个月）</a><a href="#">孕早期（1-3个月）</a><a href="#">孕早期（1-3个月）</a></p>
    </div>
    <div class="gravida-pic-wrap">
        <div class="gravida-pic">
            <a href="#"><img src="images/pic04.jpg" width="386" height="240" /></a>
            <span class="gravida-pop-shadow"></span>
            <span class="gravida-pop-tx"><a href="#">菠萝咕咾肉</a></span>
        </div>
        <p class="gravida-pic-tx">夏日滋补养颜食谱夏季阳盛阴衰，“滋阴”尤其重要。美天为MM们准备了实用的夏季养生食补系..</p>
    </div>
    <ul class="ul-gravida">
        <li>
            <a href="#"><img src="images/pic05.jpg" width="160" height="120" /></a>
            <p class="gravida-tx"><a href="#">菠萝咕咾肉</a></p>
        </li>
        <li>
            <a href="#"><img src="images/pic05.jpg" width="160" height="120" /></a>
            <p class="gravida-tx"><a href="#">菠萝咕咾肉</a></p>
        </li>
        <li>
            <a href="#"><img src="images/pic05.jpg" width="160" height="120" /></a>
            <p class="gravida-tx"><a href="#">菠萝咕咾肉</a></p>
        </li>
        <li>
            <a href="#"><img src="images/pic05.jpg" width="160" height="120" /></a>
            <p class="gravida-tx"><a href="#">菠萝咕咾肉</a></p>
        </li>
    </ul>
    <div class="g-foodstuff">
        <a  href="#" class="a-l-food">孕妇食材</a>
        <ul>
            <li>
                <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                <span class="scroll-pic-shadow"></span>
                <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
            </li>
            <li>
                <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                <span class="scroll-pic-shadow"></span>
                <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
            </li>
            <li>
                <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                <span class="scroll-pic-shadow"></span>
                <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
            </li>
            <li>
                <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                <span class="scroll-pic-shadow"></span>
                <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
            </li>
            <li>
                <a href="#"><img src="images/pic03.jpg" width="117" height="117" /></a>
                <span class="scroll-pic-shadow"></span>
                <span class="scroll-pic-tx"><a href="#">樱桃</a></span>
            </li>
        </ul>
        <a href="#" class="a-r-more">更多</a>
    </div>
</div>
<div class="delicious">
<div class="delicious-nav">
    <ul id="myTab">
        <li><a href="#" class="cur" onclick="nTabs(this,0);">美食排行榜</a></li>
        <li><a href="#" onclick="nTabs(this,1);">食材排行榜</a></li>
    </ul>
</div>
<ul class="delicious-ul" id="myTab_Content0">
    <li class="spread">
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">1</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num red">2</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num red">3</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">4</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">5</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">6</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">7</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a>/p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">8</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">9</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">10</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">11</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">12</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱/高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">13</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
</ul>
<ul class="delicious-ul" id="myTab_Content1" style="display:none;">
    <li class="spread">
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">sssss</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">1</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num red">2</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num red">3</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">4</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">5</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">6</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">7</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">8</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">9</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">10</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">11</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">12</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
    <li>
        <dl class="spread-dl">
            <dt><img src="images/pic06.jpg" width="105" height="79" /></dt>
            <dd>
                <h3 class="spr-h3"><a href="#">香蕉鸡蛋卷饼</a></h3>
                <p class="spr-p"><a href="#">幼儿食谱</a>/<a href="#">高血压调理</a></p>
                <p class="spr-sch-s"><span class="spr-schedule"><span></span></span></p>
            </dd>
        </dl>
        <div class="cutout-ul">
            <span class="cutout-ul-fr"><span class="spr-schedule"><span></span></span></span>
            <span class="cut-num">13</span><a href="#">香蕉鸡蛋卷饼</a></div>
    </li>
</ul>
</div>
</div>
<!--end孕妇食谱-->
<!--star精品食谱-->
<div class="scorll-cul-wrap">
    <a  href="#" class="a-l-food">精选做法</a>
    <div class="scorll-cul">
        <span class="btnprev"><a href="#"></a></span>
        <div class="scorll-cul-ul">
            <ul>
                <li><a href="#"><img src="images/pic06.jpg" width="160" height="120" /></a>
                    <p class="text"><a href="#">水果餐</a></p>
                </li>
                <li><a href="#"><img src="images/pic06.jpg" width="160" height="120" /></a>
                    <p class="text"><a href="#">水果餐</a></p>
                </li>
                <li><a href="#"><img src="images/pic06.jpg" width="160" height="120" /></a>
                    <p class="text"><a href="#">水果餐</a></p>
                </li>
                <li><a href="#"><img src="images/pic06.jpg" width="160" height="120" /></a>
                    <p class="text"><a href="#">水果餐</a></p>
                </li>
                <li><a href="#"><img src="images/pic06.jpg" width="160" height="120" /></a>
                    <p class="text"><a href="#">水果餐</a></p>
                </li>
            </ul>
        </div>
        <span class="btnnex"><a href="#"></a></span>
    </div>
</div>
<!--end精品食谱-->
<!--star瀑布流菜单-->
<div class="part-c">
<div class="goods_wall">
    <div class="recmore_nav">
        <h3><a href="#">菜系</a></h3>
        <p><a href="#">川菜</a><a href="#">鲁菜</a><a href="#">地方菜</a><a href="#">湘菜</a><a href="#">粤菜</a><a href="#">闽菜</a><a href="#">韩国菜</a><a href="#">浙菜</a><a href="#">京菜</a><a href="#">日本菜</a>
        </p>
        <h3><a href="#">家常</a></h3>
        <p><a href="#">凉菜</a><a href="#">汤羹</a><a href="#">小吃</a><a href="#">主食</a><a href="#">素食</a><a href="#">火锅</a><a href="#">饮品</a><a href="#">泡菜</a><a href="#">甜品</a><a href="#">糕点</a>
        </p>
        <h3><a href="#">人群</a></h3>
        <p><a href="#">孕妇</a><a href="#">产妇</a><a href="#">婴儿</a><a href="#">儿童</a><a href="#">青少</a><a href="#">老人</a><a href="#">单身</a><a href="#">清真</a></p>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic09.jpg" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
</div>
<div class="goods_wall ml10">
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic09.jpg" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic09.jpg"/></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
</div>
<div class="goods_wall ml10">
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>                </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic09.jpg" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
</div>
<div class="goods_wall ml10">
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
    <div class="goods-wrap">
        <div class="goods-pic">
            <a href="#"><img src="images/pic06.jpg" width="240" height="409" /></a>
            <div class="goods-pic-pop">
                <div class="goods-pop-shadow"></div>
                <div class="goods-pop-tx">
                    <span class="fr"><i class="icon-eye"></i>23</span>
                    <span><i class="icon-clock"></i>昨天 12：31</span>
                </div>
            </div>
        </div>
        <div class="goods-txt">
            <h3><a href="#">红烧茄子</a></h3>
            <p><a href="#">红烧茄子是家常菜菜谱，此菜是素菜中的精细者，历史久远。北魏高阳太守贾思勰在《齐民要术》素食篇中。</a></p>
        </div>
    </div>
</div>
</div>
<!--end瀑布流菜单-->
<div class="more-food">查看更多美食</div>
<!--star友情链接-->
<div class="food-link">
    <ul>
        <li><span class="food-titl">推荐地址：</span><a href="#">川菜</a>|<a href="#">鲁菜</a>|<a href="#">闽菜</a>|<a href="#">粤菜</a>|<a href="#">苏菜</a>|<a href="#">浙菜</a>|<a href="#">湘菜</a>|<a href="#">徽菜</a>|<a href="#">山西菜</a>|<a href="#">贵州菜</a>|<a href="#">上海菜</a>|<a href="#">河南菜</a>|<a href="#">江西菜</a>|<a href="#">东北菜</a>|<a href="#">西北菜</a></li>
        <li><span class="food-titl">友情链接：</span><a href="#">百度美食知道</a>|<a href="#">饭菜网</a>|<a href="#">餐饮连锁</a>|<a href="#">北京大闸蟹</a>|<a href="#">扒饭美食网</a>|<a href="#">粥</a>|<a href="#">我兴鑫美食坊</a>|<a href="#">食谱珠海</a>|<a href="#">美食指南</a>|<a href="#">福州美食网</a>|<a href="#">湘菜加盟</a>|<a href="#">芝士</a></li>
        <li><span class="food-titl">特别鸣谢：</span><a href="#">中国烹饪协会</a>|<a href="#">中国营养学会</a>|<a href="#">中国营养师协会</a></li>
    </ul>
</div>
<!--star友情链接-->
<div class="copy-bor"></div>
<div class="copy">
    <p>本站部分内容来自互联网，如果内容侵犯您的版权请 告知 ，我们将在我们第一时间处理，谢谢。<a href="#">关于菜友网</a>|<a href="#">网站地图</a>|<a href="#">联系我们</a></p>
    <p>Copyright@ 2007-2013 CAIUU Ltd,   京ICP备08005029号，All Rights Reserved,Email:nathen[at]163.com</p>
</div>
</div>
<div class="flwcli">
    <a href="#" class="turnask"><i class="icon-eye"></i>意见反馈</a>
    <a href="#" class="turntop"><i class="icon-triangle"></i>返回顶部</a>
</div>

<!--end内容-->
<script src="js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
    var timeout         = 300;
    var closetimer		= 0;
    var ddmenuitem      = 0;

    function jsddm_open()
    {	jsddm_canceltimer();
        jsddm_close();
        ddmenuitem = $(this).find('ul').eq(0).css('display', 'block');}

    function jsddm_close()
    {	if(ddmenuitem) ddmenuitem.css('display', 'none');}

    function jsddm_timer()
    {	closetimer = window.setTimeout(jsddm_close, timeout);}

    function jsddm_canceltimer()
    {	if(closetimer)
    {	window.clearTimeout(closetimer);
        closetimer = null;}}

    $(document).ready(function()
    {	$('#jsddm > li').bind('mouseover', jsddm_open);
        $('#jsddm > li').bind('mouseout',  jsddm_timer);});

    document.onclick = jsddm_close;
</script>
<!------>
</body>
</html>
