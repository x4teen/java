package com.example;

public class Widget implements SalesCalcs{
	
	private String name = "Widgets";
	private double salesPrice = 0;
	private double cost = 0;
	private double quantity = 0;
	

	public Widget(double salesPrice, double cost, double quantity) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		// TODO Auto-generated method stub
		return this.salesPrice * this.quantity;
	}

	@Override
	public double calcCost() {
		// TODO Auto-generated method stub
		return this.cost * this.quantity;
	}

	@Override
	public double calcProfit() {
		// TODO Auto-generated method stub
		return this.calcSalesPrice() - this.calcCost();
	}

}
