<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>
    </title>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
    <script src="../../js/jquery.form.js"></script>
    <script src="../../js/jquery.uploadify.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="../../css/uploadify.css">
    <script type="text/javascript">
        $(function () {
            $("#file").uploadify({
                method: 'post',
                swf: '../../../js/uploadify.swf',  // uploadify.swf在项目中的路径
                uploader: '../update',  // 后台UploadController处理上传的方法
                fileObjName: 'file',         // The name of the file object to use in your server-side script
                successTimeout: 30,                 // The number of seconds to wait for Flash to detect the server's response after the file has finished uploading
                removeCompleted: false,              // Remove queue items from the queue when they are done uploading
                fileSizeLimit: '10MB',
                buttonText: '选择文件',
                height: 30,
                width: 120,
                onUploadSuccess: function (file, data, response) {//上传完成时触发（每个文件触发一次）
                    var divshow = $("#showUpload");
                    divshow.append("<img src=\"" + data + "\"/>");
                    divshow.append("<a href=\"../sethead/");
                    divshow.append(${cookbook.id});
                    divshow.append("/").append(data);
                    divshow.append("\">设为头图</a>");
                }
            });
        });


    </script>
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
                document.location = "../list/1";
            }

            alert("修改错误！");
        }


    </script>
</head>
<body>
<form method="post" action="../update" id="cookbookForm" enctype="multipart/form-data">
    <h2>
        修改菜谱&nbsp;&nbsp;&nbsp;<a href="../list/1">菜谱列表</a>
    </h2>
    <input name="id" type="hidden" value="${cookbook.id}"/>
    <table border="1">
        <tr>
            <td>名称：</td>
            <td colspan="2"><input name="name" type="text" id="name" value="${cookbook.name}" style="width:234px;"/>
                <input type="hidden" name="headPic" value="${cookbook.headPic}"/>
            </td>

        </tr>
        <tr>
            <td>简介：</td>
            <td><textarea name="profile" rows="2" cols="20" id="profile"
                          style="height:148px;width:736px;">${cookbook.profile}</textarea>
            </td>
            <td>
                批量上传:
                <div id="queue"></div>
                <input id="file" name="file" type="file" multiple="true">
            </td>
        </tr>
        <tr>
            <td>内容：</td>
            <td><textarea name="info" rows="2" cols="40" id="info"
                          style="height:148px;width:736px;">${detail.info}</textarea>
            </td>
            <td>
                <p><img src="${cookbook.headPic}"/></p>
                <div id="showUpload"></div>
            </td>
        </tr>
        <tr>
            <td>创建时间：</td>
            <td colspan="2"><input name="publishTime" type="text" id="createTime" value="${cookbook.publishTime}"
                                   readonly="true" style="width:234px;"/>
            </td>
        </tr>
        <tr>
            <td>点击次数：</td>
            <td colspan="2"><input name="hit" type="text" id="hit" value="${cookbook.hit}" readonly="true"
                                   style="width:234px;"/></td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <input type="submit" name="btnSubmit" value="修改菜谱" id="btnSubmit"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
