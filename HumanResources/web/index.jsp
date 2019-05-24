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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(document).ready(function () {
            $(".open").click(function () {
               $(".hidebg").css('display','block');
               $(".hidebg").style.height=document.body.clientHeight+"px";

            })

            $(".close").click(function () {
               $(".hidebg").css('display','none')
            })
        })

    </script>
    <style>
        h3{font-family: 宋体}
        a{text-decoration:none}
        /*超链接在浏览之前的样式*/
        a:link{color:red}

        /*超链接浏览之后的样式*/
        a:visited{color:green}

        /*鼠标悬停在超链接上面时的样式*/
        a:hover{color: yellow}

        /*超链接在鼠标按下时的样式*/
        a:active{color:blue}

        .hidebg {
            position:absolute; left:0px; top:0px;
            text-align:center;
            background-color:#000;
            width:100%;
            height: 100%;
            filter:alpha(opacity=100);
            opacity:0.9;
            z-Index:2;
        }
    </style>
</head>
<body>
<div style="background-color: bisque;width: 100%;height: 100%">
    <h1 align="center" style="color: cornflowerblue;font-family: 宋体">欢迎您的到来</h1>

    <h3 style="margin-top: 150px" align="center"><a style="font-size: xx-large">招聘广场</a></h3>
    <h3 align="center"><a href="toRegisterPage" style="font-size: xx-large">注册</a></h3>
    <h3 align="center"><a href="test?method=checkLogin" style="font-size: xx-large">登录</a></h3>
    <h3 align="center"><a href="toAdminLoginPage" style="font-size: xx-large">员工入口</a></h3>
    <%--<h3 align="center"><a href="toAdminLoginPage" style="font-size: xx-large">员工入口</a></h3>--%>
    <input type="button" value="登录" class="open" />

    <div id="hidebg" class="hidebg" style="display:none">

        <form action="adminLogin" method="post" style="padding-top: 150px">
            <table align="center" border="1px" cellpadding="20px" style="background-color: greenyellow">
                <tr>
                    <td colspan="2" align="center">欢迎登陆人力资源系统</td>
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
                        <input type="reset" value="重输" class="input1" />
                        <input type="button" value="退出" class="close"/>
                        <input type="submit" value="登录" class="input2" />
                    </td>
                </tr>
            </table>
        </form>

    </div>
</div>
</body>
</html>
