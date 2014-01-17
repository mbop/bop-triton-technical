package com.mbop.java.tests.triton.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class used to execute a HashMap put and get method calls
 * to illustrate Method Profiling using Spring AOP.
 *
 */
public class MyProfilerExample implements ProfilerExample {

	private Map<String, String> myMap;
	
	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public void populateItems(){
 
		myMap.put("QC", "Quebec");
		myMap.put("ON", "Ontario");
		myMap.put("BC", "British Columbia");
	}
	
	public List<String> retrieveItems(){
		
		List<String> result = new ArrayList<String>();
		result.add(myMap.get("QC"));
		result.add(myMap.get("ON"));
		
		return result;
	}
}
