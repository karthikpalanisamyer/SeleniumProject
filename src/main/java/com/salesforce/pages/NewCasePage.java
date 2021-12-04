package com.salesforce.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewCasePage extends ProjectSpecificMethods {

	public NewCasePage EnterContactName(String name) throws InterruptedException, IOException{

		clearAndType(locateElement(Locators.XPATH, properties.getProperty("NewCasePage.EnterContactName.xpath")), name);
		reportStep("Contact Name entered successfully ", "pass");
		return this;
	}

	public NewCasePage selectName(String name) throws IOException{

		String dummyText=properties.getProperty("NewCasePage.selectName.xpath");
		String replace = dummyText.replace("dummy", name);

		click(Locators.XPATH, replace);
		reportStep("Name selected successful ", "pass");
		return this;
	}

	public NewCasePage selectCaseOrigin() throws IOException{

		click(Locators.XPATH, properties.getProperty("NewCasePage.selectCaseOrigin.xpath"));
		reportStep("CaseOrigin select successfully", "pass");
		return this;
	}

	public NewCasePage clickEmail() throws IOException{ 

		clickUsingJs(locateElement(Locators.XPATH, properties.getProperty("NewCasePage.clickEmail.xpath")));
		reportStep("Email selected successfully ", "pass");
		return this;
	}

	public NewCasePage selectStatus() throws IOException{

		click(Locators.XPATH, properties.getProperty("NewCasePage.selectStatus.xpath"));
		reportStep("Status button clicked successfully", "pass");
		return this;
	}

	public NewCasePage clickEscalated() throws IOException{

		clickUsingJs(locateElement(Locators.XPATH, properties.getProperty("NewCasePage.clickEscalated.xpath")));
		reportStep("Escalated Status clicked successfully", "pass");
		return this;
	}

	public NewCasePage clickStatusForNone() throws IOException{

		clickUsingJs(locateElement(Locators.XPATH, properties.getProperty("NewCasePage.clickStatusForNone.xpath")));
		reportStep("None Status clicked successfully ", "pass");
		return this;
	}

	public NewCasePage EnterSubject(String sub) throws IOException{

		clearAndType(locateElement(Locators.XPATH, properties.getProperty("NewCasePage.EnterSubject.xpath")), sub);
		reportStep(sub+"Subject Enter successfully ", "pass");
		return this;
	}

	public NewCasePage EnterDescription(String des) throws IOException{

		clearAndType(locateElement(Locators.XPATH, properties.getProperty("NewCasePage.EnterDescription.xpath")), des);
		reportStep(des+"Description Enter successfully","pass");
		return this;
	}

	public CaseList clickSave() throws InterruptedException, IOException{
		
		click(Locators.XPATH, properties.getProperty("NewCasePage.clickSave.xpath"));
			reportStep("Save button clicked successfully ", "pass");
	
		return new CaseList();
	}

	public NewCasePage clickSaveForWithout() throws InterruptedException{
		click(Locators.XPATH, properties.getProperty("NewCasePage.clickSave.xpath"));
		return this;
	}


	public NewCasePage verifyErrorStatus(){
		String verify = getDriver().findElement(By.xpath("//span[text()='Review the errors on this page.']")).getText();
		System.out.println(verify);

		if (verify.contains("errors on this page")) {
			System.out.println("Case is not Created Successfully");

		} else {
			System.out.println("Case is Created Successfully");
		}
		return this;
	}


}
