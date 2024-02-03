package com.Learning_testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_Attribute {
	@Test(enabled = false) //act like a main method
	public void RegisterText() {   										//act like a test case
		Reporter.log("Executing Register Test Case...",true);  			//steps of test cases
	}
	@Test(priority = 3)
	public void SearchText() {
		Reporter.log("Executing Search Test Case...",true);
	}
	@Test(priority = 2)
	public void loginText() {
		Reporter.log("Executing Login Test Case...",true);
	}


}
