package com.testngdemo;

import org.testng.annotations.Test;

public class FirstModuleTests {
	
	@Test(groups = {"Database"})
	public void methodOneTest() {
		System.out.println("Test method 1 of First Module Test");
	}
	
	@Test(groups = {"Testing"})
	public void methodTwoTest() {
		System.out.println("Test method 2 of First Module Test");
	}

}
