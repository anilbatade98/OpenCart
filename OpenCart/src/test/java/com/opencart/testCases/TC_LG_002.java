package com.opencart.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageObjects.LoginPage;

public class TC_LG_002 extends BaseClass {
	
	@Test
	public void logout() throws IOException, InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.openMyAccountLoginPage();
		lp.setUserName("asd@mail.com");
		lp.setPassword("12345");
		lp.clickSubmit();
		System.out.println("login suc");
		Thread.sleep(5000);
		
		if(lp.checkLogin() == true) {
			System.out.println("login sce2");
			lp.logout().clickLogout();
			System.out.println("logout");
			Thread.sleep(5000);
			if(lp.logout().checkLogout() == true) {
				System.out.println("check logout Yes");
				Assert.assertTrue(true);
			}
			else {
				captureScreenshot(driver, "TC_LG_002");
				System.out.println("Chk logout No");
				Assert.assertTrue(false);
				Thread.sleep(3000);
			}
		}
		else {
			captureScreenshot(driver, "TC_LG_002");
			Assert.assertTrue(false);
			System.out.println("not login");
			Thread.sleep(3000);
		}
		
		
	}
	
}
