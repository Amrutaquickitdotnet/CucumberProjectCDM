package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDevicesPage extends CommonActions{

	public EdgeDevicesPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, logger);
	}

	private WebDriver driver;
	
	
	@FindBy(xpath="//h2[@class='titleHeading']")
	WebElement WebDevices_heading;
	
	//ScrollIntoView
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-device/div/div[2]/div/table/thead/tr/th[6]/div/span/div/div[1]")
    WebElement Status_Heading;
	
	
	@FindBy(xpath="//td[@class='mat-cell cdk-cell table-data cdk-column-devicename mat-column-devicename ng-star-inserted']")
	WebElement Number_of_devices;
	
	
	@FindBy(xpath="//img[@class='mat-tooltip-trigger']")
	WebElement Collapse_btn;
	
	
	
}