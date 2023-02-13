package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmLoginPage {
	@FindBy(id="userName")
	private WebElement unbx;
	@FindBy(id="passWord")
	private WebElement pwbx;
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement lgnbx;
	
	public CrmLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLoginPage(String u,String p) {
		unbx.sendKeys(u);
		pwbx.sendKeys(p);
		lgnbx.click();
	}
	

}
