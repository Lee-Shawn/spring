<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/11
  Time: 18:49
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
    <title>fail</title>
  </head>
  <body>
    未登录，无权访问
  </body>
</html>