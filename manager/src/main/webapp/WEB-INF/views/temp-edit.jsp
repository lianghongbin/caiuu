<%@ page import="java.util.List" %>
<%@ page import="com.meishihome.core.entity.CategoryLink" %>
<%@ page import="com.meishihome.core.entity.Category" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>

    </title>
    <style>
        form {
            margin: 0;
        }

        textarea {
            display: block;
        }
    </style>
    <link rel="stylesheet" href="../../js/kindeditor-4.1.7/themes/default/default.css"/>
    <script charset="utf-8" src="../../js/kindeditor-4.1.7/kindeditor-min.js"></script>
    <script charset="utf-8" src="../../js/kindeditor-4.1.7/lang/zh_CN.js"></script>
    <script type="text/javascript" src="../../js/jquery-1.10.2.min.js"></script>
    <script>
        var editor;
        KindEditor.ready(function (K) {
            editor = K.create('textarea[name="info"]', {
                allowFileManager: true
            });
            K('input[name=getHtml]').click(function (e) {
                alert(editor.html());
            });
            K('input[name=isEmpty]').click(function (e) {
                alert(editor.isEmpty());
            });
            K('input[name=getText]').click(function (e) {
                alert(editor.text());
            });
            K('input[name=selectedHtml]').click(function (e) {
                alert(editor.selectedHtml());
            });
            K('input[name=setHtml]').click(function (e) {
                editor.html('<h3>Hello KindEditor</h3>');
            });
            K('input[name=setText]').click(function (e) {
                editor.text('<h3>Hello KindEditor</h3>');
            });
            K('input[name=insertHtml]').click(function (e) {
                editor.insertHtml('<strong>插入HTML</strong>');
            });
            K('input[name=appendHtml]').click(function (e) {
                editor.appendHtml('<strong>添加HTML</strong>');
            });
            K('input[name=clear]').click(function (e) {
                editor.html('');
            });
        });
    </script>

    <script type="text/javascript">
        var deleteFunction = function (id) {

            if (!confirm("你确定要删除这个采集的菜谱吗？")) {
                return false;
            }

            $.ajax({
                url: "../delete/" + id,
                type: "GET",
                contentType: "text/html; charset=utf-8",
                dataType: "text"
            }).done(function (data) {
                        if (data == "success") {
                            alert("删除成功！");
                            document.location = "../list";
                        }
                        else {
                            alert("删除失败！");
                        }
                    });
        }

        var submitCheck = function () {
            var val = $("input[name='categoryId']:checked").val();
            if (val == null) {
                alert("请选择所属分类！")
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
<input type="button" value="删除这个菜"
       style="height:40px;width:100px;font-size:14px;background-color:red;font-weight:bold;"
       onclick="deleteFunction('${temporary.id}')"/>

<form id="tempForm" action="../view" method="post" onsubmit="return submitCheck()">
    <div>
        <table width="95%" border="1">
            <tr height="50">
                <td width="72"></td>
                <td colspan="2">&nbsp;
                    <input type="submit"
                           style="height:40px;width:100px;font-size:14px;background-color:green;font-weight:bold;"
                           name="Button2" value="提交修改" id="Button3"/>&nbsp;

                <td width="306">用GOOGLE浏览效果好。</td>
            </tr>
            <tr height="60">
                <td>标题：</td>
                <td colspan="2">
                    <input type="hidden" name="id" value="${temporary.id}"/>
                    <input type="text" style="height:30px;width:700px;font-size:14px;"
                           value="${temporary.title}" name="title"/>&nbsp;&nbsp;
                    <a href="${temporary.url}" target="_blank">${temporary.url}</a>
                    <input type="hidden" name="source" value="${temporary.source}"/>
                    <input type="hidden" name="url" value="${temporary.url}"/></td>
                <td>&nbsp;</td>
            </tr>
            </tr>
            <tr>
                <td></td>
                <td width="805" valign="top">
                    <textarea name="info" style="width:800px;height:1800px;visibility:hidden;">${detail.info}</textarea>
                </td>
                <td width="363" valign="top">

                    <%!
                        StringBuffer buffer = new StringBuffer();

                        void printCategory(CategoryLink link) {
                            Category category = link.getCategory();
                            List<CategoryLink> categoryLinks = link.getChildren();
                            if (category.getParentId() == 0 || (categoryLinks != null && categoryLinks.size() > 0)) {
                                buffer.append("<p>");
                                buffer.append(link.getCategory().getName());
                                buffer.append("</p>");
                            } else {
                                buffer.append("<input type='radio' name='categoryId' value='" + category.getId() + "'>");
                                buffer.append(category.getName());
                                buffer.append("&nbsp;");
                            }

                            if (categoryLinks == null || categoryLinks.size() == 0) {
                                return;
                            }

                            buffer.append("<p>");
                            for (CategoryLink next : link.getChildren()) {
                                printCategory(next);
                            }
                            buffer.append("</p>");
                        }
                    %>
                    <%

                        List<CategoryLink> categoryLinks = (List<CategoryLink>) request.getAttribute("categoryLinks");

                        for (CategoryLink link : categoryLinks) {
                            printCategory(link);
                        }

                        out.print(buffer.toString());
                    %>


                </td>
                <td valign="top">材料：
                    <textarea name="profile" rows="27" cols="37"></textarea>
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
