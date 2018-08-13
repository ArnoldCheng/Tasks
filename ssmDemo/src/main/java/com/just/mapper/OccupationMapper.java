package com.just.mapper;

import com.just.pojo.Occupation;
import com.just.pojo.OccupationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OccupationMapper {
    int countByExample(OccupationExample example);

    int deleteByExample(OccupationExample example);

    int insert(Occupation record);

    int insertSelective(Occupation record);

    List<Occupation> selectByExample(OccupationExample example);

    int updateByExampleSelective(@Param("record") Occupation record, @Param("example") OccupationExample example);

    int updateByExample(@Param("record") Occupation record, @Param("example") OccupationExample example);
}