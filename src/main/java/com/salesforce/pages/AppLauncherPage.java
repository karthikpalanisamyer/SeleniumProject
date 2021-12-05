package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {

	public AppLauncherPage SerachandclickLE() 
	{	clearAndType(locateElement(Locators.XPATH, properties.getProperty("AppLauncherPage.Search.XPath")), "Legal");
		reportStep("clicked successfully ", "pass"); 
		return  this;
	}
	
	public LegalEntityPage ClickLE()
	{
		click(locateElement(Locators.XPATH, properties.getProperty("AppLaucherPage.clickLE.XPath")));
		reportStep(" clicked successfully ", "pass"); 
		return new LegalEntityPage();
	}
}
