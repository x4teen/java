package com.mnrnyc.hr.test;

import com.mnrnyc.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp01 = new Employee(121, "Ron", "ab123", 5000);
		emp01.raiseSalary(500);
		
		System.out.println("Employee Name : "+ emp01.getName());
		System.out.println("Employee SSN : "+ emp01.getSsn());
		System.out.println("Employee Salary : " + emp01.getSalary());
	}

}
