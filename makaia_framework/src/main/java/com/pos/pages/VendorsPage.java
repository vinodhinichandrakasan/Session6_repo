package com.pos.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class VendorsPage  extends ProjectSpecificMethods{

	public NewVendorsPage clickCreateNewVendors() {
		click(locateElement(Locators.XPATH,"//span[text()='Create New']"));
		reportStep(" Create new Vendors clicked successfully", "pass");
	    return new NewVendorsPage();
	}
	public VendorsPage enterId(String id) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Enter ID']"), id,Keys.ENTER);
		reportStep(id+" id entered  successfully", "pass");
		return this;
	}
	public VendorsPage verifyCustomer(String vendorId) {
		verifyExactText(locateElement(Locators.XPATH, "//td[text()='"+vendorId+"']"), vendorId);
		reportStep(vendorId+" Vendor Id verified  successfully", "pass");
		return this;
	}
	public EditVendorPage clickVendorEditIcon() {
		click(locateElement(Locators.XPATH,"//table[contains(@class,'MuiTable-root')]//td[1]/following::*[local-name()='svg']"));
		reportStep("Vendor Edit icon clicked  successfully", "pass");
		return new EditVendorPage();
	}
	public VendorsPage verifyVendorNameChanged(String vendorId, String vendorNameChanged) {
		verifyPartialText(locateElement(Locators.XPATH, "//td[text()='"+vendorId+"']/following-sibling::td"), vendorNameChanged);
		reportStep(vendorNameChanged+" Vendor name has changed successfully", "pass");
		return this;
	}
	public VendorsPage clickVendorDeleteIcon() {
		click(locateElement(Locators.XPATH,"(//table[contains(@class,'MuiTable-root')]//td[1]/following::*[local-name()='svg'])[2]"));
		reportStep("Vendor Delete icon clicked  successfully", "pass");
		return this;
	}

	/*
	 * public VendorsPage confirmDeleteVendorPopup(String deletePopup) {
	 * verifyExactText(locateElement(Locators.ID, "alert-dialog-description"),
	 * deletePopup);
	 * reportStep(deletePopup+" Vendor Delete popup was displayed  successfully",
	 * "pass"); return this; }
	 */
	public VendorsPage clickOKButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Ok']"));
		reportStep("Ok button clicked successfully", "pass");
	    return this;
	}
	/*
	 * public VendorsPage verifyDeletePopUp(String verifyDeletePopup) {
	 * verifyExactText(locateElement(Locators.XPATH,
	 * "//div[text()='Message']/following-sibling::span"),verifyDeletePopup);
	 * reportStep(
	 * verifyDeletePopup+" Customer deleted popup displayed  successfully", "pass");
	 * return this; }
	 */
	
	
	public VendorsPage verifyVendorDeleted(String vendorId) {
		List<WebElement> vendorMatch = locateElements(Locators.XPATH, "//td[text()='"+vendorId+"']");
	
		if(vendorMatch.size()==0) {
			reportStep("Vendor is deleted  successfully", "pass");
		}else {
			reportStep("Vendor is not deleted  successfully", "pass");
		}
		
		return this;
	}
}
