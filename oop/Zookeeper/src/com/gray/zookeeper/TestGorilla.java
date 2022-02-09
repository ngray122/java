package com.gray.zookeeper;

public class TestGorilla {

	public static void main(String[] args) {
	
			
			Gorilla g= new Gorilla();
			Bat b= new Bat();
			
		
			System.out.println("~ ~ ~ Track Gorilla Energy below ~ ~ ~");
			g.throwSomething();
			g.throwSomething();
			g.throwSomething();
			g.eatBananas();
			g.eatBananas();
			g.climb();
			g.displayEnergy();
			
			System.out.println("~ ~ ~ Track Bat Energy below ~ ~ ~");
			b.fly();
			b.fly();
			b.eatHumans();
			b.eatHumans();
			b.attackTown();
			b.attackTown();
			b.attackTown();
			b.displayEnergy();
			
	}

}
