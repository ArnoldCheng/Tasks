package com.just.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration({  "classpath:spring/applicationContext-web.xml",  "classpath:spring/applicationContext-service.xml",
		"classpath:spring/applicationContext-dao.xml"})
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;
}