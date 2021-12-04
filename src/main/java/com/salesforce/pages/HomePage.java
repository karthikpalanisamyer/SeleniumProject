package com.salesforce.pages;


import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public HomePage clickToggleMenu()  {
		
		click(locateElement(Locators.XPATH, pro.getProperty("HomePage.ToggleMenu.xpath")));
		reportStep("clickToggleMenu is succes", "pass");
		return this;
	}
	
public HomePage dashboardAppLauncher()  {
		
		click(locateElement(Locators.XPATH, pro.getProperty("HomePage.Applauncher.xpath")));
		reportStep("dashboardAppLauncher is succes", "pass");
		return this;
	}
	
	public HomePage newDashboardOption(String data)  {
		
		clearAndType(locateElement(Locators.XPATH, pro.getProperty("HomePage.newDashboardOption.xpath")), data);
		
		reportStep("newDashboardOption is succes", "pass");
		return this;
	}
	
	public DashboardsPage clickDashboard()  {
		
		click(locateElement(Locators.XPATH, pro.getProperty("HomePage.ClickDashboard.xpath")));
		reportStep("clickDashboard is succes", "pass");
		return new DashboardsPage();
	}

	
}
