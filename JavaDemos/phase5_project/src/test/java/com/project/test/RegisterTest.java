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

public class RegisterTest {
	
	WebDriver driver;
	
	public String baseUrl = "http://automationpractice.com/index.php";
	
	String authPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String regFormPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	String userDashboard = "http://automationpractice.com/index.php?controller=my-account";
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("\n[TEST:REGISTER] Launching browser...");
		String driverPath = ".\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		System.out.println("  [REGISTER] Browser launched successfully.");
	}
	
	@Test
	public void register() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("  [REGISTER] Navigating to authentication page.");
		Reporter.log("Navigating to authentication page.");
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), authPage,"[REGISTER:ERROR] Authentication page not found!");
		
		driver.findElement(By.id("email_create")).sendKeys(User.generateEmail());
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("  [REGISTER] Generated email '"+User.email+ "' to register.");
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), regFormPage,"[REGISTER:ERROR] Registration page not found!");
		
		System.out.println("  [REGISTER] Filling up registration form.");
		Reporter.log("Filling up registration form.");
		fillRegForm();
		System.out.println("  [REGISTER] Registration form submitted!");
		Reporter.log("Registration form submitted!");
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getCurrentUrl(), userDashboard, "[REGISTER:ERROR] Registration failed!");
		System.out.println("  [REGISTER] Successfully registered to the site.");
		Reporter.log("Successfully registered to the site.");
		
		driver.findElement(By.xpath("//div[@class=\"header_user_info\"]//a[@class=\"logout\"]")).click();
		System.out.println("  [REGISTER] Signed out successfully!");
		Reporter.log("Signed out successfully!");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("[TEST:REGISTER] Browser closed!");
	}
	
	public void fillRegForm() {
		driver.findElement(By.id("customer_firstname")).sendKeys(User.fname);
		driver.findElement(By.id("customer_lastname")).sendKeys(User.lname);
		driver.findElement(By.id("passwd")).sendKeys(User.password);
		driver.findElement(By.id("address1")).sendKeys(User.address);
		driver.findElement(By.id("city")).sendKeys(User.city);
		driver.findElement(By.id("id_state")).sendKeys(User.state);
		driver.findElement(By.id("postcode")).sendKeys(User.zipCode);
		driver.findElement(By.id("id_country")).sendKeys(User.country);
		driver.findElement(By.id("phone_mobile")).sendKeys(User.mobile);
		driver.findElement(By.id("submitAccount")).click();
	}
}
