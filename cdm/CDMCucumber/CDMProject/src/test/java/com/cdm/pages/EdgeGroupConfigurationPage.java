package com.cdm.pages;

import java.time.Duration;

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

public class EdgeGroupConfigurationPage extends CommonActions {

	public EdgeGroupConfigurationPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "((//table)[4])/thead/tr[1]/th[1]/mat-checkbox/label/span/input")
	WebElement checkallAppName;
	
	@FindBy(xpath = "((//table)[4])/thead/tr[1]/th[1]/mat-checkbox/label")
	WebElement checkboxAllappNameLabel;
	
	
	@FindBy(xpath = "((//tbody)[4])/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxConfigName;
	
	
	
	@FindBy(xpath = "((//thead)[2])/tr/th[1]/mat-checkbox//input")
	WebElement checkboxEdgeDeviceAll;
	
	
	@FindBy(xpath = "((//tbody)[3])/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxApplicationConfiguration;

	
	
	@FindBy(xpath = "//div[contains(text(),'Version/Tag ')]/../../..//mat-icon")

	WebElement edgeVersionDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")

	WebElement edgeGroupNameConfigDot;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name ='controllername']")
	WebElement edgeGroupNamedeployment;
	
	
	
	
	@FindBy(xpath = "//input[@name ='displayname']")
	WebElement applicationDeploymentGroupNameSearch;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckbox;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxLabel;
	
	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;
	
	@FindBy(xpath = "//input[@name='tag']")
	WebElement edgeVersionNameInput;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeDeployment;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appGroupNameInputdeploy;

	//@FindBy(xpath = "((//tbody/tr[1]/td[1]/mat-checkbox)//input)[3]")
	@FindBy(xpath = "(//table)[3]/tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeStepThreeName;

	@FindBy(xpath = "(//table)[3]/tbody/tr[1]/td[1]/mat-checkbox/label")
	WebElement selectedcheckboxEdgeStepThreeNameLabel;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement checkboxAppName;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//label")
	WebElement selectedCheckboxAppNameLabel;

	@FindBy(xpath = "(//table)[3]/tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeName;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//label")
	WebElement selectedCheckboxEdgeNameSacLabel;
	
	
	
	@FindBy(xpath = "((//tbody)[3]/tr[1]/td[1]/mat-checkbox//label)")
	WebElement selectedCheckboxAppNameConfigLabel;


	@FindBy(xpath = "//div[contains(text(),'App Group Name ')]/../../..//mat-icon")
	WebElement appGroupNameDot;

	@FindBy(xpath = "//div[contains(text(),'  EDGE ')]/../../..//mat-icon")
	WebElement edgeDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")
	WebElement deployementEdgeGroupNameDot;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[5]")
	WebElement BulkAppDeploymentButton;

	@FindBy(xpath = "//h4/span[contains(text(),'Application Deployment')]")
	WebElement headingConfigurationTitle;

	@FindBy(css = ".tableCard h4")
	WebElement deployListpageVerification;

	@FindBy(xpath = "//div[contains(text(),'App Name')]/../../..//mat-icon")

	WebElement appNameDot;
	
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-edgegroup-config/div/div/mat-horizontal-stepper/div[2]/div[1]/form/div[2]/button")
	WebElement NextButton1;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[2]/..")
	WebElement NextButton2;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[3]/..")
	WebElement NextButton3;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[4]/..")
	WebElement NextButton4;

	@FindBy(xpath = "//button/span[contains(text(),'Confirm')]")
	WebElement confirmDeployButton;

	@FindBy(xpath = "//button[@type='submit'][2]")
	WebElement deployButton;
	

	@FindBy(xpath = "((//thead)[2])/tr/th[1]/mat-checkbox//label")
	WebElement allselectionEdgeDeviceLabel;
	

	public void headingConfigurationTitleClick() {
		// clickElement(headingTitle, "Clicking on Title of heading");
		headingConfigurationTitle.click();
	}

	public void BulkAppDeploymentButton() {
		BulkAppDeploymentButton.click();
		//clickElement(BulkAppDeploymentButton, getScreenshot());
		//ElementExist(BulkAppDeploymentButton, getScreenshot());

	}

	public String verifyDeployBreadcrumb() {
		String breadcrumb = deployListpageVerification.getText();
		return breadcrumb;

	}

	public void appNameDot() {
		appNameDot.click();
	}

	public void NextButtonStep1() {
		NextButton1.click();
	}

	public void NextButtonStep2() throws InterruptedException {
		NextButton2.click();
		Thread.sleep(3000);
	}

	public void NextButtonStep3() throws InterruptedException {
		NextButton3.click();
		Thread.sleep(3000);
	}

	public void NextButtonStep4() throws InterruptedException {
		NextButton4.click();
		Thread.sleep(3000);
	}

	public void appGroupNameDot() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", appGroupNameDot);

	}

	public void edgeDot() {
		edgeDot.click();
	}

	public void appGroupNameInputdeploy(String value) {
		appGroupNameInputdeploy.sendKeys(value);
	}

	public void appNameInput(String value) {
		appNameInput.sendKeys(value);
	}

	public void edgeDeployment(String value) {
		edgeDeployment.sendKeys(value);
	}

	public void deployementEdgeGroupNameDot() {
		deployementEdgeGroupNameDot.click();
	}

	public void edgeGroupNamedeployment(String value) {
		edgeGroupNamedeployment.sendKeys(value);
	}

	public void checkboxEdgeGroupNameStepOneName() {

		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxLabel));

			if (selectedCheckbox != null) {
				String checked = selectedCheckbox.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxEdgeStepThreeName() {
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click()", selectedcheckboxEdgeStepThreeNameLabel);
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedcheckboxEdgeStepThreeNameLabel));
			if (checkboxEdgeStepThreeName != null) {
				String checked = checkboxEdgeStepThreeName.getDomAttribute("checked");
				if (checked != "checked") {
				selectedcheckboxEdgeStepThreeNameLabel.click();

				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxAppNameStepTwoName() {
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxAppNameLabel));

			if (checkboxAppName != null) {
				String checked = checkboxAppName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameLabel.click();
				}
			}
		} catch (Exception e) {

		}

	}

	public void checkboxEdgeNameStepFour() {
		try {


			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", selectedCheckboxEdgeNameSacLabel);

			if (checkboxEdgeName != null) {
				String checked = checkboxEdgeName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeNameSacLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	
	
	public void checkboxApplicationConfiguration() {
		try {


//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click()", selectedCheckboxAppNameConfigLabel);

			if (checkboxApplicationConfiguration != null) {
				String checked = checkboxApplicationConfiguration.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameConfigLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void edgeGroupNameConfigDot() {
		edgeGroupNameConfigDot.click();
	}

	public void confirmDeployButton() {
		confirmDeployButton.click();
	}
	
	public void deployApp() {
		deployButton.click();
	}

	public void edgeVersionDot() {
		edgeVersionDot.click();
	}
	
	public void edgeVersionNameInput(String value) {
		edgeVersionNameInput.sendKeys(value);
	}
	
	public void applicationDeploymentGroupNameSearch(String value) {
		applicationDeploymentGroupNameSearch.sendKeys(Keys.ENTER);
		applicationDeploymentGroupNameSearch.sendKeys(value);
	}
	
	public void checkboxAllconfigurationEdgeDevice() {
		try {


			
			if (checkboxEdgeDeviceAll != null) {
				String checked = checkboxEdgeDeviceAll.getDomAttribute("checked");
				if (checked != "checked") {
					allselectionEdgeDeviceLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	
	
	public void checkboxmultiforAppName() {
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(checkboxAllappNameLabel));

			if (checkallAppName != null) {
				String checked = checkallAppName.getDomAttribute("checked");
				if (checked != "checked") {
					checkboxAllappNameLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	
	
}
