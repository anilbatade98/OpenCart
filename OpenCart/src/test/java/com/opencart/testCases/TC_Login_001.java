package com.opencart.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import com.opencart.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.openMyAccountLoginPage();
		logger.info("open login page");

		lp.clearUserName();
		lp.clearPassword();

		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();
		logger.info("Click on submit");

		Thread.sleep(3000);

		if(lp.checkLogin()) {
			Assert.assertTrue(true);
			logger.info("login successfully");
			//			lp.clickLogout();
			lp.logout().clickLogout();
			if(lp.logout().checkLogout() == true) {
				logger.info("Logout");
			}
			else {
				captureScreenshot(driver, "TC_Login_001_logout");
				logger.warn("Account not logout");
			}
			Thread.sleep(3000);

		}
		else {
			captureScreenshot(driver, "TC_Login_001_login");
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
	}

}
