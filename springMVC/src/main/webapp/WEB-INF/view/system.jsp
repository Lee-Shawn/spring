<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/11
  Time: 18:50
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
    <title>system</title>
  </head>
  <body>
      欢迎进入系统
  </body>
</html>