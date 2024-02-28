package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
}

