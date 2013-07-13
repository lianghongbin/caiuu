<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title></head>
<body>
<h3>菜谱列表</h3>
<table cellspacing="0" rules="all" border="1" id="dgCategory" style="border-color:#CCCCCC;border-collapse:collapse;">
    <tr style="color:White;background-color:#666666;">
        <td>id</td>
        <td>name</td>
        <td>pname</td>
        <td>cname</td>
        <td>sname</td>
        <td>remark</td>
        <td>author</td>
        <td>url</td>
        <td>hit</td>
        <td>hitLast</td>
    </tr>

    <c:forEach items="${cookbooks}" var="cookbook" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr>
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;">
            </c:otherwise>
        </c:choose>

        <td>${cookbook.id}</td>
        <td>${cookbook.name}</td>
        <td>${cookbook.pname}</td>
        <td>${cookbook.cname}</td>
        <td>${cookbook.sname}</td>
        <td>${cookbook.remark}</td>
        <td>${cookbook.author}</td>
        <td>${cookbook.url}</td>
        <td>${cookbook.hit}</td>
        <td>${cookbook.hitLast}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
