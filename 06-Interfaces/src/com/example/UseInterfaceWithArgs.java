package com.example;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceWithArgs obj = (x, y)-> {
			int result = x + y;
			System.out.println("The result is " + result);
		};
		
		InterfaceWithArgs obj2 = (x, y)-> {
			int result = x * y;
			System.out.println("The result is " + result);
		};

		obj.calculate(20, 30);
		
		obj2.calculate(30, 20);
	}

}
