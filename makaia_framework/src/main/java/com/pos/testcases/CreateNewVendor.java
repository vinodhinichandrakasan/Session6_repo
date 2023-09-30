package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class CreateNewVendor extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateNewVendors";
		testDescription ="Verify The New vendor has created";
		authors="Hari";
		category ="Smoke";
		excelFileName="NewVendors";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(
			String vendorId,String vendorName,String vendorDescription
			,String  vendorAddress,String  vendorMobile,String  vendorEmailId) {
		new LoginPage()
		.login()
		.clickVendorsMenu()
		.clickCreateNewVendors()
		.enterVendorId(vendorId)
        .enterVendorName(vendorName)
        .enterVendorDescription(vendorDescription)
        .enterVendorAddress(vendorAddress)
        .enterVendorMobile(vendorMobile)
        .enterVendorEmailId(vendorEmailId)
        .clickSubmitButton()
        .clickVendorsMenu()
        .enterId(vendorId)
        .verifyCustomer(vendorId);
	}

}
