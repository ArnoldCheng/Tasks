package com.just.demo.dao;

import java.util.List;

import com.just.demo.dto.SplitPage;
import com.just.demo.entity.Student;

public interface StudentDao {
	
	List<Student> listBySplitPage() ;
	int count() ;
	List<Student> listBySplitPage(SplitPage page) ;
}
