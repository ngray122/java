package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPPACompliantUser {

	// member variables
	private ArrayList<String> patientNotes;

	public Physician(Integer userId) {
		super(userId);

	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}

	// ASSIGN PIN
	@Override
	public boolean assignPin(int pin) {
		if (pin <= 9999 && pin >= 1000) {
			this.pin = pin;
			return true;
		} else {
			return false;
		}
	}
	
	

	// ACCESS AUTHORIZED
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == this.id) {
			return true;
		} else {
			return false;
		}

	}
}
