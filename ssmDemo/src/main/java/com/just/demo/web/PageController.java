package com.just.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 显示首页
	 * @return 
	 */
	@RequestMapping("/")
	String home() {
		logger.info("list方法！！！！！！！！！！！！！");
		return "index";
	}
	
	/**
	 * 显示其他页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		logger.info("路由===" + page);
		return page;
	}
}
