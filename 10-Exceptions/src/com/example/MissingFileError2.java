package com.example;
import java.io.*;

public class MissingFileError2 {

	public static void main(String[] args) {
		InputStream in = null;
		
		try {
			// TODO code to open file
			System.out.println("About to open a file");
			in = new FileInputStream("missingfile.txt");
			System.out.println("File opened");
			int data = in.read();
			in.close();
		} catch(FileNotFoundException e) {
			System.out.println("Something went wrong - " + e.getClass().getName());
			System.out.println("Quitting");
		} catch(IOException e) {
			System.out.println("Something went wrong - " + e.getClass().getName());
			System.out.println("Quitting");
		} finally {
			System.out.println("Finally ...");
			try {
				if (in != null) in.close();
			}catch(IOException e) {
				System.out.println("Failed to close file.");
			}
		}
		

	}

}
