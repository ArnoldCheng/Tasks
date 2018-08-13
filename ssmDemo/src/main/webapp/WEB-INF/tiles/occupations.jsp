<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="/css/t11.css" rel="stylesheet" type="text/css">
<link href="/css/base.css" rel="stylesheet" type="text/css">

<div class="container">

    <div class="nav-title">首页&gt;职业</div>
    <div class="nav-bar">
        <a class="nav-bar-a a-selected" href="">全部</a>
    </div>
        <div class="row" >
            <c:forEach items="${oc}" var="oc">
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${oc.name}</h4>
                            <p class="text-present">${oc.description}</p>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 ${oc.threshold}</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度${oc.difficulty} </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${oc.cycle} </span>年
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span
                                    class="iconfont-color">${oc.scarcity} </span>家公司需要
                            </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="leftWarp">
                            薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages"> <span class="iconfont-color">${oc.salary1} </span></div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages"> <span class="iconfont-color">${oc.salary2} </span></div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages"> <span class="iconfont-color">${oc.salary3} </span></div>
                            </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <b class="text-b">有${oc.learner} 人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${oc.foundation} </p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">iOS工程师</p>
                        <p class="flip-text">iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，
                            也是以Darwin为基础的，因此同样属于类Unix的商业操作系统。国内iOS开发起步相对较晚， 人才培养机制更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
                            国内iOS开发起步相对较晚，人才培养机制更是远远跟不上市场发展速度。 有限的iOS开发人才成了国内企业必争的资源。</p>
                    </div>

                </div>
            </div>
            </c:forEach>
        </div>

    </div>

</div>