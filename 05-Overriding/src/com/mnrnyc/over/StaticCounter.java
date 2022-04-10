package com.mnrnyc.over;

public class StaticCounter {
	
	private static int counter = 0;

	public static int getCounter() {
		return counter;
	}
	
	public static int increment() {
		return counter++;
	}

}
