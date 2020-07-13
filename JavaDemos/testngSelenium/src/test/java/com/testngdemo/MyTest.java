package com.testngdemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void OpenBrowser() {
		System.out.println("Open Browser");
	}
	
	@Test(dependsOnGroups = {"database"})
	@Parameters({"username", "password", "loginType"})
	public void testLogin(String username, String password, @Optional("guest")String loginType) {
		if(username.equals("admin") && password.equals("admin") && loginType.equals("administrator")) {
			System.out.println("Welcome Admin");
		} else {
			System.out.println("Welcom Guest");
		}
	}
}
