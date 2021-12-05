package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;


public class TC005_DeleteCase extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {
		testcaseName = "Delete new case";
		testDescription ="Delete new case in salesforce";
		authors="Vignesh";
		category ="Sanity";
		excelFileName="Deletecase";
	}

	@Test(dataProvider="fetchData")
	public void Run(String username, String password) throws InterruptedException, IOException
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
		.clickFirstItemForDelete()
		.clickDelete()
		.clickConfirmDelete()
		.verifyDeleteStatus();
		
		
		
	}

}
