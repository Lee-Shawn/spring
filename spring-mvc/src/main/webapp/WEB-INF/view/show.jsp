<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/5
  Time: 12:55
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
    <title>show.jsp</title>
  </head>
  <body>
    <h3>msg数据：${msg}</h3></br>
    <h3>fun数据：${fun}</h3></br>
  </body>
</html>