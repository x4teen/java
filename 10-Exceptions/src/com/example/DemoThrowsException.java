package com.example;

import java.io.FileNotFoundException;

public class DemoThrowsException {
	
	public static void readFile (String file) throws FileNotFoundException {
		boolean found = findFile(file);
		
		if (!found) {
			throw new FileNotFoundException("Missing File Test");
		}
	}

	private static boolean findFile(String file) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		try {
			readFile("Missing.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	}

}
