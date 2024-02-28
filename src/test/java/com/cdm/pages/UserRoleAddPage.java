package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserRoleAddPage extends CommonActions {

	public UserRoleAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[2]")
	
	WebElement addUserGroupButtonplussign;
	
	@FindBy(xpath = "//input[@formcontrolname='groupname']")
	
	WebElement addUserGroupinput;
	
	@FindBy(xpath = "//button[@class='addButton']")
		
	WebElement savebtnrole;
	
	public void adduserGroup(String value) {
		addUserGroupButtonplussign.click();
	}
	
	public void addinputusergroup(String value) {
		addUserGroupinput.sendKeys(Keys.ENTER);
		addUserGroupinput.sendKeys(value);
	}
	@FindBy(xpath = "//mat-form-field[1]/div[1]/div[1]/div[3]/input")
	WebElement inputUserRole;
	
	

	
	public void inputaddrole(String value) {
		inputUserRole.sendKeys(Keys.ENTER);
		//((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", value, inputUserRole);
		inputUserRole.sendKeys(value);
	}
	
	public void saveuserrole() {
		savebtnrole.click();
		
	}
}

	

