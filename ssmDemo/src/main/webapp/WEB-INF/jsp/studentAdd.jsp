<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学员</title>

</head>
<body>
<form action="/student" method="post">
    姓名：<input type="text" name="name" /><br/>
    QQ：<input type="text" name="qq"/><br/>
    修真类型：<input type="text" name="types"/><br/>

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
