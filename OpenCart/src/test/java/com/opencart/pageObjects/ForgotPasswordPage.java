package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	WebDriver ldriver;
	
	public ForgotPasswordPage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	WebElement btnContinue;
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement btnDefault;
	
	@CacheLookup
	@FindBy(xpath = "//img[@title='Your Store']")
	WebElement home;
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement msgEmailSend;
	
	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement btnMyAccount;
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Forgotten Password']")
	WebElement btnForgotPassword;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public void clickDefault() {
		btnDefault.click();
	}
	
	public void openHomePage() {
		home.click();
	}
	
	public void openForgetPasswordPage() {
		btnMyAccount.click();
		btnForgotPassword.click();
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public boolean checkMsgSend() {
		if(msgEmailSend.getText().equals("An email with a confirmation link has been sent your email address.")) {
			return true;
		}
		return false;
	}

}
