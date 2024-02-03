package com.Learning_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Hard_Assret {
	@Test
	public void logintest() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "I am validating Title");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("deepakbutola20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678", Keys.ENTER);
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
		
	}
	

}
