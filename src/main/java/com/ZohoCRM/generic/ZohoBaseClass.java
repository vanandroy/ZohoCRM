package com.ZohoCRM.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.crm.pom.CrmLoginPage;
import com.crm.pom.CrmLogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZohoBaseClass {
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.181.128:8080/crm/ShowHomePage.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void loginPage() {
		Reporter.log("loginPage",true);
		CrmLoginPage c=new CrmLoginPage(driver);
		c.setLoginPage("rashmi@dell.com", "123456");
		
	}
	@AfterMethod
	public void logOutPage() {
		Reporter.log("logOutPage",true);
		CrmLogoutPage clo=new CrmLogoutPage(driver);
		clo.setLogOutPage();
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
	}
	
}
