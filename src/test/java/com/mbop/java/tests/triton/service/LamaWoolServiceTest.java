package com.mbop.java.tests.triton.service;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

import com.mbop.java.tests.triton.BaseTest;

public class LamaWoolServiceTest extends BaseTest {
	
	private LamaService service;

	@Test
	public void checkShearDate_AllOk() throws Exception {
		
		service = (LamaWoolService)context.getBean("service");
		assertTrue(service.isWoolTooOldToSell(new DateTime(2013, 01, 15, 0, 0, 0)));
	}

}
