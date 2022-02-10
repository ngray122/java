package com.caresoft.clinicapp;

public class User {
	
	protected Integer id;
	protected int pin;
	
	
	
	
//	getters and setters
	public User(Integer userId){
		this.id = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	

}
