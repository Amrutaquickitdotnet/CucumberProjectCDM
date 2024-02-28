package com.cdm.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeploymentsmodulePage extends CommonActions {

	public DeploymentsmodulePage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),' Apply ')]")
	public WebElement applybuttoncalender;

	@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	public WebElement arrowforyearandmonth;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement volumeDetailsStatusThreeDot;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-2']")
	WebElement dialogue2;

	@FindBy(xpath = "//tbody/tr[1]/td[9]/img[1]")
	WebElement infoicon;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//table[@role='grid']")
	WebElement tableData;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/span[1]/span[1]/small[1]")
	WebElement showMoreLink;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeNameThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameDeployThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement errorThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RunningVersionThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement expectedVersionThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[7]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement deploymentDateThreeDotDeploy;

	@FindBy(xpath = "//thead/tr[1]/th[8]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement lastUpdatedThreeDotDeploy;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refresh_Button;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement bulkDownloadButton;

	@FindBy(xpath = "//span[contains(text(),'Deployments')]")
	WebElement deployment_tab;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-deployement-app[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement currentViewButton;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement inputEdgeNameDeploy;

	@FindBy(xpath = "//h3/../div/i")
	WebElement closevolume;

	@FindBy(xpath = "//input[@name='volumename']")
	WebElement inputVolumeNameDeploy;

	@FindBy(xpath = "//input[@name='volumename']")
	WebElement inputVolumeNameDetailsPageDeploy;

	@FindBy(xpath = "//app-filter[@name='volumename']/div/a/mat-icon")
	WebElement volumeNameThreeDot;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/a[1]/mat-icon[1]")
	WebElement errorThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/a[1]/mat-icon[1]")
	WebElement DeployedVolumeDetailserrorThreeDot;

	@FindBy(xpath = "//h3[contains(text(),'Deployed Volume Details')]")
	WebElement titleheadingvolumeDetailsPage;

	@FindBy(xpath = "//input[@name='status']")
	WebElement statusDeploy;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement volumeNamePopUpThreeDot;

	@FindBy(xpath = "//input[@name='//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]']")
	WebElement CreatedDate;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement inputAppNameDeploy;

	@FindBy(xpath = "//input[@placeholder='Status']")
	WebElement inputStatusDeploy;

	@FindBy(xpath = "//input[@name='errortrace']")
	WebElement inputErrorDeploy;

	@FindBy(xpath = "//input[@name='current_version']")
	WebElement inputRunningVersion;

	@FindBy(xpath = "//input[@placeholder='Expected Version']")
	WebElement inputExpectedVersion;

	@FindBy(xpath = "//input[@placeholder='status']")
	WebElement inputVolumeNameStatusDeploy;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/progress-bar[1]/div[1]/div[1]")
	WebElement downloadstatus;

	@FindBy(xpath = "//input[@name='status']")
	WebElement inputStatusVolumeDetailsDeploy;

	@FindBy(xpath = "//input[@placeholder='Expected Version']")
	WebElement inputExpectedVersionDeploy;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;

	@FindBy(xpath = "//input[@placeholder=' Error trace']")
	WebElement volumeDetailsError;

	@FindBy(xpath = "//input[@name='errortrace']")
	WebElement inputErrorDetailsPageDeploy;

	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-deploy-volume[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement createdDateVolumeDeployDetails;

	public void calenderIcon() {
		calenderIcon.click();
	}

	public void arrowforyearandmonth() {
		arrowforyearandmonth.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void refresh_Button() {
		refresh_Button.click();
	}

	public void bulkDownloadButton() {
		bulkDownloadButton.click();
	}

	public void currentView() {
		currentViewButton.click();
	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void deploymenttabclick() {
		deployment_tab.click();
	}

	public void edgeNameThreeDotDeploy() {
		edgeNameThreeDotDeploy.click();
	}

	public void appNameDeployThreeDot() {
		appNameDeployThreeDot.click();
	}

	public void statusThreeDotDeploy() {
		statusThreeDotDeploy.click();
	}

	public void errorThreeDotDeploy() {
		errorThreeDotDeploy.click();
	}

	public void downloadStatus() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(downloadstatus.getText());

	}

	public void RunningVersionThreeDotDeploy() {
		RunningVersionThreeDotDeploy.click();
	}

	public void expectedVersionThreeDotDeploy() {
		expectedVersionThreeDotDeploy.click();
	}

	public void deploymentDateThreeDotDeploy() {
		deploymentDateThreeDotDeploy.click();
	}

	public void lastUpdatedThreeDotDeploy() {
		lastUpdatedThreeDotDeploy.click();
	}

	public void inputEdgeNameDeploy(String value) {
		inputEdgeNameDeploy.sendKeys(Keys.ENTER);
		inputEdgeNameDeploy.sendKeys(value);
	}

	public void inputAppNameDeploy(String value) {
		inputAppNameDeploy.sendKeys(Keys.ENTER);
		inputAppNameDeploy.sendKeys(value);
	}

	public void inputStatusDeploy(String value) {
		inputStatusDeploy.sendKeys(Keys.ENTER);
		inputStatusDeploy.sendKeys(value);
	}

	public void inputErrorDeploy(String value) {
		inputErrorDeploy.sendKeys(Keys.ENTER);
		inputErrorDeploy.sendKeys(value);
	}

	public void inputRunningVersion(String value) {
		inputRunningVersion.sendKeys(Keys.ENTER);
		inputRunningVersion.sendKeys(value);
	}

	public void inputExpectedVersion(String value) {
		inputExpectedVersion.sendKeys(Keys.ENTER);
		inputExpectedVersion.sendKeys(value);
	}

	public void inputVolumeNameDeploy(String value) {
		inputVolumeNameDeploy.sendKeys(Keys.ENTER);
		inputVolumeNameDeploy.sendKeys(value);
	}

	public void inputVolumeStatusDetailsDeploy(String value) {
		inputStatusVolumeDetailsDeploy.sendKeys(Keys.ENTER);
		inputStatusVolumeDetailsDeploy.sendKeys(value);
	}

	public String removalofEnteredTextForEdgeName() {

		return removalofEneredText(inputEdgeNameDeploy);

	}

	public String removalofEnteredTextForRunningVersion() {

		return removalofEneredText(inputRunningVersion);

	}

	public String removalofEnteredTextForExpectedVersion() {

		return removalofEneredText(inputExpectedVersion);

	}

	public String removalofEnteredTextForappName() {

		return removalofEneredText(inputAppNameDeploy);

	}

	public String removalofEnteredTextForStatus() {

		return removalofEneredText(inputStatusDeploy);

	}

	public String removalofEnteredTextForError() {

		return removalofEneredText(inputErrorDeploy);

	}

	public String removalofEnteredTextForVolumeNameDeploy() {

		return removalofEneredText(inputVolumeNameDeploy);

	}

	public String removalofEnteredTextForErrorDetails() {

		return removalofEneredText(inputErrorDetailsPageDeploy);

	}

	public String removalofEnteredTextForStatusDetails() {

		return removalofEneredText(inputStatusVolumeDetailsDeploy);

	}

	public String removalofEnteredTextForVolumeName() {

		return removalofEneredText(inputVolumeNameDetailsPageDeploy);

	}

	public String removalofEnteredTextForStatusVolume() {

		return removalofEneredText(inputStatusDeploy);

	}

	public String removalofEnteredTextForvolumeDetailsError() {

		return removalofEneredText(inputExpectedVersionDeploy);

	}

	public String removalofEnteredTextForcreatedDate() {

		return removalofEneredText(inputExpectedVersionDeploy);

	}

	public void showMoreLink() {
		showMoreLink.click();
	}

	public void infoicon() {
		infoicon.click();
	}

	public void volumeNamePopUpThreeDot() {
		volumeNamePopUpThreeDot.click();

	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void volumeDetailsStatusThreeDot() {

		volumeDetailsStatusThreeDot.click();
	}

	public void titleheadingvolumeDetailsPage() {
		titleheadingvolumeDetailsPage.click();
	}

	public void inputVolumeNameDetailsPageDeploy(String value) {
		inputVolumeNameDetailsPageDeploy.sendKeys(Keys.ENTER);
		inputVolumeNameDetailsPageDeploy.sendKeys(value);
	}

	public void inputErrorDetailsPageDeploy(String value) {
		inputErrorDetailsPageDeploy.sendKeys(Keys.ENTER);
		inputErrorDetailsPageDeploy.sendKeys(value);
	}

	public void inputCreatedDate(String value) {
		inputErrorDetailsPageDeploy.sendKeys(Keys.ENTER);
		inputErrorDetailsPageDeploy.sendKeys(value);
	}

	public void DeployedVolumeDetailserrorThreeDot() {
		DeployedVolumeDetailserrorThreeDot.click();
	}

	public void createdDateVolumeDeployDetailsThreeDot() {
		createdDateVolumeDeployDetails.click();
	}

	public void volumepageRecord() {
		List<String> records = Arrays.asList("Record 1", "Record 2", "Record 3", "Record 4");

		// Assuming you want to display 5 records per page
		int recordsPerPage = 4;

		// Calculate the number of pages required
		int totalPages = (records.size() + recordsPerPage - 1) / recordsPerPage;

		for (int page = 1; page <= totalPages; page++) {
			// Navigate to the desired page
			// You need to implement this part according to your specific webpage
			// For example:
			// driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

			// Extract records for the current page
			int startIndex = (page - 1) * recordsPerPage;
			int endIndex = Math.min(page * recordsPerPage, records.size());
			List<String> currentPageRecords = records.subList(startIndex, endIndex);

			// Process the records on the current page
			for (String record : currentPageRecords) {
				System.out.println(record);
			}
		}

	}
	public void applybuttoncalender() {
		applybuttoncalender.click();
	}
	public List<WebElement> tableData() {
		tableData.findElements(By.tagName("td"));
		return null;
	}

	public void closevolume() {
		try {
			closevolume.click();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
