package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

import io.cucumber.java.en.Then;

public class VolumesAddPage extends CommonActions {

	public VolumesAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-select[@formcontrolname='type']")
	WebElement volumeRepositoryType;

	@FindBy(xpath = "//mat-select[@formcontrolname='repositoryid']")
	WebElement volumeRepositoryName;

	@FindBy(xpath = "//input[@formcontrolname ='licensetype']")
	WebElement volumeLicenseTypeAdd;

	@FindBy(xpath = "//ul[@class='nav']/li[7]")
	WebElement volume_tab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement VolumeNameThreeDot;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement VolumeNameSavebutton;

	@FindBy(xpath = "//input[@formcontrolname='volumename']")
	WebElement volumeNameAdd;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/div/span/img")
	WebElement volumeAddPlusicon;

	@FindBy(xpath = "//input[@formcontrolname='repositoryid']")
	WebElement volumeRepositoryNameAdd;

	@FindBy(xpath = "//input[@name='type']")
	WebElement volumeTypeAdd;

	@FindBy(xpath = "//input[@formcontrolname='repositorylink']")
	WebElement volumerepositorylinkAdd;

	@FindBy(xpath = "//input[@formcontrolname='licensetype']")
	WebElement licensetypeAdd;

	@FindBy(xpath = "//input[@formcontrolname='tag']")
	WebElement volumetagAdd;
	
	@FindBy(xpath = "//input[@formcontrolname='shakey']")
	WebElement volumeSHAKeyAdd;

	@FindBy(xpath = "//input[@formcontrolname='mountdirectory']")
	WebElement volumemountdirectoryAdd;

	@FindBy(xpath = "//input[@formcontrolname='architecture']")
	WebElement volumearchitectureAdd;

	@FindBy(xpath = "//input[@formcontrolname='maxsize']")
	WebElement volumemaxsizeAdd;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	public void volumeAddPlusicon() {
		volumeAddPlusicon.click();

	}

	public void volumeName(String value) {
		volumeNameAdd.sendKeys(Keys.ENTER);
		volumeNameAdd.sendKeys(value);
	}

	public void volumerepositorylinkAdd(String value) {
		volumerepositorylinkAdd.sendKeys(Keys.ENTER);
		volumerepositorylinkAdd.sendKeys(value);
	}

	public void licensetypeAdd(String value) {
		licensetypeAdd.sendKeys(Keys.ENTER);
		licensetypeAdd.sendKeys(value);
	}

	public void volumeLicenseTypeAdd(String value) {
		volumeLicenseTypeAdd.sendKeys(Keys.ENTER);
		volumeLicenseTypeAdd.sendKeys(value);
	}

	public void volumeRepositoryNameAdd(String value) throws InterruptedException {

		SelectMatOption(volumeRepositoryName, value);
	}

	public void volumeRepositoryTypeAdd(String value) throws InterruptedException {

		SelectMatOption(volumeRepositoryType, value);
	}

	public void volumemountdirectoryAdd(String value) {
		volumemountdirectoryAdd.sendKeys(Keys.ENTER);
		volumemountdirectoryAdd.sendKeys(value);
	}

	public void volumeSHAKeyAdd(String value) {
		volumeSHAKeyAdd.sendKeys(Keys.ENTER);
		volumeSHAKeyAdd.sendKeys(value);
	}

	public void volumetagAdd(String value) {
		volumetagAdd.sendKeys(Keys.ENTER);
		volumetagAdd.sendKeys(value);
	}

	public void volumearchitectureAdd(String value) {
		volumearchitectureAdd.sendKeys(Keys.ENTER);
		volumearchitectureAdd.sendKeys(value);
	}

	public void volumemaxsizeAdd(String value) {
		volumemaxsizeAdd.sendKeys(Keys.ENTER);
		volumemaxsizeAdd.sendKeys(value);
	}

	public void volume_tab() throws InterruptedException {
		Thread.sleep(3000);
		volume_tab.click();
	}

	public void VolumeNameThreeDot() {
		VolumeNameThreeDot.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void volumeSavebutton() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click()");
		Thread.sleep(6000);
	}

}
