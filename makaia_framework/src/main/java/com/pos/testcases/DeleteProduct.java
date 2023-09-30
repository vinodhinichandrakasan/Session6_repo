package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class DeleteProduct extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteProduct";
		testDescription ="Delete product and verify";
		authors="Hari";
		category ="Smoke";
		excelFileName="DeleteProduct";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String productId,String deletePopup,String verifyDeletePopup)
			 {
		new LoginPage()
		.login()
		.clickProductMenu()
		.enterId(productId)
		.clickProductDeleteIcon()
		.clickOKButton()
		.enterId(productId)
		.verifyProductDeleted(productId);
	}

}
