package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateWorkTypeGroup extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateWorkTypeGroup";
		testDescription ="Create WorkType Group with mandatory fields";
		authors="Raji";
		category ="Smoke";
		excelFileName="Create WorkType Group";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password,String name, String desc, String type) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickToggleMenu()
		.clickViewAll_new()
		.searchWorkTypeGroups()
		.clickWorkTypeGroups()
		.clickDropdownIcon()
		.clickNewWorkTypeGroup()
		.enterWorkTypeGroupName(name)
		.enterDescription(desc)
		.selectGroupType(type)
		.clickSave1()
		.verifySuccessMessage();
		

	}

}
