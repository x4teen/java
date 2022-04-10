package com.example;

import java.io.*;

public class DeclaringExceptions {
	
	//declare rule
	public static int readByteFromFile() throws IOException{
		try (InputStream in = new FileInputStream("a.txt")) {
			System.out.println("File Open");
			return in.read();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			int data = readByteFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
