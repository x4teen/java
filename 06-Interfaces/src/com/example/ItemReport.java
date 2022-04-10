package com.example;

public class ItemReport {
	
	public void printItemData(SalesCalcs item) {
		System.out.println("\n--" + item.getName() + " Report--");
		System.out.println("Sale Price: " + item.calcSalesPrice());
		System.out.println("Cost: " + item.calcCost());
		System.out.println("Profit: " + item.calcProfit());
	}

}
