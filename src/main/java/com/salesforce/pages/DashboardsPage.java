package com.salesforce.pages;

import java.io.IOException;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class DashboardsPage extends ProjectSpecificMethods{

	public DashboardsPage clickNewDashboard()  {
		
		click(locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.ClickNewDashboard.xpath")));
		reportStep("clickNewDashboard is succes", "pass");
		return this;
	}

	public DashboardsPage enteriframe()  {
		switchToFrame(locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.EnteriFrame.xpath")));
		reportStep("enteriframe is succes", "pass");
		return this;
	}

	public DashboardsPage enterName(String data)  {
		clearAndType(locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.EnterName.xpath")), data);
		reportStep("enterName is succes", "pass");

		return this;
	}

	public DashboardsPage enterdName(String data) {
		clearAndType(locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.EnterdName.xpath")), data);
		reportStep("enterdName is succes", "pass");

		return this;
	}

	public DashboardsPage clickSubmit() throws IOException {
		
		click(locateElement(Locators.ID, properties.getProperty("DashboardsPage.ClickSubmit.xpath")));
		reportStep("clickSubmit is succes", "pass");

		return this;
	}

	public DashboardsPage exitiframe() throws InterruptedException {
		defaultContent();
		reportStep("exitiframe is succes", "pass");
		Thread.sleep(3000); 
		return this; }

	public DashboardsPage enteriframe1() { 
		switchToFrame(locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.enteriframe2.xpath")));
		reportStep("enteriframe is succes", "pass");
		return this;
	}


	public DashboardsPage clickSave()  {
		click(locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.clickSave.xpath")));
		reportStep("clickSave is succes", "pass");

		return this;
	}

	public DashboardsPage exitiframe1() throws InterruptedException  { 
		
			defaultContent();
			reportStep("exitiframe1 is succes", "pass");
			Thread.sleep(3000);
			

		return this; 
	}

	public DashboardsPage getText() {
		
		String str = locateElement(Locators.XPATH, properties.getProperty("DashboardsPage.getText.xpath")).getText();
		System.out.println("Success Message: " + str);
		return this;
	}


	
	
	
}
