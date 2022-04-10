package com.example;

public class TestSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrushedRock rock1 = new CrushedRock(12, 10, 50);
		SalesCalcs rock2 = new CrushedRock(12, 10, 50);
		
		System.out.println("Sale Price rock1: " + rock1.calcSalesPrice());
		System.out.println("Sales Price rock2: " + rock2.calcSalesPrice());
		
		SalesCalcs[] itemList = new SalesCalcs[5];
				
		itemList[0] = rock1;
		itemList[1] = rock2;
		itemList[2] = new RedPaint(10, 8, 25);
		itemList[3] = new Widget(12, 10, 50);
		itemList[4] = new CrushedRock(12, 10, 25);
		
		for (SalesCalcs item: itemList) {
			item.printItemData();
		}
		
		SalesCalcs.printArray(itemList);
		
		WidgetPro widget1 = new WidgetPro(15, 10, 20, "type1");
		System.out.println("Widget " + widget1.getWidgetType() + " Sale Price : " + widget1.calcSalesPrice());
		widget1.printItemData();
		
		
		
	}

}
