package com.cdm.pages;


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
	@FindBy(name = "serialNo")
	WebElement serialNumberUpdate;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Onboarding Key']")
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
	 WebElement edgeAppgroupsInput;
	

	@FindBy(css = "mat-select[formcontrolname=controllerid] span")
	WebElement edgeGroupNameUpdate;
	
	@FindBy(xpath = "//input[@name=\"hardwarename\"]")
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
	WebElement identityedgeId;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement identityedgeName;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement editidentityedgeName;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organization;

	@FindBy(css = "mat-select[formcontrolname=controllerid] span")
	WebElement edgeGroupName;

	@FindBy(name = "assignedto")
	WebElement assignedTo;

//	@FindBy(xpath="//input[@data-placeholder='Location']")
//	WebElement location;

	@FindBy(css = "mat-select[formcontrolname=format] span")
	WebElement hardwareName;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupSelect;

	public void identityedgeIdInput(String value) {
		identityedgeId.sendKeys(value);
	}

	
	public void organization(String value) throws InterruptedException {

		SelectMatOption(organization, value);
	}
	
	
	public void edgeAssignedToUpdate(String value) throws InterruptedException {

		edgeAssignedToUpdate.sendKeys(value);;
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

	public void clearEnteredName() {
		identityedgeName.clear();
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

		editidentityedgeName.clear();
	}
	
	

	public void identityedgeNameUpdate(String value) {
		edgeNameInputUpdate.sendKeys(value);
	}

	public void organizationUpdate(String value) throws InterruptedException {

		SelectMatOption(organization, value);
	}
	
	public void hardwareNameUpdate(String value) throws InterruptedException {

		SelectMatOption(hardwareName, value);
	}

	public void edgeGroupNameUpdate(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameUpdate, value);
	}

	public void identityedgeName(String value) {
		identityedgeName.sendKeys(value);
	}
	
	public void onBoardingKeyInput(String value) {
		onboardingKeyUpdate.sendKeys(value);
	}
	
	public void serialNumberInput(String value) {
		serialNumberUpdate.sendKeys(value);
	}
	
	public void imageVersionInput(String value) {
		imageVersionUpdate.sendKeys(value);
	}
	
	public void ongoingBoardUpdate(String value) {
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
		SelectMatOption(applicationGroupSelect,value);
	}
	public void serverPortInput(String value) {
		serverportUpdate.sendKeys(value);
	}
	
	public String removalofEneredTextForEdgeId() {
		
		return removalofEneredText(edgeNameInputUpdate);
			 
		}
	
	public void updatesaveAddDataBtn() {
		saveAddDataBtn.click();
	}
}
