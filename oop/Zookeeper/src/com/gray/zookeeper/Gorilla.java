package com.gray.zookeeper;

public class Gorilla extends Mammal{
	
	Gorilla(){
		super();
	}
	
	
	
	public void throwSomething() {
		this.energyLevel -= 5;
		String.format("The Gorilla just threw a banana! Decreased energy by 5. New energy: " + this.energyLevel);
	
		
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Bananas, yummmmmmm. Increased energy by 10! New energy: " + this.energyLevel);
	
		
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The Gorilla just climbed a tree. New energy: " + this.energyLevel);

	}
	
	

}
