package com.testScripts;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.util.Assert;
import com.genric_Library.WebDriver_Utility;
import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;

public class Learning_ExtentReports {

	@Test
	public void loginTest() throws InterruptedException
	{
		
		ExtentSparkReporter spark= new ExtentSparkReporter("./src/test/resources/reports/FirstReport.html");
		ExtentReports report= new ExtentReports();
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("loginTest");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		try
		{
			org.testng.Assert.assertEquals(false, 111);
			test.log(Status.INFO, "Demo web Page opened");
			WelcomePage wp = new WelcomePage(driver);
			wp.getLoginLink().click();
			
			test.log(Status.INFO, "Demo web Page opened");
			
			LoginPage lp = new LoginPage(driver);
			lp.getEmailTextField().sendKeys("amolarora@gmail.com");
			lp.getPasswordTextField().sendKeys("Amol@123");
			lp.getLoginButton().click();
			test.log(Status.PASS, "loged in successfull");
		}
		catch (Throwable e) {
			test.log(Status.FAIL, "failed");
			test.addScreenCaptureFromBase64String(WebDriver_Utility.getScreenShotPath(driver));
			
		}
		Thread.sleep(2000);
		driver.quit();
		report.flush();
	}
}
//https://github.com/amol992/SeleniumStudy.git
//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ś