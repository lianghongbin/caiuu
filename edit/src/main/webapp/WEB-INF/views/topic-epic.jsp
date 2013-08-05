<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>

    </title>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
    <script src="../../js/jquery.form.js"></script>
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
            $('#topicForm').submit(function () {
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
<form method="post" action="../upic" id="topicForm" enctype="multipart/form-data">

    <h2>
        修改专题图片&nbsp;&nbsp;&nbsp;<a href="../list">专题管理</a></a>
    </h2>
    <input name="id" type="hidden" value="${id}"/>

    <p><input name="title" value="${title}" readonly="true"/></p>

    <p>广告图：&nbsp;<span class="STYLE2"> (990x200)</span></p>

    <p><img src="${adPic}"/></p>

    <p>缩略图：&nbsp;<span class="STYLE2">（160x120）</span></p>

    <p><img src="${headPic}"/></p>

    <p>&nbsp;

    <p class="auto-style1">重新上传

    <p>广告图：<input type="file" name="adPic"/>
        &nbsp;<span class="STYLE2"> (宽990，高不限)</span></p>

    <p>缩略图：<input type="file" name="headPic"/>
        &nbsp;<span class="STYLE2">（160x120）</span></p>

    <p>
        <input type="submit" name="btnSubmit" value="提交专题" id="btnSubmit"/>
    </p>
</form>
</body>
</html>
