package com.pos.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CustomersPage extends ProjectSpecificMethods {

	public NewCustomersPage clickCreateNewButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Create New']"));
		reportStep("Create new Button is clicked  successfully", "pass");
		return new NewCustomersPage();
	}
	public CustomersPage enterId(String id) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Enter ID']"), id,Keys.ENTER);
		reportStep(id+" Customer Id is entered  successfully", "pass");
		return this;
	}
	public CustomersPage verifyCustomer(String customerId) {
		verifyExactText(locateElement(Locators.XPATH, "//td[text()='"+customerId+"']"), customerId);
		reportStep(customerId+" CustomerId is verified  successfully", "pass");
		return this;
	}
	public EditCustomerPage clickEditIcon() {
		click(locateElement(Locators.XPATH,"//table[contains(@class,'MuiTable-root')]//td[1]/following::*[local-name()='svg']"));
		reportStep("Edit icon is clicked  successfully", "pass");
		return new EditCustomerPage();
	}
	public CustomersPage verifyCustomerNameChanged(String customerId, String customerNameChanged) {
		verifyPartialText(locateElement(Locators.XPATH, "//td[text()='"+customerId+"']/following-sibling::td"), customerNameChanged);
		reportStep(customerNameChanged+" Customer name is changed successfully", "pass");
		return this;
	}
	public CustomersPage clickDeleteIcon() {
		click(locateElement(Locators.XPATH,"(//table[contains(@class,'MuiTable-root')]//td[1]/following::*[local-name()='svg'])[2]"));
		reportStep("Delete icon is clicked  successfully", "pass");
		return this;
	}

	/*
	 * public CustomersPage confirmDeletePopup(String deletePopup) {
	 * verifyPartialText(locateElement(Locators.ID, "alert-dialog-description"),
	 * deletePopup);
	 * reportStep(deletePopup+" Delete popup was displayed  successfully", "pass");
	 * return this; }
	 */
	public CustomersPage clickOKButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Ok']"));
		reportStep("Ok button is clicked successfully", "pass");
	    return this;
	}
	/*
	 * public CustomersPage verifyDeletePopUp(String verifyDeletePopup) {
	 * verifyPartialText(locateElement(Locators.XPATH,
	 * "//div[text()='Message']/following-sibling::span"),verifyDeletePopup);
	 * reportStep(
	 * verifyDeletePopup+" Customer deleted popup displayed  successfully", "pass");
	 * return this; }
	 */
	
	public CustomersPage enterDeleteId(String deleteId) {
		pause(2000);
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Enter ID']"), deleteId,Keys.ENTER);
		reportStep(deleteId+" Customer Id to be deleted is entered successfully", "pass");
		return this;
	}
	public CustomersPage verifyCutomerDeleted(String customerId) {
		List<WebElement> findMatch = locateElements(Locators.XPATH, "//td[text()='"+customerId+"']");
		if(findMatch.size()==0)
			reportStep("Customer is deleted successfully", "pass");
		else
			reportStep("Customer is not deleted successfully", "fail");
		return this;
	}
}
