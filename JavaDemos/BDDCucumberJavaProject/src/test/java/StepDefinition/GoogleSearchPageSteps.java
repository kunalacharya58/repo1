package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchPageSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		// STEP 1
		String driverPath = "J:\\Softwares\\Selenium\\drivers\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		// optional
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println("Inside step - broswer is open");
	}
	
	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		// STEP 2
		String url = "https://www.google.com/";
		driver.get(url);
		System.out.println("Inside step - google search page");
	}
	
	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		// STEP 3
		driver.findElement(By.name("q")).sendKeys("Simplilearn");
		System.out.println("Inside step - text in search box");
	}
	
	@And("hits enter")
	public void hits_enter() {
		// STEP 4
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Inside step - hits enter");
	    
	}
	
	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		// STEP 5
		System.out.println("Inside step - user navigated to results");
		driver.close();
	    driver.quit();
	}

}
