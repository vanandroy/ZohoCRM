package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leads;
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newLeads;
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getClick() {
		leads.click();
	}
	public void getNewLeads() {
		newLeads.click();
	}
	

}
