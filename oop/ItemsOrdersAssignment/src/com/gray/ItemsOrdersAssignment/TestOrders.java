package com.gray.ItemsOrdersAssignment;


public class TestOrders {

	public static void main(String[] args) {
	
//		System.out.println("Woorking");
		
		
//		Data Type is item.  Instance of the Item class
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
	
		
//		System.out.println(item1);
		 // Menu items
		
		item1.name="mocha";
		item2.name="latte";
		item3.name="drip coffee";
		item4.name="capuccino";
		
		item1.price=5.50;
		item2.price=8.00;
		item3.price=2.25;
		item4.price=4.99;
		
        // Order variables -- order1, order2 etc.
//		New instances of Order class
		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();
		Order order4 = new Order();
		
//		Add name to order instances
		order1.name = "Cindhuri";
		order2.name = "Jimmy";
		order3.name = "Noah";
		order4.name = "Sam";
		
		
//		Add item1 to order2's item list and increment the orders total
		order2.items.add(item1);
		order2.total += item1.price;
		 System.out.printf("Hi %s, your %s will be ready shortly.  Your total will be %s", order2.name, item1.name, order2.total );

		
		
//			Prints out object location in memory
//		 System.out.println(order1.name);
		
		
    
        // Application Simulations
        // Use this example code to test various orders' updates
//        System.out.printf("Name: %s\n", item1.price);
//        System.out.printf("Total: %s\n", order1.total);
//        System.out.printf("Ready: %s\n", order1.ready);
		

	}

}