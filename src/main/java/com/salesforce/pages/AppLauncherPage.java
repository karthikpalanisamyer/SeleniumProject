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
	
	public SalesHomePage clickSales() throws InterruptedException{

		click(Locators.XPATH, properties.getProperty("AppLaucherPage.clickSales.XPath"));
		
			reportStep("Sales button licked successfully ", "pass");

		return new SalesHomePage();
	}
	
	/*
	public ServiceConsolePage clickServiceConsole() throws InterruptedException, IOException{
		try {
			getDriver().findElementByXPath(properties.getProperty("AppLauncherPage.clickServiceConsole.XPath")).click();
			reportStep("ServiceConsole button licked successfully ", "pass");
		} catch (Exception e) {
			reportStep("ServiceConsole button not licked successfully", "fail");
		}
		return new ServiceConsolePage(properties);
	}
	*/
}

