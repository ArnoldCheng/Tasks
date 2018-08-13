package com.just.mapper;

import com.just.pojo.Login;
import com.just.pojo.LoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginMapper {
    int countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);
}