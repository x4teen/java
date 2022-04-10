package com.mnrnyc.over;

public class Employee {
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	

	
	public String getDetails() {
		return "ID : " + empId + "Name : " + name;
	}

	public String getAllDetails() {
		return "ID : " + empId + "Name : " + name + "SSN: " + ssn + "Salary: " + salary;
	}

	public double getSalary() {
		return this.salary;
	}
	
	public void changeName(String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}

	public void raiseSalary(double increase) {
		if (increase > 0) {
			this.salary += increase;
		}
	}
	
	@Override
	public String toString() {
		return "ID : " + empId + ", Name : " + name + ", SSN: " + ssn + ", Salary: " + salary;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}
	
}
