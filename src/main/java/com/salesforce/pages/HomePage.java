package com.salesforce.pages;

import java.io.IOException;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods{


	public HomePage clickProfile() throws InterruptedException, IOException
	{
		click(Locators.XPATH, properties.getProperty("HomePage.Profile.XPath"));
		reportStep("Profile button licked successfully", "pass");
		return this;
	}


	public LoginPage clickLogout() throws InterruptedException, IOException
	{
		click(Locators.LINK_TEXT, properties.getProperty("HomePage.Logout.LinkText"));
		reportStep("Logout button clicked successfully", "pass");
		return new LoginPage();
	}


	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}


	public HomePage clickWaffle() throws IOException 
	{ 
		click(Locators.XPATH, properties.getProperty("HomePage.Waffle.XPath"));
		reportStep("Waffle button licked successfully ", "pass"); 

		return this;
	}


	public HomePage clickViewAll_new() {
		click(locateElement(Locators.XPATH,properties.getProperty("HomePage.ViewAll.Xpath")));
		reportStep("View All clicked successfully", "pass");
		return this;
	}

	public HomePage searchWorkTypeGroups() {
		clearAndType(locateElement(Locators.XPATH,properties.getProperty("HomePage.searchWorkTypeGroups.Xpath")),"Work Type Groups");
		reportStep("WorkTypeGroups is entered successfully", "pass");
		return this;
	}


	public WorkTypeGroupsPage clickWorkTypeGroups() {
		click(locateElement(Locators.XPATH,properties.getProperty("HomePage.WorkTypeGroups.Xpath")));
		reportStep("WorkTypeGroups clicked successfully", "pass");
		return new WorkTypeGroupsPage();
	}

	public AppLaucherPage clickViewAll() throws IOException 
	{ 
		click(Locators.XPATH, properties.getProperty("HomePage.ViewAll.XPath"));
		reportStep("ViewAll button licked successfully ", "pass");
		return new AppLaucherPage();
	}

	public HomePage clickToggleMenu()  {

		click(locateElement(Locators.XPATH, properties.getProperty("HomePage.ToggleMenu.xpath")));
		reportStep("clickToggleMenu is succes", "pass");
		return this;
	}

	public HomePage dashboardAppLauncher()  {

		click(locateElement(Locators.XPATH, properties.getProperty("HomePage.Applauncher.xpath")));
		reportStep("dashboardAppLauncher is succes", "pass");
		return this;
	}

	public HomePage newDashboardOption(String data)  {

		clearAndType(locateElement(Locators.XPATH, properties.getProperty("HomePage.newDashboardOption.xpath")), data);

		reportStep("newDashboardOption is succes", "pass");
		return this;
	}

	public DashboardsPage clickDashboard()  {

		click(locateElement(Locators.XPATH, properties.getProperty("HomePage.ClickDashboard.xpath")));
		reportStep("clickDashboard is succes", "pass");
		return new DashboardsPage();
	}

}
