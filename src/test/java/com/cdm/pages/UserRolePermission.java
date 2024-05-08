package com.cdm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserRolePermission extends CommonActions {

	public UserRolePermission(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	
	@FindBy(xpath = "//input[@name='access']")
	WebElement permissionInput;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")

	WebElement addpermissioncolumn;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/span[1]/img[1]")

	WebElement addpermissionicon;

	public void addpermissionicon() {

		addpermissionicon.click();
	}
	
	public void addpermissioncolumn() {
		addpermissioncolumn.click();
	}
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}
	

	
	public void permissionInput(String value) {
		permissionInput.sendKeys(Keys.ENTER);
		permissionInput.sendKeys(value);
	}
}
