package com.Learning_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectRepository.WelcomePage;

public class Learning_Pom_Classes {

	
	@Test
	public void loginTest()
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage wl= new WelcomePage(driver);
		wl.getLoginLink().click();
		
	}
}
