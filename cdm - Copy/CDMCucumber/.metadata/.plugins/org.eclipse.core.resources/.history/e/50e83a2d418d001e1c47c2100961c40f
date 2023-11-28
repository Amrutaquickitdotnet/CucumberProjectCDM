package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LicensePage extends CommonActions{

	private WebDriver driver;
	
	public LicensePage(WebDriver driver,ExtentTest logger) //created WebDriver Constructor
	{
		super(driver,logger);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "titleHeading ng-star-inserted")
	WebElement Title_License;
	
	@FindBy(className = "mat-tooltip-trigger ml-1 ng-star-inserted")
	WebElement License_Tracker_btn;
	
	@FindBy(className = "mat-tooltip-trigger ng-star-inserted")
	WebElement Buld_dwnd_btn;
	
	// can use FindAll
	@FindBy(className = "isActive ng-star-inserted") //Need to check for the WebElements
	WebElement Active_status_count;
	
	@FindBy(className = "mat-sort-header-content ng-tns-c71-957")
	WebElement check_status_col;
	
	
	public void movetoLicensetab() {
		clickElement(Title_License, getScreenshot());
	}
	
	public void check_downloadBtn() {
		ElementExist(Buld_dwnd_btn, getScreenshot());
	}
}
