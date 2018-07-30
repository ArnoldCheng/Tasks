package com.just.service;

import com.just.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    /**
     * 分页查询学生信息
     * @return
     */
    Map<String,Object> getStudents(int page) ;

    /**
     * 通过id查询学生信息
     * @param id
     * @return
     */
    Student findById(long id) ;

    /**
     * 创建学生信息
     * @param student
     * @return
     */
    boolean addStudent(Student student) ;

    /**
     * 根据ID删除学生信息
     *
     * @param id
     * @return
     */
    boolean deleteStudent(long id) ;

    /**
     * 更新学生信息
     *
     * @param student
     * @return
     */
    boolean updateStudent(Student student) ;
}
