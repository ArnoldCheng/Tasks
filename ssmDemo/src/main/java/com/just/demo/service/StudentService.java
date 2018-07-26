package com.just.demo.service;

import java.util.List;

import com.just.demo.dto.SplitPage;
import com.just.demo.entity.Student;

public interface StudentService {

	/**
	 * 学生列表的全部查询
	 * @return
	 */
	List<Student> list();
	/**
	 * 统计学生表的数据量
	 * @return
	 */
    int total();
    
    /**
     * 分页展示学生列表
     * @param page 分页对象，包含起始页、页面展示的数据量、总数据量
     * @return
     */
    List<Student> list(SplitPage page);
}
