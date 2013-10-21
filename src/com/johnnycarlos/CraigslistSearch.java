/**
 * This purpose of class is mainly for me to learn Selenium WebDriver.  I 
 * will use it to run queries to craigslist.com.  (I realize there are 
 * better ways to do this, but that would not teach me about Selenium.
 */
package com.johnnycarlos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CraigslistSearch {
    
	private static WebDriver driver;
    private static WebElement element;
    
	public static void main(String[] args) {
		
        driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.get("http://sacramento.craigslist.org/sss/");
        
        driver.manage().window().maximize();
		
        element = driver.findElement(By.id("query"));       
        
        element.sendKeys("dungeons dragons");
        
        element.submit();
        
   
	}

}
