package com.selenium.testNG.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver =null;

  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.wikipedia.org/");
	  
  }
  
  @Test
  public void f() {
	  String currentURl = driver.getCurrentUrl();
	  Assert.assertEquals(currentURl, "https://www.wikipedia.org/");
	  List<WebElement> languageList = new ArrayList<WebElement>();
	  languageList = driver.findElements(By.xpath("//*[@id='searchLanguage']"));
	  for(WebElement language: languageList)
	  {
		  String languageName = language.getText();
		  System.out.println(languageName);
	  }
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
