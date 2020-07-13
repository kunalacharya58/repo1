package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private WebDriver driver = null;
	
	@Given("browser is open for testproject")
	public void browser_is_open_for_testproject() {
		// STEP 1
		String driverPath = "J:\\Softwares\\Selenium\\drivers\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		// optional
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Step 1: Open browser");
	}

	@And("user is on login page for testproject")
	public void user_is_on_login_page_for_testproject() {
		String url = "https://example.testproject.io/web/";
		driver.get(url);
	    System.out.println("Step 2: login page");
	}
	
	@When("^user enters (.*) and (.*) for testproject$")
	public void user_enters_username_and_password_for_testproject(String username, String password) {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Step 3: username and password");
	}
	
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	    System.out.println("Step 4: login button");
	}

	@Then("user is navigated to the home page for testproject")
	public void user_is_navigated_to_the_home_page_for_testproject() {
//		driver.findElement(By.id("logout")).click();
		driver.close();
		System.out.println("Step 5: home page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("browser is open for testproject")
//	public void browser_is_open_for_testproject() {
//		// STEP 1
//		String driverPath = "J:\\Softwares\\Selenium\\drivers\\chromedriver.exe";		
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		driver = new ChromeDriver();
//		// optional
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		System.out.println("Step 1: Open browser");
//	}
//
//	@And("user is on login page for testproject")
//	public void user_is_on_login_page_for_testproject() {
//		String url = "https://example.testproject.io/web/";
//		driver.get(url);
//	    System.out.println("Step 2: login page");
//	}
//
//	@When("user enters username and password for testproject")
//	public void user_enters_username_and_password_for_testproject() {
//		driver.findElement(By.id("name")).sendKeys("Kunal Acharya");
//		driver.findElement(By.id("password")).sendKeys("12345");
//		System.out.println("Step 3: username and password");
//	}
//	
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.id("login")).click();
//	    System.out.println("Step 4: login button");
//	}
//
//	@Then("user is navigated to the home page for testproject")
//	public void user_is_navigated_to_the_home_page_for_testproject() {
//		driver.findElement(By.id("logout")).click();
//		driver.close();
//		driver.quit();
//		System.out.println("Step 5: home page");
//	}

}
