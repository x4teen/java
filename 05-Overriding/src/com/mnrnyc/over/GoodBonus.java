package com.mnrnyc.over;

public class GoodBonus {
	
	
	public static double getBonusRate (Employee e) {
		double bonusRate = 0;
		
		if (e instanceof Employee) {
			bonusRate = 0.10;				
		} else if (e instanceof Manager) {
			bonusRate = 0.20;
		} else if (e instanceof Engineer) {
			bonusRate = 0.30;
		} else if (e instanceof Director) {
			bonusRate = 0.40;
		}
		
		return bonusRate;
		
	}

}
