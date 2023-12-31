package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

import io.cucumber.java.en.Then;

public class EdgeGroupsPage extends CommonActions {

	public EdgeGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='tableCard']/h4")
	WebElement deploymentHeadingTitle;


	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;

	// *[@id="cdk-accordion-child-8"]/div/div[1]/div[1]/div/div/span
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-add-edit-edgegroup/div/div[1]/form/mat-nav-list/mat-expansion-panel[1]/div/div/div[1]/div[1]/div/div/mat-form-field/div")
	WebElement validationMessageEdgeId;

	@FindBy(xpath = "//span[@class='text-danger ng-star-inserted']")
	WebElement validationMessageEdgeName;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-edgegrouplicenseupload[1]/form[1]/div[1]/input[1]")
	WebElement licenseUploadChooseFile;

	@FindBy(xpath = "//button/span[contains (text(),'Upload')]/..")
	WebElement licenseUploadButtonAfter;

	@FindBy(xpath = "//input[@formcontrolname='serialkeys']")
	WebElement serialKey;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement uploadButton;

	@FindBy(xpath = "//button[@class='calButton']")
	WebElement cancelButton;

	@FindBy(xpath = "//span[contains (text(),'Save')]")
	WebElement saveButtonUpload;

	@FindBy(xpath = "//input[@type='file']")
	WebElement controllerConfigurationCertificateUpload;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement onboardingCertificateIcon;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement registrationUploadButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[3]")
	WebElement refreshButtonforLicence;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[2]")
	WebElement licenceDownloadButton;

	@FindBy(xpath = "(//div[contains(text(),' License ')]/..//img)[1]")
	WebElement licenceUploadButton;

	@FindBy(css = "mat-select[formcontrolname='appgroupid'] span")
	WebElement applicationGroupName;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement EditButtonToolTip;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
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

	WebElement confirmationMessage;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[2]")

	WebElement confirmationNoMessage;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement groupNameThreeDotInput;

	@FindBy(xpath = "//input[@type='number']")
	WebElement serverNodes;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement groupNameInputSearch;

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

	@FindBy(xpath = "//input[@id='mat-input-5']")
	WebElement deviceActiveInputMax;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[2]")
	WebElement deleteEdgeGroupColumn;

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement submitButtonAll;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceConnectedThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deviceActiveThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusColumnThreeDotchecked;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusColumnThreeDotUnchecked;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement groupNameThreeDot;

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

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement Add_btn;

	@FindBy(xpath = "//button[@class='calButton']")
	WebElement Cancel_btn;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement Save_btn;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[5]")
	WebElement Bulk_App_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[4]")
	WebElement Bulk_Download_btn;

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

	@FindBy(xpath = "//button[contains (text(),'Save')]")
	WebElement saveButtonforEdgeGroup;

	public void identitySection(String value) {

		// edgeGroupIDInput.sendKeys(Keys.ENTER);
		edgeGroupIDInput.sendKeys(value);

	}

	public void edgenameInput(String value) {

		// edgeGroupNameInput.sendKeys(Keys.ENTER);
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

		serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {

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
		headingGroupListTitle.click();
	}

	public void statusColumnThreeDot() {
		clickElement(statusColumnThreeDot, getScreenshot());
		ElementExist(statusColumnThreeDot, getScreenshot());

	}

	public void groupNameInputSearch(String value) {

		groupNameInputSearch.sendKeys(value);
		groupNameInputSearch.sendKeys(Keys.ENTER);

	}

	
	public void checkbulkAppBtn() {
		clickElement(Bulk_App_btn, getScreenshot());
		ElementExist(Bulk_App_btn, getScreenshot());
	}

	public void checkrefreshbtn() {
		clickElement(Refresh_btn, getScreenshot());
		ElementExist(Refresh_btn, getScreenshot());
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
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

		clickElement(Add_btn, getScreenshot());
		// ElementExist(Add_btn, getScreenshot());
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

	public void confirmationMessage() {
		clickElement(confirmationMessage, getScreenshot());

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
			if(edittoolTipText.equals(expectedToolTip)) { 
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

	public void controllerConfigurationCertificateUpload(String value) {
		controllerConfigurationCertificateUpload.sendKeys(value);
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

	
	
}