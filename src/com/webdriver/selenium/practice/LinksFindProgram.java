package com.webdriver.selenium.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksFindProgram {
	
	static WebDriver driver = null;
	
	@BeforeClass
	public static void linksFind ()
	{
		driver = new FirefoxDriver();
		driver.get("http://ebay.co.uk");
		driver.manage().window().maximize();
	}
	

	@Test
	public void test() {
		List<WebElement> linkElements = new ArrayList<WebElement>();
		linkElements = driver.findElements(By.tagName("a"));
		System.out.println(linkElements.size());
		
	
	}

}
