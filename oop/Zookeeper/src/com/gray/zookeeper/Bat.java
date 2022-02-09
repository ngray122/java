package com.gray.zookeeper;

public class Bat extends Mammal {
	
	
	Bat() {
		super();
		this.energyLevel = 300;
		
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("EEEEEEEEEEEEE <-- Flying Bat! Decreased energy by 50: " + this.energyLevel);
		
	}
	
	public void eatHumans() {
		this.energyLevel+=25;
		
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("BURNING TOWN! Decreased energy by 100: " + this.energyLevel);


	}
	
	

}
