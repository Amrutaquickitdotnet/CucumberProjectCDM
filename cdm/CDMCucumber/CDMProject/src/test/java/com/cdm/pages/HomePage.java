package com.cdm.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class HomePage extends CommonActions {
	

	
	public HomePage(WebDriver driver,ExtentTest logger)
	{
		super(driver,logger);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
