package com.just.controller;

import com.github.pagehelper.PageInfo;
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

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Controller
public class StudentsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String index() {
        return "rest/restful" ;
    }

    @RequestMapping(value = "/rest/students/{page}", method = RequestMethod.GET)
    public String listByPage(@PathVariable Integer page,Model model) {
        Map<String,Object> listMap = studentService.getStudents(page) ;
        PageInfo<Student> pageInfo = (PageInfo<Student>) listMap.get("pageInfo") ;
        List<Student> students = (List<Student>) listMap.get("students") ;
        model.addAttribute("students",students) ;
        model.addAttribute("pagehelper",pageInfo) ;
        return "rest/students" ;
    }
    @RequestMapping(value = "/rest/student", method = RequestMethod.GET)
    public String addPre() {
        return "rest/post";
    }
    @RequestMapping(value = "/rest/student", method = RequestMethod.POST)
    public String add(Student student){
        studentService.addStudent(student) ;
        return "redirect:/rest/students/1" ;
    }
    @RequestMapping(value = "/rest/student", method = RequestMethod.PUT)
    public String update(Student student) {
        studentService.updateStudent(student) ;
        return "redirect:/rest/students/1" ;
    }
    @RequestMapping(value = "/rest/student/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id) {
        studentService.deleteStudent(id) ;
        return "redirect:/rest/students/1" ;
    }
    @RequestMapping(value = "/rest/student/{id}", method = RequestMethod.GET)
    public String updatePre(Model model,@PathVariable Long id) {
        Student student1 = studentService.findById(id) ;
        model.addAttribute("s",student1) ;
        model.addAttribute("startDate",new SimpleDateFormat("yyyy-MM-dd").format(student1.getStartDate())) ;
        return "rest/put" ;
    }
}
