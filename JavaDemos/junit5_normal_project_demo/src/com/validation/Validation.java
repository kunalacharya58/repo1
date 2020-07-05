package com.validation;

public class Validation {
	
	public boolean validatePan(String pan) {
		boolean b = false;
		if (pan != null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			b = true;
		}
		return b;
	}
}
