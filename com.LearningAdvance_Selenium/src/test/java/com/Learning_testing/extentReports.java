package com.Learning_testing;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Genaric_Library.WebDriver_Utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;

public class extentReports {

	@Test
	public void loginTest() throws InterruptedException {
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/Reports/DemowebShop-Login");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test = report.createTest("loginTest");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");

	WelcomePage wl= new WelcomePage(driver);
	wl.getLoginLink().click();
	
	LoginPage lp= new LoginPage(driver);
	lp.getEmailTextField().sendKeys("deepakbutola20@gmail.com");
	
	lp.getPasswordTextField().sendKeys("12345678",Keys.ENTER);
	test.log(Status.PASS, "User loged in successfully");
	test.addScreenCaptureFromBase64String(WebDriver_Utility.getScreenShotPath(driver));
	
	Thread.sleep(3000);
	driver.quit();
	report.flush();
	
	
	}
}
