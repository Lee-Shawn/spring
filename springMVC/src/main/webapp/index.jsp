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
                    //url:"string/json.do",
                    //url:"string/list.do",
                    url:"string/toString",
                    success:function(data){
                        //alert(data.name+","+data.age);

                        /*$.each(data, function(i, n) {
                            alert(n.name+","+n.age)
                        })*/

                        alert(data);
                    }
                });
            });
        });
    </script>
  </head>
  <body>
    返回自定义类型</br>
    <button>发起ajax请求</button></br>

    返回List类型</br>
    <button id="btnAjax">发起ajax请求</button></br>

    返回List类型</br>
    <button>发起ajax请求</button></br>

    forward请求转发</br>
    <form action="core/forward.do" method="post">
        姓名：<input type="text" name="name" /></br>
        年龄：<input type="text" name="age" /></br>
        <input type="submit" value="提交" />
    </form>

    redirect请求重定向</br>
    <form action="core/redirect.do" method="post">
        姓名：<input type="text" name="name" /></br>
        年龄：<input type="text" name="age" /></br>
        <input type="submit" value="提交" />
    </form>

    异常处理</br>
    <form action="core/handler" method="post">
        姓名：<input type="text" name="name" /></br>
        年龄：<input type="text" name="age" /></br>
        <input type="submit" value="提交" />
    </form>

    拦截器</br>
    <form action="core/interceptor" method="post">
        姓名：<input type="text" name="name" /></br>
        年龄：<input type="text" name="age" /></br>
        <input type="submit" value="提交" />
    </form>

    登录拦截验证</br>
    <form action="core/system" method="post">
        姓名：<input type="text" name="name" /></br>
        <input type="submit" value="系统" />
    </form>
  </body>
</html>