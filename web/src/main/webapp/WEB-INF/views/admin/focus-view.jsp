<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>

</title>
    <style type="text/css">
        body,div,p,table,td,span,a{ font-size:12px;}
    </style>
</head>
<body>
<form method="post" action="focus/upload" id="form1" enctype="multipart/form-data">
    <div>
        <h2>
            添加焦点图</h2>
        <p>
            标题：<input name="title" type="text" id="title" style="width:370px;" />
        </p>
        <p>
            URL：<input name="url" type="text" id="url" style="width:369px;" />
        </p>
        <p>
            670*260图片：<input type="file" name="pic43" id="pic43" />
        </p>
        <p>
            300*225图片：<input type="file" name="pic21" id="pic21" />
        </p>
        <p>发布时间：<input name="txtPublishTime" type="text" value="20130709153300" id="txtPublishTime" /></p>
        <input type="submit" name="Button1" value="添加" id="Button1" />
        <br />
        <br />
        <a href="focus/list">焦点图管理</a>
    </div>
</form>
</body>
</html>
