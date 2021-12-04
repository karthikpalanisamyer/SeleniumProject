package com.salesforce.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class WorkTypeGroupsPage extends ProjectSpecificMethods{

	public WorkTypeGroupsPage clickDropdownIcon() {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroupsPage.DropdownIcon.Xpath")));
		reportStep("WorkTypeGroups clicked successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage clickNewWorkTypeGroup() {
		clickUsingJs(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.NewWorkTypeGroup.Xpath")));
		reportStep("WorkTypeGroups clicked successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage enterWorkTypeGroupName(String name) {
		clearAndType(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.WorkTypeGroupName.Xpath")),name);
		reportStep("WorkTypeGroupName is entered successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage enterDescription(String desc) {
		clearAndType(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.Description.Xpath")),desc);
		reportStep("WorkTypeGroupName is entered successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage selectGroupType(String type) throws InterruptedException {
		WebElement groupType = locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.GroupType.Xpath"));
		groupType.click();
		String grpType = properties.getProperty("WorkTypeGroups.clickGroupType.Xpath");
		grpType = grpType.replace("dummy", type);
		clickUsingJs(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.GroupType.Xpath")));
		Thread.sleep(3000);
		reportStep("GroupType selected successfully", "pass");
		return this;
	}

	public SalesForcePage clickSave1() {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.Save.Xpath")));
		reportStep("Save clicked successfully", "pass");
		return new SalesForcePage();
	}

	public WorkTypeGroupsPage clickSave2() {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.Save.Xpath")));
		reportStep("Save clicked successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage clickWorkTypeGroupTab() {
		clickUsingJs(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.WorkTypeGroupTab.Xpath")));
		reportStep("WorkTypeGroupTab clicked successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage searchWorkTypeGroup(String searchName) throws InterruptedException {
		clearAndType(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.searchWorkTypeGroup.Xpath")),searchName, Keys.ENTER);
		Thread.sleep(5000);
		reportStep("WorkTypeGroup is entered  with searchName", "pass");
		return this;
	}

	public WorkTypeGroupsPage clickSearchItemDropdown() throws InterruptedException {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.SearchItemDropdown.Xpath")));
		//click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.SearchItemDdown.Xpath")));
		Thread.sleep(2000);
		reportStep("SearchItemDropdown clicked successfully", "pass");
		return this;
	}
	public WorkTypeGroupsPage selectEdit() {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.Edit.Xpath")));
		reportStep("Edit is clicked successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage selectDelete() {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.Delete.Xpath")));
		reportStep("Edit is clicked successfully", "pass");
		return this;

	}
	public WorkTypeGroupsPage clickDelete() {
		click(locateElement(Locators.XPATH,properties.getProperty("WorkTypeGroups.DeleteButton.Xpath")));
		reportStep("Edit is clicked successfully", "pass");
		return this;
	}

	public WorkTypeGroupsPage verifySuccessMessage() throws InterruptedException {
		String success = getElementText(locateElement(Locators.XPATH, properties.getProperty("WorkTypeGroups.verifySuccessMessage.Xpath")));
		Thread.sleep(5000);
		System.out.println("Success message from UI:" +success);
		Thread.sleep(2000);
		return this;
	}


}
