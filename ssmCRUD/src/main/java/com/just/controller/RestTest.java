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
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.List;

//@Controller
public class RestTest {

    /*private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao ;

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String index() {
        return "rest/restful" ;
    }



    @RequestMapping(value = "/rest/students/{page}", method = RequestMethod.GET)
    public String listByPagehelper(@PathVariable Integer page, Model model) {

        //if (page !=null || !"".equals(page)) {
            PageHelper.startPage(page,2);
//        }else {
//            PageHelper.startPage(1,2);
//        }

        List<Student> students = studentDao.listBySplitPage() ;
        PageInfo<Student> pageInfo = new PageInfo<Student>(students) ;
        model.addAttribute("students",students) ;
        model.addAttribute("pagehelper",pageInfo) ;
        return "rest/students" ;
    }

    @RequestMapping(value = "/rest/student", method = RequestMethod.GET)
    public String addPre() {
        return "rest/post";
    }
    @RequestMapping(value = "/rest/students", method = RequestMethod.GET)
    public String list(Model model) {
        List<Student> students = studentDao.listBySplitPage() ;
        model.addAttribute("students",students) ;
        return "rest/students" ;
    }
    @RequestMapping(value = "/rest/student", method = RequestMethod.PUT)
    public String update(Student student) {
        studentDao.update(student) ;
        return "redirect:/rest/students/1" ;
    }
    @RequestMapping(value = "/rest/student", method = RequestMethod.POST)
    public String add(Student student){
        studentDao.insert(student) ;
        return "redirect:/rest/students/1" ;
    }
    @RequestMapping(value = "/rest/student/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id) {
        studentDao.delete(id) ;
        return "redirect:/rest/students/1" ;
    }
    @RequestMapping(value = "/rest/student/{id}", method = RequestMethod.GET)
    public String updatePre(Model model,@PathVariable Long id) {
        Student student = studentDao.findById(id) ;
        String startDate = new SimpleDateFormat("yyyy-MM-dd").format(student.getStartDate());
        model.addAttribute("s",student) ;
        model.addAttribute("startDate",startDate) ;
        return "rest/put" ;
    }
*/
}
