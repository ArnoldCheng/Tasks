package com.just.service.impl;

import com.just.mapper.StudentMapper;
import com.just.pojo.Student;
import com.just.pojo.StudentExample;
import com.just.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentMapper studentMapper ;

    @Override
    public List<Student> getStudents() {
        StudentExample example = new StudentExample() ;
        return studentMapper.selectByExample(example);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public int deleteStudent(long id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Student findById(long id) {
        return studentMapper.selectByPrimaryKey(id);
    }


}
