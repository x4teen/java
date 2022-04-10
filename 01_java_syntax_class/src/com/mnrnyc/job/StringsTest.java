package com.mnrnyc.job;

public class StringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'a';
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = " world";
		
		String badString = new String("Hello");
		
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb);
		
		sb.append(s3);
		System.out.println(sb);
		

	}

}
