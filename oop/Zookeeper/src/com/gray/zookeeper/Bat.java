package com.gray.zookeeper;

public class Bat extends Mammal {
	
//	Bat will inherit Mammal(parent) attribute methods
	Bat() {
//		super();  Do I need to inherit super if I set my own default? Works without
		this.energyLevel = 300;
		
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("EEEEEEEEEEEEE <-- Flying Bat! Decreased energy by 50: " + this.energyLevel);
		
	}
	
	public void eatHumans() {
		this.energyLevel+=25;
		System.out.println("Tastes like chicken! Increased energy by 25: " + this.energyLevel);

		
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("BURNING TOWN! Decreased energy by 100: " + this.energyLevel);


	}
	
	

}
