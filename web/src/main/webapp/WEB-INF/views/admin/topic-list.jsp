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
    专题管理&nbsp;&nbsp;&nbsp;<a href="./input">添加新专题</a></a>
</h2>
<table cellspacing="0" rules="all" border="1" id="dgTopic" style="width:95%;border-collapse:collapse;">
    <tr style="background-color:#CCCCCC;height:25px;">
        <td align="center">ID</td>
        <td align="center">标题</td>
        <td align="center">广告图片</td>
        <td align="center">缩略图片</td>
        <td align="center">关键词1</td>
        <td align="center">关键词2</td>
        <td align="center">关键词3</td>
        <td align="center">总点击</td>
        <td align="center">上周点击</td>
        <td align="center">状态(1正常)</td>
        <td align="center">URL</td>
        <td align="center">修改内容</td>
        <td align="center">修改图片</td>
    </tr>
    <c:forEach items="${topics}" var="topic" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr style="height:22px;">
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;height:22px;">
            </c:otherwise>
        </c:choose>

        <td align="center"><c:out value="${topic.id}"/> </td>
        <td>${topic.title}</td>
        <td>${topic.adPic}</td>
        <td>${topic.headPic}</td>
        <td align="center">${topic.key1}</td>
        <td align="center">${topic.key2}</td>
        <td align="center">${topic.key3}</td>
        <td align="right">${topic.hit}</td>
        <td align="right">${topic.hitLast}</td>
        <td align="center">${topic.status}</td>
        <td><a href="${topic.url}" target="_blank">${topic.url}</a></td>
        <td align="center"><a href="./edit/${topic.id}" target="_self">修改内容</a></td>
        <td align="center"><a href="./epic/${topic.id}">修改图片</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
