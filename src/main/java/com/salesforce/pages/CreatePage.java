package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreatePage extends ProjectSpecificMethods {
	
	public CreatePage s2() {
		setWait();
		setWait();
		click(Locators.XPATH, "(//a[@title='Individuals']/following::a)[1]");
		return this;
	}
	
	public CreatePage s3() {
		setWait();
		//click(Locators.XPATH, "//span[text()='New Individual']");
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='New Individual']"));
		//executeTheScript(String js , Locators.XPATH, "//span[text()='New Individual']");
		return this;
	}
	
	public CreatePage s4() {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Last Name']"), "Kumar");
		return this;
	}
	
	public CreatePage save() {
		click(Locators.XPATH, "//button[@title='Save']");
		return this;
	}
	
	public void toastmsg() {
		
		getElementText(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		
		
	}
	
	

}
