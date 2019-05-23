<%--
  Created by IntelliJ IDEA.
  User: 11929
  Date: 2019/5/13
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>人力资源管理系统</title>
</head>
<body>
<div style="background-color: bisque;width: 100%;height: 100%">
    <h1 align="center" style="color: cornflowerblue;">欢迎您的到来</h1>
    <div align="center" style="padding-top: 10px;position: relative;float: left;left: 735px">


    </div>
    <div style="position: relative;float: left;left: 1550px;top: -5px">
        <a href="toRegisterPage" style="color: darkviolet">注册</a><br/><br/>
        <a href="test?method=checkLogin" style="color: lime">登录</a><br/><br/>
        <a href="toAdminLoginPage" style="color:darkorange ">管理登录</a><br/>
    </div>
</div>
</body>
</html>
