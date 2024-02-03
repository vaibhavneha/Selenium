package com.Test_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Genaric_Library.Base_Test;
import com.Genaric_Library.WebDriver_Utility;

public class TC001_Search_Test extends Base_Test{
	@Test
	public void SearchText() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		WebDriver_Utility.takesScreenshotofWebPage(driver, "Searching_An_Element");
	}
	

}
