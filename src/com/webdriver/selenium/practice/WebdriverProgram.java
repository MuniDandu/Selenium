package com.webdriver.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebdriverProgram {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://ebay.co.uk");

	}

}
