package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Lead";
		testDescription ="CreateLead";
		authors="Ashwin";
		category ="Smoke";
		excelFileName="LegalEntity";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String username, String password , String legalentityname , String company ,String description) throws InterruptedException, IOException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickWaffle()
		.ClickViewAll()
		.SerachandclickLE()
		.ClickLE()
		.ClickLEDD()
		.ClickNewLE()
		.EnterLEName(legalentityname)
		.ClickSave();

	}

}


