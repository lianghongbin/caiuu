<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>

    </title>
    <script type="text/javascript" src="../../../js/jquery-1.10.2.min.js"></script>
    <script src="../../../js/jquery.form.js"></script>
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
            $('#staticForm').submit(function () {
                $(this).ajaxSubmit(options);

                return false;
            });
        });

        function showResponse(responseText, statusText) {
            if (responseText == 'success') {
                alert("修改成功！");
                document.location = "../list";
            }

            alert("修改静态文本区错误！");
        }
    </script>
</head>
<body>
<form method="post" action="../update" id="staticForm">
    <h2>
        添加/修改站点文本内容&nbsp;&nbsp;&nbsp;<a href="./list">文本内容管理</a>
    </h2>

        <p>ID号：<input name="id" type="text" value="${staticBlock.id}" size="50" readonly="readonly" id="id"/></p>

        <p>标题：<input name="title" type="text" value="${staticBlock.title}" size="50" id="title"/></p>

        <p>内容：<textarea name="content" rows="2" cols="50" id="content" style="height:236px;width:743px;">${staticBlock.content}
        </textarea></p>

        <p><br/>
            <input type="submit" name="btnSubmit" value="修改文本" id="btnSubmit"/>
        </p>
</form>
</body>
</html>
