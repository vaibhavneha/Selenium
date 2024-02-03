package com.Learning_testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {

	@Test //act like a main method
	public void RegisterText() {   										//act like a test case
		Reporter.log("Executing Register Test Case...",true);  			//steps of test cases
	}
	@Test
	public void SearchText() {
		Reporter.log("Executing Search Test Case...",true);
	}
	@Test
	public void loginText() {
		Reporter.log("Executing Login Test Case...",true);
	}
}
