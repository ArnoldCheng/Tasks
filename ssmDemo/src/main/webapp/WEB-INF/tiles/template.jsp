<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tiles框架使用</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
    <link href="/css/Untitled-3.css" rel="stylesheet" type="text/css">
    <link href="/css/Untitled-1base.css" rel="stylesheet" type="text/css">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

<header>
    <tiles:insertAttribute name="header" />
</header>
<main>
    <tiles:insertAttribute name="body" />
</main>
<footer>
    <tiles:insertAttribute name="footer"/>
</footer>
</body>
</html>
