package com.salesforce.pages;

import java.io.IOException;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SalesHomePage extends ProjectSpecificMethods{

	public SalesHomePage clickMore() throws InterruptedException, IOException{

		click(Locators.XPATH, properties.getProperty("SalesHomePage.clickMore.XPath"));
		reportStep("More button licked successfully ", "pass");
		return this;
	}

	public CasesPage clickCases() throws InterruptedException, IOException{
		
		clickUsingJs(locateElement(Locators.XPATH, properties.getProperty("SalesHomePage.clickCases.XPath")));
		reportStep("Cases button licked successfully ", "pass");
	
		return new CasesPage();
	}
}
