package com.pos.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditCustomerPage extends ProjectSpecificMethods {

	public EditCustomerPage changeCustomerName(String changeCustomerName) {
		
		clearAndType(locateElement(Locators.XPATH, "//input[@name='name']"), changeCustomerName);
		reportStep(changeCustomerName+" Customer name is changed  successfully", "pass");
		return this;
	}
	public EditCustomerPage clickSubmitButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Submit']"));
		reportStep("Submit button clicked successfully", "pass");
	    return this;
	}
	public EditCustomerPage verifyEditedPopup(String verifyPopup) {
		verifyExactText(locateElement(Locators.ID, "alert-dialog-description"), verifyPopup);
		reportStep(verifyPopup+" Edit popup is displayed successfully", "pass");
		return this;
	}
	public CustomersPage clickOKButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Ok']"));
		reportStep("Ok button is clicked successfully", "pass");
	    return new CustomersPage();
	}
}
