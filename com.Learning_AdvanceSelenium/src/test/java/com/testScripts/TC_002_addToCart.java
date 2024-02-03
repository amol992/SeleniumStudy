package com.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genric_Library.Base_Test;
import com.genric_Library.WebDriver_Utility;

public class TC_002_addToCart extends Base_Test{
	
	@Test
	public void addToCart() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/ancestor::div[@class='details']/descendant::input")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		
		
		try {
			Reporter.log("Element is Present....",true);
			WebDriver_Utility.takesScreenShotOfWebpage(driver, "ShoppingCart");
			
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Element is not present",true);
		}
		Thread.sleep(2000);
	}

}
