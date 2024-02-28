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

public class WellsPage extends CommonActions {

	public WellsPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[1]")
	WebElement wellEditButton;
	
	
	@FindBy(xpath = "//input[@name='options']")
	WebElement activeStatusCheck;
	

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonwell;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonWell;

	@FindBy(xpath = "//input[@name='wellname']")
	WebElement inputWellName;

	@FindBy(xpath = "//h2[contains(text(),'EDGE Devices')]")
	WebElement headingTitle;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[1]")
	WebElement refreshButton;

	@FindBy(xpath = "//input[@name='ipaddress']")
	WebElement inputIPAddress;

	@FindBy(xpath = "//input[@name='devicetype']")
	WebElement inputdeviceType;

	@FindBy(xpath = "(//input[@name='options'])[2]")
	WebElement inputStatusInActive;

	@FindBy(xpath = "//input[@name='rtunumber']")
	WebElement inputRTUAddress;

	@FindBy(xpath = "//app-well-user[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement downloadButtonWell;

	@FindBy(xpath = "//a[contains(text(),'Wells')]")
	WebElement WellTab;

	@FindBy(xpath = "(//input[@formcontrolname='wellname']/../../../../div)")
	WebElement validationMessgaeWellName;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img[1]")
	WebElement addButtonWell;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement wellNameThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement IPAddressThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceTypeThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RTUAddressThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void wellNameThreeDot() {
		wellNameThreeDot.click();
	}

	public void deviceTypeThreeDot() {
		deviceTypeThreeDot.click();
	}

	public void RTUAddressThreeDot() {
		RTUAddressThreeDot.click();
	}

	public void statusThreeDot() {
		statusThreeDot.click();
	}

	public void ipAddressThreeDot() {
		IPAddressThreeDot.click();
	}

	public void wellTab() {
		WellTab.click();
	}

	public void serachWellName(String value) {
		inputWellName.sendKeys(Keys.ENTER);
		inputWellName.sendKeys(value);

	}

	public void headingClick() {
		// clickElement(headingTitle, "Clicking on Title of heading");
		headingTitle.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void serachipAddress(String value) {
		inputIPAddress.sendKeys(Keys.ENTER);
		inputIPAddress.sendKeys(value);

	}

	public void serachDeviceType(String value) {
		inputdeviceType.sendKeys(Keys.ENTER);
		inputdeviceType.sendKeys(value);

	}

	public void searchRTUAddress(String value) {
		inputRTUAddress.sendKeys(Keys.ENTER);
		inputRTUAddress.sendKeys(value);

	}

	public void clickrefreshbutton() {
		refreshButton.click();
	}

	public void inputStatusInActive() {
		inputStatusInActive.click();
	}

	public void addbutton() throws InterruptedException {
		Thread.sleep(3000);
		addButtonWell.click();
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

	public void downloadButtonWell() {

		downloadButtonWell.click();
	}
	
	public void wellEditButton() {
		wellEditButton.click();
	}
	
	public void activeStatusCheck() throws InterruptedException {
		Thread.sleep(4000);
			activeStatusCheck.click();
		
		
	}
}
