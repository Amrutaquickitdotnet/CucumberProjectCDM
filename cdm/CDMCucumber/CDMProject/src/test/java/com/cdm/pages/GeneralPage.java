package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class GeneralPage extends CommonActions {

	public GeneralPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = "//a[@id='nav-application-tab']")
	WebElement generalTabClick;
	


	public void generalTab() {
		clickElement(generalTabClick, "");
	//generalTabClick.click();
		
	}
}
