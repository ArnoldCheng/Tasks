package com.just.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.just.demo.dao.StudentDao;
import com.just.demo.dto.SplitPage;
import com.just.demo.entity.Student;
import com.just.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao ;

	@Override
	public List<Student> list() {
		return studentDao.listBySplitPage();
	}

	@Override
	public int total() {
		return studentDao.count();
	}

	@Override
	public List<Student> list(SplitPage page) {
		return studentDao.listBySplitPage(page);
	}

}
