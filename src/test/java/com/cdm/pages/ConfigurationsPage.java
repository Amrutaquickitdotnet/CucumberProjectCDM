package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class ConfigurationsPage extends CommonActions {

	 
	public ConfigurationsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@id='nav-user-tab'])[4]")
	WebElement configTabmain;
	

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement row_present;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement responseBodyIcon;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/img[1]")
	WebElement downLoadFormat;

	@FindBy(className = "titleHeading")
	WebElement Deploy_Heading;

	@FindBy(className = "mat-tooltip-trigger")
	WebElement view_response;

	@FindBy(className = "mat-tooltip-trigger")
	WebElement download_btn;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[5]/a/span")
	WebElement config_tab;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-config-deploy-history[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refreshBtn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-config-deploy-history[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement currentView;

	public void movetoconfiguration() {
		clickElement(config_tab, "confige moved on");
	}

	public void check_dwnldbt() {
		ElementExist(download_btn, getScreenshot());
	}

	public void responseBodyIcon() {

		responseBodyIcon.click();
	}

	public void downLoadButtonClick() {

		download_btn.click();
	}

	public void refreshbutton() {
		refreshBtn.click();

	}
	
	public void configTabmain() {
		configTabmain.click();
	}
}
