<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/11
  Time: 18:36
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
    <title>login</title>
  </head>
  <body>
    <%session.setAttribute("user", "lyj");%>
    登录成功
  </body>
</html>