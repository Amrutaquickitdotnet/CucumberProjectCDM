package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupConfiguration extends CommonActions {

	public EdgeGroupConfiguration(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".tableCard h4")
	WebElement deployListpageVerification;
	
	public String verifyDeployBreadcrumb() {
		String breadcrumb = deployListpageVerification.getText();
        return breadcrumb;
		
	}

}
