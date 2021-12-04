package com.salesforce.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CaseList extends ProjectSpecificMethods{

	public CasesPage verify() throws IOException
	{
		WebElement locateElement = locateElement(Locators.XPATH, properties.getProperty("CaseList.verify.xpath"));

		String elementText = getElementText(locateElement);

		System.out.println("Text is:"+elementText);

		if (elementText.contains("created")){
			System.out.println("New Case is created successfully");
		}

		else {
			System.out.println("New Case is not created successfully");
		}

		reportStep("verified successfully ", "pass");

		return null;

	}

}
