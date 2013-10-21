package com.johnnycarlos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CraigslistSearch {
    
	private static WebDriver driver;
        
	public static void main(String[] args) {
		
        driver = new FirefoxDriver();
		
        driver.get("http://www.craigslist.com");
		

	}

}
