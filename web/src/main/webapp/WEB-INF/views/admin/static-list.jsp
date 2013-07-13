<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>

    </title>
    <style type="text/css">
        body, div, p, table, td, span, a {
            font-size: 14px;
        }
    </style>
</head>
<body>

<h2>
    站点文本内容管理&nbsp;&nbsp;&nbsp;<a href="./input">添加文本内容</a>
</h2>

<table cellspacing="0" rules="all" border="1" id="dgText" style="width:700px;border-collapse:collapse;">
    <tr style="background-color:#CCCCCC;height:30px;">
        <td>ID</td>
        <td>标题</td>
        <td>创建时间</td>
        <td>最后修改</td>
        <td>修改</td>
    </tr>
    <c:forEach items="${staticBlocks}" var="static" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr style="height:22px;">
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;height:22px;">
            </c:otherwise>
        </c:choose>

        <td>${static.id}</td>
        <td>${static.title}</td>
        <td>${static.createTime}</td>
        <td>${static.lastTime}</td>
        <td><a href="./edit/${static.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
