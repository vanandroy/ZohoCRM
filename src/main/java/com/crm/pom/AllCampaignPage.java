package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCampaignPage {
	@FindBy(xpath="//td[@class='title hline']/input[1]")
	private WebElement clickNewCmp;
	public AllCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setClickNewCompaignBtn() {
		clickNewCmp.click();
	}

}
