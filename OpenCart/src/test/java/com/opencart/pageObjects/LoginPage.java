package com.opencart.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testCases.BaseClass;

public class LoginPage {
	
	WebDriver locdriver;
	public static Logger logger;
	
	public LoginPage(WebDriver refdriver) {
		locdriver = refdriver;
		PageFactory.initElements(refdriver, this);
	}
	
	public LogoutPage logout() {
		LogoutPage logoutPage = new LogoutPage(locdriver);
		return logoutPage;
	}
	
	public RegisterAccountPage register() {
		RegisterAccountPage rp = new RegisterAccountPage(locdriver);
		return rp;
	}
	
	public ForgotPasswordPage forgetPassword() {
		ForgotPasswordPage fp = new ForgotPasswordPage(locdriver);
		return fp;
	}
	
	
	
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	@CacheLookup
	WebElement btnLoginSubmit;
	
	@FindBy(xpath="//a[@title='My Account']")
	@CacheLookup
	WebElement myAccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLoginPage;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	@CacheLookup
	WebElement btnLogout;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	@CacheLookup
	WebElement errorMsg;
	
	@FindBy(xpath="//h1[normalize-space()='Account Logout']")
	@CacheLookup
	WebElement msgActLogout;
	
	public void openMyAccountLoginPage() {
		myAccount.click();
		btnLoginPage.click();
	}

	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}
	
	public void clearUserName() {
		txtUserName.clear();
	}
	
	public void setPassword(String uPassword) {
		txtPassword.sendKeys(uPassword);
	}
	
	public void clearPassword() {
		txtPassword.clear();
	}
	
	public void clickSubmit() {
		btnLoginSubmit.click();
	}
	
//	public void clickLogout() {
//		btnLogout.click();
//	}
	
	public void openHomePage() {
		BaseClass bs = new BaseClass();
		locdriver.get(bs.baseURL);
	}
	
	
	public boolean checkLogin() {
		String pageTitle = locdriver.getTitle();		
		if(pageTitle.equals("My Account")) {
			return true;
		}
		return false;
	}
	
//	public boolean checkLogout() {
//		if(msgActLogout.getText().equals("Account Logout")) {
//			return true;
//		}
//		return false;
//	}
//	
	public boolean checkErrorMsg() {
		
		if(errorMsg.getText().equals("Warning: No match for E-Mail Address and/or Password.")) {
//			Assert.assertTrue(true);
//			logger.info("Login error message displyed");
			return true;
		}
		else {
//			Assert.assertTrue(false);
//			logger.info("login error message not displayed");
			return false;
		}
		
	}

}
