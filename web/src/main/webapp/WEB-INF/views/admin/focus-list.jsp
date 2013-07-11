<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>焦点图列表</title>
    <script type="text/javascript" src="/js/jquery-1.10.2.js"></script>
    <style type="text/css">
        body, div, p, table, td, span, a {
            font-size: 14px;
        }

        .STYLE2 {
            color: #FF0000;
            font-size: 12px;
        }
    </style>
    <script>

        var deleteFocus = function (backUrl) {
            alert("OK");
            alert($("#test").value());

        }
    </script>
</head>
<body>
<h1>焦点图 </h1> &nbsp;&nbsp;<a href="view"><h3>添加焦点图</h3></a>
<table cellspacing="0" rules="all" border="1" id="dgSearchLog" style="width:90%;border-collapse:collapse;">
    <input type="text" id="test" name="test"  value="aaa"/>
    <tr style="background-color:#CCCCCC;height:25px;">
        <td>id</td>
        <td>title</td>
        <td>url</td>
        <td>pic43</td>
        <td>pic21</td>
        <td>publishTime</td>
        <td>createTime</td>
        <td align="center">操作</td>
    </tr>

    <c:forEach items="${focuses}" var="focus" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr style="height:22px;">
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;height:22px;">
            </c:otherwise>
        </c:choose>

        <td>${focus.id}</td>
        <td>${focus.title}</td>
        <td>${focus.url}</td>
        <td>${focus.pic43}</td>
        <td>${focus.pic21}</td>
        <td>${focus.publishTime}</td>
        <td>${focus.createTime}</td>
        <td>修改 &nbsp; <a href="#" onclick="deleteFocus('admin/focus/delete/${focus.id}')">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
