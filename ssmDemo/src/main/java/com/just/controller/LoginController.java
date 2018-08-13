package com.just.controller;


import com.just.pojo.Login;
import com.just.service.LoginService;
import com.just.util.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService ;

    @RequestMapping("/login")
    public String toForm() {
//        if ("#login".equals(s)) {
//            return "login" ;
//        }
        return "login" ;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Login login) {
        if (loginService.register(login) > 0){
            return "login" ;
        }
        return "index" ;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Login login, Model model, HttpServletResponse response, HttpServletRequest request) {
        if (loginService.login(login,response,request)) {
            return "redirect:/u/occupation/list" ;
        }
        return "login" ;
    }

    @RequestMapping("/logout")
    public String logout(HttpServletResponse response, HttpServletRequest request) {
        CookieUtil.clear(response,request);
        request.getSession().invalidate();
        return "redirect:/index" ;
    }
}
