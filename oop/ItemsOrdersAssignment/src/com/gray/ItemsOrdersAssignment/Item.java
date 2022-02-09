package com.gray.ItemsOrdersAssignment;


public class Item {
//	member variables
	private String name;
	private double price;
	
	public Item() {
		
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	
//	getter for name
	public String getName() {
		return this.name;
	}

	
//	Setter for name
	public void setName(String name) {
		this.name = name;
	}

//	getter for price
	public double getPrice() {
		return this.price;
	}
	
	
//	setter for price
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
