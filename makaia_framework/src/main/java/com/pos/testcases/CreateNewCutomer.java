package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class CreateNewCutomer extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateNewCutomer";
		testDescription ="Verify The New customer has created";
		authors="Hari";
		category ="Smoke";
		excelFileName="NewCustomer";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String customerId,String customerName,String customerDescription
			,String customeAddress,String customeMobile,String emailId) {
		new LoginPage()
		.login()
		.clickCustomersMenu()
		.clickCreateNewButton()
		.enterCustomerId(customerId)
        .enterCustomerName(customerName)
        .enterCustomerDescription(customerDescription)
        .enterCustomerAddress(customeAddress)
        .enterCustomerMobile(customeMobile)
        .enterEmailId(emailId)
        .clickSubmitButton()
        .clickCustomersMenu()
        .enterId(customerId)
        .verifyCustomer(customerId);
	}

}
