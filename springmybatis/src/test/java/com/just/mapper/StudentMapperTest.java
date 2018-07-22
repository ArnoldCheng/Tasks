package com.just.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.just.pojo.Student;
import com.just.pojo.StudentExample;
import com.just.pojo.StudentExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentMapperTest  {

	@Autowired
	private StudentMapper studentMapper ;
	
	@Test
	public void createStudentTest()  {
		Student student = new Student() ;
		student.setName("hell");
		student.setQq("263540121");
		student.setTypes("java工程师112");
		try {
			student.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-8-13").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		student.setSchool("xx理工大学");
		student.setStudentId("4595");
		student.setDailyLink("http://www.jnshu.com/school/28522/message/daily?page=1");
		student.setWish("结合实践学习");
		student.setCoach("[深圳分院|内门弟子] JAVA-方逾阳 ");
		student.setKnowFrom("知乎");
		student.setCreateAt(System.currentTimeMillis());
		student.setUpdateAt(System.currentTimeMillis());
		System.out.println(studentMapper.insert(student));
	}
	
	@Test
	public void deleteStudentTest() {
		studentMapper.deleteByPrimaryKey(5L);
	}
	
	@Test
	public void updateStudentByIdTest() {
		Student student = studentMapper.selectByPrimaryKey(1L) ;
		System.out.println(student);
		student.setKnowFrom("百度搜索");
		studentMapper.updateByPrimaryKeySelective(student);
	}
	
	@Test 
	public void listStudentTest() {
		StudentExample example = new StudentExample() ;
		List<Student> students = studentMapper.selectByExample(example) ;
		for(Student student:students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void getStudentByIdTest() {
		Student student = studentMapper.selectByPrimaryKey(1L) ;
		System.out.println(student);
	}
	
	@Test
	public void getStudentByNameTest() {
		StudentExample example = new StudentExample() ;
		Criteria criteria = example.createCriteria() ;
		criteria.andNameLike("%h%") ;
		List<Student> students = studentMapper.selectByExample(example) ;
		for (Student student :students ) {
			System.out.println(student);
		}
	}
}
