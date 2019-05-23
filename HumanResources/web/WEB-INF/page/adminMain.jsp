<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Dbbbyt
  Date: 2019/5/22
  Time: 13:37
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
    <title>提示信息</title>
</head>
<body>
<div style="align-content: center; margin-top: 100px;margin-left: 10px">
    <table align="center" style="align-content: center;border: 1px rosybrown solid">
        <tr style="border: 1px rosybrown solid ">
            <td align="center" style="border: 1px rosybrown solid ">提示:</td>
            <td align="center" style="border: 1px rosybrown solid ">${a}</td>
        </tr>
        <tr style="border: 1px rosybrown solid ">
            <td align="center" style="border: 1px rosybrown solid ">选择:</td>
            <td align="center" style="border: 1px rosybrown solid ">
                <a href="toAdminLoginPage">重新登录</a>　　　<a href="http://localhost:8066/HumanResources/">退出</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
