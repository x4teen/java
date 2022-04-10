package com.example;

public class WidgetPro extends Widget implements WidgetSalesCalcs{
	
	private String type;

	public WidgetPro(double salesPrice, double cost, double quantity, String type) {
		super(salesPrice, cost, quantity);
		this.type = type;
	}

	@Override
	public String getWidgetType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	@Override
	public void printItemData() {
		System.out.println("\n--" + this.getName() + " Report--");
		System.out.println("Widget Type : " + this.type);
		System.out.println("Sale Price: " + this.calcSalesPrice());
		System.out.println("Cost: " + this.calcCost());
		System.out.println("Profit: " + this.calcProfit());
	}

}
