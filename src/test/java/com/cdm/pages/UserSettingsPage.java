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

public class UserSettingsPage extends CommonActions {

	public UserSettingsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}




	@FindBy(xpath = "//table/tbody/tr[1]/td[6]/img[1]")
	WebElement edituserbutton;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement FirstNameDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement LastNameDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement EmailDot;

	@FindBy(xpath = "//div[@class='tableCard']/../div/div[1]/div/span/img[1]")
	WebElement addButton;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RoleNameDot;

	@FindBy(xpath = "//input[@data-placeholder='password']")
	WebElement password;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement StatusDot;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//input[@data-placeholder='First Name']")
	WebElement firstNameinputAdd;

	@FindBy(xpath = "//input[@formcontrolnameame='lastname']")
	WebElement lastNameinput;

	@FindBy(xpath = "//input[@formcontrolname='emailid']")
	WebElement emailidinput;

	@FindBy(xpath = "//input[@name='rolename']")
	WebElement roleNameinput;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement statusinputinActive;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement statusinputActive;

	@FindBy(xpath = "//mat-nav-list/ul/li[10]/a")
	WebElement Setting_tab;

	@FindBy(xpath = "//ul[@class='nav']/li[2]")
	WebElement Users_tab;
	
	@FindBy(xpath = "//ul[@class='nav']/li[4]")
	WebElement Users_Role;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Refresh_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Add_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/span[1]/img[2]")
	WebElement BulkUpload_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement Download_btn;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//table/tbody/tr[1]/td[6]/img[2]")
	WebElement deleteButton;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesbutton;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstNameInput;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastNameInput;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailidInput;

	@FindBy(xpath = "//input[@name='contact']")
	WebElement phoneInput;
	
	

	public void Setting_tab() {
		Setting_tab.click();
	}

	public void Users_tab() {
		Users_tab.click();
	}

	public boolean isVisibleRefresh() {

		return Refresh_btn != null && Refresh_btn.isDisplayed();
	}

	public boolean isVisibleAdd() {

		return Add_btn != null && Add_btn.isDisplayed();
	}

	public boolean isVisibleUpload() {

		return BulkUpload_btn != null && BulkUpload_btn.isDisplayed();
	}

	public boolean isVisibleDownload() {

		return Download_btn != null && Download_btn.isDisplayed();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(css = ".cdk-overlay-container")
	WebElement cdkcontainer;

	public void FirstNameDot() {
		FirstNameDot.click();
	}

	public void LastNameDot() {
		LastNameDot.click();
	}

	public void EmailDot() {
		EmailDot.click();
	}

	public void RoleNameDot() {
		RoleNameDot.click();
	}

	public void status() {
		StatusDot.click();
	}

	public void firstNameinput(String value) {

		firstNameInput.sendKeys(Keys.ENTER);
		firstNameInput.sendKeys(value);
	}

	public void firstNameinputSearch() {

		firstNameInput.sendKeys(Keys.ENTER);

	}

	public void lastNameinput(String value) {

		lastNameinput.sendKeys(Keys.ENTER);
		lastNameinput.sendKeys(value);
	}

	public void emailidinput(String value) {
		emailidinput.sendKeys(Keys.ENTER);
		emailidinput.sendKeys(value);
	}

	public void phoneInput(String value) {
		phoneInput.sendKeys(Keys.ENTER);
		phoneInput.sendKeys(value);
	}

	public void password(String value) {
		password.sendKeys(Keys.ENTER);
		password.sendKeys(value);
	}

	public void roleNameinput(String value) {
		roleNameinput.sendKeys(Keys.ENTER);
		roleNameinput.sendKeys(value);
	}

	public void addButton() {
		addButton.click();
	}

	public void BulkUpload_btn() {
		BulkUpload_btn.click();
	}

	public void Download_btn() {
		Download_btn.click();
	}

	public void saveButton() {
		saveButton.click();
	}

	public void cancelButton() {
		cancelButton.click();
	}

	public void edituserbutton() throws InterruptedException {
		Thread.sleep(3000);
		try {
			edituserbutton.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void cdkcontainer() {
		cdkcontainer.click();
	}

	public void deleteButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#matTable img.mat-tooltip-trigger.ml-2.ng-star-inserted\").click()");
	        
	
	}
	
	public void deleteButtonUser() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#matTable > tbody > tr > td.mat-cell.cdk-cell.table-data.cdk-column-Action.mat-column-Action.ng-star-inserted > img:nth-child(2)\").click()");
	        
	
	}

	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

        // Perform a click action on the confirmation Yes button
        confirmationYesButton.click();
		
	}
	public void Users_Role() {
		Users_Role.click();
	}
}
