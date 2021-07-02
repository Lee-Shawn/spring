<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/11
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
  <base href="<%=basePath%>">
    <title>listStudent.jsp</title>
    <script type="text/javascript" src="static/js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function(){
            // 在当前页面dom对象加载后，执行stuInfo
            stuInfo();
            $("#btnLoader").click(function() {
                stuInfo();
            })
        })
        function stuInfo() {
            $.ajax({
                url: "student/queryStudent",
                type: "post",
                dataType: "json",
                success: function(data) {
                    // 清除旧数据
                    $("#stuBody").html("");
                    // 增加新数据
                    $.each(data, function(i, n) {
                        $("#stuBody").append("<tr>")
                            .append("<td>" + n.id + "</td>")
                            .append("<td>" + n.name + "</td>")
                            .append("<td>" + n.age + "</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
  </head>
  <body>
    <div align="center">
        <p>查询学生数据</p>
        <table>
            <thead>
                <tr>
                    <td>id</td>
                    <td>姓名</td>
                    <td>年龄</td>
                </tr>
                <tbody id="stuBody">

                </tbody>
            </thead>
        </table>
        <input type="button" id="btnLoader" value="查询数据" />
    </div>
  </body>
</html>