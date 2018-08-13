<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学员</title>

</head>
<body>
<form action="/trainees" method="post" enctype="multipart/form-data">
    姓名：<input type="text" name="displayName" /><br/>
    简介：<input type="text" name="description"/><br/>
    头像：<input type="text" name="headImage"><br/>

    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
