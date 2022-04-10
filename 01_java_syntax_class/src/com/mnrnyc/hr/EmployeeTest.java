package com.mnrnyc.hr;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101);
		emp.setName("Jane Smith");
		emp.setSsn("123-45-5678");
		emp.setSalary(120_345.27);
		
		printEmployeeDetails(emp);
		

	}

	private static void printEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Employee Id:\t" + emp.getEmpId());
		System.out.println("Employee Name:\t" + emp.getName());
		System.out.println("Employee SSN:\t" + emp.getSsn());
		System.out.println("Employee Salary:\t" + emp.getSalary());
		
	}

}
