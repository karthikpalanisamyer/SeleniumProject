package com.salesforce.pages;

import java.io.IOException;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CasesPage extends ProjectSpecificMethods{

	public CasesPage clickdropButton() throws InterruptedException, IOException{

		click(Locators.XPATH, properties.getProperty("CasesPage.clickdropButton.xpath"));
		reportStep("drop button licked successfully ", "pass");
		return this;
	}

	public NewCasePage clickNewCase() throws IOException{

		clickUsingJs(locateElement(Locators.XPATH, properties.getProperty("CasesPage.clickNewCase.xpath")));
			reportStep("NewCase button licked successfully ", "pass");
		return new NewCasePage();
	}
	
	/*

	public CasesPage findCount() throws InterruptedException{
		WebElement ele = getDriver().findElementByXPath(properties.getProperty("CasesPage.findCount.xpath"));
		Thread.sleep(10000);
		String count = ele.getText().replaceAll("\\D","");

		System.out.println(count);
		recordsCount = Integer.parseInt(count);
		System.out.println(recordsCount);
		return this;
	}

	public CasesPage scrollDownAndclickEditDropdown() throws InterruptedException{

		for (int i = 1; i <= recordsCount; i++) {

			String dummyText=properties.getProperty("CasesPage.scrollDownAndclickEditDropdown.xpath");
			System.out.println("dummyText :"+dummyText);
			String replace = dummyText.replace("dummy", String.valueOf(i));
			System.out.println("After dummyText :"+replace);



			WebElement row =  getDriver().findElementByXPath(replace);
			Thread.sleep(3000);
			executor.executeScript("arguments[0].scrollIntoView();", row);
			text = row.getText();


			String dummyTextEdit=properties.getProperty("CasesPage.EditDropdown.xpath");
			Thread.sleep(3000);
			String replaceText = dummyTextEdit.replace("dummy", String.valueOf(i));
			System.out.println(replaceText);

			if (!text.equals("Working")){ 
				Thread.sleep(3000); 
				getDriver().findElementByXPath(replaceText).click();
				break;
			}
		}
		return this;
	}

	public CasesPage clearSearch(){
		getDriver().findElementByXPath(properties.getProperty("CasesPage.clearSearch.xpath")).clear();
		return this;
	}

	public CasesPage EnterCaseNumberinSearch() throws InterruptedException{

		getDriver().findElementByXPath(properties.getProperty("CasesPage.EnterCaseNumberinSearch.xpath")).sendKeys(caseNumber,Keys.ENTER);
		Thread.sleep(2000);
		return this;
	}

	public CasesPage getStatus() throws InterruptedException{

		String statusVerify = getDriver().findElement(By.xpath("CasesPage.getStatus.xpath")).getText();
		Thread.sleep(2000);
		return this;
	}

	public CasesPage verifyStatus(){

		if (statusVerify.contains("Working")) {
			System.out.println("Case is Edited Successfully and Status is working");

		} else {
			System.out.println("Case is not Edited Successfully");
		}
		return this;
	}

	public EditCasePage clickEdit() throws InterruptedException{
		getDriver().findElementByXPath(properties.getProperty("CasesPage.clickEdit.xpath")).click();	
		Thread.sleep(3000);
		return new EditCasePage(properties);
	}

	public CasesPage clickFirstItemForDelete() throws InterruptedException{

		executor.executeScript("arguments[0].click();",getDriver().findElementByXPath(properties.getProperty("CasesPage.clickFirstItemForDelete.xpath")));
		return this;
	}


	public CasesPage clickDelete() throws InterruptedException{

		getDriver().findElementByXPath(properties.getProperty("CasesPage.clickDelete.xpath")).click();
		return this;
	}

	public CasesPage clickConfirmDelete() throws InterruptedException{

		getDriver().findElementByXPath(properties.getProperty("CasesPage.clickConfirmDelete.xpath")).click();
		return this;
	}


	public CasesPage verifyDeleteStatus(){
		//Verify the case with your name is deleted or not
		String deleteVerify = getDriver().findElementByXPath(properties.getProperty("CasesPage.verifyDeleteStatus.xpath")).getText();
		System.out.println(deleteVerify);

		if (deleteVerify.contains("deleted")) {
			System.out.println(" The case with your name is there in the application");

		} else {
			System.out.println("case with your name is not there in the application");
		}
		return this;
	}


*/


}


