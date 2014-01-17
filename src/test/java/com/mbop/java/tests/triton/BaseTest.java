package com.mbop.java.tests.triton;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {

	protected ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		
		context = new ClassPathXmlApplicationContext("context.xml");
	
	}
}
