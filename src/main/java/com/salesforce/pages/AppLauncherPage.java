package com.salesforce.pages;

import java.io.IOException;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods
{

	public SalesHomePage clickSales() throws InterruptedException, IOException{

		click(Locators.XPATH, properties.getProperty("AppLauncherPage.clickSales.XPath"));
		
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
		//getDriver().findElementByXPath(properties.getProperty("AppLauncherPage.clickServiceConsole.XPath")).click();
		Thread.sleep(5000);
		return new ServiceConsolePage(properties);
	}
	
	*/

}
