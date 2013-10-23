/**
 * 
 */

package com.johnnycarlos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterTests {

	private static WebDriver driver;
	private static WebElement element;
	private static String username;
	private static String password;
	    
    public static void main(String[] args) {
		
    	checkArgs(args);
    	
    	start();
    
    	//end();
	    
    }

	private static void start() {
		
	    driver = new FirefoxDriver();
        
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	    driver.get("http://www.twitter.com");
	        
	    driver.manage().window().maximize();
		
	    element = driver.findElement(By.id("signin-email"));
	    
	    element.sendKeys(username);
	    
	    element = driver.findElement(By.id("signin-password"));
	    
	    element.sendKeys(password);

		
	}

	private static void checkArgs(String[] args) {
		if( args.length == 0){
			printHelp();
            System.exit(0);
		}
		
		username = args[0];
		password = args[1];
		
	}

	private static void end() {
		System.out.println("Exiting");
		driver.quit();
	}

	private static void printHelp() {
		System.out.println("Usage:");
		System.out.println("java -jar TwitterTests.jar <username> <password>");
		
	}


}
