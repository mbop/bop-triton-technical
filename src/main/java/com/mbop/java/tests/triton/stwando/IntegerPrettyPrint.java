package com.mbop.java.tests.triton.stwando;

import java.util.ArrayList;
import java.util.List;

/**
 * given a number n, will iterate from 1 to n and each number in
 * between 1 and n, but for multiple of 3 will output "Stw", for
 * multiple of 5, will output "Ando" and for multiple of both 3
 * and 5 will output "StwAndo". Output is represented by a List
 * for code testability purpose.
 */
public class IntegerPrettyPrint {

	public List<String> print(int n){
		
		List<String> resultList = new ArrayList<String>();
		for(int i=1; i<= n; i++){
			
			if(i%3 == 0 && i%5 == 0){
				resultList.add("StwAndo");
			}			
			else if( i%3 == 0){
				resultList.add("Stw");				
			}
			else if(i%5 == 0){
				resultList.add("Ando");
			}				
			else{
				resultList.add(Integer.toString(i));
			}						
		}
		return resultList;
	}
	
}
