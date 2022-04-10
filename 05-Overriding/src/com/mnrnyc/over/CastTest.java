package com.mnrnyc.over;

public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Manager(1, "John", "111-11-1111", 2000, "Marketing");
		
		Manager m = (Manager) e;
		
		System.out.println(m.getDetails());

	}

}
