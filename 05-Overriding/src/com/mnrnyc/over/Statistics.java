package com.mnrnyc.over;

public class Statistics {
	
	public double average(int...nums) {
		int sum = 0;
		double result = 0;
		
		if (nums.length >0) {
			for (int x : nums) {
				sum += x;
			}
			result = sum / nums.length;
		}
		
		return result;
	}

}
