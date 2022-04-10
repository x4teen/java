package com.example;

public class UseSimpleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterface instance = new SimpleInterface() {

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("I did this.");
				
			}
			
		};

		instance.doSomething();
		
		SimpleInterface obj = () -> System.out.println("Lambda - I did this");
		obj.doSomething();
	}

}
