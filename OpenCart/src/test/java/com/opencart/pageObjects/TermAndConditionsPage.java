package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TermAndConditionsPage {
	

	@CacheLookup
	@FindBy(xpath = "//div[@id='content']//h1")
	WebElement txtTermsConditions;
	
	public boolean checkTermsConditions() {
		return txtTermsConditions.getText().equals("Terms & Conditions");
	}
	
	
	
}
