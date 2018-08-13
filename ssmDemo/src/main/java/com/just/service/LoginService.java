package com.just.service;

import com.just.pojo.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginService {
    int register(Login login) ;

    boolean login(Login login, HttpServletResponse response, HttpServletRequest request) ;
}
