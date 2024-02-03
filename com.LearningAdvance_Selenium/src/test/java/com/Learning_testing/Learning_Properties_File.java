package com.Learning_testing;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_File {
	@Test
	public void loginTest() throws Throwable {
		FileInputStream FIS= new FileInputStream("./src/test/resources/data/Common_data.properties");
		Properties prop=new Properties();
		prop.load(FIS);
		String URL=prop.getProperty("url");
		String USERNAME=prop.getProperty("username");
		String PASSWORD=prop.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(USERNAME);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD, Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
	}
}
