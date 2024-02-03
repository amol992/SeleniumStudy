package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	
	@Test
	public void loginTest()
	{
		Reporter.log("Login Test Case------",true);
	}
	@Test
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
