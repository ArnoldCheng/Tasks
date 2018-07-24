package com.just.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.just.mapper.StudentMapper;
import com.just.pojo.Student;
import com.just.pojo.StudentExample;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper ;
	
	public List<Student> listStudent() {
		StudentExample example = new StudentExample() ;
		return studentMapper.selectByExample(example);
	}

	public boolean addStudent(Student student) {
		return studentMapper.insert(student) > 0;
	}

}
