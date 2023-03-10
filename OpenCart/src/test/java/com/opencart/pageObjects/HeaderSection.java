package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
	
	WebDriver ldriver;
	
	public HeaderSection(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//button[@class=\"btn btn-link dropdown-toggle\"]")
	WebElement dropdownCurrency;
	
	@CacheLookup
	@FindBy(xpath = "//button[@name='EUR']")
	WebElement btnCurrencyEUR;
	
	@CacheLookup
	@FindBy(xpath = "//button[@name='GBP']")
	WebElement btnCurrencyGBP;
	
	@CacheLookup
	@FindBy(xpath = "//button[@name=\"USD\"]")
	WebElement btnCurrencyUSD;
	
	@CacheLookup
	@FindBy(xpath = "//i[@class=\"fa fa-phone\"]")
	WebElement btnContact;
	
	@CacheLookup
	@FindBy(xpath = "//a[@title=\"My Account\"]")
	WebElement dropdownMyAccount;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement btnRegister;
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement btnLogin;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement btnMyAccount;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement btnOrderHistory;
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='Transactions']")
	WebElement btnTransactions;
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='Downloads']")
	WebElement btnDownloads;
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	@CacheLookup
	@FindBy(xpath = "//a[@id='wishlist-total']//i[@class='fa fa-heart']")
	WebElement btnWishList;
	
	@CacheLookup
	@FindBy(xpath = "//a[@title=\"Shopping Cart\"]")
	WebElement btnShoppingCart;
	
	@CacheLookup
	@FindBy(xpath = "//a[@title=\"Checkout\"]")
	WebElement btnCheckout;
	
	@CacheLookup
	@FindBy(xpath = "//img[@title=\"Your Store\"]")
	WebElement imgLogo;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name=\"search\"]")
	WebElement txtSearch;
	
	@CacheLookup
	@FindBy(xpath = "//i[@class=\"fa fa-search\"]")
	WebElement btnSearch;
	
	@CacheLookup
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement btnCart;
	
	@CacheLookup
	@FindBy(xpath = "//div//ul//li//p")
	WebElement itemsCart;
	
	
	public void selectCurrency(String currency) {
		dropdownCurrency.click();
		if(currency.equals("EUR")) {
			btnCurrencyEUR.click();
		}
		else if(currency.equals("GBP")) {
			btnCurrencyGBP.click();
		}
		else if(currency.equals("USD")) {
			btnCurrencyUSD.click();
		}
	}
	
	public void clickContact() {
		btnContact.click();
	}
	
	public void clickDrpdownMyAccount() {
		dropdownMyAccount.click();
	}
	
	public void clickRegister() {
		btnRegister.click();
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickMyAccount() {
		btnMyAccount.click();
	}
	
	public void clickWishlist() {
		btnWishList.click();
	}
	
	public void clickShoppingCart() {
		btnShoppingCart.click();
	}
	
	public void clickCheckout() {
		btnCheckout.click();
	}
	
	public void clickLogo() {
		imgLogo.click();
	}
	
	public void setSearch(String search) {
		txtSearch.clear();
		txtSearch.sendKeys(search);
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	public void clickCart() {
		btnCart.click();
	}
	
	public void clickOrderHistory() {
		btnOrderHistory.click();
	}
	
	public void clickTransction() {
		btnTransactions.click();
	}
	
	public void clickDownloads() {
		btnDownloads.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}
	
	
	

}
