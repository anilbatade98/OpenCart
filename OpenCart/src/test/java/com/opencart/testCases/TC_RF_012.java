package com.opencart.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.opencart.pageObjects.RegisterAccountPage;

import junit.framework.Assert;

public class TC_RF_012 extends BaseClass {
	
	public String randomEmail() {
		return RandomStringUtils.randomAlphabetic(6);
	}
	
	@Test
	public void registerTest() throws IOException, InterruptedException {
		
		RegisterAccountPage rap = new RegisterAccountPage(driver);  // create register page object
		Actions action = new Actions(driver);  // action object for keyboard actions
		
		rap.openResistationPage();  // open application register page
		logger.info("open register page");
		
		rap.setFirstName("lkjh");
		logger.info("First name provided");
		
		action.sendKeys(Keys.TAB).sendKeys("sdfg").perform();
		logger.info("last name provided");
		
		action.sendKeys(Keys.TAB).sendKeys(randomEmail()+"@sdf.com").perform();
		logger.info("email provided");
		
		action.sendKeys(Keys.TAB).sendKeys("3465456").perform();
		logger.info("telephone no provided");
		
		action.sendKeys(Keys.TAB).sendKeys("12345").perform();
		logger.info("password provided");
		
		action.sendKeys(Keys.TAB).sendKeys("12345").perform();
		logger.info("confirm password provided");
		
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
		logger.info("not subscribe");
		logger.info("ticked privacy policy");
		
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		logger.info("click on continue");
		
		Thread.sleep(5000);
		
		if(rap.checkAccountCreatedSuccess() == true) {
			Thread.sleep(3000);
			Assert.assertTrue(true);
			logger.info("Account register successfully");
		}
		else {
			captureScreenshot(driver, "TC_RF_012");
			Assert.assertTrue(false);
			logger.warn("Account registed failed");
		}
		Thread.sleep(3000);
		
		
	}

}
 