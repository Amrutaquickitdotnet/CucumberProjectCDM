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

public class CertificatesPage extends CommonActions {

	public CertificatesPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-select[@role='combobox']")
	WebElement dropdownmain;
	
	@FindBy(xpath="//span[contains(text(),\" Please enter a valid Server Host IP Address!\")]")
	WebElement validationmessageIP;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement downloadButton;

	@FindBy(xpath = "//input[@formcontrolname='ip']")
	WebElement IPInput;

	@FindBy(xpath = "//input[@formcontrolname='cn']")
	WebElement certificateName;

	@FindBy(xpath = "//input[@formcontrolname='org']")
	WebElement OrganizationField;

	@FindBy(xpath = "//input[@formcontrolname='duration']")
	WebElement duration;

	@FindBy(xpath = "//input[@formcontrolname='group']")
	WebElement GroupInput;

	@FindBy(xpath = "//input[@formcontrolname='duration']")
	WebElement validityDay;

	@FindBy(xpath = "//a[contains(text(),'Certificates')]")
	WebElement certificateTab;

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void certificateTabClick() {
		certificateTab.click();
	}

	public void certificateType(String value) throws InterruptedException {

		SelectMatOption(dropdownmain, value);
	}

	public void IPinput(String value) {
		
		SetInputENterKey(IPInput,"");
		SetInput(IPInput, value, value);


	}

	public void groupInput(String value) {
		
		SetInputENterKey(GroupInput,"");
		SetInput(GroupInput, value, value);

		
//		GroupInput.sendKeys(Keys.ENTER);
//		GroupInput.sendKeys(value);
	}

	public void validitydaysinput(String value) {
		SetInputENterKey(validityDay,"");
		SetInput(validityDay, value, value);
//
//		
//		validityDay.sendKeys(Keys.ENTER);
//		validityDay.sendKeys(value);
	}

	public void downloadButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
		Thread.sleep(5000);
	}

	public void certificateName(String value) {
		SetInputENterKey(certificateName,"");
		SetInput(certificateName, value, value);
//		
//		certificateName.sendKeys(Keys.ENTER);
//		certificateName.sendKeys(value);
	}

	public void OrganizationField(String value) {
		
		SetInputENterKey(OrganizationField,"");
		SetInput(OrganizationField, value, value);
		
//		OrganizationField.sendKeys(Keys.ENTER);
//		OrganizationField.sendKeys(value);
	}

	public void validitydaysinputOnboarding(String value) {
		
		SetInputENterKey(validityDay,"");
		SetInput(validityDay, value, value);
		
//		validityDay.sendKeys(Keys.ENTER);
//		validityDay.sendKeys(value);
	}

	
	public String validationmessageIP() {
		
		if (validationmessageIP == null) {
			return "";
		}
		String message = validationmessageIP.getText();

		return message.trim();
	}
}
