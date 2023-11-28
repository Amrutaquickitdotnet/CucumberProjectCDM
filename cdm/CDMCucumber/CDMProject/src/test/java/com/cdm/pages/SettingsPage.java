package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class SettingsPage extends CommonActions{

	public SettingsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver =driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[9]/a/span")
	WebElement Setting_tab;
	
	@FindBy(tagName = "nav-application-tab") //webEleemnts
	WebElement General_tab;
	
	@FindBy(className = "mat-content ng-tns-c138-1239")
	WebElement UserSetting_Title;
	
	@FindBy(id = "mat-form-field-flex ng-tns-c144-1287")
	WebElement Setting_dropdown;
	//dropdown for thedefault value // default
	
	@FindBy(className = "addButton")
	WebElement Save_btn;
	
	@FindBy(className = "mat-button-wrapper")
	WebElement Cancel_btn;

	
	public void movetotab_Setting() {
		clickElement(Setting_tab, getScreenshot());
	}
	
	public void check_general() {
		ElementExist(General_tab, getScreenshot());
	}
}
