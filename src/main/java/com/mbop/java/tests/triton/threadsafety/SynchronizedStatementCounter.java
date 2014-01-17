package com.mbop.java.tests.triton.threadsafety;

/**
 * This class illustrates the use of a synchronized statement to safely
 * increment the variable counter. Unlike the synchronized method strategy,
 * synchronized statements provide fine synchronization in order to avoid
 * synchronizing other sections of a method for example calls to other objects
 * method which may cause deadlocks.
 */
public class SynchronizedStatementCounter {

	private int counter = 0;
	
	public void increment(){
		
		synchronized (this) {
			counter++;
		}
	}
	
	public int getCounter(){
		return counter;
	}
}
