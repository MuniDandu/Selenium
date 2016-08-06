package com.selenium.testNG.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class DropAndDrag {
WebDriver driver = null;
	
	
	@BeforeClass
	public void intializer(){
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void excuteDragAndDrop() throws InterruptedException{
		
		
		WebElement framePath = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(framePath);
		WebElement sourceToDrag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement sourceToDrop = driver.findElement(By.xpath("//*[@id='droppable']"));
	     Actions dragAndDropActionClass = new Actions(driver);
	     
	     dragAndDropActionClass.dragAndDrop(sourceToDrag, sourceToDrop).build().perform();
	     Thread.sleep(500);
	}
	
	@AfterClass
	public void afterExcution(){
		driver.quit();
		
	}

}
