<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        .STYLE2 {
            color: #FF0000;
            font-size: 12px;
        }
    </style>
</head>
<body>
<h1>搜索排行</h1>
<table cellspacing="0" rules="all" border="1" id="dgSearchLog" style="width:90%;border-collapse:collapse;">
    <tr style="background-color:#CCCCCC;height:25px;">
        <td>key</td>
        <td>hit</td>
        <td>result</td>
    </tr>

    <c:forEach items="${searchTops}" var="top" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr style="height:22px;">
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;height:22px;">
            </c:otherwise>
        </c:choose>

        <td>${top.key}</td>
        <td>${top.hit}</td>
        <td>${top.result}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
