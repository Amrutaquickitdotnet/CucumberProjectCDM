package com.cdm.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EnvironmentalVariablePage extends CommonActions {

	public EnvironmentalVariablePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//h4/span")
	WebElement headingTitle;

	@FindBy(xpath = "//button[@class='mat-focus-indicator btnNext mat-button mat-button-base mat-primary']")
	WebElement confirmationYesButton;

	@FindBy(xpath = "//input[@name='configname']")
	WebElement confignameInput;

	@FindBy(xpath = "//input[@name='configvalue']")
	WebElement configValueInput;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement configNameSearch;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement configValueSearch;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/app-config[1]/div[1]/div[1]/div[2]/span[1]/img[2]")
	WebElement bulkUpload;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/app-config[1]/div[1]/div[1]/div[2]/span[1]/img[3]")
	WebElement bulkDownload;

	@FindBy(xpath = "//button[@class='mat-focus-indicator btnCancel mat-button mat-button-base']")
	WebElement confirmationCancelButton;

	@FindBy(xpath = "//a[contains(text(),'Environment variable')]")
	WebElement environmentalVariableTab;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[1]")
	WebElement EditButton;

	@FindBy(xpath = "//tbody/tr[2]/td[4]/img[2]")
	WebElement deleteButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/app-config[1]/div[1]/div[1]/div[2]/span[1]/img[1]")
	WebElement environmentalVariableAddButton;

	@FindBy(xpath = "//input[@formcontrolname = 'configvalue']")
	WebElement ConfigValue;

	@FindBy(xpath = "//input[@formcontrolname = 'configname']")
	WebElement ConfigName;

	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//input[@formcontrolname = 'Inactive')]")
	WebElement sliderOff;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']")
	WebElement chooseFile;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-config-csv-file[1]/div[2]/button[2]")
	WebElement uploadconfigbutton;

	@FindBy(xpath = "//input[@name='myfile']")
	WebElement uploadedFile;

	public void saveDataConfig() {

		saveButton.click();
	}

	public void uploadConfig(String value) throws IOException {

		chooseFile.sendKeys(value);

	}

	public void clickOnUploadButton() {

		uploadconfigbutton.click();
	}

	public void moveSlideroffCondition() {
		Actions actions = new Actions(driver);
		actions.moveToElement(sliderOff).dragAndDropBy(sliderOff, 150, 0).build().perform();
	}

	public void environmentalVariableTab() {
		environmentalVariableTab.click();
	}

	public void moveSliderCondition(String m) {
		boolean isSelected = sliderOnCheckBox.isSelected();
		if (m == "checked") {
			if (!isSelected) {
				sliderOnCheckBoxLabel.click();
			}
		} else {
			if (isSelected) {
				sliderOnCheckBoxLabel.click();
			}
		}

	}

	public void environmentalVariableAddButton() {
		environmentalVariableAddButton.click();
	}

	public void environmentalConfigName(String value) {
		ConfigName.sendKeys(value);
	}

	public void environmentalConfigValue(String value) {
		ConfigValue.sendKeys(value);
	}

	public void clickEditButton() {

		scrollingElementRightBar("div.example-container", "900");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditButton.click();
	}

	public void deleteButtonClick() {

		deleteButton.click();
	}

	public void confirmationYesDeleteButton() {

		confirmationYesButton.click();
	}

	public void confirmationCancelDeleteButton() {

		confirmationCancelButton.click();
	}

	public void clickEditevButton() {

		EditButton.click();
	}

	public void clickInputField() {

		ConfigName.clear();
	}

	public void clickInputFieldconfigValue() {

		ConfigValue.clear();
	}

	public void bulkUploadButton() {

		bulkUpload.click();
	}

	public void bulkDownloadButton() {

		bulkDownload.click();
	}

	public void configNameSearch() {
		clickElement(configNameSearch,"configNameSearch on page");
		//configNameSearch.click();
	}

	public void configValue() {
		clickElement(configValueSearch,"configValue");
	}

	public void configNameInput(String value) {
		confignameInput.sendKeys(value);
	}

	public void configValueInput(String value) {
		configValueInput.sendKeys(value);
	}

	public void headingClick() {

		headingTitle.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

}
