package com.example;

public class CrushedRock implements SalesCalcs{
	
	private String name = "Crushed Rock";
	private double salesPrice = 0;
	private double cost = 0;
	private double weight = 0;
	
	public CrushedRock(double salesPrice, double cost, double weight) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.weight = weight;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		// TODO Auto-generated method stub
		return this.salesPrice * this.weight;
	}

	@Override
	public double calcCost() {
		// TODO Auto-generated method stub
		return this.cost * this.weight;
	}

	@Override
	public double calcProfit() {
		// TODO Auto-generated method stub
		return this.calcSalesPrice() - this.calcCost();
	}

}
