package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {
	
	WebDriver ldriver;
	
	public OrderHistoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement btnView;
	
	@CacheLookup
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement btnContinue;
	
	@CacheLookup
	@FindBy(xpath = "//a[@data-original-title='Reorder']")
	WebElement btnReorder;
	
	@CacheLookup
	@FindBy(xpath = "//a[@data-original-title='Return']")
	WebElement btnReturn;
	
	public void clickView() {
		btnView.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public void clickReorder() {
		btnReorder.click();
	}
	
	public void clickReturn() {
		btnReturn.click();
	}

}
