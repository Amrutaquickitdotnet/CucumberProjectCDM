package com.cdm.pages;

import java.time.Duration;

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
	



@FindBy(xpath = "(//input[@name='options'])[1]")
WebElement StatusActiveCheck;
	
	
@FindBy(xpath = "(//input[@name='options'])[2]")
WebElement StatusInActiveCheck;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckboxWell;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxLabelforWell;

	@FindBy(xpath = "//div[contains(text(),'Well Name')]/../../..//mat-icon")

	WebElement wellnameThreeDot;

	@FindBy(xpath = "//div[contains(text(),'IP Address')]/../../..//mat-icon")

	WebElement IPAddressThreeDot;

	@FindBy(xpath = "//div[contains(text(),'Device Type')]/../../..//mat-icon")

	WebElement deviceTypeThreeDot;

	@FindBy(xpath = "//div[contains(text(),'RTU Address')]/../../..//mat-icon")

	WebElement RTUAddressThreeDot;

	@FindBy(xpath = "//div[contains(text(),'Status')]/../../..//mat-icon")

	WebElement StatusThreeDot;

	@FindBy(xpath = "//ul[@class='nav']/li[6]")

	WebElement wellmappingtab;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxforWellLabel;

	@FindBy(xpath = "//span[@class='titleHeadingsub']")
	WebElement headingTitle;

	@FindBy(xpath = "//input[@name='ipaddress']")
	WebElement IPAddressInputSearch;
	
	
	@FindBy(xpath = "//input[@name='devicetype']")
	WebElement deviceTypeSearchInput;
	
	
	@FindBy(xpath = "//input[@name='wellname']")
	WebElement wellMappingSearchInput;
	
	
	@FindBy(xpath = "//input[@name='rtunumber']")
	WebElement RTUAddressSearchInput;
	
	
	
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-well-link-edge-device[1]/div[1]/div[4]/button[1]")
	WebElement saveButton;
	// *[@id="nav-user-tab"]
	@FindBy(xpath = "(//*[@id='nav-user-tab'])[5]")
	WebElement wellMappingIcon;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement wellMappingSearchDot;

	// @FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]/span[1]")
	@FindBy(xpath = "//*[@id='mat-checkbox-4']/label")
	WebElement selectedCheckbox;

	@FindBy(css = "app-well-link-edge-device .text-right .mat-button-wrapper")
	WebElement saveWellData;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckboxforWell;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	public void wellnameThreeDot() {

		wellnameThreeDot.click();
	}

	public void IPAddressThreeDot() {
		IPAddressThreeDot.click();

	}

	
	
	
	public void RTUAddressSearchInput(String value) {
		RTUAddressSearchInput.sendKeys(Keys.ENTER);
		RTUAddressSearchInput.sendKeys(value);
		

	}

	public void deviceTypeThreeDot() {
		deviceTypeThreeDot.click();

	}

	public void RTUAddressThreeDot() {
		RTUAddressThreeDot.click();

	}

	public void StatusThreeDot() {
		StatusThreeDot.click();

	}

	public void wellmappingClick() {

		wellMappingIcon.click();
	}

	public void wellMappingSearchDot() {
		wellMappingSearchDot.click();
	}

	public void headingClick() {
		headingTitle.click();

	}

	public void wellMappingSearchInput(String value) {
		wellMappingSearchInput.sendKeys(value);
		wellMappingSearchInput.sendKeys(Keys.ENTER);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void selectedCheckboxforWell() {
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

	public void wellmappingtab() {
		wellmappingtab.click();
	}
	
	public void IPAddressInputSearch(String value) 
	{
		
		IPAddressInputSearch.sendKeys(Keys.ENTER);
		IPAddressInputSearch.sendKeys(value);
	}
	
	
	public void deviceTypeSearchInput(String value) throws InterruptedException 
	{
		
		deviceTypeSearchInput.sendKeys(Keys.ENTER);
		deviceTypeSearchInput.sendKeys(value);
		deviceTypeSearchInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public void saveData() {
		saveButton.click();
	}
	
	public void StatusActiveCheck() {
		StatusActiveCheck.click();
	}
	
	
	
	public void StatusInActiveCheck() {
		StatusInActiveCheck.click();
	}
	public void checkboxWell() {

		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxforWellLabel));
                   Thread.sleep(4000);
			if (selectedCheckboxforWell != null) {
				String checked = selectedCheckboxforWell.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxforWellLabel.click();

				}
			}
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		
	}

}
