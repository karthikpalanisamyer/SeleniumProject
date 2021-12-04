package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC004_DeleteWorkTypeGroup extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteWorkTypeGroup";
		testDescription ="Delete WorkType Group";
		authors="Raji";
		category ="Smoke";
		excelFileName="Delete WorkType Group";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password,String searchName) throws InterruptedException {
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
		.selectDelete()
		.clickDelete()
		.verifySuccessMessage();
		
		

	}

}
