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
        <h3 style="color: cornflowerblue">欢迎您，<%=admin.getaName()%></h3>
        <a href="#" style="color: red">发布招聘信息</a>　　　
        <a href="toDepmanagePage" style="color: coral">部门管理</a>　　　
        <a href="#" style="color: mediumslateblue">录用申请</a>　　　
        <a href="#" style="color: darkviolet">薪资结算</a>　　　
        <a href="#" style="color: orange">考勤管理</a>　　　
        <a href="#" style="color: greenyellow">培训管理</a>　　　
        <a href="#" style="color: fuchsia">奖惩管理</a>　　　
        <a href="http://localhost:8066/HumanResources/" style="color: gold">退出</a>　　　
    </div>
</div>
</body>
</html>
