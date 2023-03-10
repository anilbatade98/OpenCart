package com.opencart.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageObjects.ForgotPasswordPage;

public class TC_FP_001 extends BaseClass {
	
	@Test
	public void forgetPassword() throws InterruptedException, IOException {
		
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		
		fp.openHomePage();
		logger.info("open application(home page)");
		fp.openForgetPasswordPage();
		logger.info("open forget password page");
		
		fp.setEmail("qwe@gmail.com");
		logger.info("email provided");
		fp.clickContinue();
		logger.info("click on continue");
		
		if(fp.checkMsgSend() == true) {
			Assert.assertTrue(true);
			logger.info("email send successfully");
		}
		else {
			captureScreenshot(driver, "TC_FP_001");
			Assert.assertTrue(false);
			logger.warn("email not send");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		
		
		
	}

}
