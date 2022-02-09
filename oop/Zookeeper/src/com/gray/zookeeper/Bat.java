package com.gray.zookeeper;

public class Bat extends Mammal {
	
	
	Bat() {
		super();
		this.energyLevel = 300;
		
	}
	
	public void fly() {
		System.out.println("EEEEEEEEEEEEE <-- Flying Bat! Decreased energy by 50: " + this.energyLevel);
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel+=25;
		
	}
	
	public void attackTown() {
		System.out.println("BURNING TOWN! Decreased energy by 100: " + this.energyLevel);

		this.energyLevel -= 100;
	}
	
	

}
