<%--
  Created by IntelliJ IDEA.
  User: yun
  Date: 2021/4/7
  Time: 19:15
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
    <title>spring mvc</title>
    <script type="text/javascript" src="static/js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function(){
            $("button").click(function(){
                $.ajax({
                    url:"string/ajax.do",
                    data:{
                        name:"无敌",
                        age:"88"
                    },
                    type:"post",
                    dataType:"json",
                    success:function(resp){
                        alert("resp:"+resp.name+","+resp.age);
                    }
                });
            });
        });
    </script>
  </head>
  <body>
    第一个SpringMVC项目</br>
    <a href="hello/some.do">发起some.do请求</a></br>

    POST请求</br>
    <form action="hello/other.do" method="post">
        <input type="submit" value="发起other.do请求" />
    </form>

    接收请求参数</br>
    <form action="hello/param.do" method="post">
        姓名：<input type="text" name="name" /></br>
        年龄：<input type="text" name="age" /></br>
        <input type="submit" value="提交" />
    </form>

    请求参数名称与形参不一致</br>
    <form action="hello/different.do" method="post">
            姓名：<input type="text" name="lName" /></br>
            年龄：<input type="text" name="lAge" /></br>
            <input type="submit" value="提交" />
    </form>

    形参是Java对象</br>
    <form action="hello/student.do" method="post">
            姓名：<input type="text" name="name" /></br>
            年龄：<input type="text" name="age" /></br>
            <input type="submit" value="提交" />
    </form>

    返回类型是string</br>
    <form action="string/returnString.do" method="post">
            姓名：<input type="text" name="name" /></br>
            年龄：<input type="text" name="age" /></br>
            <input type="submit" value="提交" />
    </form>

    返回类型是void</br>
    <button>发起ajax请求</button>
  </body>
</html>