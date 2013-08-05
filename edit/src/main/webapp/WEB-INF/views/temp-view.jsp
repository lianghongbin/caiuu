<%@ page import="com.meishihome.core.entity.Category" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title>
</title>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
    <script src="../../js/jquery.form.js"></script>
    <script type="text/javascript">

        $(document).ready(function () {
            var options = {
                beforeSubmit:  setData(),  // 提交前调用的方法
                success: showResponse  // 返回后笤俑的方法
            };

            // 绑定FORM提交事件
            $('#cookbookForm').submit(function () {
                $(this).ajaxSubmit(options);

                return false;
            });
        });

        function setData() {
            var viewInfo = $("#viewInfo").html();
            $("#info").val(viewInfo);
        }

        function showResponse(responseText, statusText) {
            if (responseText == 'success') {
                alert("提交菜单成功！");
                document.location = "./list";
            }

            alert("提交菜单失败！");
        }
    </script>
</head>
<body>
<form id="cookbookForm" action="../cookbook/add" method="post">
<p style="text-align:center;">
    <input type="submit" name="Button1" value="提交修改" id="Button1" class="aspNetDisabled" style="height:40px;width:100px;font-size:14px;background-color:green;font-weight:bold;" />
    <input type="Button" name="Button2" value=" 返回 " id="Button4" onclick="history.go(-1);" />
</p>
<div>
    <h1>${temporary.title}</h1>
    <p style="background-color:#f2f2f2;padding:10px;">
        作者：${temporary.source}  URL：${temporary.url}
    </p>
    <p style="background-color:#f2f2f2;padding:10px;">
        菜系：
        <%
            List<Category> categories = (List<Category>) request.getAttribute("categoryFamily");
            StringBuffer buffer = new StringBuffer(categories.size());
            for (Category category : categories) {
                if (buffer.length() > 0) {
                    buffer.append("-");
                }
                buffer.append(category.getName());
            }

            out.print(buffer.toString());
        %>
    </p>
    <p id="viewInfo" style="background-color:#f2f2f2;padding:10px;">${info}</p>
</div>

<div style="display:none">
    <input name="temporaryId" type="hidden" value="${temporary.id}" readonly="true"/>
    <input name="name" type="text" value="${temporary.title}" readonly="readonly" />
    <input name="profile" type="text" value="${profile}" readonly="readonly" />
    <textarea name="info" rows="2" cols="20" id="info"></textarea>
    <input name="author" type="text" value="${temporary.source}" readonly="readonly" />
    <input name="url" type="text" value="${temporary.url}" readonly="readonly" />
    <input name="pid" type="text" value="${category.parentId}" readonly="readonly" />
    <input name="categoryId" type="text" value="${category.id}" readonly="readonly" />
    <input name="cname" type="text" value="${category.name}" readonly="readonly" />
</div>
<p style="text-align:center;">
    <input type="submit" name="Button2" value="提交修改" id="Button2"  class="aspNetDisabled" style="height:40px;width:100px;font-size:14px;background-color:green;font-weight:bold;" />
    <input type="Button" name="Button2" value=" 返回 " id="Button3" onclick="history.go(-1);" />
</p>
</form>
</body>
</html>
