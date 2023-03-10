package com.opencart.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.opencart.pageObjects.RegisterAccountPage;

import junit.framework.Assert;

public class TC_Register_003 extends BaseClass {
	
	public String randomEmail() {
		return RandomStringUtils.randomAlphabetic(6);
	}
	
	@Test
	public void checkRegister() throws InterruptedException, IOException {
		
		RegisterAccountPage reg = new RegisterAccountPage(driver);
		
		
		reg.openResistationPage();
		logger.info("Open registration page");
		
		reg.setFirstName("dipak");
		logger.info("Enter first name");
		
		reg.setLastName("dale");
		logger.info("Enter last name");
		
		reg.setEmail(randomEmail() + "@gmail.com");
		logger.info("Enter email id");
		
		reg.setTelephone(1465645634);
		logger.info("Enter mobile no");
		
		reg.setPassword("12345");
		logger.info("Enter password");
		
		reg.setConfirmPassword("12345");
		logger.info("Enter confirm password");
		
		reg.subscribe("No");
		logger.info("Click on No subscription");
		
		reg.selectPrivacyPolicyCheckBox();
		logger.info("Ticked privacy check box");
		
		reg.clickContinue();
		logger.info("Click on continue");
		Thread.sleep(5000);
		
		if(reg.checkAccountCreatedSuccess() == true) {
			Thread.sleep(3000);
			Assert.assertTrue(true);
			logger.info("Account register successfully");
		}
		else {
			captureScreenshot(driver, "TC_Register_003");
			Assert.assertTrue(false);
			logger.warn("Account registed failed");
		}
		Thread.sleep(3000);
//		reg.clickContinue();
//		logger.info("Click on continue");
//		Thread.sleep(3000);
		
	}
	

}
