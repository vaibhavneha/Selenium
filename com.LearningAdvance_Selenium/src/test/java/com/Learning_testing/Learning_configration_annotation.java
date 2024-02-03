package com.Learning_testing;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learning_configration_annotation {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Executing before Suite...",true);
		
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("Executing after method...",true);
		
		
	}
	@Test(priority = 1) //act like a main method
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
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Executing before method...",true);
		
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("Executing after test...",true);
		
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("Executing before test...",true);
		
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("Executing after class...",true);
		
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Executing before Class...",true);
		
	}
	@AfterSuite
	public void Aftersuite() {
		Reporter.log("Executing After Suite...",true);
		
	}
}
