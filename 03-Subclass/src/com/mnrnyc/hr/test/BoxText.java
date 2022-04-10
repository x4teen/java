package com.mnrnyc.hr.test;
import com.mnrnyc.hr.Box;

public class BoxText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box();
		Box box2 = new Box(5);
		Box box3 = new Box(5, 4, 3);
		
		System.out.println("Box-1 Volume : " + box1.volume());
		System.out.println("Box-2 Volume : " + box2.volume());
		System.out.println("Box-3 Volume : " + box3.volume());

	}

}
