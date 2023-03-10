package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage {
	
	@CacheLookup
	@FindBy(xpath = "//div[@id='content']//h1")
	WebElement txtAboutUs;
	
	@CacheLookup
	@FindBy(xpath = "//div[@id='content']//p")
	WebElement txtAboutUsSummary;
	
	public boolean checkAboutUs() {
		return txtAboutUs.getText().equals("About Us");
	}
	
	public boolean checkAboutUsSummery() {
		return txtAboutUs.getText().equals("About Us");
	}
	

}
