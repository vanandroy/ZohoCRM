package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatesNewLeads {
	@FindBy(xpath="//input[@name='property(Company)']")
	private WebElement comName;
	@FindBy(xpath="(//select[@class='select'])[3]")
	private WebElement nameprefix;
	@FindBy(xpath="//input[@name='property(First Name)']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='property(Last Name)']")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='property(Designation)']")
	private WebElement designation;
	@FindBy(xpath="//input[@name='property(Email)']")
	private WebElement email;
	@FindBy(xpath="//input[@name='property(Phone)']")
	private WebElement phone;
	@FindBy(xpath="//input[@name='property(Fax)']")
	private WebElement fax;
	@FindBy(xpath="//input[@name='property(Mobile)']")
	private WebElement mobile;
	@FindBy(xpath="//input[@name='property(Website)']")
	private WebElement website;
	@FindBy(xpath="//input[@name='property(No of Employees)']")
	private WebElement noemp;
	
	
	
	public CreatesNewLeads(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setCoName(String comNaam) {
		comName.sendKeys(comNaam);
	}

	public void getPrefix() {
		Select s=new Select(nameprefix);
	s.selectByVisibleText("Mr.");
	
	}
	public void setName(String fnaam,String lnaam,String des,String em,String ph,String fx,String mb,String wb,String emp) {
		firstName.sendKeys(fnaam);
		lastName.sendKeys(lnaam);
		designation.sendKeys(des);
		email.sendKeys(em);
		phone.sendKeys(ph);
		fax.sendKeys(fx);
		mobile.sendKeys(mb);
		website.sendKeys(wb);
		noemp.sendKeys(emp);
	}
	public void setIntValue() {
		
	}
	

}
