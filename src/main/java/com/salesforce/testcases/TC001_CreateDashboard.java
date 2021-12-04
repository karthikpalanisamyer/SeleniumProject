package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_CreateDashboard extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Login And LogOut";
		testDescription ="Verify Login functionality with positive data";
		authors="Vignesh";
		category ="Smoke";
		excelFileName="dLogin";

	}
	
	@Test(dataProvider = "fetchData")

	public void runLogin(String username, String password, String dName,String dashName, String disName, String editdisName) throws InterruptedException, IOException {

		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage().clickToggleMenu().dashboardAppLauncher()
		.newDashboardOption(dName).clickDashboard()
		.clickNewDashboard().enteriframe().enterName(dashName).
		enterdName(disName).clickSubmit().exitiframe().enteriframe1().
		clickSave().exitiframe1().getText();
	/*	.clickDashboard()
		.searchandSelectDashboard().clickEditDashboard().enteriFrame().editDashboardProp().clearData().
		enterData(editdisName).clickSubmit().clickSave().exitFrame().clickText().enteriFrame2().clickDone().
		enterText().exitFrame2();*/


	}

}
