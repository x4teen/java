package com.mnrnyc.over;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee(1, "vinod", "111-11-1111", 2000);
		System.out.println(e);
		
		Employee e1 = new Employee(1, "vinod", "111-11-1111", 2000);
		Employee e2 = new Employee(1, "vinod", "111-11-1111", 2000);
		
		System.out.println("Statement: e1.equals(e2) : " + e1.equals(e2));
		System.out.println("Statement: e1 == e2 : " + (e1==e2));

	}

}
