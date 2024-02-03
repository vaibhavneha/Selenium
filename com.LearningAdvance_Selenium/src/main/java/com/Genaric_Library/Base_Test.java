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

public class Base_Test {
	public WebDriver driver;

	@BeforeClass
	public void OpenBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

	@BeforeMethod
	public void login() {

		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("deepakbutola20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678", Keys.ENTER);
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

}
