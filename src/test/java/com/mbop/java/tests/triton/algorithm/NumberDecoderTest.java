package com.mbop.java.tests.triton.algorithm;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.mbop.java.tests.triton.BaseTest;

public class NumberDecoderTest extends BaseTest{

	private NumberDecoder numberDecoder;
	private static final int MAX_NUMBER_POSITION = 1000;
	private Logger logger = Logger.getLogger(NumberDecoderTest.class);
	
	@Test
	public void decodeTestSixDigitNumber(){
		
		numberDecoder = (NumberDecoder)context.getBean("numberDecoder");
		String result = numberDecoder.decode(119999, MAX_NUMBER_POSITION);
		String expectedResult = "one hundred nineteen thousand, nine hundred ninety nine";
		
		logger.debug("119999 is decoded to: " + result);
		Assert.assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void decodeTestFiveDigitNumber(){
		numberDecoder = (NumberDecoder)context.getBean("numberDecoder");
		String result = numberDecoder.decode(18006, MAX_NUMBER_POSITION);
		String expectedResult = "eighteen thousand, six";
		
		logger.debug("18006 is decoded to: " + result);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void decodeTestFourDigitNumber(){
		numberDecoder = (NumberDecoder)context.getBean("numberDecoder");
		String result = numberDecoder.decode(7457, MAX_NUMBER_POSITION);
		String expectedResult = "seven thousand, four hundred fifty seven";
		
		logger.debug("7457 is decoded to: " + result);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void decodeTestThreeDigitNumber(){
		numberDecoder = (NumberDecoder)context.getBean("numberDecoder");
		String result = numberDecoder.decode(326, MAX_NUMBER_POSITION);
		String expectedResult = "three hundred twenty six";
		
		logger.debug("326 is decoded to: " + result);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void decodeTestTwoDigitNumber(){
		numberDecoder = (NumberDecoder)context.getBean("numberDecoder");
		String result = numberDecoder.decode(29, MAX_NUMBER_POSITION);
		String expectedResult = "twenty nine";
		
		logger.debug("29 is decoded to: " + result);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void decodeTestOneDigitNumber(){
		numberDecoder = (NumberDecoder)context.getBean("numberDecoder");
		String result = numberDecoder.decode(1, MAX_NUMBER_POSITION);
		String expectedResult = "one";
		
		logger.debug("1 is decoded to: " + result);
		Assert.assertEquals(expectedResult, result);
	}	
}
