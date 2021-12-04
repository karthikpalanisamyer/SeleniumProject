package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC003_EditWorkTypeGroup extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "EditWorkTypeGroup";
		testDescription ="Edit WorkType Group";
		authors="Raji";
		category ="Smoke";
		excelFileName="Edit WorkType Group";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password,String searchName, String desc, String type) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickToggleMenu()
		.clickViewAll()
		.searchWorkTypeGroups()
		.clickWorkTypeGroups()
		.clickWorkTypeGroupTab()
		.searchWorkTypeGroup(searchName)
		.clickSearchItemDropdown()
		.selectEdit()
		.enterDescription(desc)
		.selectGroupType(type)
		.clickSave2()
		.verifySuccessMessage();
		

	}

}
