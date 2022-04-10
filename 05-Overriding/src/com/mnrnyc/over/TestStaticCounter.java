package com.mnrnyc.over;

public class TestStaticCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticCounter.getCounter());
		StaticCounter.increment();
		StaticCounter.increment();
		
		System.out.println(StaticCounter.getCounter());

	}

}
