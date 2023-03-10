package com.opencart.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencart.pageObjects.LoginPage;
import com.opencart.utilities.XLUtils;

import junit.framework.Assert;


public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void LoginDDT(String user, String pwd) throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);

		lp.openHomePage();
		lp.openMyAccountLoginPage();
		lp.clearUserName();
		lp.clearPassword();

		lp.setUserName(user);
		logger.info("Username provided");
		lp.setPassword(pwd);
		logger.info("Password provided");
		lp.clickSubmit();
		logger.info("Click on submit");
		Thread.sleep(3000);

		if(lp.checkLogin()) {
			Assert.assertTrue(true);
			logger.info("login successfully");
			lp.logout().clickLogout();
			if(lp.logout().checkLogout() == true) {
				logger.info("logout");
			}
			else {
				captureScreenshot(driver, "TC_LoginDDT_002_logout");
				logger.warn("Account not logout");
			}
			Thread.sleep(4000);
		}
		else {
			captureScreenshot(driver, "TC_LoginDDT_002_login");
			Assert.assertTrue(false);
			logger.warn("login failed");
		}

	}

	@DataProvider(name = "LoginData")
	String [][] getData() throws IOException{

		String path = System.getProperty("user.dir") + "/src/test/java/com/opencart/testData/Test data.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int coloumnum = XLUtils.getCellCount(path, "Sheet1", rownum);

		String [][] loginData = new String [rownum][coloumnum];

		for(int i=1; i<= rownum; i++) {
			for(int j=0; j<coloumnum; j++) {
				loginData [i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);  // 1 0 
			}
		}

		return loginData;
	}

}
