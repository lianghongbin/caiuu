<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title>
    <style type="text/css">
        body, div, p, table, td, span, a {
            font-size: 12px;
        }
    </style>
    <script type="text/javascript" src="../../../js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../../../js/jquery.form.js"></script>
    <style type="text/css">
        body, div, p, table, td, span, a {
            font-size: 14px;
        }
    </style>
    <script type="text/javascript">
        $(document).ready(function () {
            var options = {
                //beforeSubmit:  showRequest,  // 提交前调用的方法
                success: showResponse  // 返回后笤俑的方法
            };

            // 绑定FORM提交事件
            $('#mapForm').submit(function () {
                var contentId = $('#content');
                if (contentId.val().trim()=="") {
                    alert("请畭映射菜谱名称！");
                    contentId.val("");
                    contentId.focus();
                    return false;
                }

                $(this).ajaxSubmit(options);
                return false;
            });
        });

        function showResponse(responseText, statusText) {
            if (responseText == 'success') {
                alert("更新分类-菜谱映射成功！");
                document.location = "./list/0/1";
            }

            alert("菜谱映射成功失败！");
        }
    </script>
</head>
<body>
<form method="post" action="./add" id="mapForm">
    <div>
        <h2>添加分类-菜谱映射&nbsp;&nbsp;<a href="../list/0/1">分类-菜谱映射管理</a></h2>
        <p>
            <select name="categoryId" id="categoryId">
                <c:forEach items="${categories}" var="category">
                    <option value="${category.id}">${category.name}</option>
                </c:forEach>
            </select>
        </p>
        <p>
            菜谱名称：<textarea rows="10" cols="50" id="content" name="content"></textarea>
        </p>

        <input type="submit" value="添加" id="Button1"/>
        <br/>
        <br/>

    </div>
</form>
</body>
</html>
