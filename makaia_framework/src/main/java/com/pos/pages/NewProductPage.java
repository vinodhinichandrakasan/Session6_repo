package com.pos.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewProductPage  extends ProjectSpecificMethods{

	public NewProductPage enterProductId(String productId) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Product Id']//following::input"), productId);
		reportStep(productId+" Product Id entered successfully", "pass");
		return this;
	}
	public NewProductPage enterProductName(String productName) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Name']//following::input[1]"), productName);
		reportStep(productName+" Product name entered successfully", "pass");
		return this;
	}
	public NewProductPage clickProductType() {
		click(locateElement(Locators.XPATH,"//div[@class='Select-placeholder']"));
		reportStep(" VendorDescription entered successfully", "pass");
		return this;
	}
	public NewProductPage selectOptionProductType() {
		click(locateElement(Locators.XPATH,"//div[text()='stat']"));
		reportStep(" Dropdown selected successfully", "pass");
		return this;
	}
	public NewProductPage enterProductDescription(String productDescription) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Description']//following::input"), productDescription);
		reportStep(productDescription+" Product Descirption entered successfully", "pass");
		return this;
	}
	public NewProductPage enterCostPrice(String costPrice) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Cost price']//following::input"), costPrice);
		reportStep(costPrice+" Cost Price entered successfully", "pass");
		return this;
	}
	public NewProductPage enterSellingPrice(String sellingPrice) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Selling price']//following::input"), sellingPrice);
		reportStep(sellingPrice+" Selling Price entered successfully", "pass");
	    return this;
	}
	public NewProductPage clickSubmitButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Submit']"));
		reportStep("Submit button clicked successfully", "pass");
	    return this;
	}
	public ProductPage clickProductTap() {
		click(locateElement(Locators.XPATH,"//h3[text()='Products']"));
		reportStep("Customer tap clicked  successfully", "pass");
	    return new ProductPage();
	}
}
