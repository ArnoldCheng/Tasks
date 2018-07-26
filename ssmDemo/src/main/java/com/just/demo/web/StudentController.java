package com.just.demo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.just.demo.entity.Student;
import com.just.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private StudentService studentService ;
		
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		logger.info("list方法！！！！！！！！！！！！！");
		List<Student> students = studentService.list();
        model.addAttribute("students", students);
        // list.jsp + model = ModelAndView
        return "studentList";// WEB-INF/jsp/"studentList".jsp
	}
}
