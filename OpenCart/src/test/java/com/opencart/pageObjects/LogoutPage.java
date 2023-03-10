package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver ldriver;
	
	public LogoutPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//a[@class=\"list-group-item\"][contains(text(),'Logout')]")
	WebElement btnLogout;
	
	@CacheLookup
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']")
	WebElement dropdownMyAccount;
	
	@CacheLookup
//	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']") // not working// invalid xpath
	@FindBy(linkText = "Logout")
	WebElement dropdownLogout;
	
	@CacheLookup
	@FindBy(xpath ="//h1[normalize-space()='Account Logout']")
	WebElement txtAccountLogout;
	
	@CacheLookup
	@FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
	WebElement btnContinue;
	
	public void clickLogout() {
		btnLogout.click();
	}
	
	public void clickLogout2() {
		dropdownMyAccount.click();
		dropdownLogout.click();
	}
	
	public boolean checkLogout() {
		return txtAccountLogout.getText().equals("Account Logout");
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	

}
