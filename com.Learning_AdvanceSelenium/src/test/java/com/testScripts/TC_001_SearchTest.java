package com.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.genric_Library.Base_Test;
import com.genric_Library.WebDriver_Utility;

public class TC_001_SearchTest extends Base_Test
{
	
	@Test
	public void searchTest() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		WebDriver_Utility.takesScreenShotOfWebpage(driver, "SearchSS");
		Thread.sleep(2000);
	}

}
