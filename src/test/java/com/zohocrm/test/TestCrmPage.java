package com.zohocrm.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ZohoCRM.generic.ZohoBaseClass;
import com.crm.pom.AllCampaignPage;
import com.crm.pom.CreatesCampaignPage;
import com.crm.pom.CreatesNewLeads;
import com.crm.pom.HomePage;
import com.crm.pom.LeadsPage;

public class TestCrmPage extends ZohoBaseClass {
	WebDriver d;
	@Test(priority = 1)
	public void homePage() throws InterruptedException {
		d=super.driver;
		Reporter.log("homePage",true);
		HomePage h=new HomePage(d);
		h.setCompaignButton();
		Thread.sleep(3000);
		AllCampaignPage a=new AllCampaignPage(d);
		a.setClickNewCompaignBtn();
		CreatesCampaignPage c=new CreatesCampaignPage(d);
		c.setType();
		c .setCamNam("sale");
		c.setStatus();
		
	
		Thread.sleep(5000);

	}
	
	@Test(priority = 2)
	public void leadsPage() throws InterruptedException {
		d=super.driver;
		Reporter.log("leadsPage",true);
		LeadsPage l=new LeadsPage(driver);
		l.getClick();
		l.getNewLeads();
		Thread.sleep(2000);
		CreatesNewLeads cnl=new CreatesNewLeads(driver);
		cnl.setCoName("ty");
		cnl.getPrefix();
		cnl.setName("vk", "kr", "er", "kv123gmail.com","123456","12345","1234","vk.com","1200");
		Thread.sleep(5000);

	}
	
}
