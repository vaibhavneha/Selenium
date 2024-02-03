package com.Test_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Genaric_Library.Base_Test;
import com.Genaric_Library.WebDriver_Utility;

public class TC002_Add_To_Cart extends Base_Test {
	@Test
	public void addtocartTest() throws InterruptedException {
Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Jewelry']")));
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();
		
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//span[text()='Shopping cart']")));
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		WebDriver_Utility.takesScreenshotofWebPage(driver, "Shopingcart");
	}
	
}
