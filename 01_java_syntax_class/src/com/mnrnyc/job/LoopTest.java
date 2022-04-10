package com.mnrnyc.job;

public class LoopTest{

	public static void main(String[] args) {
		int x = 10;
		
		System.out.println("Starting a while loop...\n");
		while ( x < 20) {
			System.out.println("The value of x is "+ x);
			x++;
		}
		
		
		System.out.println("\n\nStarting a do while loop...\n");
		do {
			System.out.println("The value of x is "+ x);
			x++;
		} while (x < 25);
		
		
		System.out.println("\n\nStarting a for loop...\n");
		for (int i = 0; i < x; i++) {
			System.out.println("The value of i is " + i + " and x is " + x + ".");
		}
		

	}

}
