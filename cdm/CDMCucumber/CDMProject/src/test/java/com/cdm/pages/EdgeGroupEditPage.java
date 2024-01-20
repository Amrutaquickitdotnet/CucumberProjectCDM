package com.cdm.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupEditPage extends CommonActions {
	public EdgeGroupEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddressInput;

	// serverport

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverPortInput;
	@FindBy(css = "mat-select[formcontrolname='appgroupid'] span")
	WebElement applicationGroupName;
	
	@FindBy(xpath = "//app-edgegrouplicenseupload/div[2]/button[2]")
	WebElement saveButtonUploadforLicense;
	
	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}
	
	public void applicationGroupName(String value) throws InterruptedException {
		SelectMatOption(applicationGroupName, value);
	}
	public void serverHostAddress(String value) {

		serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {

		serverPortInput.sendKeys(value);
	}
	
	public void saveButtonUploadforLicense() {
		
		saveButtonUploadforLicense.click();
	}
}
