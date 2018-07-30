<%--
  Created by IntelliJ IDEA.
  User: 26342
  Date: 2018/7/28
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REST首页</title>
</head>
<body>
<h3>用户管理</h3>
<a href="/rest/students/1">用户列表</a>
<form action="/rest/student" method="get"><input type="submit" value="用户添加"></form>
<h3>其他管理</h3>
</body>
</html>
