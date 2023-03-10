package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DeliveryInformationPage {
	
	
	@CacheLookup
	@FindBy(xpath = "//div[@id='content']//h1")
	WebElement txtDeliveryInformation;
	
	public boolean checkDeliveryInformation() {
		return txtDeliveryInformation.getText().equals("Delivery Information");
	}
	
	
	
	

}
