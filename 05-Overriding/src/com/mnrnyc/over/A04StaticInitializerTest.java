package com.mnrnyc.over;

public class A04StaticInitializerTest {
	private static final boolean[] switches = new boolean[5];
	
	static {
		System.out.println("Initializing...");
		for (int i=0; i<5; i++) {
			switches[i] = true;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switches[1] = false;
		switches[2] = false;
		
		System.out.println("Switch Setting");
		
		for (boolean currSwitch: switches) {
			if (currSwitch) {
				System.out.println(" On ");
			} else {
				System.out.println(" Off ");
			}
			
		}
		
	}

	

}
