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

public class HardwareAddPage extends CommonActions {

	public HardwareAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[8]/img[2]")
	WebElement hardwareDelete;

	@FindBy(xpath = "//ul[@class='nav']/li[6]")
	WebElement hardware_tab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwarethreedot;
	
	@FindBy(xpath = "//button[@class='addButton']")
	WebElement hardwareSavebutton;
	
	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardwarenamesearch;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img")
	WebElement hardwareAddPlusicon;

	@FindBy(xpath = "//input[@formcontrolname='hardwarename']")
	WebElement hardwareName;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement hardwareDisplayName;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement hardwareDescription;

	@FindBy(xpath = "//input[@formcontrolname='model']")
	WebElement hardwareModel;

	@FindBy(xpath = "//input[@formcontrolname='os']")
	WebElement hardwareOS;

	@FindBy(xpath = "//input[@formcontrolname='make']")
	WebElement hardwareMake;

	@FindBy(xpath = "//input[@formcontrolname='processor']")
	WebElement hardwareProcessor;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	public void hardwareAddPlusicon() {
		hardwareAddPlusicon.click();

	}

	public void hardwareName(String value) {
		hardwareName.sendKeys(Keys.ENTER);
		hardwareName.sendKeys(value);
	}

	public void hardwareDisplayName(String value) {
		hardwareDisplayName.sendKeys(Keys.ENTER);
		hardwareDisplayName.sendKeys(value);
	}

	public void hardwareDescription(String value) {
		hardwareDescription.sendKeys(Keys.ENTER);
		hardwareDescription.sendKeys(value);
	}

	public void hardwareModel(String value) {
		hardwareModel.sendKeys(Keys.ENTER);
		hardwareModel.sendKeys(value);
	}

	public void hardwareOS(String value) {
		hardwareOS.sendKeys(Keys.ENTER);
		hardwareOS.sendKeys(value);
	}

	public void hardwareMake(String value) {
		hardwareMake.sendKeys(Keys.ENTER);
		hardwareMake.sendKeys(value);
	}

	public void hardwareProcessor(String value) {
		hardwareProcessor.sendKeys(Keys.ENTER);
		hardwareProcessor.sendKeys(value);
	}
	
	public void hardwareNameSearch(String value) {
		hardwarenamesearch.sendKeys(Keys.ENTER);
		hardwarenamesearch.sendKeys(value);
	}

	public void hardware_tab() throws InterruptedException {
		Thread.sleep(3000);
		hardware_tab.click();
	}
	
	public void hardwarethreedot() {
		hardwarethreedot.click();
	}
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void hardwareSavebutton() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
		Thread.sleep(6000);
	}
	
	
	

	public void hardwareDelete() {
		hardwareDelete.click();
	}
	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

       // Perform a click action on the confirmation Yes button
       confirmationYesButton.click();
		
	}
}
