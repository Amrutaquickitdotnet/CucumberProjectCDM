package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeploymentsPage extends CommonActions{

	public DeploymentsPage(WebDriver driver,ExtentTest logger) //created WebDriver Constructor
	{
		super(driver, logger);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	private WebDriver driver;
	@FindBy(xpath= "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[4]/a/span")
	WebElement Deployment_tab;

	@FindBy(xpath="//img[@class='mat-tooltip-trigger ml-1 ng-star-inserted']")
	WebElement view_eye_btn;
	
	@FindBy(xpath="//h3[@class='titleHeading']")
	WebElement Deploy_heading;
	
	@FindBy(xpath = "//img[@class='mat-tooltip-trigger ng-star-inserted']")
	WebElement refresh_btn;
	
	@FindBy(className = "mat-tooltip-trigger")
	WebElement i_mark;
	//Need to attach number of rows in table using WebElements
	
	public void verifyTitle() {
		ElementExist(Deploy_heading, getScreenshot());
	}
	
	public void verifyimark() {
		ElementExist(i_mark, getScreenshot());
	}
	public void Deploymenttab() {
		
	  Deployment_tab.click();
	}
	
	public void refresbtn() {
		refresh_btn.click();
	}
	
	
}
