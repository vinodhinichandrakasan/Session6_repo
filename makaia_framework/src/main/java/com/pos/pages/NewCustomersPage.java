package com.pos.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewCustomersPage extends ProjectSpecificMethods {

	public NewCustomersPage enterCustomerId(String customerId) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Customer Id']/following::input"), customerId);
		reportStep(customerId+"Customer Id is entered successfully", "pass");
		return this;
	}
	public NewCustomersPage enterCustomerName(String customerName) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Customer Name']/following::input"), customerName);
		reportStep(customerName+"Customer Name is entered successfully", "pass");
		return this;
	}
	public NewCustomersPage enterCustomerDescription(String customerDescription) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Description']/following::input"), customerDescription);
		reportStep(customerDescription+"Customer Description is entered successfully", "pass");
		return this;
	}
	public NewCustomersPage enterCustomerAddress(String customerAddress) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Address']/following::input"), customerAddress);
		reportStep(customerAddress+"Customer address is entered successfully", "pass");
		return this;
	}
	public NewCustomersPage enterCustomerMobile(String customerMobile) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Mobile']/following::input"), customerMobile);
		reportStep(customerMobile+"Customer Mobile is entered successfully", "pass");
		return this;
	}
	public NewCustomersPage enterEmailId(String emailId) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Email Id']/following::input"), emailId);
		reportStep(emailId+"Email Id is entered successfully", "pass");
		return this;
	}
	public NewCustomersPage clickSubmitButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Submit']"));
		reportStep("Submit button is clicked successfully", "pass");
	    return this;
	}
	public CustomersPage clickCustomersMenu() {
		click(locateElement(Locators.XPATH,"//h3[text()='Customers']"));
		reportStep("Customers menu is clicked  successfully", "pass");
	    return new CustomersPage();
	}
}
