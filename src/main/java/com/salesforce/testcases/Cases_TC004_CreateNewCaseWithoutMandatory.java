package com.salesforce.testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class Cases_TC004_CreateNewCaseWithoutMandatory  extends ProjectSpecificMethods {


	@BeforeTest
	public void setValues() {
		testcaseName = "Create new Case Without Mandatory";
		testDescription ="create a new cases Without Mandatory in salesforce";
		authors="Vignesh";
		category ="Smoke";
		excelFileName="createNewCasewithoutMandatory";
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
		.clickStatusForNone()
		.EnterSubject(sub)
		.EnterDescription(des)
		.clickSaveForWithout()
		.verifyErrorStatus();
	}

}
