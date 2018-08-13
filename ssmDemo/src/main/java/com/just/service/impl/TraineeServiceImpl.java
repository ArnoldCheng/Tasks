package com.just.service.impl;

import com.github.pagehelper.PageHelper;
import com.just.mapper.TraineeMapper;
import com.just.pojo.Trainee;
import com.just.pojo.TraineeExample;
import com.just.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeMapper traineeMapper ;

    @Override
    public List<Trainee> getTraineeList() {
        TraineeExample example = new TraineeExample() ;
        PageHelper.startPage(1,4);
        List<Trainee> list = traineeMapper.selectByExample(example) ;
        if (list.size() > 4) {
            Collections.shuffle(list) ;
            list = list.subList(0,4) ;
        }

        return list;
    }

    @Override
    public int createTrainee(Trainee trainee) {
        return traineeMapper.insertSelective(trainee);
    }

    @Override
    public int updateTrainee(Trainee trainee) {
        return traineeMapper.updateByPrimaryKeySelective(trainee);
    }

    @Override
    public int deleteTrainee(long id) {
        return traineeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Trainee findById(long id) {
        return traineeMapper.selectByPrimaryKey(id);
    }
}
