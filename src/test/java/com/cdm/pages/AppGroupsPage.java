package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppGroupsPage extends CommonActions{

	public AppGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
	
	@FindBy(className = "full-width ng-star-inserted full-active")
	WebElement AppGrp_tab_btn;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-appgroup/div/div[1]/h2")
	WebElement check_alert_title;
	
	@FindBy(className = "isActive ng-star-inserted")
	WebElement Active_state_check;
	
	public void movetoAppGroup() {
		clickElement(AppGrp_tab_btn, getScreenshot());
	}
	
	public void checktitle(String exp) {
		verifyTitle(exp);
	}
	
	public void checkactivebtn() {
		ElementExist(Active_state_check, getScreenshot());
	}
}
