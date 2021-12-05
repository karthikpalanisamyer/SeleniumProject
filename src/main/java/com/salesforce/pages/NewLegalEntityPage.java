package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewLegalEntityPage extends ProjectSpecificMethods {

	public NewLegalEntityPage EnterLEName(String LE)
	{
		clearAndType(locateElement(Locators.XPATH, properties.getProperty("NewLegalEntity.EnterName.Xpath")), LE);
		//click(locateElement(Locators.XPATH , properties.getProperty("AppLaucherPage.clickLE.XPath")));
		reportStep("Entity Name Entered successfully ", "pass"); 
		return this;
	}
	
	public NewLegalEntityPage EnterCompany(String Company)
	{
		clearAndType(locateElement(Locators.XPATH, properties.getProperty("NewLegalEntity.EnterCompany.Xpath")), Company);
		//click(locateElement(Locators.XPATH , properties.getProperty("AppLaucherPage.clickLE.XPath")));
		reportStep("Entity Name Entered successfully ", "pass"); 
		return this;
	}
	
	public NewLegalEntityPage EnterDescription(String Description)
	{
		clearAndType(locateElement(Locators.XPATH, properties.getProperty("NewLegalEntity.EnterDescription.Xpath")), Description);
		//click(locateElement(Locators.XPATH , properties.getProperty("AppLaucherPage.clickLE.XPath")));
		reportStep("Entity Name Entered successfully ", "pass"); 
		return this;
	}
	
	
	public NewLegalEntityPage ClickSave() throws InterruptedException
	{
		click(locateElement(Locators.XPATH, properties.getProperty("NewLegalEntity.ClickSave.Xpath")));
		//click(locateElement(Locators.XPATH , properties.getProperty("AppLaucherPage.clickLE.XPath")));
		reportStep("Saveclicked successfully ", "pass"); 
		Thread.sleep(5000);
		return this;
	}
	
}
