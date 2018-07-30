<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="javascript">

</script>
<!--   -->
<!-- 页数 -->
<div class="message">
    共<i class="blue">${pagehelper.total}</i>条记录，当前显示第&nbsp;<i
        class="blue">${pagehelper.pageNum}/${pagehelper.pages}</i>&nbsp;页
</div>
<div style="text-align:center;">
    <ul class="pagination">
        <!-- <li><a href="#">&laquo;</a></li> -->
        <li><a href="/rest/students/1">首页</a></li>
            <li><a href="/rest/students/${pagehelper.pageNum -1}">&laquo;</a></li>


        <c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">

                <c:if test="${navigatepageNum==pagehelper.pageNum}">
                    <li class="active"><a href="">${navigatepageNum}</a></li>
                </c:if>
                <c:if test="${navigatepageNum!=pagehelper.pageNum}">
                    <li><a href="/rest/students/${navigatepageNum}">${navigatepageNum}</a></li>
                </c:if>
        </c:forEach>
            <li><a href="/rest/students/${pagehelper.pageNum +1}">&raquo;</a></li>
            <li><a href="/rest/students/${pagehelper.pages}">末页</a></li>
        <!-- <li><a href="#">&raquo;</a></li> -->
    </ul>
</div>