package com.framework.testng.api.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	public static Properties pro;
	
	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	@BeforeMethod
	public void preCondition() throws IOException {
		startApp("chrome", false, "https://login.salesforce.com/");
		setNode();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");		
		//create object properties file
		pro =new Properties();		
		//load the properties file
		pro.load(fis);
		
		
	}
	
	
	
	public void postCondition() {
		close();

	}
	
	

	
	  

	
	
}
