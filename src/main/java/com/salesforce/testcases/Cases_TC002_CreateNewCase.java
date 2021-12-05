package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;


public class Cases_TC002_CreateNewCase extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {
		testcaseName = "Create new Case";
		testDescription ="create a new cases in salesforce";
		authors="Vignesh";
		category ="Sanity";
		excelFileName="createNewCase";
	}

	@Test(dataProvider="fetchData")
	public void Run(String username, String password, String name,String sub,String des) throws InterruptedException, IOException
	{
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickWaffle() 
		.ClickViewAll() 
		.clickSales() 
		.clickMore() 
		.clickCases()
		.clickdropButton() 
		.clickNewCase() 
		.EnterContactName(name) 
		.selectName(name)
		.selectCaseOrigin() 
		.clickEmail() 
		.selectStatus() 
		.clickEscalated()
		.EnterSubject(sub) 
		.EnterDescription(des) 
		.clickSave() 
		.verify();

	}

}
