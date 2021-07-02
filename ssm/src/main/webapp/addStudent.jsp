<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/11
  Time: 9:24
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
    <title>addStudent.jsp</title>
  </head>
  <body>
    <div align="center">
        <p>学生注册页面</p>
        <form action="student/addStudent" method="post">
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="text" name="age" /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="注册" /></td>
            </tr>
        </form>
    </div>
  </body>
</html>