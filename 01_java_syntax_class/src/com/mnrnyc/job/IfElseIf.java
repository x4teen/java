package com.mnrnyc.job;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
//		String input = JOptionPane.showInputDialog("Enter a number");
//		int x = Integer.parseInt(input);
		
		
		if (x == 10) {
			System.out.println("Value of x is 10");
		} else if (x == 20) {
			System.out.println("Value of x is 20");
		} else if (x == 30) {
			System.out.println("Value of x is 30");
		} else {
			System.out.println("The else stament was executed.");
		}

	}
	
}
