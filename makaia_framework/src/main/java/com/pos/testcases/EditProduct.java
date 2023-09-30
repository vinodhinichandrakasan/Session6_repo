package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class EditProduct extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "EditProduct";
		testDescription ="Verify The New Product name has updated";
		authors="Hari";
		category ="Smoke";
		excelFileName="EditProduct";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String productId,String changeProductName,String verifyPopup
			) {
		new LoginPage()
		.login()
		.clickProductMenu()
		.enterId(productId)
		.clickProductEditIcon()
		.changeProductName(changeProductName)
		.clickSubmitButton()
		.verifyEditedProductPopup(verifyPopup)
		.clickOKButton()
		.enterId(productId)
		.verifyProductNameChanged(productId,changeProductName);
		
	}

}
