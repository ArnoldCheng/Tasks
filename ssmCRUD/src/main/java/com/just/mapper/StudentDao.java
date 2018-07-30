package com.just.mapper;

import com.just.pojo.Student;

import java.util.List;

public interface StudentDao {
	/**
	 * 数据的列表查询，若结合pagehelper传入limit数据则分页显示，否则不分页显示
	 *
	 * @return
	 */
	List<Student> listBySplitPage() ;

	/**
	 * 在数据库中插入学生对象的数据
	 *
	 * @param student 学生对象
	 * @return 是否插入成功
	 */
	boolean insert(Student student) ;

	/**
	 * 通过id查询学生对象
	 * @param id
	 * @return
	 */
	Student findById(long id) ;

	/**
	 * 通过id删除学生对象
	 * @param id
	 * @return
	 */
	boolean delete(long id) ;

	/**
	 * 更新学生对象信息
	 * @param student
	 * @return
	 */
	boolean update(Student student) ;
}
