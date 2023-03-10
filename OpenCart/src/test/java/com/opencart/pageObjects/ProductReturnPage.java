package com.opencart.pageObjects;

// need to change xpath of error msg

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductReturnPage {

	WebDriver ldriver;

	public ProductReturnPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFirstName;

	@CacheLookup
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[1]/div[1]/div/div")
	WebElement msgErrorFirstName;

	@CacheLookup
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtLastName;

	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	WebElement msgErrorLastName;

	@CacheLookup
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;

	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	WebElement msgErrorEmail;

	@CacheLookup
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement txtTelephone;

	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	WebElement msgErrorTelephone;

	@CacheLookup
	@FindBy(xpath = "//input[@name='order_id']")
	WebElement txtOrderId;

	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'Order ID required!')]")
	WebElement msgErrorOrderID;

	@CacheLookup
	@FindBy(xpath = "//input[@name='date_ordered']")
	WebElement tableOrderDate;

	@CacheLookup
	@FindBy(xpath = "//input[@name='product']")
	WebElement txtProductName;

	@CacheLookup
	@FindBy(xpath ="//div[contains(text(),'Product Name must be greater than 3 and less than 255 characters!')]")
	WebElement msgErrorProductName;

	@CacheLookup
	@FindBy(xpath = "//input[@name='model']")
	WebElement txtProductCode;

	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'Product Model must be greater than 3 and less than 64 characters!')]")
	WebElement msgErrorProductCode;

	@CacheLookup
	@FindBy(xpath = "//input[@name='quantity']")
	WebElement txtQuantity;

	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'You must select a return product reason!')]")
	WebElement msgErrorReasonReturn;

	@CacheLookup
	@FindBy(xpath = "//input[@name='return_reason_id'][@value='1']")
	WebElement rdobtnDead;

	@CacheLookup
	@FindBy(xpath = "//input[@name='return_reason_id'][@value='4']")
	WebElement rdobtnFaulty;

	@CacheLookup
	@FindBy(xpath = "//input[@name='return_reason_id'][@value='3']")
	WebElement rdobtnError;

	@FindBy(xpath = "//input[@name='return_reason_id'][@value='5']")
	@CacheLookup
	WebElement rdobtnOther;

	@CacheLookup
	@FindBy(xpath = "//input[@name='return_reason_id'][@value='2']")
	WebElement rdobtnWrong;

	@CacheLookup
	@FindBy(xpath = "//input[@name='opened'][@value='1']")
	WebElement rdobtnProductOpenYes;

	@CacheLookup
	@FindBy(xpath = "//input[@name='opened'][@value='0']")
	WebElement rdobtnProductOpenNo;

	@CacheLookup
	@FindBy(xpath = "//textarea[@name='comment']")
	WebElement txtComment;

	@CacheLookup
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement btnDefault;

	@CacheLookup
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnSubmit;
	
	
	public void setFirstName(String fName) {
		txtFirstName.clear();
		txtFirstName.sendKeys(fName);
	}
	
	public boolean checkFirstName() {
		return msgErrorFirstName.getText().equals("First Name must be between 1 and 32 characters!");
	}
	
	public void setLastName(String lName) {
		txtLastName.clear();
		txtLastName.sendKeys(lName);
	}
	
	public boolean checkLastName() {
		return msgErrorLastName.getText().equals("Last Name must be between 1 and 32 characters!");
	}
	
	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public String checkEmail() {
		return msgErrorEmail.getText();
	}
	
	public void setTelephone(String number) {
		txtTelephone.clear();
		txtTelephone.sendKeys(number);
	}
	
	public boolean checkTelephone() {
		return msgErrorTelephone.getText().equals("Telephone must be between 3 and 32 characters!");
	}
	
	public void setOrderID(String id) {
		txtOrderId.clear();
		txtOrderId.sendKeys(id);
	}
	
	public boolean checkOrderID() {
		return msgErrorOrderID.getText().equals("Order ID required!");
	}
	
	public void setOrderDate(String year, String month, String date) {
		tableOrderDate.sendKeys(year +"-"+month+"-"+date);
	}
	
	public void setProductName(String pName) {
		txtProductName.clear();
		txtProductName.sendKeys(pName);
	}
	
	public boolean checkProductName() {
		return txtProductName.getText().equals("Product Name must be greater than 3 and less than 255 characters!");
	}
	
	public void setProductCode(String pCode) {
		txtProductCode.sendKeys(pCode);
	}
	
	public boolean checkProductCode() {
		return txtProductCode.getText().equals("Product Model must be greater than 3 and less than 64 characters!");
	}
	
	public void setQuantity(String qty) {
		txtQuantity.clear();
		txtQuantity.sendKeys(qty);
	}
	
	public int getQuantity() {
		int qty = 0;
		return qty;
	}
	
	public void selectReasonForReturn(String ror) {
		
		System.out.println("text1:"+rdobtnDead.getText());
		System.out.println("text2:"+rdobtnError.getText());
		System.out.println("text3:"+rdobtnFaulty.getText());
		System.out.println("text4:"+rdobtnOther.getText());
		System.out.println("text5:"+rdobtnWrong.getText());
		
		
		if(ror.equalsIgnoreCase("Dead On Arrival")) {
			rdobtnDead.click();
		}
		else if(ror.equalsIgnoreCase("Faulty, please supply details")) {
			rdobtnError.click();
		}
		else if(ror.equalsIgnoreCase("Order Error")) {
			rdobtnFaulty.click();
		}
		else if(ror.equalsIgnoreCase("Other, please supply details")) {
			rdobtnOther.click();
		}
		else if(ror.equalsIgnoreCase("Received Wrong Item")) {
			rdobtnWrong.click();
		}
	}
	
	public void selectProductIsOpen(String YesNo) {
		if(YesNo.equals("Yes")) {
			rdobtnProductOpenYes.click();
		}
		else if(YesNo.equals("No")){
			rdobtnProductOpenNo.click();
		}
	}
	
	public void setOtherDetails(String details) {
		txtComment.clear();
		txtComment.sendKeys(details);
	}
	
	public void clickDefault() {
		btnDefault.click();
	}

	public void clickSubmit() {
		btnSubmit.click();
	}



}
