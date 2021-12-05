package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SalesForcePage extends ProjectSpecificMethods{

	public SalesForcePage verifySuccessMessage() throws InterruptedException {
		//String success= locateElement(Locators.XPATH, properties.getProperty("SalesForcePage.verifySuccessMessage.Xpath")).getText();
		String success = getElementText(locateElement(Locators.XPATH, properties.getProperty("SalesForcePage.verifySuccessMessage.Xpath")));
		Thread.sleep(5000);
		System.out.println("Success message from UI:" +success);
		Thread.sleep(5000);
		return this;
	}


}
