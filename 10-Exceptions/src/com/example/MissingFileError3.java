package com.example;
import java.io.*;

public class MissingFileError3 {

	public static void main(String[] args) {
		int data = 0;
				
		try (InputStream in = new FileInputStream("missingfile.txt")){
			System.out.println("File opened");
			data = in.read();
			in.close();
		} catch(FileNotFoundException e) {
			System.out.println("Something went wrong - " + e.getClass().getName());
			System.out.println("Quitting");
		} catch(IOException e) {
			System.out.println("Something went wrong - " + e.getClass().getName());
			System.out.println("Quitting");
		} 
		
		if (data != 0) {
			System.out.println(data);
		} else {
			System.out.println("Data not found.");
		}
		
	}

}
