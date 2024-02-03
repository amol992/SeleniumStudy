package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Leaning_Enable_method {
	@Test
	public void loginTest()
	{
		Reporter.log("Login Test Case------",true);
	}
	@Test(enabled = false)
	public void registerTest()
	{
		Reporter.log("Register Test Case------",true);
	}
	@Test
	public void searchTest()
	{
		Reporter.log("Search Test Case------",true);
	}
}
