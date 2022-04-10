package com.mnrnyc.job;
import javax.swing.JOptionPane;

public class SwitchStringStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = JOptionPane.showInputDialog("Enter a shirt color : ");
		String shirt = " Shirt";
		
		switch (color) {
		case "Blue":
			shirt = "Blue" + shirt;
			break;
		case "Red":
			shirt = "Red" + shirt;
			break;
		default:
			shirt = "White" + shirt;
			break;
		}
		
		System.out.println("You shirt type is "+shirt);

	}

}
