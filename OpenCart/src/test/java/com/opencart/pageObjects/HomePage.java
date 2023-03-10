package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public AboutUsPage aboutUs() {
		AboutUsPage obj = new AboutUsPage();
		return obj;
	}
	
	public AddressBookPage addressBook() {
		AddressBookPage obj = new AddressBookPage();
		return obj;
	}
	
	public ContactUsPage contactUs() {
		ContactUsPage obj = new ContactUsPage();
		return obj;
	}
	
	public DeliveryInformationPage deliveryinfo() {
		DeliveryInformationPage obj = new DeliveryInformationPage();
		return obj;
	}
	
	public DownloadPage download() {
		DownloadPage obj = new DownloadPage();
		return obj;
	}
	
	public FooderSection fooder() {
		FooderSection obj = new FooderSection(ldriver);
		return obj;
	}
	
	public ForgotPasswordPage forgotPassword() {
		ForgotPasswordPage obj = new ForgotPasswordPage(ldriver);
		return obj;
	}
	
	public HeaderSection header() {
		HeaderSection obj = new HeaderSection(ldriver);
		return obj;
	}
	
	public HomePage home() {
		HomePage obj = new HomePage(ldriver);
		return obj;
	}
	
	public LoginPage login() {
		LoginPage obj = new LoginPage(ldriver);
		return obj;
	}
	
	public LogoutPage logout() {
		LogoutPage obj = new LogoutPage(ldriver);
		return obj;
	}
	
	public MyWishlistPage myWishlist() {
		MyWishlistPage obj = new MyWishlistPage(ldriver);
		return obj;
	}
	
	public OrderHistoryPage orderHistory() {
		OrderHistoryPage obj = new OrderHistoryPage(ldriver);
		return obj;
	}
	
	public PrivacyPolicyPage privacyPolicy() {
		PrivacyPolicyPage obj = new PrivacyPolicyPage();
		return obj;
	}
	
	public ProductReturnPage productReturn() {
		ProductReturnPage obj = new ProductReturnPage(ldriver);
		return obj;
	}
	
	public RegisterAccountPage registerAccount() {
		RegisterAccountPage obj = new RegisterAccountPage(ldriver);
		return obj;
	}
	
	public TermAndConditionsPage termCondition() {
		TermAndConditionsPage obj = new TermAndConditionsPage();
		return obj;
	}
	
}
