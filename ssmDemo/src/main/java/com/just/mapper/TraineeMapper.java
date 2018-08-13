package com.just.mapper;

import com.just.pojo.Trainee;
import com.just.pojo.TraineeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TraineeMapper {
    int countByExample(TraineeExample example);

    int deleteByExample(TraineeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trainee record);

    int insertSelective(Trainee record);

    List<Trainee> selectByExample(TraineeExample example);

    Trainee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trainee record, @Param("example") TraineeExample example);

    int updateByExample(@Param("record") Trainee record, @Param("example") TraineeExample example);

    int updateByPrimaryKeySelective(Trainee record);

    int updateByPrimaryKey(Trainee record);
}