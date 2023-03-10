package com.opencart.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage {
	
	WebDriver ldriver;
	
	public MyWishlistPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']")
	WebElement tblMyWishlist;

	@CacheLookup
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnContinue;

	@CacheLookup
	@FindBy(xpath = "//tbody//tr")
	WebElement row;

	@CacheLookup
	@FindBy(xpath ="//tbody//tr//td//button")
	WebElement btnAddToCart;

	@CacheLookup
	@FindBy(xpath = "//tbody//tr//td//a[@data-original-title='Remove']")
	WebElement btnRemove;

	public void clickContinue() {
		btnContinue.click();
	}

	public void clickAddToCart(int indxProdct) {
		ldriver.findElement(By.xpath("(//tbody//tr//td//button)[indxProdct]"));
	}
	
	public void clickDelete(int indxProdct) {
		ldriver.findElement(By.xpath("(//tbody//tr//td//a[@data-original-title='Remove'])[indxProdct]"));
	}
	
	public 
	
	
	
	
	
}
