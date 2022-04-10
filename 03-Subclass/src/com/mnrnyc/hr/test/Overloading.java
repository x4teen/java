package com.mnrnyc.hr.test;

public class Overloading {
	
	public void print(int i) {
		System.out.println("Printing Integer - " + i);
	}
	
	public void print(String s) {
		System.out.println("Printing String - " + s);
	}
	
	public void print(float f) {
		System.out.println("Printing Float - " + f);
	}
	
	public void print(double d) {
		System.out.println("Printing Double - " + d);
	}

	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.print(5);
		ov.print("Hello");
		ov.print(2.2f);
		ov.print(2.2);
	}
}
