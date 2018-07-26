<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="common/tag.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表页</title>
</head>
<body>
<a href="/student/addPre">添加</a>

		<table border="1" cellpadding="5" cellspacing="0" bgcolor="F2F2F2"
			width="100%">
			<tr>
				<td>ID</td>
				<td>姓名</td>
				<td>QQ</td>
				<td>修真类型</td>
				<td>入学时间</td>
				<td>毕业院校</td>
				<td>线上学号</td>
				<td>日报链接</td>
				<td>立愿</td>
				<td>线上师兄</td>
				<td>从哪里了解到修真院</td>
				<td>操作</td>
				<td></td>
			</tr>
	<c:if test="${students != null}" var="res">
			<c:forEach items="${students}" var="s">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td>${s.qq}</td>
					<td>${s.types}</td>
					<%-- <td><%=new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date().getTime())%></td> --%>
					<td>
						<fmt:formatDate value="${s.startDate }" pattern="yyyy-MM-dd"/>
					</td>
					<td>${s.school}</td>
					<td>${s.studentId}</td>
					<td>${s.dailyLink}</td>
					<td>${s.wish}</td>
					<td>${s.coach}</td>
					<td>${s.knowFrom}</td>
					<td>
				</tr>
			</c:forEach>
	</c:if>
		</table>
</body>
</html>