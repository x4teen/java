package com.example;
import java.io.*;

public class MissingFileError {

	public static void main(String[] args) {
		
		try {
			// TODO code to open file
			System.out.println("About to open a file");
			InputStream in = new FileInputStream("missingfile.txt");
			System.out.println("File opened");
		} catch(Exception e) {
			System.out.println("Something went wrong - " + e.getMessage());
		}
		

	}

}
