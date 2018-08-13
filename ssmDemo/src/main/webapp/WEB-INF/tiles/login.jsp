<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <div class="container ng-scope">
        <div class="login-box row">
            <div class="login-img col-lg-7 col-md-6">
                <img class="img-responsive" src="http://jns.img.bucket.ks3-cn-beijing.ksyun.com/skill/skill_html/images/login-ad_03.png">
            </div>
            <div class="well col-lg-5 col-md-6">
                <ul id="myTab" class="nav nav-tabs">
                    <li class="active">
                        <a href="#register" data-toggle="tab">
                            注册
                        </a>
                    </li>
                    <li><a href="#login" data-toggle="tab">登录</a></li>

                </ul>
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in active" id="register">
                        <form action="/register" method="post">
                            <br/>
                            用户名：<input type="text" name="username" /><br/><br/>
                            密码：<input type="password" name="password" /><br/><br/>
                            <input type="submit" value="注册"/>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="login">
                        <form action="/login" method="post">
                            <br/>
                            用户名：<input type="text" name="username" /><br/><br/>
                            密码：<input type="password" name="password" /><br/><br/>
                            <input type="submit" value="登录"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

