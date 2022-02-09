package com.gray.ItemsOrdersAssignment;

public class TestOrders {

	public static void main(String[] args) {
		
//		Data Type is item.  Instance of the Item class
		Item item1 = new Item("cappuccino", 5.5);
		Item item2 = new Item("mocha", 7.00);
		Item item3 = new Item("latte", 4.99);
		Item item4 = new Item("drip coffee", 2.00);
		
		
//		creating 2 orders for unspecified guest
		Order order1 = new Order();
		Order order2 = new Order();

//		create 3 orders using overload constructor
		Order order3 = new Order("Nicole");
		Order order4 = new Order("Batman");
		Order order5 = new Order("Robin");
//		System.out.println(order5.getName());

//		Add two items to each of the orders
		order1.addItem(item1);
		order1.addItem(item2);
		order2.addItem(item2);
		order2.addItem(item4);
		order3.addItem(item3);
		order3.addItem(item2);
		order4.addItem(item4);
		order4.addItem(item1);
//		System.out.println(order4.getItems());

//		Check order status and change ready status
		System.out.println(order1.getStatusMessage());
		order1.setReady(true);
		System.out.println(order1.getStatusMessage());
		
		System.out.println(order2.getStatusMessage());
		order2.setReady(false);
		System.out.println(order2.getStatusMessage());
		

		System.out.println(order3.getStatusMessage());
		order3.setReady(true);
		System.out.println(order3.getStatusMessage());
		

		System.out.println(order4.getStatusMessage());
		order4.setReady(false);
		System.out.println(order4.getStatusMessage());
		
//		get order total
		 System.out.println(order1.getOrderTotal());
		 System.out.println(order1.getOrderTotal());
		 
		 order3.addItem(item1);
	       order3.addItem(item4);
	       order3.addItem(item2);
	       order3.displayTotal();
	}

}



//
////System.out.println("Working");
//

//
////System.out.println(item1);
//// Menu items
//
////item1.name = "mocha";
////item2.name = "latte";
////item3.name = "drip coffee";
////item4.name = "capuccino";
////
////item1.price = 5.50;
////item2.price = 8.00;
////item3.price = 2.25;
////item4.price = 4.99;
//
//// Order variables -- order1, order2 etc.
////New instances of Order class
//Order order1 = new Order();
//Order order2 = new Order();
//Order order3 = new Order();
//Order order4 = new Order();
//
////Add name to order instances
//order1.name = "Cindhuri";
//order2.name = "Jimmy";
//order3.name = "Noah";
//order4.name = "Sam";
//	
//
//
////Add item1 to order2's item list and increment the orders total
//order2.items.add(item1);
////Incrementing the order total by price of item1
//order2.total += item1.price;
//System.out.printf("Hi %s, your %s will be ready shortly.  Your total will be %s \n", order2.name, item1.name,
//		order2.total);
//
//
////Order3 ordered a cappucino, add to order and total
//order3.items.add(item4);
//order3.total += item1.price;
//System.out.printf("Hi %s, your %s will be ready shortly.  Your total will be %s\n", order3.name, item4.name,
//		order3.total);
//
////Order4 ordered a latte
//order4.items.add(item2);
//order4.total += item2.price;
//System.out.printf("Hi %s, your %s will be ready shortly.  Your total will be %s\n", order4.name, item2.name,
//		order4.total);
//
////Order1 is ready
//order1.isReady = true;
//
////Sam ordered two more lattes
//order4.items.add(item2);
//order4.items.add(item2);
//order4.total += item2.price *2;
//System.out.printf("Hi %s, your %s will be ready shortly.  Your total will be %s\n", order4.name, item2.name,
//		order4.total);
//
////Jimmys' order is ready
//order2.isReady = true;
//
//
////Prints out object location in memory
//// System.out.println(order1.name);
//
//// Application Simulations
//// Use this example code to test various orders' updates
////System.out.printf("Name: %s\n", item1.price);
////System.out.printf("Total: %s\n", order1.total);
////System.out.printf("Ready: %s\n", order1.ready);
