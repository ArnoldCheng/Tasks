package com.just.service;

import java.util.List;

import com.just.pojo.Student;

public interface StudentService {

	List<Student> listStudent() ;
	
	boolean addStudent(Student student) ;
}
