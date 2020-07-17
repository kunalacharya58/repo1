package com.project.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.project.test.model.User;

public class LoginTest {
	
	WebDriver driver;
	
	String authPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String userDashboard = "http://automationpractice.com/index.php?controller=my-account";
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("\n[TEST:LOGIN] Launching browser...");
		String driverPath = ".\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		System.out.println("  [LOGIN] Browser launched successfully.");
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.get(authPage);
		System.out.println("  [LOGIN] Navigating to authentication page.");
		Reporter.log("Navigating to authentication page.");
		
		Assert.assertEquals(driver.getCurrentUrl(), authPage, "[LOGIN:ERROR] Log in page not found!");

		System.out.println("  [LOGIN] Attempting to log in.");
		Reporter.log("Attempting to log in.");
		enterLoginCredentials();
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), userDashboard, "[LOGIN:ERROR] Log in failed!");
		System.out.println("  [LOGIN] Log in was successful!");
		Reporter.log("Log in was successful!");
		
		driver.findElement(By.xpath("//div[@class=\"header_user_info\"]//a[@class=\"logout\"]")).click();
		System.out.println("  [LOGIN] Signed out successfully!");
		Reporter.log("Signed out successfully!");
	}
		
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("[TEST:LOGIN] Browser closed!");
	}
	
	public void enterLoginCredentials() {
		driver.findElement(By.id("email")).sendKeys(User.email);
		driver.findElement(By.id("passwd")).sendKeys(User.password);
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
