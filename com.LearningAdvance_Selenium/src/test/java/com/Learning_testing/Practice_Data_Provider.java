package com.Learning_testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_Data_Provider {
	@Test(dataProvider = "SearchData")
	public void loginTest(String SearchData) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "I am validating Title");
		driver.findElement(By.partialLinkText("Log in")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("deepakbutola20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678", Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys(SearchData);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./src/test/resources/screenshots" + SearchData + ".png");
		Thread.sleep(1000);
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@DataProvider(name="SearchData")
	public Object[][] SearchData(){
		Object[][] data=new Object[2][1];
		data[0][0]= "Mobile";
		data[1][0]= "chair";
		data[2][0]= "laptop";
		data[3][0]= "shirt";
		data[4][0]= "gift";
		data[5][0]= "walet";
		data[6][0]= "ring";
		data[7][0]= "flowers";
		data[8][0]= "carpet";
		data[9][0]= "teddy";
		data[10][0]= "paints";
		data[11][0]= "bat";
		data[12][0]= "ball";
		data[13][0]= "jacket";
		data[14][0]= "dinner set";
		data[15][0]= "microwave";
		data[16][0]= "television";
		data[17][0]= "sofa";
		data[18][0]= "table";
		data[19][0]= "cap";
		return data;
	}
}
