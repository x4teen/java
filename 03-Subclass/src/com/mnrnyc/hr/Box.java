package com.mnrnyc.hr;

public class Box {
	
	private double length, width, height;
	
	public Box() {
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}
	
	public Box(double length) {
		this.length = length;
		this.width = 1;
		this.height = 1;
	}
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double volume() {
		return width * length * height;
	}

}
