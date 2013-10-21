/**
 * This purpose of class is mainly for me to learn Selenium WebDriver.  I 
 * will use it to run queries to craigslist.com.  (I realize there are 
 * better ways to do this, but that would not teach me about Selenium.
 */
package com.johnnycarlos;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CraigslistSearch {
    
    private static WebDriver driver;
    private static WebElement element;
    
	public static void main(String[] args) {
		
        driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.get("http://sacramento.craigslist.org/sss/");
        
        driver.manage().window().maximize();
		
        element = driver.findElement(By.id("query"));       
        
        //TODO: get this from args
        element.sendKeys("dungeons dragons");
        
        element.submit();
        
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        try {
			FileUtils.copyFile(screenshot, new File("/tmp/screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        // Example of storing the html source code
        //String html = driver.getPageSource();
        
	}

}
