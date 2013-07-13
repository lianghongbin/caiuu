<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title>

</title>
    <script type="text/javascript" src="../../../js/jquery-1.10.2.min.js"></script>
    <script src="../../../js/jquery.form.js"></script>
    <style type="text/css">
        body,div,p,table,td,span,a{ font-size:14px;}
        .STYLE2 {color: #FF0000;font-size:12px;}
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
<form method="post" action="../update" id="topicForm">

    <h2>
        添加新专题&nbsp;&nbsp;&nbsp;<a href="./list">专题管理</a>&nbsp;&nbsp;<a href="TopicCaipu.aspx">专题-菜谱管理</a>
    </h2>
            <input name="id" type="hidden" value="${topic.id}"/>
        <p>标题：<input name="title" type="text" id="title" value="${topic.title}" style="width:234px;" />
            &nbsp;<span class="STYLE2">9个汉字以内</span></p>
        <p>URL：www.caiuu.com/topic/<input name="url" type="text" id="url" value=${topic.url} style="width:123px;" />/<span class="STYLE2">（纯字母）</span></p>
        <p>简介：<textarea name="remark" rows="2" cols="20" id="remark" style="height:148px;width:736px;">${topic.remark}</textarea>
        </p>
        <p>关键词：<input name="key1" type="text" id="key1" value="${topic.key1}" style="width:85px;" />
            &nbsp;<input name="key2" type="text" id="key2" value="${topic.key2}" style="width:85px;" />
            &nbsp;<input name="key3" type="text" id="key3" value="${topic.key3}" style="width:85px;" />
            &nbsp;<span class="STYLE2">设置3个关键词，系统自动生成专题和菜谱的关系</span></p>

        <p>百科ID：<input name="materialId" type="text" id="materialId" value="${topic.materialId}" />
            &nbsp;<span class="STYLE2">将与百科内容关联</span>
        </p>
        <p>
            <input type="submit" name="btnSubmit" value="提交专题" id="btnSubmit" />
        </p>
</form>
</body>
</html>
