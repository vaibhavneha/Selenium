package com.Test_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Genaric_Library.WebDriver_Utility;

public class TC003_Remove_From_Cart extends TC002_Add_To_Cart{
	@Test
	public void removeFromCart() throws Exception {
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("(//a[text()='Black & White Diamond Heart'])[2]/../..//input[@type='checkbox']")).click();
		driver.findElement(By.name("updatecart")).click();
		WebDriver_Utility.takesScreenshotofWebPage(driver, "Removing_from_Shopingcart");
	}

}
