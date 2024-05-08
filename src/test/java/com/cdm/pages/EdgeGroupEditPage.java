package com.cdm.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupEditPage extends CommonActions {
	public EdgeGroupEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='addButton')]")
	WebElement saveButtononEdgeEditPage;
	
	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddressInput;

	// serverport

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverPortInput;
	@FindBy(css = "mat-select[formcontrolname='appgroupid'] span")
	WebElement applicationGroupName;
	
	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edge-onboarding-upload[1]/div[3]/button[2]")
	WebElement saveButtonfinalonboarding;
	
	
	@FindBy(xpath = "//input[@type='file']")
	WebElement onboardingCertificateUpload;
	
	
	@FindBy(xpath = "//input[@type='file']")
	WebElement EdgeConfigurationUpload;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement onboardingCertificateIcon;
	
	public void onboardingCertificateIcon() {
		onboardingCertificateIcon.click();
	}
	
	
	public void onboardingCertificateUpload(String value) {
		
		onboardingCertificateUpload.sendKeys(Keys.ENTER);
		onboardingCertificateUpload.sendKeys(value);
	}
	
	
public void EdgeConfigurationUpload(String value) {
		
	EdgeConfigurationUpload.sendKeys(Keys.ENTER);
	EdgeConfigurationUpload.sendKeys(value);
	}
	
	public void uploadfile() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

	
		js.executeScript("arguments[0].click();",onboardingCertificateUpload);
	}
	
	public void scrollingverticalAdd() {

		scrollingvertical("div.pagefooter", "0", "500");
	}
	
	public void applicationGroupName(String value) throws InterruptedException {
		SelectMatOption(applicationGroupName, value);
	}
	public void serverHostAddress(String value) {

		serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {

		serverPortInput.sendKeys(value);
	}
	
	public void saveButtononEdgeEdit() {
		saveButtononEdgeEditPage.click();
	}
	

	public void saveButtonfinalonboarding() throws InterruptedException {
		
		
		
		saveButtonfinalonboarding.click();
		Thread.sleep(3000);
		
	}
}
