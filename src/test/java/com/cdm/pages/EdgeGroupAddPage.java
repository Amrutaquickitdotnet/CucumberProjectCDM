package com.cdm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupAddPage extends CommonActions {
	public EdgeGroupAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeGroupNameAdd;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../div/../../span[1])")
	WebElement validationMessageGroupName;

	
	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../div/../../span[2])")
	WebElement validationMessageGroupName1;
	
	@FindBy(xpath = "//input[@formcontrolname='controllername']")
	WebElement edgeGroupIdAdd;

	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../../../../div[1]/div/div/span/span")
	WebElement validationMessageGroupId;

	@FindBy(xpath = "//h4/span")
	WebElement headingTitleAdd;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonUpload;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonforEdgeGroup;

	public void edgeGroupNameAdd(String value) {
		edgeGroupNameAdd.sendKeys(Keys.ENTER);
		edgeGroupNameAdd.sendKeys(value);
		logger.fail("Step failed due to " + "<span class='label end-time'><a href=" + getScreenshot()
				+ ">Screenshot</a></span>");
	}

	public void edgeGroupIdAdd(String value) {
		edgeGroupIdAdd.sendKeys(Keys.ENTER);
		edgeGroupIdAdd.sendKeys(value);
	}

	public void headingTitleAdd() {
		headingTitleAdd.click();
	}

	public String verifyValidationMessageGroupName() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageGroupName == null) {
			return "";
		}
		String message = validationMessageGroupName.getText();

		return message.trim();

	}
	
	public String verifyValidationMessageGroupName1() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageGroupName1 == null) {
			return "";
		}
		String message = validationMessageGroupName1.getText();

		return message.trim();

	}
	public String verifyValidationMessageEdgeIDAdd() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageGroupId == null) {
			return "";
		}
		String message = validationMessageGroupId.getText();

		return message.trim();

	}


	public void saveButtonUpload() {
		saveButtonUpload.click();
	}

	public String verifyValidationMessageGroupID() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageGroupId == null) {
			return "";
		}
		String message = validationMessageGroupId.getText();

		return message.trim();

	}

	public void saveButtonforEdgeGroup() {
		saveButtonforEdgeGroup.click();
	}
	
	public void scrollingverticalAdd() {

		scrollingvertical("div.pagefooter", "0", "500");
	}
}
