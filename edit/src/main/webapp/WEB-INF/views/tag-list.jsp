<%@ page import="com.meishihome.edit.util.Page" %>
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
    食调分类管理
</h2>
<%
    Page outPage = (Page) request.getAttribute("page");
    out.print(outPage.toString());
%>
<table cellspacing="0" rules="all" border="1" id="dgTopic" style="width:95%;border-collapse:collapse;">
    <tr style="background-color:#CCCCCC;height:25px;">
        <td align="center">ID</td>
        <td align="center">Name</td>
        <td align="center">Count</td>
    </tr>
    <c:forEach items="${tags}" var="tag" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr style="height:22px;">
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;height:22px;">
            </c:otherwise>
        </c:choose>

        <td align="center"><c:out value="${tag.id}"/> </td>
        <td>${tag.name}</td>
        <td>${tag.count}</td>
        </tr>
    </c:forEach>

</table>
<%
    out.print(outPage.toString());
%>
</body>
</html>
