package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Priority_Attribute {
	@Test(priority=0)
	public void loginTest()
	{
		Reporter.log("Login Test Case------",true);
	}
	@Test(priority=-1)
	public void registerTest()
	{
		Reporter.log("Register Test Case------",true);
	}
	@Test(priority=1)
	public void searchTest()
	{
		Reporter.log("Search Test Case------",true);
	}

}
