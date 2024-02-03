package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learning_Configuration_Annottation {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Executing beforeSuite",true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Executing beforeTest",true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("Executing beforeclass",true);
	}

	@BeforeMethod
	public void beforeMehtod() {
		Reporter.log("Executing beforeMethod",true);
	}

//after 
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Executing afterSuite",true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("Executing afterTest",true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("Executing beforeclass",true);
	}

	@AfterMethod
	public void afterMehtod() {
		Reporter.log("Executing afterMethod",true);
	}

	@Test
	public void login() {
		Reporter.log("login test Case",true);
	}
}
