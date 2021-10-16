<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/11
  Time: 18:53
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
    <title>logout</title>
  </head>
  <body>
    <%session.removeAttribute("user");%>
    退出登录
  </body>
</html>