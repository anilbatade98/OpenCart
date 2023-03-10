package com.opencart.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.opencart.pageObjects.RegisterAccountPage;

import junit.framework.Assert;

public class TC_RF_008 extends BaseClass {
	
	public String randomEmail() {
		return RandomStringUtils.randomAlphabetic(6);
	}
	
	@Test
	public void registerTest() throws IOException, InterruptedException {
		
		RegisterAccountPage rap = new RegisterAccountPage(driver);
		
		rap.openResistationPage();
		logger.info("open register page");
		
		rap.setFirstName("lkjh");
		logger.info("first name provided");
		
		rap.setLastName("mnbv");
		logger.info("last name provided");
		
		rap.setEmail(randomEmail() +"@gmail.com");
		logger.info("email id provided");
		
		rap.setTelephone(1234567890);
		logger.info("telephome no provided");
		
		rap.setPassword("12345");
		logger.info("password provided");
		
		rap.setConfirmPassword("asdfd");
		logger.info("confirm password provided");
		
		rap.subscribe("Yes");
		logger.info("Subscribe yes");
		
		rap.selectPrivacyPolicyCheckBox();
		logger.info("ticked privacy policy");
		
		rap.clickContinue();
		logger.info("click on continue");
		
		Thread.sleep(5000);
		
		if(rap.checkAccountCreatedSuccess() == true) {
			Thread.sleep(3000);
			Assert.assertTrue(true);
			logger.info("Account register successfully");
		}
		else {
			captureScreenshot(driver, "TC_RF_008");
			Assert.assertTrue(false);
			logger.warn("Account registed failed");
		}
		Thread.sleep(3000);
		
		
	}

}
