package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class CreateNewProduct extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateNewProduct";
		testDescription ="Verify The New product has created";
		authors="Hari";
		category ="Smoke";
		excelFileName="NewProduct";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String productId,String productName,String productDescription
			,String costPrice,String sellingPrice
			) {
		new LoginPage()
		.login()
		.clickProductMenu()
		.clickCreateNewProduct()
		.enterProductId(productId)
        .enterProductName(productName)
        .clickProductType()
        .selectOptionProductType()
        .enterProductDescription(productDescription)
        .enterCostPrice(costPrice)
        .enterSellingPrice(sellingPrice)
        .clickSubmitButton()
        .clickProductTap()
        .enterId(productId)
        .verifyProduct(productId);
	}

}
