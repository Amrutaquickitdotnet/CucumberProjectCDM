package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDeviceAdd extends CommonActions {

	public EdgeDeviceAdd(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement sliderOnCheckBoxLabel;
	
	@FindBy(name = "serialNo")
	WebElement serialNumber;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Onboarding Key']")
	WebElement onboardingKey;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Image Version']")
	WebElement imageVersion;

	
	
	@FindBy(xpath = "//input[@formcontrolname='appinstanceload']")
	WebElement serverport;
	
	@FindBy(xpath = "//input[@formcontrolname='edgeuser']")
	WebElement edgeUser;
	
	@FindBy(xpath = "//input[@formcontrolname='edgepassword']")
	WebElement edgePassword;
	
	
	

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement editEdgeDevice;

	@FindBy(xpath = "(//input[@formcontrolname='devicename']/../../../../../span)[2]")
	WebElement validationMessageEdgeId;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageEdgeName;

	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;

	@FindBy(css = ".addButton")
	WebElement saveAddDataBtn;

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	@FindBy(xpath = "//input[@data-placeholder='EDGE ID']")
	WebElement identityedgeId;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement identityedgeName;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement editidentityedgeName;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organization;

	@FindBy(css = "mat-select[formcontrolname='controllerid'] span")
	WebElement edgeGroupName;

	@FindBy(name = "assignedto")
	WebElement assignedTo;

//	@FindBy(xpath="//input[@data-placeholder='Location']")
//	WebElement location;

	@FindBy(css = "mat-select[formcontrolname=format]  div.mat-select-arrow")
	WebElement hardwareName;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupSelect;

	public void identityedgeIdInput(String value) {
		identityedgeId.sendKeys(value);
	}

	public void identityedgeName(String value) {
		identityedgeName.sendKeys(value);
	}
	
	public void onBoardingKeyInput(String value) {
		onboardingKey.sendKeys(value);
	}
	
	public void serialNumberInput(String value) {
		serialNumber.sendKeys(value);
	}
	
	public void imageVersionInput(String value) {
		imageVersion.sendKeys(value);
	}
	
	public void serverPortInput(String value) {
		serverport.sendKeys(value);
	}
	
	public void organization(String value) throws InterruptedException {

		SelectMatOption(organization, value);
	}

	public void edgeGroupName(String value) throws InterruptedException {
		SelectMatOption(edgeGroupName, value);
	}

	public void assignedTo(String value) {
		assignedTo.sendKeys(value);
	}

	public void applicationGroupSelect(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelect, value);
	}

	public void clearEnteredId() {
		identityedgeId.clear();
	}

	public void hardWareName(String value) throws InterruptedException {

		SelectMatOption(hardwareName, value);
	}

	public String verifyDeviceAddBreadcrumb() {
		String breadcrumb = AddListpageVerification.getText();
		return breadcrumb;

	}

	public void saveAddData() {
		saveAddDataBtn.click();
	}
	
	public void edgeUserInput(String value) {
		edgeUser.sendKeys(value);;
	}
	
	public void edgeUserPassword(String value) {
		edgePassword.sendKeys(value);;
	}

	public void cancelData() {
		cancelAddDataButton.click();
	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public String verifyValidationMessageEdgeId() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeId == null) {
			return "";
		}
		String message = validationMessageEdgeId.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeName() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeName == null) {
			return "";
		}
		String message = validationMessageEdgeName.getText();

		return message.trim();

	}

	public void editEdgeDeviceClick() {

		
		clickElement(editEdgeDevice,"Click on Edit icon of Edge Device");
		
	}

	public void setEditClearField() {
		
		
		SetInput(editidentityedgeName,"","Entered text is clear");

	
	}
	
	//Either checked or unchecked 
		public void moveSliderCondition(String m) {
			moveSliderCondition(sliderOnCheckBox,sliderOnCheckBoxLabel,m);
		}

}
