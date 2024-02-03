package com.Genaric_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test2 {
	public WebDriver driver;
	public static WebDriver sDriver;
public ExtentReports report;
public ExtentTest test;
	@BeforeClass
	public void OpenBrowser() throws Throwable {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(File_Utility.getpropertyvalue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sDriver=driver;
		

	}

	@BeforeMethod
	public void login() throws Throwable {

		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(File_Utility.getpropertyvalue("username"));
		driver.findElement(By.id("Password")).sendKeys(File_Utility.getpropertyvalue("password"), Keys.ENTER);
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log out")).click();

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@BeforeSuite
	public void configureReport()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/Reports/"+ java_Utility.getName()+".html");
		report = new ExtentReports();
		report.attachReporter(spark);
		
	}

}
