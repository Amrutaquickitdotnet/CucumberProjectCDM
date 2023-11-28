package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class ConfigurationsPage extends CommonActions{

	private WebDriver driver;
	
	public ConfigurationsPage(WebDriver driver, ExtentTest logger) {
		
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement row_present;
	
	
	@FindBy(className = "titleHeading")
	WebElement Deploy_Heading;
	
	@FindBy(className = "mat-tooltip-trigger fa fa-file-text")
	WebElement view_response;
	
	@FindBy(className = "mat-tooltip-trigger ml-1")
	WebElement download_btn;
	
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[5]/a/span")
    WebElement config_tab;

	public void movetoconfiguration() {
		clickElement(config_tab, "confige moved on");
	}
	
	public void check_dwnldbt() {
		ElementExist(download_btn, getScreenshot());
	}

}
