package com.caresoft.clinicapp;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPPACompliantUser, HIPPACompliantAdmin {

	private Integer employeeID;
	private String role;
	private ArrayList<String> securityIncidents = new ArrayList<String>();

	public AdminUser(Integer userId, String userRole) {
		super(userId);
		this.role = userRole;
	}

	public void newIncident(String notes) {
		String report = String.format("Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", new Date(),
				this.id, notes);
		securityIncidents.add(report);
	}

	public void authIncident() {
		String report = String.format("Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(), this.id,
				"AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
		securityIncidents.add(report);

	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		return this.securityIncidents;
		
	}
		
		

	@Override
	public boolean assignPin(int pin) {
		if (pin >= 100000) {
			return true;

		} else {
			return false;

		}

	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
		} else {
			authIncident();
			return false;
			
			
		}
		
	}
	
	

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
