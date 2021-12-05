package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC_003_CreateLeadWOMandatory extends ProjectSpecificMethods{
		@BeforeTest
		public void setValues() {
			testcaseName = "Create Lead";
			testDescription ="CreateLead";
			authors="Ashwin";
			category ="Smoke";
			excelFileName="LegalEntity";
		}
		
		@Test(dataProvider = "fetchData")
		public void CreateLeadWOMandatory(String username, String password , String legalentityname , String company ,String description) throws InterruptedException, IOException {
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
			.EnterCompany(company)
			.EnterDescription(description)
			.ClickSave();

		}

	}
