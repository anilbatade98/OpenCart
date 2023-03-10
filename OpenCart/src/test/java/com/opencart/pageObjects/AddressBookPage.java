package com.opencart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage {
	
	@CacheLookup
	@FindBy(xpath = "//a[text()='Edit']")
	WebElement btnEdit;
	
	@CacheLookup
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement btnDelete;
	
	@CacheLookup
	@FindBy(xpath = "//a[text()='Back']")
	WebElement btnBack;
	
	@CacheLookup
	@FindBy(xpath = "//a[text()='New Address']")
	WebElement btnNewAddress;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFirstName;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtLastName;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='company']")
	WebElement txtCompany;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='address_1']")
	WebElement txtAddress1;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='address_2']")
	WebElement txtAddress2;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='city']")
	WebElement txtCity;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='postcode']")
	WebElement txtPostCode;
	
	@CacheLookup
	@FindBy(xpath = "//select[@name='country_id']")
	WebElement drpCountry;
	
	@CacheLookup
	@FindBy(xpath = "//select[@name='zone_id']")
	WebElement drpState;
	
	@CacheLookup
	@FindBy(xpath ="(//input[@type='radio'])[1]")
	WebElement rdoDefaultAddressY;

	@CacheLookup
	@FindBy(xpath ="(//input[@type='radio'])[2]")
	WebElement rdoDefaultAddressN;
	
	@CacheLookup
	@FindBy(xpath ="//input[@type='submit']")
	WebElement btnContinue;
	
	public void clickEdit() {
		btnEdit.click();
	}
	
	public void clickDelete() {
		btnDelete.click();
	}
	
	public void clickNewAddress() {
		btnNewAddress.click();
	}
	
	public void clickBack() {
		btnBack.click();
	}
	
	public void setFirstName(String fName) {
		txtFirstName.clear();
		txtFirstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		txtLastName.clear();
		txtLastName.sendKeys(lName);
	}
	
	public void setCompany(String company) {
		txtCompany.clear();
		txtCompany.click();
	}
	
	public void setAddress1(String address) {
		txtAddress1.clear();
		txtAddress1.sendKeys(address);
	}
	
	public void setAddress2(String address) {
		txtAddress2.clear();
		txtAddress2.sendKeys(address);
	}
	
	public void setCity(String city) {
		txtCity.clear();
		txtCity.sendKeys(city);
	}
	
	public void setPostCode(String pCode) {
		txtPostCode.clear();
		txtPostCode.sendKeys(pCode);
	}
	
	public void setCountry(String country) {
		Select cotry = new Select(drpCountry);
		cotry.selectByVisibleText(country);
	}
	
	public void setState(String state) {
		Select stat = new Select(drpState);
		stat.selectByVisibleText(state);
	}
	
	public void selectDefaultAddress(boolean yN) {
		if(yN) {
			rdoDefaultAddressY.click();
		}
		else if(yN) {
			rdoDefaultAddressN.click();
		}
	}
	
	
	
	
}
