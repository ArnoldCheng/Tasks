package com.just.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.just.mapper.StudentDao;
import com.just.pojo.Student;
import com.just.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao ;

    @Override
    public Map<String,Object> getStudents(int page) {
        logger.info("分页查询方法开始，页数为：？",page);
        PageHelper.startPage(page,2);
        List<Student> students = studentDao.listBySplitPage() ;
        PageInfo<Student> pageInfo = new PageInfo<Student>(students) ;
        Map<String,Object> listMap = new HashMap<>() ;
        listMap.put("students",students) ;
        listMap.put("pageInfo",pageInfo) ;
        return listMap ;
    }

    @Override
    public Student findById(long id) {
        return studentDao.findById(id);
    }

    @Override
    public boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public boolean deleteStudent(long id) {
        return studentDao.delete(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.update(student);
    }
}
