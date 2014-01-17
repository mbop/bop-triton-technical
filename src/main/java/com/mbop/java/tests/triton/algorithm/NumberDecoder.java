package com.mbop.java.tests.triton.algorithm;

/**
 * Decodes a number to its word representation. example: the number 321
 * is decoded to the word "three hundred twenty one". <br/>
 * The algorithm used finds the position of each digit in the number
 * and maps it to its word representation. First in the decode method,
 * we find the highest possible position digit or number, in our
 * case it is the thousand position by dividing the number by a thousand.
 * If the thousand position digit or number exists, it is decoded to its 
 * word representation. In the division process, we keep the remainder
 * and recursively call the decode method passing the remainder and the
 * next position (after a thousand, it is a hundred) to find and decode
 * the next digit or number position. 
 * 
 */
public class NumberDecoder {
	
	private String result = "";

	/**
	 * @param number, the number to be decoded
	 * @param position, position of each digit in the number
	 * @return the word representation of number by recursively
	 * calling this method to find each digit position and decode it
	 * according to its position.
	 */
	public String decode(int number, int position) {
	
		int nextPosition = position/10;
		
		int divisionResult = number/position;
		
		//handle numbers 10000 and above
		if(divisionResult > 19){
			decode(divisionResult, nextPosition);
		}
		result += decodeNumberPosition(divisionResult, position);
		int remainder = number%position;
		
		if(remainder < 20 ){
			result += decodeNumber(remainder);
			return result ;
		}
		else {
			decode(remainder, nextPosition);
		}
		return result;
	}
	
	/**
	 * @param number, the number to decode into a String
	 * @param position, represents the place of a digit on a number, 1's position,
	 * 10's position, 100's position etc...
	 * @return the word representation of parameter number depending
	 * on its position. for the 10's position, return the String "ten", "twenty",
	 * "thirty" etc... otherwise delegates to methods decodeNumber and
	 * decodePosition for further processing.
	 */
	private String decodeNumberPosition(int number, int position) {

		if(number == 0){
			return "";
		}
		String result = "";
		if(position == 10){
			switch (number) {
			case 1:
				result = "ten ";
				break;
			case 2:
				result = "twenty ";
				break;
			case 3:
				result = "thirty ";
				break;
			case 4:
				result = "forty ";
				break;
			case 5:
				result = "fifty ";
				break;
			case 6:
				result = "sixty ";
				break;
			case 7:
				result = "seventy ";
				break;
			case 8:
				result = "eigthy ";
				break;		
			case 9:
				result = "ninety ";
				break;				
			default:
				break;
			}
		}
		else{
			result = decodeNumber(number)+ " " + decodePosition(position) + " ";
		}
		return result;
	}
	
	/**
	 * @param number, the number to decode into a String
	 * @return the word representation of numbers from 1 to 19.
	 */
	private String decodeNumber(int number){
		
		String result = "";
		switch (number) {
		case 1:
			result =  "one";
			break;
		case 2:
			result =  "two";
			break;
		case 3:
			result =  "three";
			break;
		case 4:
			result =  "four";
			break;
		case 5:
			result =  "five";
			break;
		case 6:
			result =  "six";
			break;
		case 7:
			result =  "seven";
			break;	
		case 8:
			result =  "eight";
			break;	
		case 9:
			result =  "nine";
			break;	
		case 10:
			result =  "ten";
			break;				
		case 11:
			result =  "eleven";
			break;	
		case 12:
			result =  "twelve";
			break;
		case 13:
			result =  "thirteen";
			break;
		case 14:
			result =  "fourteen";
			break;
		case 15:
			result =  "fifteen";
			break;
		case 16:
			result =  "sixteen";
			break;
		case 17:
			result =  "seventeen";
			break;
		case 18:
			result =  "eighteen";
			break;		
		case 19:
			result =  "nineteen";
			break;			
		default:
			break;
		}
		return result;
	}
	
	/**
	 * @param position, represents the place of a digit on a number, 1's position,
	 * 10's position, 100's position etc...
	 * @return the String hundred if a digit is located at the 100's 
	 * position of a number, or the String thousand for the 1000's position
	 * or an empty String for the 1's position.
	 */
	private String decodePosition(int position){
		
		String result = "";
		switch (position) {
		case 1:
			result = "";
			break;
		case 100:
			result = "hundred";
			break;
		case 1000:
			result = "thousand,";
			break;			
		default:
			break;
		}
		
		return result;
		
	}

}
