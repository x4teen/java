package com.mnrnyc.over;

public class GoodBonusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodBonus bonus = new GoodBonus();
		
		Employee e = new Employee(101, "Jim Smith", "111-11-111", 2000);
		System.out.println(e.getDetails());
		System.out.println("Bonus : " );
		
		Manager m = new Manager(101, "Jim Smith", "111-11-111", 2000, "Marketing");
		System.out.println(m.getAllDetails());
		System.out.println("Bonus : " );

	}

}
