package com.cdm.pages;



import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

import io.cucumber.java.en.Then;

public class EdgeGroupsPage extends CommonActions {

	public EdgeGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
			PageFactory.initElements(driver, this);
	}
	
	

	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement licenseCancelButton;;
	

	@FindBy(xpath = "//div[@class='tableCard']/h4")
	WebElement deploymentHeadingTitle;
	
	
	
	
	@FindBy(xpath = "(//input[@name='options'])[2]")
	WebElement edgegroupstatusInactive;
	
	@FindBy(xpath = "//div/div/div[1]/div/div/div[2]/label/div/span[2]")
	WebElement cloudhealthButtonOff;

	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;

	// *[@id="cdk-accordion-child-8"]/div/div[1]/div[1]/div/div/span
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-add-edit-edgegroup/div/div[1]/form/mat-nav-list/mat-expansion-panel[1]/div/div/div[1]/div[1]/div/div/mat-form-field/div")
	WebElement validationMessageEdgeId;

	@FindBy(xpath = "//span[@class='text-danger ng-star-inserted']")
	WebElement validationMessageEdgeName;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgegrouplicenseupload[1]/form[1]/div[1]/input[1]")
	WebElement licenseUploadChooseFile;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgegrouplicenseupload[1]/div[2]/button[2]")
	WebElement licenseUploadButtonAfter;
	
	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement location;

	@FindBy(xpath = "//input[@class='titleHeadingsub']")
	WebElement headingtitleonboarding;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@formcontrolname='serialkeys']")
	WebElement serialKey;

	@FindBy(xpath = "//span[contains(text(),'Alphanumerics of length Min = 2, Max = 64 are allo')]")
	WebElement validationMessageGroupName;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement uploadButton;

	@FindBy(xpath = "//button[@class='calButton']")
	WebElement cancelButton;

	@FindBy(xpath = "//app-edgeconfigupload/div[3]/button[2]")
	WebElement saveButtonUpload;
	
	
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[2]/a/span")
	WebElement EdgeGroupTab;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edge-onboarding-upload[1]/div[3]/button[2]")
	WebElement saveButtonfinalonboarding;

	@FindBy(xpath = "//input[@type='file']")
	WebElement controllerConfigurationCertificateUpload;
	
	@FindBy(xpath = "//input[@type='file']")
	WebElement onboardingCertificateUpload;

	@FindBy(xpath = "//mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement onboardingCertificateIcon;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement saveButtononboardingCertificateIcon;
	
	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgeconfigupload[1]/div[3]/button[2]")
	WebElement saveButtononEdgeConfiguration;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement registrationUploadButton;

	@FindBy(xpath = "//mat-expansion-panel[5]/div/div/div/div[1]/div/div[2]/img[3]")
	WebElement refreshButtonforLicence;

	@FindBy(xpath = "(//div[contains(text(),' License ')]/..//img)[2]")
	// @FindBy(xpath = "((//div[@class='labelClass'])[3])/../div[2]/img[2]")
	WebElement licenceDownloadButton;

	@FindBy(xpath = "(//div[contains(text(),' License ')]/..//img)[1]")
	WebElement licenceUploadButton;

	@FindBy(css = "mat-select[formcontrolname='appgroupid'] span")
	WebElement applicationGroupName;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement EditButtonToolTip;

	@FindBy(xpath = "//body/div[3]/div/div/mat-tooltip-component/div")
	WebElement DeleteButtonToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement toolTip;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement StopButtonToolTip;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement ConsoleButtonToolTip;

	@FindBy(xpath = "//tbody/tr[3]/td[6]/img[3]")
	WebElement stopButton;

	@FindBy(xpath = "//h2[contains(text(),'EDGE Groups')]")
	WebElement headingGroupListTitle;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[3]")
	WebElement stopIconEdgeGroup;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/mat-icon[1]")
	WebElement consoleIcon;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement devicesActiveThreeDot;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[1]")

	WebElement confirmationYesMessage;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[2]")

	WebElement confirmationNoMessage;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement groupNameThreeDot;

	@FindBy(xpath = "//input[@type='number']")
	WebElement serverNodes;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement groupNameInputSearch;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement groupNameAdd;

	@FindBy(xpath = "//input[@data-placeholder ='Minimum']")
	WebElement alaramRaisedInputMin;

	@FindBy(xpath = "//input[@data-placeholder ='Maximum']")
	WebElement alaramRaisedInputMax;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/mat-card[1]/button[1]")
	WebElement submitButtonForAlaramRaised;

	// Device Connected

	@FindBy(xpath = "//input[@data-placeholder='Minimum']")
	WebElement deviceConnectedInputMin;

	@FindBy(xpath = "//input[@data-placeholder='Maximum']")
	WebElement deviceConnectedInputMax;

	// DeviceActive
	@FindBy(xpath = "//input[@id='mat-input-4']")
	WebElement deviceActiveInputMin;

	@FindBy(xpath = "//input[@data-placeholder='Maximum']")
	WebElement deviceActiveInputMax;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[2]")
	WebElement deleteEdgeGroupColumn;

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement submitButtonAll;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceConnectedThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceActiveThreeDot;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement statusColumnActive;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement statusColumnThreeDotUnchecked;



	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement alaramRaisedThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusColumnThreeDot;

	@FindBy(xpath = "//table[@role='table']")
	WebElement tableElement;

	@FindBy(xpath = "//span[@class='full-width ng-star-inserted full-active']")
	WebElement EdgeGroup_btn;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[1]")
	WebElement Refresh_btn;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[1]/div/p/img")
	WebElement Collapse_btn;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[2]")
	WebElement Add_btn;

	@FindBy(xpath = "//button[@class='calButton']")
	WebElement Cancel_btn;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement Save_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement Bulk_App_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[4]")
	WebElement Bulk_Download_btn;

	@FindBy(xpath = "((//div[@class='labelClass'])[3])/../div[2]/img[2]")
	WebElement LicenseDownloadButton;

	@FindBy(xpath = "/body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[2]")
	WebElement edgeConfigurationDownloadBtn;

	@FindBy(xpath = "//span[@class='titleHeadingsub']")
	WebElement Buld_App_Validation;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[1]")
	WebElement Edit_btn;

	// Identity Section
	@FindBy(xpath = "//input[@formcontrolname ='controllername']")
	WebElement edgeGroupIDInput;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeDeployment;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeGroupNameInput;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;

	// Health Section

	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement healthtogglebtn;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement healthtoggleLabel;

	// Deployment section
	@FindBy(xpath = "//input[@formcontrolname='appgroupid']")
	WebElement edgeApplicationGroupID;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddressInput;

	// serverport

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverPortInput;

	// addButton

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonforEdgeGroup;

	public void identitySectionGroupID(String value) {

		// edgeGroupIDInput.sendKeys(Keys.ENTER);
		edgeGroupIDInput.sendKeys(value);

	}
	
	public void locationedgeGroup(String value) {

		location.sendKeys(Keys.ENTER);
		location.sendKeys(value);

	}
	
	public void descriptionedgeGroup(String value) {

		// edgeGroupIDInput.sendKeys(Keys.ENTER);
		description.sendKeys(Keys.ENTER);
		description.sendKeys(value);

	}

	public void edgenameInput(String value) {

		edgeGroupNameInput.sendKeys(Keys.ENTER);
		edgeGroupNameInput.sendKeys(value);
	}

	public void healthSection() {
		healthtogglebtn.click();
	}

	public void deploymentSection(String value) {

		// edgeApplicationGroupID.sendKeys(Keys.ENTER);
		edgeApplicationGroupID.sendKeys(value);

	}

	public void serverHostAddress(String value) {
		serverHostAddressInput.sendKeys(Keys.ENTER);
		serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {
		serverPortInput.sendKeys(Keys.ENTER);
		serverPortInput.sendKeys(value);
	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public void applicationGroupName(String value) throws InterruptedException {
		SelectMatOption(applicationGroupName, value);
	}

	public void saveButtonforEdgeGroup() {
		saveButtonforEdgeGroup.click();
	}

	public void checkEdgeGrouptab() {

		clickElement(EdgeGroup_btn, "checkgroup tab");
		System.out.println("this has been run honey");
	}

	public void groupNameThreeDot() {
		clickElement(groupNameThreeDot, getScreenshot());
		ElementExist(groupNameThreeDot, getScreenshot());

	}

	public void alaramRaisedThreeDot() {
		clickElement(alaramRaisedThreeDot, getScreenshot());
		ElementExist(alaramRaisedThreeDot, getScreenshot());

	}

	public void deviceConnectedThreeDot() {
		clickElement(deviceConnectedThreeDot, getScreenshot());
		ElementExist(deviceConnectedThreeDot, getScreenshot());

	}

	public void deviceActiveThreeDot() {
		clickElement(deviceActiveThreeDot, getScreenshot());
		ElementExist(deviceActiveThreeDot, getScreenshot());

	}

	public void headingEdgeGroupListClick() {
		// clickElement(headingTitle, "Clicking on Title of heading");
		try {
		headingGroupListTitle.click();
		}
		catch(Exception ex) {}
	}

	public void statusColumnThreeDot() {
		statusColumnThreeDot.click();

	}

	public void groupNameInputSearch(String value) {

		groupNameInputSearch.sendKeys(Keys.ENTER);
		groupNameInputSearch.sendKeys(value);

	}

	public void checkbulkAppBtn() {
		Bulk_App_btn.click();
//		clickElement(Bulk_App_btn, getScreenshot());
//		ElementExist(Bulk_App_btn, getScreenshot());
	}

	public void checkrefreshbtn() {
		clickElement(Refresh_btn, getScreenshot());
		ElementExist(Refresh_btn, getScreenshot());
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			try {
			backDropShowing.click();
			}
			catch(Exception ex){}
		}
	}
	
	public void backDropShowing_Div_Clickonboarding() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", backDropShowing);
		if (backDropShowing != null) {
			try {
			backDropShowing.click();
			}
			catch(Exception ex){}
		}
	}

	public void checkBulkDownloadButton() {
		clickElement(Bulk_Download_btn, getScreenshot());
		ElementExist(Bulk_Download_btn, getScreenshot());
	}

	@Then("Click on the three dots of GroupName")
	public void click_on_the_three_dots_of_group_name() {
		clickElement(groupNameThreeDot, getScreenshot());
		ElementExist(groupNameThreeDot, getScreenshot());
	}

	public void checkAddbtn() {
		Add_btn.click();
		
	}

	public void setZoomLevel(int height, int width) {
		Dimension d = new Dimension(height, width);
		driver.manage().window().setSize(d);
	}

	public String getCellText(int rowIndex, int colIndex) {
		WebElement row = tableElement.findElements(By.tagName("tr")).get(rowIndex);
		WebElement cell = row.findElements(By.tagName("td")).get(colIndex);
		String tablevalue = cell.getText();
		return tablevalue;
	}

	public void Edit_btn() {

		clickElement(Edit_btn, getScreenshot());

	}

	public void deleteEdgeGroupColumn() {
		clickElement(deleteEdgeGroupColumn, getScreenshot());
	}

	public void confirmationYesMessage() {
		clickElement(confirmationYesMessage, getScreenshot());

	}

	public void confirmationNoMessage() {
		clickElement(confirmationNoMessage, getScreenshot());

	}

	public void stopButton() {

		clickElement(stopButton, getScreenshot());
	}

	public void consoleIcon() {
		clickElement(consoleIcon, getScreenshot());

	}

	public void alaramRaisedThreeDotInputMin(String value) {

		alaramRaisedInputMin.sendKeys(Keys.ENTER);
		alaramRaisedInputMin.sendKeys(value);
	}

	public void alaramRaisedThreeDotInputMax(String value) {
		alaramRaisedInputMax.sendKeys(Keys.ENTER);
		alaramRaisedInputMax.sendKeys(value);
	}

	public void submitButtonForAll() {
		submitButtonAll.click();
	}

	public void deviceConnectedInputMin(String value) {

		deviceConnectedInputMin.sendKeys(Keys.ENTER);
		deviceConnectedInputMin.sendKeys(value);

	}

	public void deviceConnectedInputMax(String value) {
		deviceConnectedInputMax.sendKeys(Keys.ENTER);
		deviceConnectedInputMax.sendKeys(value);
	}

	public void deviceActiveInputMin(String value) {

		deviceActiveInputMin.sendKeys(Keys.ENTER);
		deviceActiveInputMin.sendKeys(value);
	}

	public void deviceActiveInputMax(String value) {
		deviceActiveInputMax.sendKeys(Keys.ENTER);
		deviceActiveInputMax.sendKeys(value);

	}

	public String get_Text_EditButtonToolTip() throws InterruptedException {

		mouseHover(Edit_btn);
		Thread.sleep(2000);
		if (toolTip != null) {
			String expectedToolTip = "Edit";
			String edittoolTipText = EditButtonToolTip.getText();

			System.out.println("toolTipText-->" + edittoolTipText);
			if (edittoolTipText.equals(expectedToolTip)) {
				System.out.println("Test Case Passed");
			}
			return edittoolTipText;
		}
		return "";
	}

	public String get_Text_DeleteButtonToolTip() throws InterruptedException {

		mouseHover(deleteEdgeGroupColumn);

		Thread.sleep(3000);

		if (toolTip != null) {
			String deletetoolTipText = toolTip.getText();

			System.out.println("toolTipText-->" + deletetoolTipText);

			return deletetoolTipText;
		}
		return "";
	}

	public String get_Text_StopButtonToolTip() {

		mouseHover(stopButton);

		String stoptoolTipText = StopButtonToolTip.getText();

		System.out.println("toolTipText-->" + stoptoolTipText);

		return stoptoolTipText;
	}

	public String get_Text_ConsoleButtonToolTip() throws InterruptedException {

		mouseHover(consoleIcon);

		Thread.sleep(3000);

		if (toolTip != null) {
			String consoletoolTipText = ConsoleButtonToolTip.getText();

			System.out.println("toolTipText-->" + consoletoolTipText);

			return consoletoolTipText;
		}
		return "";
	}

	public void moveSliderCondition(String m) {
		moveSliderCondition(healthtogglebtn, healthtoggleLabel, m);
	}

	public String removalofEneredTextForEdgeGroupName() {

		return removalofEneredText(edgeGroupNameInput);

	}
	
	public String removalofEneredTextForLocation() {

		return removalofEneredText(location);

	}
	
	public String removalofEneredTextForDescription() {

		return removalofEneredText(description);

	}
	
	
	public void moveslideronoff() {
		Actions act = new Actions(driver);
        act.moveToElement(cloudhealthButtonOff).build().perform();
	}

	public String removalofEneredTextForServerNodes() {

		return removalofEneredText(serverNodes);

	}
	public String removalofEneredTextForServerHostAddress() {

		return removalofEneredText(serverHostAddressInput);

	}
	
	public String removalofEneredTextForServerPort() {

		return removalofEneredText(serverPortInput);

	}

	public void edgeConfigurationDownloadBtn() {
		edgeConfigurationDownloadBtn.click();
	}

	public void licenceDownloadButton() {
		licenceDownloadButton.click();
	}

	public void refreshButtonforLicence() {
		refreshButtonforLicence.click();
	}

	public void registrationUploadButton() {
		registrationUploadButton.click();
	}

	public void controllerConfigurationCertificateUpload(String value) throws AWTException {
		backDropShowing_Div_Click();
		controllerConfigurationCertificateUpload.sendKeys(value);
//		Robot r = new Robot();
//	      //pressing enter
//	      r.keyPress(KeyEvent.VK_ENTER);
//	      //releasing enter
//	      r.keyRelease(KeyEvent.VK_ENTER);
//	      //pressing ctrl+v
//	      r.keyPress(KeyEvent.VK_CONTROL);
//	      r.keyPress(KeyEvent.VK_V);
//	      //releasing ctrl+v
//	      r.keyRelease(KeyEvent.VK_CONTROL);
//	      r.keyRelease(KeyEvent.VK_V);
//	      //pressing enter
//	      r.keyPress(KeyEvent.VK_ENTER);
//	      //releasing enter
//	      r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void saveButtonUpload() {
		saveButtonUpload.click();
	}

	public void onboardingCertificateIcon() {
		onboardingCertificateIcon.click();
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

	public void serialKey(String value) {
		serialKey.sendKeys(value);
	}

	public void uploadButton() {
		uploadButton.click();
	}

	public void licenceUploadButton() {
		licenceUploadButton.click();
	}

	public void licenseUploadButtonAfter() {

		licenseUploadButtonAfter.click();
	}

	public void licenseUploadChooseFile(String value) {
		licenseUploadChooseFile.sendKeys(value);
	}

	public void cancelButton() {
		cancelButton.click();
	}

	public void serverNodes(String value) {
		serverNodes.sendKeys(value);
	}

	public String deploymentHeadingTitle() {
		String titleDeployment = deploymentHeadingTitle.getText();
		return titleDeployment;

	}

	public void groupNameAdd(String value) {
		groupNameAdd.sendKeys(Keys.ENTER);
		groupNameAdd.sendKeys(value);
	}

	public void LicenseDownloadButton() {
		LicenseDownloadButton.click();
	}

	public String validationMessageGroupName() {
		validationMessageGroupName.getText();
		return validationMessageGroupName();
	}

	public void saveButtononboardingCertificateIcon() {
		saveButtononboardingCertificateIcon.click();
	}

	public void saveButtonfinalonboarding() {
		saveButtonfinalonboarding.click();
	}

	public void fileupload() {
		Actions action = new Actions(driver);

		action.moveToElement(Bulk_App_btn).click().build().perform();
	}

	public void statusColumnActive() {
		statusColumnActive.click();
	}
	public String removalofEnteredTextForGroupName() {

		return removalofEneredText(groupNameInputSearch);

	}
	
	public String removalofEnteredTextForAlaramRaisedMin() {

		return removalofEneredText(alaramRaisedInputMin);

	}
	
	
	public String removalofEnteredTextForAlaramRaisedMax() {

		return removalofEneredText(alaramRaisedInputMax);

	}
	
	public String removalofEnteredTextForDeviceConnectedMin() {

		return removalofEneredText(deviceConnectedInputMin);

	}
	
	public String removalofEnteredTextFordeviceConnectedInputMax() {

		return removalofEneredText(deviceConnectedInputMax);

	}
	
	public void cloudbuttonhealth() {
		cloudhealthButtonOff.click();
	}

	public void clickEdgeGroups() {
		
		EdgeGroupTab.click();
	}
	public void edgegroupstatusInactive() {
		edgegroupstatusInactive.click();
	}
	
	public void saveButtononEdgeConfiguration() {
		saveButtononEdgeConfiguration.click();
	}
	
	public void licenseCancelButton() {
		licenseCancelButton.click();
	}
	
	public void headingtitleonboarding() {
		headingtitleonboarding.click();
	}
	
	public void onboardingCertificateUpload(String value) {
	
		onboardingCertificateUpload.sendKeys(value);
	}
}