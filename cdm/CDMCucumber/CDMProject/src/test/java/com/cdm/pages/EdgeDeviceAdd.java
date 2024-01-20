package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	WebElement serialNumberAdd;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationAdd;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement descriptionAdd;

	@FindBy(xpath = "//input[@data-placeholder='Onboarding Key']")
	WebElement onboardingKeyAdd;

	@FindBy(xpath = "//input[@data-placeholder='Image Version']")
	WebElement imageVersionAdd;

	@FindBy(xpath = "//input[@formcontrolname='appinstanceload']")
	WebElement serverportAdd;

	@FindBy(xpath = "//input[@formcontrolname='edgeuser']")
	WebElement edgeUserAdd;

	@FindBy(xpath = "//input[@formcontrolname='edgepassword']")
	WebElement edgePasswordAdd;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement editEdgeDevice;

	@FindBy(xpath = "(//input[@formcontrolname='devicename']/../../../../../span)[2]")
	WebElement validationMessageEdgeId;
	
	@FindBy(xpath = "(//input[@formcontrolname='devicename']/../../../../../div)")
	WebElement validationMessageEdgeId1;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageEdgeName1;
	
	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageEdgeName;

	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	@FindBy(xpath = "//input[@data-placeholder='EDGE ID']")
	WebElement identityedgeIdAdd;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement identityedgeNameAdd;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement editidentityedgeName;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationAdd;

	@FindBy(css = "mat-select[formcontrolname='controllerid'] span")
	WebElement edgeGroupNameAdd;

	@FindBy(name = "assignedto")
	WebElement assignedToAdd;

	@FindBy(xpath = "//h4/span")
	WebElement headingTitleAdd;

	@FindBy(css = "mat-select[formcontrolname=format]  div.mat-select-arrow")
	WebElement hardwareNameAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupSelect;

	public void identityedgeIdInputAdd(String value) {
		identityedgeIdAdd.sendKeys(value);
	}

	public String identityedgeIdInputGet() {
		return identityedgeIdAdd.getText();
	}

	public void identityedgeNameAdd(String value) {
		identityedgeNameAdd.sendKeys(value);
	}

	public void onBoardingKeyInputAdd(String value) {
		onboardingKeyAdd.sendKeys(value);
	}

	public void serialNumberInputAdd(String value) {
		serialNumberAdd.sendKeys(value);
	}

	public void imageVersionInputAdd(String value) {
		imageVersionAdd.sendKeys(value);
	}

	public void serverPortInputAdd(String value) {
		serverportAdd.sendKeys(value);
	}

	public void organizationAdd(String value) throws InterruptedException {

		SelectMatOption(organizationAdd, value);
	}

	public void edgeGroupNameAdd(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameAdd, value);
	}

	public void assignedToAdd(String value) {
		assignedToAdd.sendKeys(value);
	}

	public void applicationGroupSelect(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelect, value);
	}

	public void clearEnteredId() {
		identityedgeIdAdd.clear();
	}

	public void hardWareNameAdd(String value) throws InterruptedException {

		SelectMatOption(hardwareNameAdd, value);
	}

	public String verifyDeviceAddBreadcrumb() {
		String breadcrumb = AddListpageVerification.getText();
		return breadcrumb;

	}

	public void saveAddData() {
		saveAddDataBtn.click();
	}

	public void edgeUserInputAdd(String value) {
		edgeUserAdd.sendKeys(value);

	}

	public void edgeUserPasswordAdd(String value) {
		edgePasswordAdd.sendKeys(value);

	}

	public void cancelData() {
		cancelAddDataButton.click();
	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}
	
	public String verifyValidationMessageEdgeId1() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeId1 == null) {
			return "";
		}
		String message = validationMessageEdgeId1.getText();

		return message.trim();

	}
	
	public String verifyValidationMessageEdgeName1() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeName1 == null) {
			return "";
		}
		String message = validationMessageEdgeName1.getText();

		return message.trim();

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

		clickElement(editEdgeDevice, "Click on Edit icon of Edge Device");

	}

	public void setEditClearField() {

		SetInput(editidentityedgeName, "", "Entered text is clear");

	}

	// Either checked or unchecked
	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}

	public void locationAdd(String value) {
		locationAdd.sendKeys(Keys.ENTER);
		locationAdd.sendKeys(value);
	}

	public void descriptionAdd(String value) {
		descriptionAdd.sendKeys(Keys.ENTER);
		descriptionAdd.sendKeys(value);
	}
	
	public void headingTitleAdd() {
		headingTitleAdd.click();
	}
}
