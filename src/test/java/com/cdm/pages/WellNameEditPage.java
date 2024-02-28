package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class WellNameEditPage extends CommonActions {

	public WellNameEditPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id= 'isActive']")
	WebElement sliderOnCheckBox;
	
	@FindBy(xpath = "//*[@id='isActive']/..")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//input[@formcontrolname ='wellname']")
	WebElement wellnameinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='port']")
	WebElement portNumberinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='rtunumber']")
	WebElement RTUAddressinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='password']")
	WebElement passwordinputEdit;

	@FindBy(xpath = "//input[@formcontrolname ='ipaddress']")
	WebElement IPAddressinputEdit;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonwell;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonWell;

	
	@FindBy(xpath = "(//input[@formcontrolname='wellname']/../../../../div)")
	WebElement validationMessgaeWellName;

	@FindBy(xpath = "(//input[@formcontrolname='port']/../../../../div)")
	WebElement validationMessgaePort;

	@FindBy(xpath = "(//input[@formcontrolname='rtunumber']/../../../../div)")
	WebElement validationMessgaeRTUAddress;

	@FindBy(xpath = "(//input[@formcontrolname='password']/../../../../div)")
	WebElement validationMessgaePassword;

	@FindBy(xpath = "(//input[@formcontrolname='ipaddress']/../../../../div)")
	WebElement validationMessgaeIPAddress;

	@FindBy(xpath = "//mat-select[@formcontrolname='devicetype']")
	WebElement deviceTypeEdit;

	@FindBy(xpath = "(//mat-select[@formcontrolname='devicetype']/../../../../div)")
	WebElement validationMessgaedeviceType;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void setEditClearField() {

		wellnameinputEdit.clear();
	}
	
	
	public void setEditClearFieldforRTU() {

		RTUAddressinputEdit.clear();
	}

	
	public void setEditClearFieldforPassword() {

		passwordinputEdit.clear();
	}
	
	public void setEditClearFieldforPortNumber() {

		portNumberinputEdit.clear();
	}
	public void cancelButtonwell() {
		cancelButtonwell.click();

	}

	public void saveButton() {
		saveButtonWell.click();

	}

	public String verifyValidationMessageWellName() throws InterruptedException {
		Thread.sleep(3000);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaeWellName == null) {
			return "";
		}
		String message = validationMessgaeWellName.getText();

		return message.trim();

	}

	public String verifyValidationMessagePort() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaePort == null) {
			return "";
		}
		String message = validationMessgaePort.getText();

		return message.trim();

	}

	public String verifyValidationMessageRTUAddress() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaeRTUAddress == null) {
			return "";
		}
		String message = validationMessgaeRTUAddress.getText();

		return message.trim();

	}

	public String verifyValidationMessageIPAddress() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaeIPAddress == null) {
			return "";
		}
		String message = validationMessgaeIPAddress.getText();

		return message.trim();

	}

	public String verifyValidationMessagePassword() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaePassword == null) {
			return "";
		}
		String message = validationMessgaePassword.getText();

		return message.trim();

	}

	public String verifyValidationMessagedeviceType() throws InterruptedException {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessgaedeviceType == null) {
			return "";
		}
		String message = validationMessgaedeviceType.getText();

		return message.trim();

	}

	public void wellnameinputEdit(String value) {
		wellnameinputEdit.sendKeys(Keys.ENTER);
		wellnameinputEdit.sendKeys(value);
	}

	public void portnumberinputEdit(String value) {
		portNumberinputEdit.sendKeys(Keys.ENTER);
		portNumberinputEdit.sendKeys(value);
	}

	public void RTUAddressinputEdit(String value) {
		RTUAddressinputEdit.sendKeys(Keys.ENTER);
		RTUAddressinputEdit.sendKeys(value);
	}

	public void passwordinputEdit(String value) {
		passwordinputEdit.sendKeys(Keys.ENTER);
		passwordinputEdit.sendKeys(value);
	}

	public void IPAddressinputEdit(String value) {
		IPAddressinputEdit.sendKeys(Keys.ENTER);
		IPAddressinputEdit.sendKeys(value);
	}

	public void deviceTypeDropdownEdit(String value) throws InterruptedException {
         Thread.sleep(4000);
		SelectMatOption(deviceTypeEdit, value);
	}
	
	public void moveSliderCondition(String m) {
		
		moveSliderCondition(sliderOnCheckBox,sliderOnCheckBoxLabel,m);
	}


}
