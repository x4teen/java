package com.mnrnyc.over;

public class StatisticsTest {

	public static void main(String[] args) {
		Statistics s = new Statistics();
		
		double avg0 = s.average();
		System.out.println("Average with no argument : "+ avg0);
		
		double avg1 = s.average(5);
		System.out.println("Average with one argument (5) : "+ avg1);
		
		double avg2 = s.average(100, 200, 300, 400);
		System.out.println("Average with multiple argument : "+ avg2);
		
	}

}
