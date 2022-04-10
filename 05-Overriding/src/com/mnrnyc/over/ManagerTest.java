package com.mnrnyc.over;

public class ManagerTest {
	
	

	public static void main(String[] args) {
		Employee emp = new Employee(123, "Barbara Jones", "123-45-6525", 10000);
		Manager mgr = new Manager(123, "Barbara Jones", "123-45-6525", 10000, "Sales");
		
		System.out.println(emp.getDetails());
		System.out.println(mgr.getDetails());

	}

}
