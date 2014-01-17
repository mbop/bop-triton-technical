package com.mbop.java.tests.triton.aop;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mbop.java.tests.triton.BaseTest;

public class MyProfilerExampleTest extends BaseTest{

	@Autowired
	private ProfilerExample myProfilerExample;
	
	@Test
	public void profilerTest(){
		
		myProfilerExample = (ProfilerExample)context.getBean("myProfilerExample");
		
		myProfilerExample.populateItems();
		myProfilerExample.retrieveItems();
	}
}
