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

        .STYLE2 {
            color: #FF0000;
            font-size: 12px;
        }
    </style>
    <script type="text/javascript">

        $(document).ready(function () {
            var options = {
                //beforeSubmit:  showRequest,  // 提交前调用的方法
                success: showResponse  // 返回后笤俑的方法
            };

            // 绑定FORM提交事件
            $('#cookbookForm').submit(function () {
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
<form method="post" action="../update" id="cookbookForm">

    <h2>
        修改菜谱&nbsp;&nbsp;&nbsp;<a href="./list">菜谱列表</a>
    </h2>
    <input name="id" type="hidden" value="${cookbook.id}"/>

    <p>名称：<input name="name" type="text" id="name" value="${cookbook.name}" style="width:234px;"/></p>

    <p>简介：<textarea name="profile" rows="2" cols="20" id="profile"
                    style="height:148px;width:736px;">${cookbook.profile}</textarea>
    </p>

    <p>内容：<textarea name="info" rows="2" cols="20" id="info"
                    style="height:148px;width:736px;">${detail.info}</textarea>
    </p>

    <p>创建时间：<input name="publishTime" type="text" id="createTime" value="${cookbook.publishTime}" readonly="true" style="width:234px;"/>
    </p>

    <p>点击次数：<input name="hit" type="text" id="hit" value="${cookbook.hit}" readonly="true" style="width:234px;"/></p>

    <p>
        <input type="submit" name="btnSubmit" value="修改菜谱" id="btnSubmit"/>
    </p>
</form>
</body>
</html>
