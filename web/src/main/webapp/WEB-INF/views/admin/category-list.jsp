<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title></head>
<body>
<h3>菜谱分类管理</h3>
<table cellspacing="0" rules="all" border="1" id="dgCategory" style="border-color:#CCCCCC;border-collapse:collapse;">
    <tr style="color:White;background-color:#666666;">
        <td>categoryid</td>
        <td>name</td>
        <td>dname</td>
        <td>mname</td>
        <td>parentid</td>
        <td>pyname</td>
        <td>createtime</td>
    </tr>

    <c:forEach items="${categories}" var="category" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr>
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;">
            </c:otherwise>
        </c:choose>

        <td>${category.id}</td>
        <td>${category.name}</td>
        <td>${category.dname}</td>
        <td>${category.mname}</td>
        <td>${category.parentId}</td>
        <td>${category.pinyin}</td>
        <td>${category.createTime}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
