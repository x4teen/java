package com.example;

public interface SalesCalcs {

	public String getName();
	public double calcSalesPrice();
	public double calcCost();
	public double calcProfit();
	public static final String reportTitle = "\n ==Static List Report ==";
	
	public default void printItemData() {
		System.out.println("\n--" + this.getName() + " Report--");
		System.out.println("Sale Price: " + this.calcSalesPrice());
		System.out.println("Cost: " + this.calcCost());
		System.out.println("Profit: " + this.calcProfit());
	}
	
	public static void printArray(SalesCalcs[] items) {
		System.out.println(reportTitle);
		
		for (SalesCalcs item : items) {
			System.out.println("\n--" + item.getName() + " Report--");
			System.out.println("Sale Price: " + item.calcSalesPrice());
			System.out.println("Cost: " + item.calcCost());
			System.out.println("Profit: " + item.calcProfit());
			
		}
		
	}

}
