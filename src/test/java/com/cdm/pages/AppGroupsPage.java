package com.cdm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppGroupsPage extends CommonActions {

	public AppGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "(//input[@name= 'options'])[1]")

	WebElement statusActiveCheckbox;
	
	@FindBy(xpath = "//table/tbody/tr")

	WebElement tableRow;

	
	@FindBy(xpath = "(//input[@name= 'options'])[2]")

	WebElement statusinActiveCheckbox;
	

	@FindBy(xpath = "//app-filter[@name ='isActive']")
	WebElement statusThreeDot;

	

	@FindBy(xpath = "//app-appgroup/div/div[2]/div/table/tbody/tr[2]/td[4]/img[2]")
	WebElement deleteIcon;

	@FindBy(xpath = "//input[@formcontrolname='appgroupname']")
	WebElement appGroupName;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appGroupNameInput;

	@FindBy(xpath = "//input[@formcontrolname='appgroupname']")
	WebElement appGroupNameEnterData;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement appGroupDisplayNameEnterData;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/button/input")
	WebElement appGroupDisplayNameInput;

	@FindBy(xpath = "//div[@class='tableCard']/../div/div[1]/div/img[2]")
	WebElement addButtonAppGroup;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appGroupNameDot;

	public void movetoAppGroup() {
		appGroupNameDot.click();
	}

	public void checktitle(String exp) {
		verifyTitle(exp);
	}

	public void checkactivebtn() {
		// ElementExist(Active_state_check, getScreenshot());
	}

	public void appGroupNameInput(String value) {
		appGroupNameInput.sendKeys(Keys.ENTER);
		appGroupNameInput.sendKeys(value);
	}

	public void appGroupDisplayNameInput(String value) {
		appGroupDisplayNameInput.sendKeys(Keys.ENTER);
		appGroupDisplayNameInput.sendKeys(value);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void addButtonAppGroup() {
		addButtonAppGroup.click();
	}

	public void appGroupName(String value) {
		appGroupName.sendKeys(Keys.ENTER);
		appGroupName.sendKeys(value);
	}

	public void appGroupDisplayNameEnterData(String value) {
		appGroupDisplayNameEnterData.sendKeys(Keys.ENTER);
		appGroupDisplayNameEnterData.sendKeys(value);
	}

	public void appGroupNameEnterData(String value) {
		appGroupNameEnterData.sendKeys(Keys.ENTER);
		appGroupNameEnterData.sendKeys(value);
	}

	public void saveButton() {
		saveButton.click();
	}

	public void deleteButton() {
		deleteIcon.click();
	}



	public void statusThreeDot() {
		statusThreeDot.click();
	}
	
	public void statusActiveCheckbox() {
		statusActiveCheckbox.click();
	}
	
	public void statusinActiveCheckbox() {
		statusinActiveCheckbox.click();
	}
	
	public void tabledata() {
		try {
			List<WebElement> tableRows =	driver.findElements(By.xpath("//table/tbody/tr"));
			int count = tableRows.size();
			System.out.println("row count "+count);
			
		    }catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
	
		
	}
