package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class DeleteCustomer extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteCutomer";
		testDescription ="Customer deleted successfully";
		authors="Hari";
		category ="Smoke";
		excelFileName="DeleteCustomer";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String customerId,String verifyDeletePopup,String deletePopup)
			 {
		new LoginPage()
		.login()
		.clickCustomersMenu()
		.enterId(customerId)
		.clickDeleteIcon()
		.clickOKButton()
		.enterDeleteId(customerId)
		.verifyCutomerDeleted(customerId);
	}

}
