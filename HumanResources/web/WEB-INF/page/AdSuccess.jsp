<%@ page import="com.iotek.model.TAdmin" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Dbbbyt
  Date: 2019/5/22
  Time: 11:00
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
    <title>欢迎来到管理页面</title>

    <style>
        a{text-decoration:none}
        /*超链接在浏览之前的样式*/
        a:link{color:red}

        /*超链接浏览之后的样式*/
        a:visited{color:green}

        /*鼠标悬停在超链接上面时的样式*/
        a:hover{color: darkorange}

        /*超链接在鼠标按下时的样式*/
        a:active{color:blue}
    </style>

</head>
<body>
<%
    TAdmin admin = (TAdmin) session.getAttribute("a");
%>
<div>
    <%--<div>--%>
        <%--<img src="../../img/ad01.jpg" style="background-repeat: no-repeat;position: relative;"/>--%>
    <%--</div>--%>
    <div align="center" style="align-content: center;padding-top: 10px;">
        <h1 style="color: darkviolet">欢迎您，<%=admin.getaName()%></h1>
        <a href="#" >发布招聘信息</a>　　　
        <a href="toDepmanagePage" >部门管理</a>　　　
        <a href="#" >录用申请</a>　　　
        <a href="#" >薪资结算</a>　　　
        <a href="#" >考勤管理</a>　　　
        <a href="#" >培训管理</a>　　　
        <a href="#" >奖惩管理</a>　　　
        <a href="http://localhost:8066/HumanResources/" >退出</a>　　
        　
    </div>
</div>
</body>
</html>
