package com.mbop.java.tests.triton.threadsafety;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class features the use of an AtomicInteger variable which can
 * be incremented safely through the atomic operation incrementAndGet.
 * an atomic operation happens all at once at the machine level therefore
 * highly reducing the risk of thread interference.
 */
public class AtomicIntegerCounter {

	private AtomicInteger counter = new AtomicInteger(0);
	
	public void increment(){
		counter.incrementAndGet();
	}
	
	public int getCounter(){
		return counter.get();
	}
}
