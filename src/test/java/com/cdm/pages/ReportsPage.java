package com.cdm.pages;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class ReportsPage extends CommonActions {

	public ReportsPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='/assets/img/orangewifi.png']")
	WebElement networkOrange;

	@FindBy(xpath = "//img[@src='/assets/img/orangewifi.png']")
	WebElement networkGreen;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement downloadButton;

	@FindBy(xpath = "//mat-select[@formcontrolname='reporttype']")
	WebElement reportTypeSelect;

	@FindBy(xpath = "//button[@aria-haspopup= 'dialog']")
	WebElement calenderIcon;

	@FindBy(xpath = "(//mat-datepicker-toggle)[2]//button")
	WebElement endDatecalenderIcon;

	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	WebElement reportsTab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@formcontrolname='startdate']")
	WebElement startDate;

	@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	public WebElement arrowforyearandmonth;

	@FindBy(xpath = "//button[@aria-live='polite']")
	public WebElement yearselection;

	@FindBy(xpath = "//button[@class='mat-calendar-body-cell']")
	public WebElement monthselection;

	@FindBy(xpath = "//button[@class='mat-calendar-body-cell']")
	public WebElement dayselection;
	
	
	@FindBy(xpath = "//span[@class='text-danger ng-star-inserted']")
	WebElement validationmessage;

	public String verifyValidationMessageforReports() {
		validationmessage.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationmessage == null) {
			return "";
		}
		String message = validationmessage.getText();

		return message.trim();

	}
	
	
	public void reportsTab() {
		reportsTab.click();
	}

	public void reportTypeDropdown(String value) throws InterruptedException {
		Thread.sleep(5000);
		SelectMatOption(reportTypeSelect, value);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void calicon() {
		calenderIcon.click();
	}

	public void caliconEndDate() {
		endDatecalenderIcon.click();
	}

	public void arrowforyearandmonth() {
		arrowforyearandmonth.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void monthselection(String value) {

		String str = "//button[@aria-label='" + value + "']";
		WebElement ele = driver.findElement(By.xpath(str));
		ele.click();
	}

	public void yearselection(String value) {
		String str = "//button[@aria-label='" + "2024" + "']";
		WebElement ele = driver.findElement(By.xpath(str));
		ele.click();

	}

	public void dayselection(String value) {
		String str = "//button[@aria-label='" + value + "']";
		WebElement ele = driver.findElement(By.xpath(str));
		ele.click();
	}

	public void minimiseWindow() {
		driver.manage().window().minimize();
	}

	public void downloadButton() {
		downloadButton.click();
	}

	public void maximiseWindow() {
		driver.manage().window().maximize();
	}

	public void setdimension(int height, int width) {
		Dimension d = new Dimension(height, width);
		driver.manage().window().setSize(d);

	}
	public void networkGreen() {
		networkGreen.click();
	}
	
	public void networkOrange() {
		networkOrange.click();
	}
}