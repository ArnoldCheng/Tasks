package com.just.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.just.pojo.Student;
import com.just.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService ;
	
	@RequestMapping("/listStudent")
	public ModelAndView listStudent() {
		ModelAndView mav = new ModelAndView() ;
		List<Student> students = studentService.listStudent() ;
		mav.addObject("students", students) ;
		mav.setViewName("listStudent");
		return mav ;
	}
}
