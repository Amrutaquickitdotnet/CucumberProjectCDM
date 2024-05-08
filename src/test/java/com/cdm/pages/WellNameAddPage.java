package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class WellNameAddPage extends CommonActions {

	public WellNameAddPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement activeUserToolTip;

	@FindBy(xpath="//div[@class='slider round']")
	WebElement sliderRound;
	
	
	
	@FindBy(xpath = "//*[@id= 'isActive']")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id='isActive']/..")
	WebElement sliderOnCheckBoxLabel;
	
	@FindBy(xpath = "//input[@formcontrolname ='wellname']")
	WebElement wellnameinputAdd;

	@FindBy(xpath = "//input[@formcontrolname ='port']")
	WebElement portNumberinputAdd;

	@FindBy(xpath = "//input[@formcontrolname ='rtunumber']")
	WebElement RTUAddressinputAdd;

	@FindBy(xpath = "//input[@formcontrolname ='password']")
	WebElement passwordinputAdd;

	@FindBy(xpath = "//input[@formcontrolname ='ipaddress']")
	WebElement IPAddressinputAdd;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonwell;

	@FindBy(xpath = "//button[@class='addButton')]")
	WebElement saveButtonWell;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img[1]")
	WebElement addButtonWell;

	@FindBy(xpath = "(//input[@formcontrolname='wellname']/../../../../../span[1]/span)")
	WebElement validationMessgaeWellName;

	@FindBy(xpath = "(//input[@formcontrolname='port']/../../../../../span[1]/span)")
	WebElement validationMessgaePort;

	@FindBy(xpath = "(//input[@formcontrolname='rtunumber']/../../../../../span[1]/span[1])")
	WebElement validationMessgaeRTUAddress;

	@FindBy(xpath = "(//input[@formcontrolname='password']/../../../../../span[1]/span)")
	WebElement validationMessgaePassword;

	@FindBy(xpath = "(//input[@formcontrolname='ipaddress']/../../../../../span[1]/span[1])")
	WebElement validationMessgaeIPAddress;
	
	@FindBy(xpath = "(//input[@formcontrolname='ipaddress']/../../../../../span[1]/span[2])")
	WebElement validationMessgaeIPAddress1;

	@FindBy(xpath = "//mat-select[@formcontrolname='devicetype']")
	WebElement deviceTypeAdd;

	@FindBy(xpath = "(//mat-select[@formcontrolname='devicetype']/../../../../../span[1]/span)")
	WebElement validationMessgaedeviceType;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void addbutton() throws InterruptedException {
		Thread.sleep(3000);
		addButtonWell.click();
	}

	public void cancelButtonwell() {
		cancelButtonwell.click();

	}

	public void saveButton() {
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		
		js.executeScript("document.querySelector(\".addButton\").click()");

	}

	public String verifyValidationMessageWellName() throws InterruptedException {

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

		if (validationMessgaeIPAddress == null) {
			return "";
		}
		String message = validationMessgaeIPAddress.getText();

		return message.trim();

	}
	
	public String verifyValidationMessageIPAddress1() throws InterruptedException {

		if (validationMessgaeIPAddress1 == null) {
			return "";
		}
		String message = validationMessgaeIPAddress1.getText();

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

	public void wellnameinputAdd(String value) {
		wellnameinputAdd.sendKeys(Keys.ENTER);
		wellnameinputAdd.sendKeys(value);
	}

	public void portnumberinputAdd(String value) {
		portNumberinputAdd.sendKeys(Keys.ENTER);
		portNumberinputAdd.sendKeys(value);
	}

	public void RTUAddressinputAdd(String value) {
		RTUAddressinputAdd.sendKeys(Keys.ENTER);
		RTUAddressinputAdd.sendKeys(value);
	}

	public void passwordinputAdd(String value) {
		passwordinputAdd.sendKeys(Keys.ENTER);
		passwordinputAdd.sendKeys(value);
	}

	public void IPAddressinputAdd(String value) {
		IPAddressinputAdd.sendKeys(Keys.ENTER);
		IPAddressinputAdd.sendKeys(value);
	}

	public void deviceTypeDropdownAdd(String value) throws InterruptedException {

		SelectMatOption(deviceTypeAdd, value);
	}
	
	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox,sliderOnCheckBoxLabel,m);
	}

	public String get_Text_ToolTipActiveUser() {

		mouseHover(sliderRound);

		String activeUserToolTipText = sliderRound.getText();

		activeUserToolTipText.trim();

		return activeUserToolTipText;
	}
}
