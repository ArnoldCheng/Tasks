package com.just.service.impl;

import com.just.mapper.LoginMapper;
import com.just.pojo.Login;
import com.just.pojo.LoginExample;
import com.just.service.LoginService;
import com.just.util.CookieUtil;
import com.just.util.MD5Encoder;
import com.just.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public int register(Login login) {
        try {
            String md5Password = MD5Encoder.getEncryptedPwd(login.getUsername()) ;
            login.setPassword(md5Password);
            logger.info("MD5加密后：?",md5Password);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return loginMapper.insert(login);
    }

    @Override
    public boolean login(Login login, HttpServletResponse response, HttpServletRequest request) {
        LoginExample example = new LoginExample() ;
        LoginExample.Criteria criteria = example.createCriteria() ;
        criteria.andUsernameEqualTo(login.getUsername()) ;
        List<Login> loginList = loginMapper.selectByExample(example) ;
        if (loginList.size() > 0 ) {
            for (Login login1:loginList) {
                try {
                    logger.info(login.getPassword()+"，"+login1.getPassword());
                    if (MD5Encoder.validPassword(login.getPassword(),login1.getPassword())) {
                        request.getSession().setAttribute("username", login.getUsername());
                        Map<String,Object> tokenMap =  new TokenUtil().createToken(login.getUsername()) ;
                        CookieUtil.save(response,request,"token",(String) tokenMap.get("token"),(int) tokenMap.get("expire")) ;
                        return true ;
                    }
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }

//

        }
        return false;
    }
}
