<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>焦点图列表</title>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
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

        var deleteFocus = function (id) {
            if (!confirm("你确定要删除该焦点图吗？")) {
                return false;
            }

            $.ajax({
                type: "GET",
                url: "./delete/" + id,
                contentType: "text/html; charset=utf-8",
                dataType: "text"
            }).done(function (data) {
                        if (data == "success") {
                            alert("删除成功!");
                            document.location.reload();
                        }
                    }).error(function () {
                        alert("error!");
                    });
        }
    </script>
</head>
<body>

<h2>焦点图管理  &nbsp;&nbsp;<a href="view">添加焦点图</a></h2>
<table cellspacing="0" rules="all" border="1" id="dgSearchLog" style="width:90%;border-collapse:collapse;">
    <tr style="background-color:#CCCCCC;height:25px;">
        <td>id</td>
        <td>title</td>
        <td>url</td>
        <td>bigphoto</td>
        <td>smallphoto</td>
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
        <td>${focus.bigPhoto}</td>
        <td>${focus.smallPhoto}</td>
        <td>${focus.publishTime}</td>
        <td>${focus.createTime}</td>
        <td><a href="./edit/${focus.id}">修改</a> &nbsp; <a href="#" onclick="deleteFocus('${focus.id}')">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
