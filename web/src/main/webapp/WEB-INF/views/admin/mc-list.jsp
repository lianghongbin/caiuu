<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title></head>
<body>
<h2>食材分类</h2>
<table cellspacing="0" rules="all" border="1" id="dgMaterial" style="border-collapse:collapse;">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>

    <c:forEach items="${mcs}" var="mc" varStatus="status">

        <td>${mc.id}</td>
        <td>${mc.name}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
