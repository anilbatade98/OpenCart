package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {
	
	WebDriver ldriver;
	
	public RegisterAccountPage(WebDriver refdriver) {
		ldriver = refdriver;
		PageFactory.initElements(refdriver, this);
	}
	
	@CacheLookup
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	@CacheLookup
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@CacheLookup
	@FindBy(name="email")
	WebElement txtEmail;
	
	@CacheLookup
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
	@CacheLookup
	@FindBy(name="password")
	WebElement txtPassword;
	
	@CacheLookup
	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	
	@CacheLookup
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement btnSubscYes;
	
	@CacheLookup
	@FindBy(xpath="//label[normalize-space()='No']")
	WebElement btnSubscNo;
	
	@CacheLookup
	@FindBy(how= How.XPATH, using = "//input[@name='agree']")
	WebElement btnCheckBox;
	
	@CacheLookup
	@FindBy(how= How.XPATH, using = "(//input[@value='Continue'])[1]")
	WebElement btnContinue;
	
	@CacheLookup
	@FindBy(xpath = "//*[@class=\"btn btn-primary\"]")
	WebElement btnContinue1;
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='col-sm-9']//h1")
	WebElement txtActCreatSuc;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/a")
	WebElement txtPrivacyPolicy;
	
	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement txtmyAccount;
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Register']")
	WebElement btnRegister;
	
	
	
	public void setFirstName(String userName) {
		txtFirstName.sendKeys(userName);
	}
	
	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(int telephone) {
		txtTelephone.sendKeys(String.valueOf(telephone));
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmPass) {
		txtConfirmPassword.sendKeys(confirmPass);
	}
	
	public void subscribe(String yN) {
		if(yN.equals("Yes")) {
			btnSubscYes.click();
		}
		else if(yN.equals("No")) {
			btnSubscNo.click();
		}
	}
	
	public void selectPrivacyPolicyCheckBox() {
		btnCheckBox.click();
	}
	
	public void ClickPrivacypolicy() {
		txtPrivacyPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue1.click();
	}
	
//	public boolean checkAccountCreatedSuccess1() {
//		if(txtActCreatSuc.getText().equals("Your Account Has Been Created!")) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean checkAccountCreatedSuccess() {
		return ldriver.getPageSource().contains("Your Account Has Been Created!");
	}
	
	public void openResistationPage() {
		txtmyAccount.click();
		btnRegister.click();
	}
	
	
	
}
