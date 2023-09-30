package com.pos.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditVendorPage extends ProjectSpecificMethods {

	public EditVendorPage changeVendorName(String changeVendorName) {
		Actions builder=new Actions(getDriver());
		builder.click(locateElement(Locators.XPATH, "//label[text()='Vendor Name']/following::input"))
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		pause(3000);
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Vendor Name']/following::input"), changeVendorName);
		reportStep(changeVendorName+" Vendor name changed  successfully", "pass");
		return this;
	}
	public EditVendorPage clickSubmitButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Submit']"));
		reportStep("Submit button clicked successfully", "pass");
	    return this;
	}
	public EditVendorPage verifyEditedVendorPopup(String verifyPopup) {
		verifyExactText(locateElement(Locators.ID, "alert-dialog-description"), verifyPopup);
		reportStep(verifyPopup+" Edit Vendor popup was displayed  successfully", "pass");
		return this;
	}
	public VendorsPage clickOKButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Ok']"));
		reportStep("Ok button clicked successfully", "pass");
	    return new VendorsPage();
	}
}
