package com.project.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.project.test.model.User;

public class SearchTest {
	
	WebDriver driver;
	
	String loginPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String userDashboard = "http://automationpractice.com/index.php?controller=my-account";
	String productPage = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=shirt&submit_search=";
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("\n[TEST:SEARCH] Launching browser...");
		String driverPath = ".\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		System.out.println("  [SEARCH] Browser launched successfully.");
	}
	
	@Test
	public void searchProduct() throws InterruptedException {
		driver.get(loginPage);
		System.out.println("  [SEARCH] Navigating to log in page.");
		Reporter.log("Navigating to log in page.");
		
		Assert.assertEquals(driver.getCurrentUrl(), loginPage, "[SEARCH:ERROR] Log in page not found!");

		System.out.println("  [SEARCH] Attempting to log in.");
		Reporter.log("Attempting to log in.");
		enterLoginCredentials();
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), userDashboard, "[SEARCH:ERROR] Log in failed!");
		System.out.println("  [SEARCH] Log in was successful!");
		Reporter.log("Log in was successful!");
		
		driver.findElement(By.id("search_query_top")).sendKeys(User.query);
		driver.findElement(By.name("submit_search")).sendKeys(Keys.ENTER);
		System.out.println("  [SEARCH] Searching for a product 'shirt'...");
		Reporter.log("Searching for a product 'shirt'...");
		
		Assert.assertEquals(driver.getCurrentUrl(), productPage, "[SEARCH:ERROR] Product not found!");
		
		System.out.println("  [SEARCH] Matching products received!");
		Reporter.log("Matching products received!");

		driver.findElement(By.xpath("//div[@class=\"header_user_info\"]//a[@class=\"logout\"]")).click();
		System.out.println("  [SEARCH] Signed out successfully!");
		Reporter.log("Signed out successfully!");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("[TEST:SEARCH] Browser closed!");
	}
	
	public void enterLoginCredentials() {
		driver.findElement(By.id("email")).sendKeys(User.email);
		driver.findElement(By.id("passwd")).sendKeys(User.password);
		driver.findElement(By.id("SubmitLogin")).click();
	}
}
