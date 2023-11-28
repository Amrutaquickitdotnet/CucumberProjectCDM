package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDeviceAdd extends CommonActions {

	public EdgeDeviceAdd(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;
	
	public String verifyDeviceAddBreadcrumb() {
		String breadcrumb = AddListpageVerification.getText();
        return breadcrumb;
		
	}

}
