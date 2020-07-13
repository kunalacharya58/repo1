package com.test.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "J:\\Softwares\\Selenium\\drivers\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	
    	String actualUrl = "https://www.testandquiz.com/selenium/testing.html";
    	driver.get(actualUrl);
    	driver.findElement(By.cssSelector("input#male")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("input.Performance")).click();
    	Thread.sleep(2000);
    	
        driver.close();
    }
}