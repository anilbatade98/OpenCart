package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooderSection {
	
	WebDriver ldriver;
	
	public FooderSection(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='About Us']")
	WebElement btnAboutUs;
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='Delivery Information']")
	WebElement btnDeliveryInformation;
	
	@CacheLookup
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	WebElement btnPrivacyPolicy;
	
	@CacheLookup
	@FindBy(linkText = "Terms & Conditions")
	WebElement btnTermsConditions;
	
	@CacheLookup
	@FindBy(linkText = "Contact Us")
	WebElement btnContactUs;
	
	@CacheLookup
	@FindBy(linkText = "Returns")
	WebElement btnReturns;
	
	@CacheLookup
	@FindBy(linkText = "Site Map")
	WebElement btnSiteMap;
	
	@CacheLookup
	@FindBy(linkText = "Brands")
	WebElement btnBrands;
	
	@CacheLookup
	@FindBy(linkText = "Gift Certificates")
	WebElement btnGiftCertificates;
	
	@CacheLookup
	@FindBy(linkText = "Affiliate")
	WebElement btnAffiliate;
	
	@CacheLookup
	@FindBy(linkText = "Specials")
	WebElement btnSpecials;
	
	@CacheLookup
	@FindBy(linkText = "My Account")
	WebElement btnMyAccount;
	
	@CacheLookup
	@FindBy(linkText = "Order History")
	WebElement btnOrderHistory;
	
	@CacheLookup
	@FindBy(linkText = "Wish List")
	WebElement btnWishList;
	
	@CacheLookup
	@FindBy(linkText = "Newsletter")
	WebElement btnNewsletter;
	
	@CacheLookup
	@FindBy(linkText = "OpenCart")
	WebElement linkOpenCart;
	
	public void clickAboutUS() {
		btnAboutUs.click();
	}
	
	public void clickDeliveryInformation() {
		btnDeliveryInformation.click();
	}
	
	public void clickPrivacyPolicy() {
		btnPrivacyPolicy.click();
	}
	
	public void clickTermConditions() {
		btnTermsConditions.click();
	}
	
	public void clickContactUs() {
		btnContactUs.click();
	}
	
	public void clickReturn() {
		btnReturns.click();
	}
	
	public void clickSiteMap() {
		btnSiteMap.click();
	}
	
	public void clickBrands() {
		btnBrands.click();
	}
	
	public void clickGiftCertificates() {
		btnGiftCertificates.click();
	}
	
	public void clickAffiliate() {
		btnAffiliate.click();
	}
	
	public void clickSpecials() {
		btnSpecials.click();
	}
	
	public void clickMyAccount() {
		btnMyAccount.click();
	}
	
	public void clickOrderHistory() {
		btnOrderHistory.click();
	}
	
	public void clickWishList() {
		btnWishList.click();
	}
	
	public void clickNewsLetter() {
		btnNewsletter.click();
	}
	
	public void clickOpenCart() {
		linkOpenCart.click();
	}

}
 	