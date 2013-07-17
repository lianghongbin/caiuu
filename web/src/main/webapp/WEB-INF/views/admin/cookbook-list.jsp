<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>
</title>
    <script type="text/javascript" src="../../../js/jquery-1.10.2.min.js"></script>
    <script src="../../js/jquery.form.js"></script>
    <script type="text/javascript">
        var deleteFunction = function (id) {

            if (!confirm("你确定要删除该食材吗？")) {
                return false;
            }

            $.ajax({
                url: "./delete/" + id,
                type: "GET",
                contentType: "text/html; charset=utf-8",
                dataType: "text"
            }).done(function (data) {
                        if (data == "success") {
                            alert("删除成功！");
                            document.location.reload();
                        }
                        else {
                            alert("删除失败！");
                        }
                    });
        }

    </script>
</head>
<body>
<h3>菜谱列表</h3>
<table cellspacing="0" rules="all" border="1" id="dgCategory" style="border-color:#CCCCCC;border-collapse:collapse;">
    <tr style="color:White;background-color:#666666;">
        <td>名称</td>
        <td>头图</td>
        <td>7天点击数</td>
        <td>添加时间</td>
        <td>操作</td>
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

        <td>${cookbook.name}</td>
        <td><img src="http://img.caiuu.com/${cookbook.headPic}"/></td>
        <td>${cookbook.hitLast}</td>
        <td>${cookbook.publishTime}</td>
        <td>分类 <a href="./edit/${cookbook.id}">修改</a> <a href="#" onclick="return deleteFunction('${cookbook.id}')">删除</a> </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
