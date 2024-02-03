package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Depends_On_Methods {
	@Test(dependsOnMethods = "registerTest")
	public void loginTest()
	{
		Reporter.log("Login Test Case------",true);
	}
	@Test
	public void registerTest()
	{
		Reporter.log("Register Test Case------",true);
	}
	@Test(dependsOnMethods = {"registerTest","loginTest"})
	public void searchTest()
	{
		Reporter.log("Search Test Case------",true);
	}
}
