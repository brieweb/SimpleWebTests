/**
 * This purpose of class is mainly for me to learn Selenium WebDriver.  I 
 * will use it to run queries to craigslist.com.  (I realize there are 
 * better ways to do this, but that would not teach me about Selenium.
 */
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
