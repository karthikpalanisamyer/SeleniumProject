package com.salesforce.testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateIndividuals extends ProjectSpecificMethods  {

	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Kalanithi";
		category ="Smoke";
		excelFileName="credentials";
	}

	@Test(dataProvider = "fetchData")
	public void search(String username, String password) throws IOException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickWaffle()
		.clickViewAll_k()
		.searchIndividual()
		.s1()
		.s2()
		.s3()
		.s4()
		.save();


	}


}



