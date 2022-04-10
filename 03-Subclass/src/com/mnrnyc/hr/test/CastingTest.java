package com.mnrnyc.hr.test;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		int i = c;
		
		System.out.println(c + " = " + i);
		
		double d = 67.23;
		float f = (float) d;
		i = (int) d;
		c = (char) d;
		
		System.out.println("double = " + d + " when type casted to float is " + f);
		System.out.println("double = " + d + " when type casted to integer is " + i);
		System.out.println("double = " + d + " when type casted to char is " + c);
		
	}

}
