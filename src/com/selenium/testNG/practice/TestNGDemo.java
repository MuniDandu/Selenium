package com.selenium.testNG.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNGDemo {
	
	WebDriver driver = null;
	
	
	 @BeforeClass
	  public void beforeClass() {
		 driver = new FirefoxDriver();
		 driver.get("https://ebay.co.uk");
		 
	  }
	 
	 
	 @Test
	 public void f() {
		 
		 String currentURL = driver.getCurrentUrl();
		 Assert.assertEquals(currentURL, "https://ebay.co.uk");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void testMethod(){
		 
	 }
 

	 @AfterClass
	 public void afterClass() {
		 driver.quit();
		 driver.close();
	 }

}
