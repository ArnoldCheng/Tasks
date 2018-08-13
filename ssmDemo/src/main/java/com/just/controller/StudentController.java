package com.just.controller;

import com.just.pojo.Student;
import com.just.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService ;

    @RequestMapping("/student/list")
    public String getStudents(Model model) {
        List<Student> students = studentService.getStudents() ;
        model.addAttribute("students",students) ;
        return "studentList" ;
    }

    @RequestMapping("/student/add")
    public String add() {
        return "studentAdd" ;
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String save(Student student) {

        studentService.addStudent(student) ;
        return "redirect:/student/list" ;
    }

    @RequestMapping("/student/{id}")
    public String edit(Model model,@PathVariable Long id) {
        Student student1 = studentService.findById(id) ;
        model.addAttribute("s",student1) ;
        return "studentEdit" ;
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public String update(Student student) {
        studentService.updateStudent(student) ;
        return "redirect:/student/list" ;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id) {
        studentService.deleteStudent(id) ;
        return "redirect:/student/list" ;
    }
}
