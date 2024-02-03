package com.Learning_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Learning_Data_Provider {
	@Test(dataProvider = "Logindata")
	public void loginTest(String username,String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password, Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
		
	}
	@DataProvider(name="Logindata")
	public Object[][] logindata(){
		Object[][] data=new Object[2][2];
		data[0][0]= "vaibhav5598@gmail.com";
		data[0][1]= "12345678";
		data[1][0]= "deepak@gmail.com";
		data[1][1]= "12345678";
		return data;
	}
	

}
	
	