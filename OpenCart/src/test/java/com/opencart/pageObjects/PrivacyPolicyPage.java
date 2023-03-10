package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyPage {
	
	
	@CacheLookup
	@FindBy(xpath = "//div[@id='content']//h1")
	WebElement txtPrivacyPolicy;
	
	public boolean checkPrivacyPolicy() {
		return txtPrivacyPolicy.getText().equals("Privacy Policy");
	}
	
	
}
