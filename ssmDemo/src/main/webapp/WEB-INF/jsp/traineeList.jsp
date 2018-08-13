<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>优秀学员</title>
</head>
<body>
<form action="/trainee/add" method="get"><input type="submit" value="添加"></form>
<div style="width:100%;margin:0px auto;text-align:center">
    <table border="1" cellpadding="5" cellspacing="0" bgcolor="F2F2F2"
           width="100%">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>简单描述</td>
            <td>头像</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <%--<c:if test="${traineess != null}" var="res">--%>
        <c:forEach items="${trainees}" var="t">
            <tr>
                <td>${t.id}</td>
                <td>${t.displayName}</td>
                <td>${t.description}</td>
                <td><img src="${t.headImage}"></td>
                <td><a href="/trainee/${t.id}">编辑</a></td>
                <td>
                    <form action="/trainee/${t.id}" method="post">
                        <input type="hidden" name="_method" value="delete"/>
                            <%--<input type="hidden" name="id" value="${id}">--%>
                        <input type="submit" value="删除">
                    </form>
                </td>
            </tr>
        </c:forEach>
        <%--</c:if>--%>

    </table>
</div>
</body>
</html>
