package com.webdriver.selenium.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindParticularLink {
	
	static WebDriver driver = null;
	
	
	@BeforeClass
	public static void findParticularLink()
	{
		driver = new FirefoxDriver();
		driver.get("http://ebay.co.uk");
		driver.manage().window().maximize();
		
		
		
	}
	@Test
	public void linksList(){
		List<WebElement> linkElements = new ArrayList<WebElement>();
		linkElements = driver.findElements(By.tagName("a"));
		System.out.println(linkElements.size());
		for (WebElement element: linkElements){
			
			String linkname = element.getText();
			System.out.println(linkname);
		}
	}
	

	@Test
	public void test() {
        
		
		System.out.println("Enter the link to find ");
		
		Scanner input = new Scanner(System.in);		
		String link= input.nextLine();
		List<WebElement> linkElements = new ArrayList<WebElement>();
		linkElements = driver.findElements(By.linkText(link));
	    System.out.println(linkElements.size());
		if(linkElements.contains(link))
		{
			System.out.println("the link is there");
			
		}
		else
		{
			System.out.println("Link is not there");
		}
	}

	
}
