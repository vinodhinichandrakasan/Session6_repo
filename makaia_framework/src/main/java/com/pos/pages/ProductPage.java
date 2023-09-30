package com.pos.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ProductPage  extends ProjectSpecificMethods{

	public NewProductPage clickCreateNewProduct() {
		click(locateElement(Locators.XPATH,"//span[text()='Create New']"));
		reportStep(" Create new Vendors clicked successfully", "pass");
	    return new NewProductPage();
	}
	public ProductPage enterId(String id) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Enter ID']"), id,Keys.ENTER);
		reportStep(id+" id entered  successfully", "pass");
		return this;
	}
	public ProductPage verifyProduct(String productId) {
		verifyExactText(locateElement(Locators.XPATH, "//table[contains(@class,'MuiTable-root')]//td[1]"), productId);
		reportStep(productId+" Product Id verified  successfully", "pass");
		return this;
	}
	public EditProductPage clickProductEditIcon() {
		click(locateElement(Locators.XPATH,"//table[contains(@class,'MuiTable-root')]//td[1]/following::*[local-name()='svg']"));
		reportStep("Product Edit icon clicked  successfully", "pass");
		return new EditProductPage();
	}
	public ProductPage verifyProductNameChanged(String productId,String productNameChanged) {
		verifyPartialText(locateElement(Locators.XPATH, "//td[text()='"+productId+"']/following-sibling::td"), productNameChanged);
		reportStep(productNameChanged+" Product name has changed successfully", "pass");
		return this;
	}
	public ProductPage clickProductDeleteIcon() {
		click(locateElement(Locators.XPATH,"(//table[contains(@class,'MuiTable-root')]//td[1]/following::*[local-name()='svg'])[2]"));
		reportStep("Vendor Delete icon clicked  successfully", "pass");
		return this;
	}
	public ProductPage confirmDeleteProductPopup(String deletePopup) {
		verifyExactText(locateElement(Locators.ID, "alert-dialog-description"), deletePopup);
		reportStep(deletePopup+" Product Delete popup was displayed  successfully", "pass");
		return this;
	}
	public ProductPage clickOKButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Ok']"));
		reportStep("Ok button clicked successfully", "pass");
	    return this;
	}
	public ProductPage verifyDeletePopUp(String verifyDeletePopup) {
		verifyExactText(locateElement(Locators.XPATH,"//div[text()='Message']/following-sibling::span"),verifyDeletePopup);
		reportStep(verifyDeletePopup+" Product deleted popup displayed  successfully", "pass");
		return this;
	}
	
	/*
	 * public ProductPage enterDeleteProductId(String deleteId) { Actions
	 * builder=new Actions(getDriver()); builder.click(locateElement(Locators.XPATH,
	 * "//input[@placeholder='Enter ID']"))
	 * .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.
	 * BACK_SPACE).build().perform();
	 * 
	 * pause(2000); clearAndType(locateElement(Locators.XPATH,
	 * "//input[@placeholder='Enter ID']"), deleteId,Keys.ENTER);
	 * reportStep(deleteId+" id entered  successfully", "pass"); return this; }
	 */
	public ProductPage verifyProductDeleted(String productId) {
		List<WebElement> matchingProduct = locateElements(Locators.XPATH, "//td[text()='"+productId+"']");
		if(matchingProduct.size()==0) {
			reportStep("Product is deleted successfully", "pass");
		}else {
			reportStep("Product is not deleted successfully", "fail");
		}
		
		return this;
	}
}
