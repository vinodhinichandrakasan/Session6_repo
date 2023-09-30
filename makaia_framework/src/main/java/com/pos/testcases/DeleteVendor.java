package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class DeleteVendor extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteVendor";
		testDescription ="Delete vendor and verify";
		authors="Hari";
		category ="Smoke";
		excelFileName="DeleteVendor";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(
			String vendorId,String deletePopup,
			String verifyDeletePopup)
			 {
		new LoginPage()
		.login()
		.clickVendorsMenu()
		.enterId(vendorId)
		.clickVendorDeleteIcon()
		.clickOKButton()
		.enterId(vendorId)
		.verifyVendorDeleted(vendorId);
	}

}
