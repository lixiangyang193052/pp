<%@ page import="com.iotek.model.TDep" %>
<%@ page import="java.util.List" %>
<%@ page import="com.iotek.model.TJob" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Dbbbyt
  Date: 2019/5/23
  Time: 14:04
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
    <title>部门职位管理</title>
</head>
<script src="../../js/jquery-3.1.0.js"></script>
<script>
    $(document).ready(function () {

        $(":button").click(function () {

                alert("ok");

        })

        $("#did").change(function () {
            $.ajax({
                type: "get",
                url: "ganged",
                data: {did: $("#did").val()},
                success: function (data) {
                    for (var i in data){
                        var job = data[i];
                        var jName= job['jName'];
                        alert(jName);
                        // var t= data[i]['jName'];
                        // alert(t);
                    }
                }
            });
        })

    })
</script>
<body>
<div style="align-content: center;padding-top: 100px">
    <table border="1px" align="center" cellpadding="10px" style="background-color: orange">
        <tr>
            <th>部门</th>
            <th>职位</th>
            <th>员工</th>
            <th>删除</th>
            <th>修改</th>
        </tr>

        <%
            List<TDep> deps = (List<TDep>) session.getAttribute("Deps");

            if (deps!=null&&deps.size()!=0){
        %>
        <tr>
            <td align="center">

                <select  id="did">
                    <%
                        for (TDep dep : deps) {
                    %>
                            <option  value="<%=dep.getdId()%>"><%=dep.getdName()%></option>
                    <%
                        }
                    %>
                </select>
            </td>

            <td align="center">

                <select  id="jid">

                </select>

            </td>
        </tr>

        <tr>
            <td colspan="1" align="center">
                <a href="#" style="background-color: whitesmoke">返回</a>
            </td>
            <td colspan="3" align="center"><a href="#">添加部门职位</a></td>
            <td colspan="1" align="center"><a href="http://localhost:8066/HumanResources/">退出</a></td>
        </tr>
        <%    }else {
        %>
        <tr>
            <td colspan="5" align="center">
                还没有部门信息，请添加...
            </td>
        </tr>
        <tr>
            <td colspan="1" align="center">
                <a href="#" style="background-color: whitesmoke">返回</a>
            </td>
            <td colspan="3" align="center"><a href="#">添加部门职位</a></td>
            <td colspan="1" align="center"><a href="http://localhost:8066/HumanResources/">退出</a></td>
        </tr>


        <%
                //还没有任何详情，请添加
            }
        %>
    </table>
</div>
</body>
</html>
