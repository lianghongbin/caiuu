<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
    <script src="../../js/jquery.form.js"></script>
    <script type="text/javascript">

        $(document).ready(function () {
            var options = {
                //beforeSubmit:  showRequest,  // 提交前调用的方法
                success: showResponse  // 返回后笤俑的方法
            };

            // 绑定FORM提交事件
            $('#materialForm').submit(function () {
                $(this).ajaxSubmit(options);

                return false;
            });
        });

        function showResponse(responseText, statusText) {
            if (responseText == 'success') {
                alert("修改成功！");
                document.location = "../list";
            }

            alert("修改错误！");
        }
    </script>
</head>
<body>
<h2>食材修改</h2>

<form id="materialForm" method="post" action="../update">
    <table cellspacing="0" rules="all" border="1" id="Table1" style="width:100%;border-collapse:collapse;">
        <input type="hidden" name="id" value="${material.id}"/>
        <tr>
            <td>名称</td>
            <td><input name="name" type="text" id="name" value="${material.name}"/></td>
        </tr>
        <tr>
            <td>别名</td>
            <td><input name="sname" type="text" id="sname" value="${material.sname}"/></td>
        </tr>
        <tr>
            <td>菜类</td>
            <td>
                <select name="categoryId">
                    <c:forEach items="${categories}" var="category">
                        <option value="${category.id}" <c:if test="${category.id==material.category.id}">selected</c:if>>${category.name}</option>
                    </c:forEach>

                </select>
            </td>
        </tr>

        <tr>
            <td>祥细</td>
            <td><textarea name="info" id="info">${material.info}</textarea></td>
        </tr>
        <tr>
            <td>营养</td>
            <td>
                <textarea name="alimentation" id="alimentation">${material.alimentation}</textarea>
            </td>
        </tr>
        <tr>
            <td>人群</td>
            <td><textarea name="human" id="human">${material.human}</textarea></td>
        </tr>
        <tr>
            <td>做法</td>
            <td><textarea name="make" id="make">${material.make}</textarea></td>
        </tr>

        <tr>
            <td>食疗、健康</td>
            <td><textarea name="cure" id="cure">${material.cure}</textarea></td>
        </tr>
        <tr>
            <td>其他</td>
            <td><textarea name="other" id="other">${material.other}</textarea></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><textarea name="remark" id="remark">${material.remark}</textarea></td>
        </tr>
        <tr>
            <td>冲突</td>
            <td><textarea name="conflict" id="conflict">${material.conflict}</textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="修改食材"/></td>
        </tr>
    </table>
</form>
</body>
</html>
