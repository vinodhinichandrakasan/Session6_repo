package com.pos.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditProductPage extends ProjectSpecificMethods {

	public EditProductPage changeProductName(String changeProductName) {
		Actions builder=new Actions(getDriver());
		builder.click(locateElement(Locators.XPATH, "//label[text()='Name']/following::input"))
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		pause(3000);
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Name']/following::input"), changeProductName);
		reportStep(changeProductName+" Product name changed  successfully", "pass");
		return this;
	}
	public EditProductPage clickSubmitButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Submit']"));
		reportStep("Submit button clicked successfully", "pass");
	    return this;
	}
	public EditProductPage verifyEditedProductPopup(String verifyPopup) {
		verifyExactText(locateElement(Locators.ID, "alert-dialog-description"), verifyPopup);
		reportStep(verifyPopup+" Edit Product popup was displayed  successfully", "pass");
		return this;
	}
	public ProductPage clickOKButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Ok']"));
		reportStep("Ok button clicked successfully", "pass");
	    return new ProductPage();
	}
}
