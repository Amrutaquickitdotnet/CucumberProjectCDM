package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

public class AppsPage extends CommonActions {

	public AppsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//app-applist[1]/div[1]/div[1]/img[1]")
	WebElement refreshlist;


	@FindBy(xpath = "//ul[@class='nav']/li[9]")
	WebElement App_tab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;
	
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement appNameToolTip;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement appDisplayNameToolTip;
	
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryLinkToolTip;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement licesnseTypeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement configMasterToolTip;
	
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement versionToolTip;
	
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement architectureToolTip;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement rootVolumeToolTip;
	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement applicationthreedot;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement architecturethreedot;
	
	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement versionThreeDot;
	
	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement stausThreeDot;
	
	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[5]/span[1]/img[1]")
	WebElement inActiveIcon;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement viewVolumeDetails;
	

	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/img[2]")
	WebElement editButtonConfig;

	

	@FindBy(xpath = "//input[@name='tag']")
	WebElement versionTag;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement applicationName;

	@FindBy(xpath = "//input[@name='architecture']")
	WebElement architecture;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	

	public void applicationName(String value) {
		applicationName.sendKeys(Keys.ENTER);
		applicationName.sendKeys(value);
	}

	public void architecture(String value) {
		architecture.sendKeys(Keys.ENTER);
		architecture.sendKeys(value);
	}

	public void versionTag(String value) {
		versionTag.sendKeys(Keys.ENTER);
		versionTag.sendKeys(value);
	}

	

	public void Apps_tab() throws InterruptedException {
		Thread.sleep(3000);
		App_tab.click();
	}
	
	public void applicationthreedot() {
		applicationthreedot.click();
	}
	public void architecturethreedot() {
		architecturethreedot.click();
	}
	public void versionThreeDot() {
		versionThreeDot.click();
	}
	
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}



	public void inactivecrossbar() {
		inActiveIcon.click();
	}
	
	public void viewVolumeDetails() {
		viewVolumeDetails.click();
	}
	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));
		WebElement confirmationNoButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'No')]")));
       // Perform a click action on the confirmation Yes button
      // confirmationYesButton.click();
       confirmationNoButton.click();
		
	}
	
	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}
	public void refreshlist() {
		refreshlist.click();
	}

	public String get_Text_ToolTipStatus() {
		mouseHover(stausThreeDot);

		String statusText = statusToolTip.getText();

		statusText.trim();

		return statusText;
	}
	
	public void editButtonConfig() {
		editButtonConfig.click();
	}

	
	
}
