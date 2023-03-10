package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DownloadPage {
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnContinue;
	
	
	
}
