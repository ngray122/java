package com.gray.ItemsOrdersAssignment;

import java.util.ArrayList;

public class Order {
//	member variables
	private String name;
	private boolean isReady;
	private ArrayList<Item>items = new ArrayList<Item>();
	
	
//	Constructor method
	public Order() {
		this.name = "Guest";
		
	}
	
//	overloaded contructor
	public Order(String name) {
		this.name = name;
		
	}
	
//	getter for name
	public String getName() {
		return this.name;
	}
	

//	setter for name
	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return isReady;
	}
	
//	setter fir isReady
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

//	getter for Arrayalist
	public ArrayList<Item> getItems() {
		return items;
	}

//	setter for ArrayList
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	
//	add item to order
	public void addItem(Item item) {
		this.items.add(item);
		
	}
	
//	return a string for status messgae
	public String getStatusMessage() {
		if (this.isReady == true) {
			return  "Your order is ready";
		} else
		return "Your order will be ready soon";
	}
	
//	get price of items 
	public double getOrderTotal() {
		double total = 0.0;
		for(Item i: this.items) {
			total += i .getPrice();
		}
			return total;
	}
	
//prints out order info
	public void displayTotal() {
		System.out.printf("Name: %s", this.name);
		for(Item i: this.items) {
			System.out.println(i.getName() + "$" + i.getPrice());
		}
		System.out.println("Total Order: $" + this.getOrderTotal() );
	}
	

}
