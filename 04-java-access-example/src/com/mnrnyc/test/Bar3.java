package com.mnrnyc.test;

import com.mnrnyc.Foo3;

public class Bar3 extends Foo3{
	private int sum = 10;
	
	public void reportSum() {
		sum += super.getResult();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	}

}
