package com.mnrnyc.over;

public class VirtualInvokeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;  //instance of a super class can be come a subclass
		
		e = new Manager(102, "John Smith", "123-45-6789", 2000, "Marketing"); //poly morphismn
		System.out.println(e.getAllDetails());

	}

}
