package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class WellMapping extends CommonActions {
	
	 
	public WellMapping(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxforWellLabel;
	
	
	
	@FindBy(xpath = "//span[@class='titleHeadingsub']")
	WebElement headingTitle;
	
	
	@FindBy(xpath = "//input[@name='wellname']")
	WebElement wellMappingSearchInput;
	
	//*[@id="nav-user-tab"]
	@FindBy(xpath = "(//*[@id='nav-user-tab'])[5]")
	WebElement wellMappingIcon;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement wellMappingSearchDot;

	
	//@FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]/span[1]")
	@FindBy(xpath ="//*[@id='mat-checkbox-4']/label")
	WebElement selectedCheckbox;
	
	@FindBy(css ="app-well-link-edge-device .text-right .mat-button-wrapper")
	WebElement saveWellData;
	
	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckboxforWell;
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	public void wellmappingClick() {
		
		wellMappingIcon.click();
	}
	
	public void wellMappingSearchDot() {
		wellMappingSearchDot.click();
	}
	
	public void  headingClick() {
		headingTitle.click();
		
	}
	public void wellMappingSearchInput(String value) {
		wellMappingSearchInput.sendKeys(value);
		wellMappingSearchInput.sendKeys(Keys.ENTER);
	}
	
	public void backDropShowing_Div_Click() {
		if(backDropShowing!=null) {
			backDropShowing.click();
		}
	}
	

	
public void selectedCheckboxforWell()
{
	try {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxforWellLabel));

		if (selectedCheckboxforWell != null) {
			String checked = selectedCheckboxforWell.getDomAttribute("checked");
			if (checked != "checked") {
				selectedCheckboxforWellLabel.click();
			}
		}
	} catch (Exception e) {
		
	}
	

	
}
public void saveWellData() {
	saveWellData.click();
}
}


	
	
	
		
	
