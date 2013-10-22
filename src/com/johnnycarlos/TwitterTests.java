package com.johnnycarlos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterTests {

	private static WebDriver driver;
	private static WebElement element;
	    
    public static void main(String[] args) {
			
	    driver = new FirefoxDriver();
	        
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	    driver.get("http://www.twitter.com");
	        
	    driver.manage().window().maximize();
		
	    element = driver.findElement(By.id("signin-email"));
	    
	    element.sendKeys("johnnycarlos@gmail.com");
	    
	    // put email and password as args
 
    }
	
}
