package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='name']")
	WebElement txtName;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	
	@CacheLookup
	@FindBy(xpath = "//textarea[@name='enquiry']")
	WebElement txtEnquiry;
	
	@CacheLookup
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement btnSubmit;
	
	public void setYourName(String name) {
		txtName.clear();
		txtName.sendKeys(name);
	}
	
	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setEnquiry(String enquiry) {
		txtEnquiry.clear();
		txtEnquiry.sendKeys(enquiry);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}

}
