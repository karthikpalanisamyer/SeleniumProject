package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Login And LogOut";
		testDescription ="Verify Login functionality with positive data";
		authors="Vignesh";
		category ="Smoke";
		excelFileName="credentials";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) throws InterruptedException, IOException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickProfile()
		.clickLogout();

	}

}
