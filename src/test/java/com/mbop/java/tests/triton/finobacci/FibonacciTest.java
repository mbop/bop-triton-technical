package com.mbop.java.tests.triton.finobacci;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import com.mbop.java.tests.triton.BaseTest;
import com.mbop.java.tests.triton.fibonacci.FibonacciGenerator;

public class FibonacciTest extends BaseTest{

	private FibonacciGenerator fibGenerator;
	private Logger logger = Logger.getLogger(FibonacciTest.class);

	@Test
	public void generateFibonacciTest(){
		
		fibGenerator = (FibonacciGenerator)context.getBean("fibGenerator");
		List<Integer> expectedResult = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
		List<Integer> generatedResult = fibGenerator.generate(10);
		
		logger.debug("The generated first 10 Fibonacci numbers are: " +
				generatedResult.toString());
		Assert.assertEquals(expectedResult, generatedResult);
	}
}
