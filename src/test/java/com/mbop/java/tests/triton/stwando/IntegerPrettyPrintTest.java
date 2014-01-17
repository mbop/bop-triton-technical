package com.mbop.java.tests.triton.stwando;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.mbop.java.tests.triton.BaseTest;

public class IntegerPrettyPrintTest extends BaseTest {

	private IntegerPrettyPrint integerPrettyPrint;
	private Logger logger = Logger.getLogger(IntegerPrettyPrint.class);
	
	@Test
	public void printTest(){
		
		integerPrettyPrint = (IntegerPrettyPrint)context.getBean("integerPrettyPrint");
		List<String> expectedResult = Arrays.asList("1", "2", "Stw", "4", "Ando", 
													"Stw", "7", "8", "Stw", "Ando",
													"11", "Stw", "13", "14", "StwAndo");
		
		 List<String> result = integerPrettyPrint.print(15);
		 Assert.assertEquals(expectedResult, result);
		 
		 List<String> secondResult = integerPrettyPrint.print(100);
		 logger.debug("Printing the first 100 numbers: " +
				 secondResult.toString());
		
	}
}
