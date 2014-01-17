package com.mbop.java.tests.triton.threadsafety;

/**
 * This class increments variable counter inside a synchronized method.
 * This ensures two different threads cannot interleave and access the
 * variable counter at the same time.
 */
public class SynchonizedMethodCounter {

	private int counter = 0;
	
	public synchronized void increment(){
		
		counter++;
	}
	
	public synchronized int getCounter(){
		return counter;
	}
}
