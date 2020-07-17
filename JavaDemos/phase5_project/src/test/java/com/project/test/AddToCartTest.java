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

public class AddToCartTest {
	
	WebDriver driver;
	
	String loginPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String userDashboard = "http://automationpractice.com/index.php?controller=my-account";
	String productPage = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=shirt&submit_search=";
	String productDetailsPage = "http://automationpractice.com/index.php?id_product=1&controller=product&search_query=shirt&results=1";
	String cartPage = "http://automationpractice.com/index.php?controller=order";
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("\n[TEST:CART] Launching browser...");
		String driverPath = ".\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		System.out.println("  [CART] Browser launched successfully.");
	}
	
	@Test
	public void addToCart() throws InterruptedException {
		driver.get(loginPage);
		System.out.println("  [CART] Navigating to log in page.");
		Reporter.log("Navigating to log in page.");
		
		Assert.assertEquals(driver.getCurrentUrl(), loginPage, "[CART:ERROR] Log in page not found!");

		System.out.println("  [CART] Attempting to log in.");
		Reporter.log("Attempting to log in.");
		enterLoginCredentials();
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), userDashboard, "[CART:ERROR] Log in failed!");
		System.out.println("  [CART] Log in was successful!");
		Reporter.log("Log in was successful!");
	
		driver.findElement(By.id("search_query_top")).sendKeys(User.query);
		driver.findElement(By.name("submit_search")).sendKeys(Keys.ENTER);
		System.out.println("  [CART] Searching for a product 'shirt'...");
		Reporter.log("Searching for a product 'shirt'...");
		
		Assert.assertEquals(driver.getCurrentUrl(), productPage, "[CART:ERROR] Product not found!");
		
		System.out.println("  [CART] Selecting a product.");
		Reporter.log("Selecting a product.");
		
		driver.findElement(By.xpath(
			"//div[@class=\"product-container\"]//div//h5//a[contains(text(), \"shirts\")]"
			)).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), productDetailsPage, "[CART:ERROR] Cannot find product details!");
	
		System.out.println("  [CART] Adding product to the Cart...");
		Reporter.log("Adding product to the Cart...");
		
		driver.findElement(By.xpath(
			"//button[@type=\"submit\" and @name=\"Submit\"]"
			)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
			"//div[@class=\"button-container\"]//a//span[contains(text(),\"Proceed to checkout\")]"
			)).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), cartPage, "[CART:ERROR] Failed to add to cart!");
		
		System.out.println("  [CART] Product added to cart successfully!");
		Reporter.log("Product added to cart successfully!");
		
		driver.findElement(By.xpath("//div[@class=\"header_user_info\"]//a[@class=\"logout\"]")).click();
		System.out.println("  [CART] Signed out successfully!");
		Reporter.log("Signed out successfully!");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("[TEST:CART] Browser closed!");
	}
	
	public void enterLoginCredentials() {
		driver.findElement(By.id("email")).sendKeys(User.email);
		driver.findElement(By.id("passwd")).sendKeys(User.password);
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
