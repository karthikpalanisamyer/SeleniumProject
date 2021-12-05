package com.framework.testng.api.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	public static Properties properties;
	public int recordsCount;
	public JavascriptExecutor executor;

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() throws IOException {

		FileInputStream fileInputStream=new FileInputStream("./src/main/resources/config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		executor=(JavascriptExecutor)getDriver();
		//setProp();
		startApp("chrome", false,properties.getProperty("url"));
		setNode();

	}
	
	public void postCondition() {
		close();

	}
	
	

	
	  

	
	
}
