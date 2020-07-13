package com.testngdemo;

import org.testng.annotations.Test;

public class SecondModule {
	
	@Test(groups = {"Database"})
	public void methodOneTest() {
		System.out.println("Test method 1 of Second Module Test");
	}
	
	@Test(groups = {"Testing"})
	public void methodTwoTest() {
		System.out.println("Test method 2 of Second Module Test");
	}
	
}
