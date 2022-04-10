package com.mnrnyc.hr.test;
import com.mnrnyc.hr.Manager;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager(102, "Barbara Jones", "123-45-6789", 10000, "Marketing");
		
		System.out.println("Manager Name : " + mgr.getName());
		System.out.println("Department : " + mgr.getDeptName());
		System.out.println("Salary : " + mgr.getSalary());
		
		mgr.raiseSalary(5000);
		
		System.out.println("Raised Salary : " + mgr.getSalary());
		
		
		
	
		
	}

}
