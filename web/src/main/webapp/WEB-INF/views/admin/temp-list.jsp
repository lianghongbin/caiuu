<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>

    </title>
    <style type="text/css">
        li {
            list-style: none;
            border: 1px solid #f2f2f2;
            width: 300px;
            padding: 3px;
            float: left;
        }

        .clearFloat {
            clear: both;
            font-size: 0;
            height: 0;
            line-height: 0;
            overflow: hidden;
        }
    </style>
</head>
<body>
<h2>采集临时菜谱管理</h2>

<p>共${count}条记录 共71 第<span style='color:red'>1</span> <a href='CaipuTemp.aspx?pageindex=2' style='color:blue'>[2]</a> <a
        href='CaipuTemp.aspx?pageindex=3' style='color:blue'>[3]</a> <a href='CaipuTemp.aspx?pageindex=4'
                                                                        style='color:blue'>[4]</a> <a
        href='CaipuTemp.aspx?pageindex=5' style='color:blue'>[5]</a> <a href='CaipuTemp.aspx?pageindex=6'
                                                                        style='color:blue'>[6]</a> <a
        href='CaipuTemp.aspx?pageindex=7' style='color:blue'>[7]</a> <a href='CaipuTemp.aspx?pageindex=8'
                                                                        style='color:blue'>[8]</a> <a
        href='CaipuTemp.aspx?pageindex=9' style='color:blue'>[9]</a> <a href='CaipuTemp.aspx?pageindex=10'
                                                                        style='color:blue'>[10]</a> <a
        href='CaipuTemp.aspx?pageindex=11' style='color:blue'>[11]</a> <a href='CaipuTemp.aspx?pageindex=12'
                                                                          style='color:blue'>[12]</a> <a
        href='CaipuTemp.aspx?pageindex=13' style='color:blue'>[13]</a> <a href='CaipuTemp.aspx?pageindex=14'
                                                                          style='color:blue'>[14]</a> <a
        href='CaipuTemp.aspx?pageindex=15' style='color:blue'>[15]</a> 页</p>
<ul>
    <c:forEach items="${temporaries}" var="temporary" varStatus="status">
        <li>
            <p><a href="${temporary.url}" target="_blank">${temporary.title}</a></p>

            <p>字节：${temporary.length}，作者：${temporary.source}</p>

            <p>时间：${temporary.createTime}</p>
        </li>
    </c:forEach>

</ul>
<p>共3544条记录 共71页 第<span style='color:red'>1</span> <a href='CaipuTemp.aspx?pageindex=2' style='color:blue'>[2]</a> <a
        href='CaipuTemp.aspx?pageindex=3' style='color:blue'>[3]</a> <a href='CaipuTemp.aspx?pageindex=4'
                                                                        style='color:blue'>[4]</a> <a
        href='CaipuTemp.aspx?pageindex=5' style='color:blue'>[5]</a> <a href='CaipuTemp.aspx?pageindex=6'
                                                                        style='color:blue'>[6]</a> <a
        href='CaipuTemp.aspx?pageindex=7' style='color:blue'>[7]</a> <a href='CaipuTemp.aspx?pageindex=8'
                                                                        style='color:blue'>[8]</a> <a
        href='CaipuTemp.aspx?pageindex=9' style='color:blue'>[9]</a> <a href='CaipuTemp.aspx?pageindex=10'
                                                                        style='color:blue'>[10]</a> <a
        href='CaipuTemp.aspx?pageindex=11' style='color:blue'>[11]</a> <a href='CaipuTemp.aspx?pageindex=12'
                                                                          style='color:blue'>[12]</a> <a
        href='CaipuTemp.aspx?pageindex=13' style='color:blue'>[13]</a> <a href='CaipuTemp.aspx?pageindex=14'
                                                                          style='color:blue'>[14]</a> <a
        href='CaipuTemp.aspx?pageindex=15' style='color:blue'>[15]</a> <a href='CaipuTemp.aspx?pageindex=16'
                                                                          style='color:blue'>[16]</a> <a
        href='CaipuTemp.aspx?pageindex=17' style='color:blue'>[17]</a> <a href='CaipuTemp.aspx?pageindex=18'
                                                                          style='color:blue'>[18]</a> <a
        href='CaipuTemp.aspx?pageindex=19' style='color:blue'>[19]</a> <a href='CaipuTemp.aspx?pageindex=20'
                                                                          style='color:blue'>[20]</a> <a
        href='CaipuTemp.aspx?pageindex=21' style='color:blue'>[21]</a> <a href='CaipuTemp.aspx?pageindex=22'
                                                                          style='color:blue'>[22]</a> <a
        href='CaipuTemp.aspx?pageindex=23' style='color:blue'>[23]</a> <a href='CaipuTemp.aspx?pageindex=24'
                                                                          style='color:blue'>[24]</a> <a
        href='CaipuTemp.aspx?pageindex=25' style='color:blue'>[25]</a> <a href='CaipuTemp.aspx?pageindex=26'
                                                                          style='color:blue'>[26]</a> <a
        href='CaipuTemp.aspx?pageindex=27' style='color:blue'>[27]</a> <a href='CaipuTemp.aspx?pageindex=28'
                                                                          style='color:blue'>[28]</a> <a
        href='CaipuTemp.aspx?pageindex=29' style='color:blue'>[29]</a> <a href='CaipuTemp.aspx?pageindex=30'
                                                                          style='color:blue'>[30]</a> <a
        href='CaipuTemp.aspx?pageindex=31' style='color:blue'>[31]</a> <a href='CaipuTemp.aspx?pageindex=32'
                                                                          style='color:blue'>[32]</a> <a
        href='CaipuTemp.aspx?pageindex=33' style='color:blue'>[33]</a> <a href='CaipuTemp.aspx?pageindex=34'
                                                                          style='color:blue'>[34]</a> <a
        href='CaipuTemp.aspx?pageindex=35' style='color:blue'>[35]</a> <a href='CaipuTemp.aspx?pageindex=36'
                                                                          style='color:blue'>[36]</a> <a
        href='CaipuTemp.aspx?pageindex=37' style='color:blue'>[37]</a> <a href='CaipuTemp.aspx?pageindex=38'
                                                                          style='color:blue'>[38]</a> <a
        href='CaipuTemp.aspx?pageindex=39' style='color:blue'>[39]</a> <a href='CaipuTemp.aspx?pageindex=40'
                                                                          style='color:blue'>[40]</a> <a
        href='CaipuTemp.aspx?pageindex=41' style='color:blue'>[41]</a> <a href='CaipuTemp.aspx?pageindex=42'
                                                                          style='color:blue'>[42]</a> <a
        href='CaipuTemp.aspx?pageindex=43' style='color:blue'>[43]</a> <a href='CaipuTemp.aspx?pageindex=44'
                                                                          style='color:blue'>[44]</a> <a
        href='CaipuTemp.aspx?pageindex=45' style='color:blue'>[45]</a> <a href='CaipuTemp.aspx?pageindex=46'
                                                                          style='color:blue'>[46]</a> <a
        href='CaipuTemp.aspx?pageindex=47' style='color:blue'>[47]</a> <a href='CaipuTemp.aspx?pageindex=48'
                                                                          style='color:blue'>[48]</a> <a
        href='CaipuTemp.aspx?pageindex=49' style='color:blue'>[49]</a> <a href='CaipuTemp.aspx?pageindex=50'
                                                                          style='color:blue'>[50]</a> <a
        href='CaipuTemp.aspx?pageindex=51' style='color:blue'>[51]</a> <a href='CaipuTemp.aspx?pageindex=52'
                                                                          style='color:blue'>[52]</a> <a
        href='CaipuTemp.aspx?pageindex=53' style='color:blue'>[53]</a> <a href='CaipuTemp.aspx?pageindex=54'
                                                                          style='color:blue'>[54]</a> <a
        href='CaipuTemp.aspx?pageindex=55' style='color:blue'>[55]</a> <a href='CaipuTemp.aspx?pageindex=56'
                                                                          style='color:blue'>[56]</a> <a
        href='CaipuTemp.aspx?pageindex=57' style='color:blue'>[57]</a> <a href='CaipuTemp.aspx?pageindex=58'
                                                                          style='color:blue'>[58]</a> <a
        href='CaipuTemp.aspx?pageindex=59' style='color:blue'>[59]</a> <a href='CaipuTemp.aspx?pageindex=60'
                                                                          style='color:blue'>[60]</a> <a
        href='CaipuTemp.aspx?pageindex=61' style='color:blue'>[61]</a> <a href='CaipuTemp.aspx?pageindex=62'
                                                                          style='color:blue'>[62]</a> <a
        href='CaipuTemp.aspx?pageindex=63' style='color:blue'>[63]</a> <a href='CaipuTemp.aspx?pageindex=64'
                                                                          style='color:blue'>[64]</a> <a
        href='CaipuTemp.aspx?pageindex=65' style='color:blue'>[65]</a> <a href='CaipuTemp.aspx?pageindex=66'
                                                                          style='color:blue'>[66]</a> <a
        href='CaipuTemp.aspx?pageindex=67' style='color:blue'>[67]</a> <a href='CaipuTemp.aspx?pageindex=68'
                                                                          style='color:blue'>[68]</a> <a
        href='CaipuTemp.aspx?pageindex=69' style='color:blue'>[69]</a> <a href='CaipuTemp.aspx?pageindex=70'
                                                                          style='color:blue'>[70]</a> <a
        href='CaipuTemp.aspx?pageindex=71' style='color:blue'>[71]</a> 页</p>
</body>
</html>
