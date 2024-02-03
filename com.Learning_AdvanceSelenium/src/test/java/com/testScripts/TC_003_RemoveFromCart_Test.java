package com.testScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genric_Library.WebDriver_Utility;

public class TC_003_RemoveFromCart_Test extends TC_002_addToCart{
	@Test
	public void removeFromCartTest() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/ancestor::tr[@class='cart-item-row']/descendant::input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("[name='updatecart']")).click();
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		try {
			Reporter.log("Element is Present....",true);
			WebDriver_Utility.takesScreenShotOfWebpage(driver, "RemoveSS");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Element is not present",true);
		}
		Thread.sleep(2000);
		
	}

}
