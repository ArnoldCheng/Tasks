
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<html>
<head>
    <title>JSON格式</title>
</head>
<body>
<json:object>
    <json:array name="s" var="student" items="${students}">
        <json:object prettyPrint="true">
            <json:object name="学生${student.id}"/>
            <json:property name="姓名" value="${student.name}"/>
            <json:property name="QQ" value="${student.qq}"/>
            <json:property name="修真类型" value="${student.types}"/>
            <json:property name="预计入学时间" value="${student.startDate }"/>
            <json:property name="毕业院校" value="${student.school}"/>
            <json:property name="线上学号" value="${student.studentId}"/>
            <json:property name="日报链接" value="${student.dailyLink}"/>
            <json:property name="立愿" value="${student.wish}"/>
            <json:property name="线上师兄" value="${student.coach}"/>
            <json:property name="从哪里了解到修真院" value="${student.knowFrom}"/>
        </json:object>
    </json:array>
</json:object>
</body>
</html>
