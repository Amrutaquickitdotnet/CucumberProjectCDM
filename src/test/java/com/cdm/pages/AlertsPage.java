package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AlertsPage extends CommonActions{

	public AlertsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[7]/a/span")
	WebElement movetoalerttab;
	
	@FindBy(className = "titleHeading")
	WebElement Alert_Heading;
	
	@FindBy(className = "noData ng-star-inserted")
	WebElement check_no_data_found;
	
	public void openalerttab() {
		clickElement(movetoalerttab, "we are in alerts tab");
	}
	
	public void Check_alert_heading() {
		ElementExist(Alert_Heading, getScreenshot());
	}
	
	public void checkfordata() {
		ElementExist(check_no_data_found, getScreenshot());
	}
	
	
}
