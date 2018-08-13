<%--
  Created by IntelliJ IDEA.
  User: 26342
  Date: 2018/8/9
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学员信息修改</title>
</head>
<body>
<form action="/student" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" name="id" value="${s.id}">
    姓名：<input type="text" name="name" value="${s.name}" /><br/>
    QQ：<input type="text" name="qq" value="${s.qq}"/><br/>
    修真类型：<input type="text" name="types" value="${s.types}"/><br/>

    毕业院校：<input type="text" name="school" value="${s.school}"/><br/>
    线上学号：<input type="text" name="studentId" value="${s.studentId}"/><br/>
    日报链接：<input type="text" name="dailyLink" value="${s.dailyLink}"/><br/>
    立愿：<input type="text" name="wish" value="${s.wish}"/><br/>
    线上师兄：<input type="text" name="coach" value="${s.coach}"/><br/>
    从哪里了解到修真院：<input type="text" name="knowFrom" value="${s.knowFrom}"/><br/>
    <input type="submit" value="更新">
    <input type="reset" value="重置">
</form>
</body>
</html>
