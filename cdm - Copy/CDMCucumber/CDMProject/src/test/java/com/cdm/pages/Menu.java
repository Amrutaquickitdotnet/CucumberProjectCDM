package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class Menu extends CommonActions {

private WebDriver driver;
	
	public Menu(WebDriver driver,ExtentTest logger) //created WebDriver Constructor
	{
		super(driver,logger);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	
	@FindBy(xpath="//app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[3]/a/span")  //these all are locators
	WebElement edgeDevices;
	
	public void clickEdgeDevices()
	{
		clickElement(edgeDevices,"CLicked On Edge Device");
	}

}
