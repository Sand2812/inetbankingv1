package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;



public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
	    logger.info("Username is provided");
		lp.setPassWord(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.ClickAddNewCustomer();
     	Thread.sleep(3000);
		logger.info("providing customer details...");
//		Thread.sleep(10000);
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='ad_iframe']"));
//	    driver.switchTo().frame(frame2);
//	    driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
//	    driver.switchTo().defaultContent();
		
		Thread.sleep(12000);
		addcust.custName("Sandhya");
		addcust.custgender("female");
        addcust.custdob("10", "28", "1997");
       // Thread.sleep(3000);
		addcust.custaddress("India");
		addcust.custcity("BBSR");
		addcust.custstate("Odisha");
		addcust.custpin("751010");
		addcust.custtelephone("9078870681");
		
		String email=randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		logger.info("Validation started...");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("test case is passed...");
		}
		else {
			logger.info("test case is failed");
			captureScreen(driver,"addNewCustomer");
		Assert.assertTrue(false);	
		}
	}
	public String randomstring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(9);
		return generatedstring;
	}
//	public static String randomNum() {
//		String generatedstring2=RandomStringUtils.randomAlphanumeric(4);
//		return generatedstring2;
//	}
	
	
}
