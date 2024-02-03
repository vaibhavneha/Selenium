package com.Learning_testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Genaric_Library.Base_Test2;
@Listeners(com.Genaric_Library.Learning_Listener_Implementation.class)
public class Learning_Listener_Interface extends Base_Test2 {
	@Test
	public void SearchText() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop");
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);

	}
}
