<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="/tags" prefix="date"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>

</head>
<body>
<%--<a href="/rest/studentform">添加</a>--%>
<form action="/student/add" method="get"><input type="submit" value="添加"></form>
<div style="width:100%;margin:0px auto;text-align:center">
    <table border="1" cellpadding="5" cellspacing="0" bgcolor="F2F2F2"
           width="100%">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>QQ</td>
            <td>修真类型</td>
            <td>预计入学时间</td>
            <td>毕业院校</td>
            <td>线上学号</td>
            <td>日报链接</td>
            <td>立愿</td>
            <td>线上师兄</td>
            <td>从哪里了解到修真院</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <%--<c:if test="${students != null}" var="res">--%>
        <c:forEach items="${students}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.qq}</td>
                <td>${s.types}</td>
                <td> <date:date value="${s.startDate}" pattern="yyyy-MM-dd"/></td>
                <td>${s.school}</td>
                <td>${s.studentId}</td>
                <td>${s.dailyLink}</td>
                <td>${s.wish}</td>
                <td>${s.coach}</td>
                <td>${s.knowFrom}</td>
                <td><a href="/student/${s.id}">编辑</a></td>
                <td>
                    <form action="/student/${s.id}" method="post">
                        <input type="hidden" name="_method" value="delete"/>
                            <%--<input type="hidden" name="id" value="${id}">--%>
                        <input type="submit" value="删除">
                    </form>
                </td>
            </tr>
        </c:forEach>
        <%--  </c:if>--%>

    </table>

</div>
</body>
</html>
