package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmLogoutPage {
	
	@FindBy(xpath="//a[text()='Logout [rashmi@dell.com]']")
	private WebElement lgoutbx;
	
	public CrmLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogOutPage() {
		lgoutbx.click();
	}
	
}
