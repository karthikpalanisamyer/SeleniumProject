package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SearchPage extends ProjectSpecificMethods{
	
	public SearchPage searchIndividual() {
		click(Locators.XPATH, "//input[@placeholder='Search apps or items...']");
		return this;
	}
	
	public CreatePage s1() {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), "Individuals");
		setWait();
		click(Locators.XPATH, "//mark[text()='Individuals']");
		return new CreatePage();
	}
	
	

}
