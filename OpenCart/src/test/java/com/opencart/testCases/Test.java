package com.opencart.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.opencart.pageObjects.FooderSection;
import com.opencart.pageObjects.HeaderSection;
import com.opencart.pageObjects.HomePage;
import com.opencart.pageObjects.LoginPage;
import com.opencart.pageObjects.ProductReturnPage;

public class Test {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		
		
		driver.get("http://localhost/opencart/upload/index.php?route=account/return/add"); // open home page
//		LoginPage login = new LoginPage(driver);
//		System.out.println(driver.getTitle());
//		WebElement myact = driver.findElement(By.xpath("//ul[@class="dropdown-menu dropdown-menu-right"]//li//a"));
		
//		login.openMyAccountLoginPage();
//		login.setUserName("asd@mail.com");login.setPassword("12345");login.clickSubmit();
		
//		List<WebElement> drpCurrency = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//li//a"));
//		System.out.println("Size : " + drpCurrency.size());
//		for(WebElement curr : drpCurrency) {
//			Thread.sleep(5000);
//			System.out.println("txt" + curr.getAttribute(null));  
//			
//		}
		
//		ProductReturnPage fs = new ProductReturnPage(driver);
//		
//		fs.clickSubmit();
//		fs.setFirstName("asd");
//		fs.setLastName("qwer");
//		fs.setEmail("asd@mail.com");
//		fs.setTelephone("123345556");
//		fs.setOrderID("23454");
//		fs.setOrderDate("2018", "04", "26");
//		fs.setProductName("mobile");
//		fs.setProductCode("2345");
//		fs.setQuantity("2");
//		fs.selectReasonForReturn("Dead On Arrival");
//		fs.selectProductIsOpen("Yes");
//		fs.setOtherDetails("kahi pn ka");
//		fs.clickSubmit();
		
		HomePage hm = new HomePage(driver);
		hm.logout().clickLogout();
		
		hm.header().clickOrderHistory();
		
		
		
		
		
		
		
		
		
			
	}

}
