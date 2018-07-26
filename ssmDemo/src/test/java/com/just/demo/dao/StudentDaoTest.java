package com.just.demo.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.just.demo.BaseTest;
import com.just.demo.dto.SplitPage;
import com.just.demo.entity.Student;

public class StudentDaoTest extends BaseTest {

	@Autowired
	private StudentDao studentDao ;
	
	@Test
	public void listBySplitPageTest() {
		//List<Student> students = studentDao.listBySplitPage() ;
		SplitPage page = new SplitPage() ;
		page.setStart(0);
		page.setCount(4);
		List<Student> students = studentDao.listBySplitPage(page) ;
		for (Student s: students) {
			System.out.println(s);
		}
	}
}
