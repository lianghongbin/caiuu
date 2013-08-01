<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>分类-菜谱映射列表</title>
    <script type="text/javascript" src="../../../../js/jquery-1.10.2.min.js"></script>
    <style type="text/css">
        body, div, p, table, td, span, a {
            font-size: 14px;
        }

        .STYLE2 {
            color: #FF0000;
            font-size: 12px;
        }
    </style>
    <script type="text/javascript">
        function changeCategory() {
            var cValue = $('#categoryId').val();
            document.location = "../../list/" + cValue + "/1";
        }
    </script>
</head>
<body>

<h2>分类-菜谱映射管理&nbsp;&nbsp;
    <select name="categoryId" id="categoryId" onchange="changeCategory()">
        <option value="0">全部</option>
        <c:forEach items="${categories}" var="category">
            <option value="${category.id}"
                    <c:if test="${category.id==categoryId}">selected</c:if>>${category.name}</option>
        </c:forEach>

    </select>
    &nbsp;&nbsp;<a href="../../input">添加映射</a></h2>
<table cellspacing="0" rules="all" border="1" id="dgSearchLog" style="width:90%;border-collapse:collapse;">
    <tr style="background-color:#CCCCCC;height:25px;">
        <td>编号</td>
        <td>分类名称</td>
        <td>菜名</td>
        <td>状态</td>
        <td>抓取时间</td>
        <td align="center">操作</td>
    </tr>

    <c:forEach items="${categoryMaps}" var="map" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr style="height:22px;">
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;height:22px;">
            </c:otherwise>
        </c:choose>

        <td>${map.id}</td>
        <td>${map.categoryName}</td>
        <td>${map.name}</td>
        <td>
            <c:choose>
                <c:when test="${map.fetched}">已</c:when>
                <c:otherwise><font color=red>未</font></c:otherwise>
            </c:choose>
        </td>
        <td>${map.fetchTime}</td>
        <td><a href="./edit/${focus.id}">抓取</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
