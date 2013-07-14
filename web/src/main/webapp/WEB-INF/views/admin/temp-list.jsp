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

<ul>
    <c:forEach items="${temporaries}" var="temporary" varStatus="status">
        <li>
            <p><a href="${temporary.url}" target="_blank">${temporary.title}</a>&nbsp;&nbsp;<a href="./edit/${temporary.id}">编辑</a> </p>

            <p>字节：${temporary.length}，作者：${temporary.source}</p>

            <p>时间：${temporary.createTime}</p>
        </li>
    </c:forEach>

</ul>
</body>
</html>
