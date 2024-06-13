package com.cdm.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class HardwareEditPage extends CommonActions {

	public HardwareEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[8]/img[1]")
	WebElement hardwareEditButton;
	

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveEditHardware;
	
	
	@FindBy(xpath = "//input[@formcontrolname='hardwarename']")
	WebElement hardwareNameEdit;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement hardwareDisplayNameEdit;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement hardwareDescriptionEdit;

	@FindBy(xpath = "//input[@formcontrolname='model']")
	WebElement hardwareModelEdit;

	@FindBy(xpath = "//input[@formcontrolname='os']")
	WebElement hardwareOSEdit;

	@FindBy(xpath = "//input[@formcontrolname='make']")
	WebElement hardwareMakeEdit;

	@FindBy(xpath = "//input[@formcontrolname='processor']")
	WebElement hardwareProcessorEdit;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	
	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardwarenamesearch;
	
	public void hardwareEditButton() {
		clickElement(hardwareEditButton, "");
		//hardwareEditButton.click();

	}

	public void hardwareNameEdit(String value) {
		SetInputENterKey(hardwareNameEdit,"");
		SetInput(hardwareNameEdit, value, value);
		
		
//		hardwareNameEdit.sendKeys(Keys.ENTER);
//		hardwareNameEdit.sendKeys(value);
	}

	public void hardwareDisplayNameEdit(String value) {
		
		SetInputENterKey(hardwareDisplayNameEdit,"");
		SetInput(hardwareDisplayNameEdit, value, value);
		
//		hardwareDisplayNameEdit.sendKeys(Keys.ENTER);
//		hardwareDisplayNameEdit.sendKeys(value);
	}

	public void hardwareDescriptionEdit(String value) {
		SetInputENterKey(hardwareDescriptionEdit,"");
		SetInput(hardwareDescriptionEdit, value, value);
//		hardwareDescriptionEdit.sendKeys(Keys.ENTER);
//		hardwareDescriptionEdit.sendKeys(value);
	}

	public void hardwareModelEdit(String value) {
		
		SetInputENterKey(hardwareModelEdit,"");
		SetInput(hardwareModelEdit, value, value);
		
		
//		hardwareModelEdit.sendKeys(Keys.ENTER);
//		hardwareModelEdit.sendKeys(value);
	}

	public void hardwareOSEdit(String value) {
		SetInputENterKey(hardwareOSEdit,"");
		SetInput(hardwareOSEdit, value, value);
		
//		hardwareOSEdit.sendKeys(Keys.ENTER);
//		hardwareOSEdit.sendKeys(value);
	}

	public void hardwareMakeEdit(String value) {
		SetInputENterKey(hardwareMakeEdit,"");
		SetInput(hardwareMakeEdit, value, value);
		
//		hardwareMakeEdit.sendKeys(Keys.ENTER);
//		hardwareMakeEdit.sendKeys(value);
	}

	public void hardwareProcessorEdit(String value) {
		SetInputENterKey(hardwareProcessorEdit,"");
		SetInput(hardwareProcessorEdit, value, value);
//		
//		hardwareProcessorEdit.sendKeys(Keys.ENTER);
//		hardwareProcessorEdit.sendKeys(value);
	}
	
	public void hardwareNameSearch(String value) {
		SetInputENterKey(hardwarenamesearch,"");
		SetInput(hardwarenamesearch, value, value);
//		
//		hardwarenamesearch.sendKeys(Keys.ENTER);
//		hardwarenamesearch.sendKeys(value);
	}
	public String removalofEnteredTextForhardwareDescriptionEdit() {

		return removalofEneredText(hardwareDescriptionEdit);

	}
	public String removalofEnteredTextForhardwareDisplayNameEdit() {

		return removalofEneredText(hardwareDisplayNameEdit);

	}
	public String removalofEnteredTextForhardwareMakeEdit() {

		return removalofEneredText(hardwareMakeEdit);

	}
	public String removalofEnteredTextForhardwareModelEdit() {

		return removalofEneredText(hardwareModelEdit);

	}
	public String removalofEnteredTextForhardwareOSEdit() {

		return removalofEneredText(hardwareOSEdit);

	}
	public String removalofEnteredTextForhardwareProcessorEdit() {

		return removalofEneredText(hardwareProcessorEdit);

	}
	public String removalofEnteredTextForhardwareNameEdit() {

		return removalofEneredText(hardwareNameEdit);

		
	}
	
	public void saveEditHardware() throws InterruptedException {
		clickElement(saveEditHardware, "");
		saveEditHardware.click();
		
	}

}

