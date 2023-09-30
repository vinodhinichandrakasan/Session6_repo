package com.framework.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@Parameters({"browser"})
	@BeforeMethod
	public void preCondition(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
		startApp("chrome", false, prop.getProperty("url"));
		setNode();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			startApp("firefox", false, prop.getProperty("url"));
			setNode();
		}
	}

	@AfterMethod
	public void postCondition() {
		close();

	}

}
