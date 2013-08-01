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
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../../js/jquery.form.js"></script>
    <script type="text/javascript" src="../../js/calendar/jquery-calendar.js"></script>
    <link rel="stylesheet" type="text/css" href="../../js/calendar/jquery-calendar.css">
    <link rel="stylesheet" type="text/css" href="../../js/calendar/styles.css">
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
            $('#focusForm').submit(function () {
                $(this).ajaxSubmit(options);

                return false;
            });
        });

        function showResponse(responseText, statusText) {
            if (responseText == 'success') {
                alert("添加焦点图成功！");
                document.location = "list";
            }

            alert("添加焦点图失败！");
        }

        $(document).ready(function () {
            $("#publishTime").calendar();
        });
    </script>
</head>
<body>
<form method="post" action="save" id="focusForm" enctype="multipart/form-data">
    <div>
        <h2>添加焦点图&nbsp;&nbsp;<a href="list">焦点图管理</a></h2>

        <p>
            标题：<input name="title" type="text" style="width:370px;"/>
        </p>

        <p>
            URL：<input name="url" type="text" style="width:369px;"/>
        </p>

        <p>
            670*260图片：<input type="file" name="big"/>
        </p>

        <p>
            300*225图片：<input type="file" name="small"/>
        </p>

        <p>发布时间：<input type="text" name="publishTime" id="publishTime"></p>
        <input type="submit" value="添加" id="Button1"/>
        <br/>
        <br/>

    </div>
</form>
</body>
</html>
