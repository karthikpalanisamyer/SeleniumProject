package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LegalEntityPage extends ProjectSpecificMethods {
	
	public LegalEntityPage ClickLEDD() throws InterruptedException
	{
		click(locateElement(Locators.XPATH , properties.getProperty("LegalEntityPage.ClickLE1.Xpath")));
		reportStep("Legal Entity Tab clicked successfully ", "pass"); 
		Thread.sleep(5000);
		return this;
	}
	
	public NewLegalEntityPage ClickNewLE()
	{
		clickUsingJs(locateElement(Locators.XPATH , properties.getProperty("LegalEntityPage.NewLE.Xpath")));
		reportStep("New Legal ENtity clicked successfully ", "pass"); 
		
		return new NewLegalEntityPage();
	}
}
