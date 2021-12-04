package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, properties.getProperty("LoginPage.Username.Id")), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, properties.getProperty("LoginPage.Password.Id")), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement(Locators.ID, properties.getProperty("LoginPage.Login.Id")));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}

}
