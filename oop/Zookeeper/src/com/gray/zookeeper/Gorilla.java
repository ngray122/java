package com.gray.zookeeper;

public class Gorilla extends Mammal{
	
	Gorilla(){
		super();
	}
	
	
	
	public int throwSomething() {
		System.out.println("The Gorilla just threw a banana! Decreased energy by 5. New energy: " + this.energyLevel);
		return this.energyLevel -= 5;
		
	}
	
	public int eatBananas() {
		System.out.println("Bananas, yummmmmmm. Increased energy by 10! New energy: " + this.energyLevel);
		return this.energyLevel += 10;
		
	}
	
	public int climb() {
		System.out.println("The Gorilla just climbed a tree. New energy: " + this.energyLevel);
		return this.energyLevel -= 10;
	}
	
	

}
