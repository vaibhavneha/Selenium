package com.Learning_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocaton_count {
	@Test() //act like a main method
	public void RegisterText() {   										//act like a test case
		Reporter.log("Executing Register Test Case...",true);  			//steps of test cases
	}
	@Test(priority = 3)
	public void SearchText() {
		Reporter.log("Executing Search Test Case...",true);
		
	}
	@Test(invocationCount = 3)
	public void loginText() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("VaibhavG598@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='0Log in']")).click();
		Thread.sleep(100);
		driver.quit();
		
	}


}
