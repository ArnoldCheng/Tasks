package com.just.demo.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.just.demo.BaseTest;
import com.just.demo.dto.SplitPage;
import com.just.demo.entity.Student;

public class StudentServiceTest extends BaseTest {

	@Autowired
	private StudentService studentService ;
	
	@Test
	public void listTest() {
		List<Student> students = studentService.list() ;
//		SplitPage page = new SplitPage() ;
//		page.setStart(0);
//		page.setCount(4);
//		List<Student> students = studentService.list(page) ;
		for (Student s: students) {
			System.out.println(s);
		}
	}
}
