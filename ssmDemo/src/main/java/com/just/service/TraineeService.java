package com.just.service;

import com.just.pojo.Trainee;

import java.util.List;

public interface TraineeService {
    List<Trainee> getTraineeList() ;

    int createTrainee(Trainee trainee) ;

    int updateTrainee(Trainee trainee) ;

    int deleteTrainee(long id) ;

    Trainee findById(long id) ;
}
