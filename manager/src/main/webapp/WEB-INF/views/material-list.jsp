<%@ page import="com.caiuu.web.util.Page" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
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
<h2>食材管理</h2>

<p><%
    Page outPage = (Page) request.getAttribute("page");
    out.print(outPage.toString());
%></p>
<table cellspacing="0" rules="all" border="1" id="Table1" style="width:100%;border-collapse:collapse;">
    <tr align="center" style="background-color:#999999;">
        <td style="width:20px;">ID</td>
        <td style="width:100px;">名称(别名)</td>
        <td style="width:60px;">分类</td>
        <td style="width:120px;">图片</td>
        <td style="width:80px;">用量</td>
        <td style="width:120px;">详细</td>
        <td style="width:120px;">营养价值</td>
        <td style="width:120px;">相关人群</td>
        <td style="width:120px;">加工方式</td>
        <td style="width:120px;">食疗&健康</td>
        <td style="width:120px;">其它</td>
        <td style="width:120px;">备注</td>
        <td style="width:120px;">食物相克</td>
        <td style="width:60px;">点击</td>
        <td style="width:60px;">操作</td>
    </tr>
    <c:forEach items="${materials}" var="material" varStatus="status">
        <c:choose>
            <c:when test="${status.index%2==0}">
                <tr>
            </c:when>
            <c:otherwise>
                <tr style="background-color:#F2F2F2;">
            </c:otherwise>
        </c:choose>

        <td valign="top" align="center">${material.id}</td>
        <td valign="top" align="center">${material.name}<br/><font
                color="#999"><u>${material.sname}</u><br/><u>${material.aname}</u></font></td>
        <td valign="top" align="center">${material.category.name}</td>
        <td valign="top"><img src="${material.pic}"/></td>
        <td valign="top">${material.weight}</td>
        <td valign="top">${material.info}</td>
        <td valign="top">${material.alimentation}</td>
        <td valign="top">${material.human}</td>
        <td valign="top">${material.make}</td>
        <td valign="top">${material.cure}</td>
        <td valign="top">${material.other}</td>
        <td valign="top">${material.remark}</td>
        <td valign="top">${material.conflict}</td>
        <td valign="top" align="right">${material.hit}</td>
        <td valign="top" align="center">
            <a href="./view/${material.id}" target="_blank">食材</a><br/>
            <a href="./edit/${material.id}" target="_blank">修改</a><br/>
            <a href="#" onclick="return deleteFunction(${material.id})">删除</a><br/>
        </td>
        </tr>
    </c:forEach>
</table>
<p><%
    out.print(outPage.toString());
%></p>
</body>
</html>
