package com.mnrnyc.job;

public class SwitchTest {

	public static void main(String[] args) {
		
		char grade = args[0].charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent.");
			break;
		case 'B':
			
		case 'C':
			System.out.println("Satisfactory");
			break;
		case 'D':
			System.out.println("Passed!");
		case 'F':
			System.out.println("Failed! Repeat Course");
			break;
		default:
			System.out.println("Invalid Grade!");
			break;
		}
		
		System.out.println("Your grade is "+grade);
	}

}
