<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加</title>
   <%-- <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#datepicker" ).datepicker({
                dateFormat: "yy-mm-dd"
            });
        } );
    </script>--%>
</head>
<body>
<form action="/rest/student" method="post">
    姓名：<input type="text" name="name" /><br/>
    QQ：<input type="text" name="qq"/><br/>
    修真类型：<input type="text" name="types"/><br/>
    预计入学时间：<input type="text" id="datepicker" name="startDate"><br/>
    毕业院校：<input type="text" name="school"/><br/>
    线上学号：<input type="text" name="studentId"/><br/>
    日报链接：<input type="text" name="dailyLink"/><br/>
    立愿：<input type="text" name="wish"/><br/>
    线上师兄：<input type="text" name="coach"/><br/>
    从哪里了解到修真院：<input type="text" name="knowFrom"/><br/>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
