package com.mbop.java.tests.triton.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
	
	/**
	 * @param n, the number of finobacci numbers to print.<br/>
	 * Advantages of using a non-recursive function are:
	 * <li>A list is used to keep previously calculated finobacci numbers,
	 * therefore we can avoid computing the same finobacci number several times as it 
	 * is done in the recursive algorithm</li>
	 * <li>Improved time complexity.</li>
	 * @return the first n fibonacci numbers as a List
	 */
	public List<Integer> generate(int n){
		ArrayList<Integer> fibList = new ArrayList<Integer>();
		fibList.add(0);
		fibList.add(1);
		for (int i=0; i<n; i++){
			if(i >= fibList.size()){
				fibList.add(i, fibList.get(i-1)+fibList.get(i-2));
			}
		}		
		return fibList;
	}
}
