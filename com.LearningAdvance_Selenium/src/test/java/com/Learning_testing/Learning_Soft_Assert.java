package com.Learning_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Soft_Assert {
	@Test
	public void logintest() throws InterruptedException {
		
		SoftAssert ast=new SoftAssert();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ast.assertEquals(driver.getTitle(), "Flipcart", "I am validating Title");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("deepakbutola20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678", Keys.ENTER);
		ast.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.quit();
		ast.assertAll();
	}

}
