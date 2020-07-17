package com.project.test.model;

import java.util.Random;

public class User {

	// All the mandatory details required for registration.
	public static String email = "jococ69602@romail9.com"; // default email used while testing.
	public static String fname = "Michael";
	public static String lname = "Scott";
	public static String password = "password";
	public static String address = "Dunder Mifflin Paper, Scranton, PA";
	public static String city = "Electric City";
	public static String state = "Pennsylvania";
	public static String zipCode = "15683";
	public static String country = "United States";
	public static String mobile = "+17013684600";
	
	public static String query = "shirt";
	
	// Generate unique scrap email to bypass the email validation during registration.
	public static String generateEmail() {
		String charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random rnd = new Random();
        int maxlen = 3 + (int) (rnd.nextFloat()*10);
        while (email.length() < maxlen) {
            int index = (int) (rnd.nextFloat() * charPool.length());
            email.append(charPool.charAt(index));
        }
        email.append("@"+email+".com");
        String newEmail = email.toString();
        User.email = newEmail;
        return newEmail;
	}
}
