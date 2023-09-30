package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class EditVendor extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "EditVendors";
		testDescription ="Verify The New vendor name has updated";
		authors="Hari";
		category ="Smoke";
		excelFileName="EditVendor";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String vendorId,String changeVendorName,String verifyPopup
			,String vendorNameChanged) {
		new LoginPage()
		.login()
		.clickVendorsMenu()
		.enterId(vendorId)
		.clickVendorEditIcon()
		.changeVendorName(changeVendorName) 
		.clickSubmitButton()
		.verifyEditedVendorPopup(verifyPopup)
		.clickOKButton()
		.enterId(vendorId)
		.verifyVendorNameChanged(vendorId,vendorNameChanged);
		
	}

}
