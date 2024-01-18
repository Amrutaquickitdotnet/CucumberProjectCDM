package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeploymentsmodulePage extends CommonActions {

	public DeploymentsmodulePage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refresh_Button;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement bulkDownloadButton;
	
	@FindBy(xpath = "//span[contains(text(),'Deployments')]")
	WebElement deployment_tab;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement currentViewButton;
	
	
	
	
	public void refresh_Button() {
		refresh_Button.click();
	}
	
	public void bulkDownloadButton() {
		bulkDownloadButton.click();
	}
	
	public void currentView() {
		currentViewButton.click();
	}
	
	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}
	
	public void deploymenttabclick() {
		deployment_tab.click();
	}
	
}
