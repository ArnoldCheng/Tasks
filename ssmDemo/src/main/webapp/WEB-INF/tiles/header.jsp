<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
    <div class="container  hidden-xs">
        <div class="row header-top">
            <p class="col-xs-12 col-sm-6 col-md-6 col-lg-6">客服电话:010-594-78634</p>
            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-right">
                <div>
                    <a href="#" target="_blank"> <img alt="" src="/images/54537.png"></a>
                    <a href="#" target="_blank"><img alt="" src="/images/45678678.png"></a>
                    <a href="#" target="_blank"> <img alt="" src="/images/54375483543.png"></a>
                    <c:if test="${username == null}">
                        <a href="/login">登录</a><span class="header-dot-333">|</span>
                        <a href="/login">注册</a>
                    </c:if>
                    <c:if test="${username != null}">
                        ${username}<span class="header-dot-333">|</span><a href="/logout">退出</a>
                    </c:if>
                </div>

            </div>
        </div>
    </div>
</header>
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a href="#" class="navbar-brand">
                <img src="/images/logo.png" alt="Brand" class="img-responsive">
            </a>
            <button data-target="#open-nav" data-toggle="collapse" class="navbar-toggle btn-primary collapsed"
                    aria-expanded="false">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div id="open-nav" class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">
            <ul class="nav navbar-nav navbar-right text-center list-inline">
                <li><a href="/index">首页</a></li>
                <li><a href="/u/occupation/list">职业</a></li>
                <li><a href="">推荐</a></li>
                <li><a href="">关于</a></li>
            </ul>
        </div>

    </div>
</nav>