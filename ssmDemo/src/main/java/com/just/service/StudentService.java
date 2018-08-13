package com.just.service;

import com.just.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents() ;

    int addStudent(Student student) ;

    int updateStudent(Student student) ;

    int deleteStudent(long id) ;

    Student findById(long id) ;
}
