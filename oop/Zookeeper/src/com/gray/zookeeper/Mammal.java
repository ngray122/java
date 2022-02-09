package com.gray.zookeeper;

public class Mammal {
	
	protected int energyLevel = 100;
	
	
	
	

	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	

	
//	method to display and return mammal energy 
	public int displayEnergy() {
		System.out.println("Current energy level: " + this.energyLevel);
		return this.energyLevel;
	}
}
