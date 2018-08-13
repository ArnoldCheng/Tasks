package com.just.controller;

import com.just.util.CookieUtil;
import com.just.util.MicroDES;
import com.just.util.TokenUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String url = request.getRequestURI() ;
        Map<String, String> cookieMap = (Map<String, String>) CookieUtil.load(request) ;
        String username = cookieMap.get("token") ;
        String key = "098f6bcd4621d373cade4e832627b4f62017121611345734";
        if (username != null && !"".equals(username)) {
            if (MicroDES.decr(key,username).equals(request.getSession().getAttribute("username"))) {
                return true ;
            }
        }
        response.sendRedirect("/index");
//        request.getRequestDispatcher("/WEB-INF/tiles/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
