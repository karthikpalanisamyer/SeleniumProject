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

	




}
