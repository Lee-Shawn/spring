<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/10
  Time: 18:30
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
    <title>index.jsp</title>
  </head>
  <body>
    <div align="center">
        <p>ssm-student操作</p>
        <img src="static/image/1.jpg" />
        <table cellpadding="0" cellspacing="0">
            <tr>
                <td><a href="addStudent.jsp">注册学生</a></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td><a href="listStudent.jsp">查询学生</a></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td><a href="pageStudent.jsp">分页查询</a></td>
            </tr>
        </table>
    </div>
  </body>
</html>