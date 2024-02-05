package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {
    @Test
	public void loginTest() throws IOException {

		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassWord(password);
		logger.info("Entered password");
		logger.info("Entered password debug");
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		
		else {
			captureScreen(driver,"loginTest");
			logger.info("Login test failed");
			Assert.assertTrue(false);
			
		}
	}
}
