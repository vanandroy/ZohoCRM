package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatesCampaignPage {
	@FindBy(xpath="//select[@name='property(Type)']")
	private WebElement selectType;
	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement fillCampName;
	@FindBy(xpath="//select[@name='property(Status)']")
	private WebElement selectStatus;
	@FindBy(xpath="//input[@name='property(Start Date)' ]/../img")
	private WebElement clickOnCalender;
	public CreatesCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setType() {
		Select s=new Select(selectType);
		s.selectByVisibleText("Advertisement");
	}
	public void setCamNam(String cmn) {
		fillCampName.sendKeys(cmn);
	}
	public void setStatus() {
		Select s=new Select(selectStatus);
		s.selectByVisibleText("Planning");
	}
	public void setCalender() {
		clickOnCalender.click();
	}
	

}
