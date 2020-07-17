package com.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	
	public WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Launching browser...");
		String driverPath = "J:\\Softwares\\Selenium\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@Test
	public void openWebsite() {
		String baseUrl = "http://automationpractice.com/index.php";
		driver.get(baseUrl);
		System.out.println("Navigation complete.");
	}
	
	@Test
	public void loginTest() {
		System.out.println("Now begin login.");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Browser closed.");
		driver.close();
	}

}
