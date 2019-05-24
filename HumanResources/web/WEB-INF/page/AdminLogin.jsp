<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Dbbbyt
  Date: 2019/5/22
  Time: 10:37
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
    <title>商家登录</title>

</head>
<body>
<form action="adminLogin" method="post" style="padding-top: 150px">
    <table align="center" border="1px" cellpadding="20px" style="background-color: greenyellow">
        <tr>
            <td colspan="2" align="center">欢迎登录</td>
        </tr>
        <tr>
            <td>账号：</td>
            <td>
                <input type="text" name="aName" placeholder="请输入用户名" required>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="aPassword" placeholder="请输入密码" required>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登录"><br/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
