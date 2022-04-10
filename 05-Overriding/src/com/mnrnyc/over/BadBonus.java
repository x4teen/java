package com.mnrnyc.over;

public class BadBonus {
	
	public double calcBonus (Employee e) {
		return e.getSalary() * 0.10;
	}
	
	public double calcBonus (Manager m) {
		return m.getSalary() * 0.20;
	}

	public double calcBonus (Engineer en) {
		return en.getSalary() * 0.30;
	}
	
	public double calcBonus (Director d) {
		return d.getSalary() * 0.30;
	}
	
}
