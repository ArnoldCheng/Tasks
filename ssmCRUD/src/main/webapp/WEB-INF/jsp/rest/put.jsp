
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>更新</title>
   <%-- <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            &lt;%&ndash;$( "#datepicker" ).val(${s.startDate}),&ndash;%&gt;
            $( "#datepicker" ).datepicker({
                defaultDate: '${s.startDate}',
                dateFormat: "yy-mm-dd",

            });
        } );
    </script>--%>
</head>
<body>
<form action="/rest/student" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" name="id" value="${s.id}">
    姓名：<input type="text" name="name" value="${s.name}" /><br/>
    QQ：<input type="text" name="qq" value="${s.qq}"/><br/>
    修真类型：<input type="text" name="types" value="${s.types}"/><br/>
    预计入学时间：<input type="text" id="datepicker" name="startDate" value="${startDate}"><br/>
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
