<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/5
  Time: 14:48
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
    <title>student.jsp</title>
  </head>
  <body>
      name = ${myName}</br>
      age = ${myAge}</br>
      student = ${myStudent}
  </body>
</html>