package com.cdm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDeviceEdit extends CommonActions {

	public EdgeDeviceEdit(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageEdgeEdit;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement identityedgeNameEdit;

	@FindBy(name = "assignedto")
	WebElement assignedtoUpdate;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationUpdate;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement descriptionUpdate;

	@FindBy(name = "serialNo")
	WebElement serialNumberUpdate;

	@FindBy(xpath = "//input[@formcontrolname='onboardingkey']")
	WebElement onboardingKeyUpdate;

	@FindBy(xpath = "//input[@data-placeholder='Image Version']")
	WebElement imageVersionUpdate;

	@FindBy(xpath = "//input[@formcontrolname='appinstanceload']")
	WebElement serverportUpdate;

	@FindBy(xpath = "//input[@formcontrolname='edgeuser']")
	WebElement edgeUserUpdate;

	@FindBy(xpath = "//input[@formcontrolname='edgepassword']")
	WebElement edgePasswordUpdate;
	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement editEdgeDevice;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeNameInputUpdate;

	@FindBy(xpath = "//input[@name=\"appgroupname\"]")
	WebElement edgeAppgroupsInputUpdate;

	@FindBy(css = "mat-select[formcontrolname=controllerid] span")
	WebElement edgeGroupNameUpdate;

	@FindBy(xpath = "//mat-select[@formcontrolname='format']")
	WebElement hardWareNameInputUpdate;

	@FindBy(xpath = "//input[@name=\"assignedto\"]")
	WebElement edgeAssignedToUpdate;

	@FindBy(xpath = "//input[@name=\"description\"]")
	WebElement edgeDescriptionUpdate;

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
	WebElement identityedgeIdUpdate;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement identityedgeNameUpdate;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement editidentityedgeNameUpdate;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationUpdate;

	@FindBy(name = "assignedto")
	WebElement assignedToUpdate;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupSelectUpdate;

	public void identityedgeIdInputUpdate(String value) {
		identityedgeIdUpdate.sendKeys(value);
	}

	public void edgeAssignedToUpdate(String value) throws InterruptedException {

		edgeAssignedToUpdate.sendKeys(value);
		;
	}

	public void edgeGroupName(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameUpdate, value);
	}

	public void assignedTo(String value) {
		assignedToUpdate.sendKeys(Keys.ENTER);
		assignedToUpdate.sendKeys(value);
	}

	public void applicationGroupSelectUpdate(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelectUpdate, value);
	}

	public void clearEnteredName() {
		identityedgeNameUpdate.clear();
	}

	public void hardWareName(String value) throws InterruptedException {

		SelectMatOption(hardWareNameInputUpdate, value);
	}

	public String verifyDeviceAddBreadcrumb() {
		String breadcrumb = AddListpageVerification.getText();
		return breadcrumb;

	}

	public void saveAddData() {
		saveAddDataBtn.click();
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

		editEdgeDevice.click();
	}

	public void setEditClearField() {

		editidentityedgeNameUpdate.clear();
	}

	public void identityedgeNameUpdate(String value) {
		edgeNameInputUpdate.sendKeys(value);
	}

	public void organizationUpdate(String value) throws InterruptedException {

		SelectMatOption(organizationUpdate, value);
	}

	public void hardwareNameUpdate(String value) throws InterruptedException {

		SelectMatOption(hardWareNameInputUpdate, value);
	}

	public void edgeGroupNameUpdate(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameUpdate, value);
	}

	public void identityedgeName(String value) {
		identityedgeNameUpdate.sendKeys(value);
	}

	public void onBoardingKeyInput(String value) {
		onboardingKeyUpdate.sendKeys(Keys.ENTER);
		onboardingKeyUpdate.sendKeys(value);
	}

	public void serialNumberInput(String value) {
		serialNumberUpdate.sendKeys(value);
	}

	public void imageVersionInput(String value) {
		imageVersionUpdate.sendKeys(value);
	}

	public void ongoingBoardUpdate(String value) {
		onboardingKeyUpdate.sendKeys(Keys.ENTER);
		onboardingKeyUpdate.sendKeys(value);
	}

	public void serialNumberUpdate(String value) {
		serialNumberUpdate.sendKeys(value);
	}

	public void imageVersionUpdate(String value) {
		imageVersionUpdate.sendKeys(value);
	}

	public void serverPortUpdate(String value) {
		serverportUpdate.sendKeys(value);
	}

	public void edgeUserNameUpdate(String value) {
		edgeUserUpdate.sendKeys(value);
	}

	public void edgePasswordUpdate(String value) {
		edgePasswordUpdate.sendKeys(value);
	}

	public void applicationGroupUpdate(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelectUpdate, value);
	}

	public void serverPortInput(String value) {
		serverportUpdate.sendKeys(value);
	}

	public String removalofEnteredTextForEdgeName() {

		return removalofEneredText(edgeNameInputUpdate);

	}

	public String removalofEneredTextForOnboardingKey() {

		return removalofEneredText(onboardingKeyUpdate);

	}

	public String removalofEneredTextForLocation() {

		return removalofEneredText(locationUpdate);

	}

	public String removalofEneredTextForDescription() {

		return removalofEneredText(descriptionUpdate);

	}

	public void updatesaveAddDataBtn() {
		saveAddDataBtn.click();
	}

	public void assignedtoUpdate(String value) {
		assignedtoUpdate.sendKeys(Keys.ENTER);
		assignedtoUpdate.sendKeys(value);
	}

	public void locationUpdate(String value) {
		locationUpdate.sendKeys(Keys.ENTER);
		locationUpdate.sendKeys(value);
	}

	public void descriptionUpdate(String value) {
		descriptionUpdate.sendKeys(Keys.ENTER);
		descriptionUpdate.sendKeys(value);
	}

	public String verifyValidationMessageEdgeNameEdit() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeEdit == null) {
			return "";
		}
		String message = validationMessageEdgeEdit.getText();

		return message.trim();

	}
	
	public void identityedgeNameEdit(String value) throws InterruptedException {
		Thread.sleep(3000);
		identityedgeNameEdit.sendKeys(Keys.ENTER);
		identityedgeNameEdit.sendKeys(value);
	}

}
