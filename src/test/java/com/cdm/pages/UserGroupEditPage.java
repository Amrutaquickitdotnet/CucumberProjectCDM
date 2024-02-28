package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserGroupEditPage extends CommonActions {

	public UserGroupEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//mat-icon[contains(text(),'more_vert')]")
	WebElement UserGroupDot;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonAdd;

	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/img[1]")
	WebElement usergroupEditicon;
	
	@FindBy(xpath = "//input[@name='groupname']")
	WebElement usergroupinputsearch;

	
	@FindBy(xpath = "//input[@formcontrolname='groupname']")
	WebElement usergroupnameedit;
	
	public void usergroupEditicon() {
		usergroupEditicon.click();
	}
	
	public void UserGroupDot() {
		UserGroupDot.click();
	}
	public void usergroupinputsearch(String value) {
		usergroupinputsearch.sendKeys(Keys.ENTER);
		usergroupinputsearch.sendKeys(value);

	}
	
	public void usergroupnameedit(String value) {
		usergroupnameedit.sendKeys(Keys.ENTER);
		usergroupnameedit.sendKeys(value);
	}

	public void saveButtonAdd() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();",saveAddDataBtn);
		js.executeScript("document.querySelector(\".addButton\").click();", saveButtonAdd);
	}

	public String removalofEnteredTextForUserGroups() {

		return removalofEneredText(usergroupnameedit);

	}

}
