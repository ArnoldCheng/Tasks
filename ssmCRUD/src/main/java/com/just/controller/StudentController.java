package com.just.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.just.mapper.StudentDao;
import com.just.pojo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao ;
    @RequestMapping("/")
    public String index() {
        return "index" ;
    }
    @RequestMapping("/student/list")
    public String list(Model model) {
        List<Student> students = studentDao.listBySplitPage() ;
        model.addAttribute("students",students) ;
        return "list" ;
    }

    @RequestMapping("/student/listPage/{page}")
    public String listByPagehelper(@PathVariable Integer page,Model model) {
        PageHelper.startPage(page,2);
        List<Student> students = studentDao.listBySplitPage() ;
        PageInfo<Student> pageInfo = new PageInfo<Student>(students) ;
        model.addAttribute("students",students) ;
        model.addAttribute("pagehelper",pageInfo) ;
        return "list" ;
    }
    @RequestMapping("/student/jsonList")
    public String jsonList(Model model) {
        List<Student> students = studentDao.listBySplitPage() ;
        model.addAttribute("students",students) ;
        return "json";
    }
    @RequestMapping("/student/addPre")
    public String addPre() {
        return "add" ;
    }
    @RequestMapping("/student/add")
    public String add(Student student){
        studentDao.insert(student) ;
        return "redirect:/student/listPage/1" ;
    }
    @RequestMapping("/student/delete")
    public String delete(long id) {
        studentDao.delete(id) ;
        return "redirect:/student/listPage/1" ;
    }
    @RequestMapping("/student/edit")
    public String updatePre(Model model,long id) {
        Student student = studentDao.findById(id) ;
        String startDate = new SimpleDateFormat("yyyy-MM-dd").format(student.getStartDate());
        model.addAttribute("s",student) ;
        model.addAttribute("startDate",startDate) ;
        return "update" ;
    }
    @RequestMapping("/student/update")
    public String update(Student student) {
        studentDao.update(student) ;
        return "redirect:/student/listPage/1" ;
    }
}
