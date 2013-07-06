<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head></head>
<body>

<table cellspacing="0" rules="all" border="1" id="dgFeedback" style="width:100%;border-collapse:collapse;">
    <tr style="color:Black;background-color:#CCCCCC;">
        <td>ID</td>
        <td>内容</td>
        <td>联系方式</td>
        <td>IP地址</td>
        <td>referrer</td>
        <td>创建时间</td>
    </tr>
    <c:forEach items="${feedbacks}" var="feedback" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr>
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2">
            </c:otherwise>
        </c:choose>

        <td>${feedback.id}</td>
        <td>${feedback.content}</td>
        <td>${feedback.phone}</td>
        <td>${feedback.ip}</td>
        <td>${feedback.referrer}</td>
        <td>${feedback.createTime}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
