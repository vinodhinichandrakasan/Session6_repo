package com.pos.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class PointOfSalePage extends ProjectSpecificMethods {

	public CustomersPage clickCustomersMenu() {
		click(locateElement(Locators.XPATH,"//h3[text()='Customers']"));
		reportStep("Customer menu is clicked  successfully", "pass");
		return new CustomersPage();
	}
	public VendorsPage clickVendorsMenu() {
		click(locateElement(Locators.XPATH,"//h3[text()='Vendors']"));
		reportStep("Vendor menu is clicked  successfully", "pass");
	    return new VendorsPage();
	}
	public ProductPage clickProductMenu() {
		click(locateElement(Locators.XPATH,"//h3[text()='Products']"));
		reportStep("Product menu is clicked  successfully", "pass");
	    return new ProductPage();
	}
}
