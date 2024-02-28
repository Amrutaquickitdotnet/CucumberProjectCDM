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

	@FindBy(xpath = "//mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[2]/button[1]")
	WebElement previousButtonApplicationonDeploymentButton;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//thead/tr[1]/th[1]/mat-checkbox/label/span/input")
	WebElement checkallAppName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//thead/tr[1]/th[1]/mat-checkbox/label")
	WebElement checkboxAllappNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxConfigName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]//td[1]//mat-checkbox//label")
	WebElement checkboxAppNameSingleSelectLabel;
	
	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[2]//td[1]//mat-checkbox//label")
	WebElement checkboxAppNameSingleSelectLabelTwo;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr/th[1]/mat-checkbox//input")
	WebElement checkboxEdgeDeviceAll;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxApplicationConfiguration;

	@FindBy(xpath = "//div[contains(text(),'Version/Tag ')]/../../..//mat-icon")

	WebElement edgeVersionDot;
	
	
	@FindBy(xpath = "//div[contains(text(),'App Name')]/../../..//mat-icon")

	WebElement edgeAppNameDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")

	WebElement edgeGroupNameConfigDot;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name ='controllername']")
	WebElement edgeGroupNamedeployment;

	@FindBy(xpath = "//input[@name ='displayname']")
	WebElement applicationDeploymentGroupNameSearch;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckbox;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxEdgeGroupNameDeploymentLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label//input")
	WebElement selectedCheckboxEdgeGroupNameDeploymentInput;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;

	@FindBy(xpath = "//input[@name='tag']")
	WebElement edgeVersionNameInput;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeDeployment;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeIdConfigurationInput;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appGroupNameInputdeploy;

	// @FindBy(xpath = "((//tbody/tr[1]/td[1]/mat-checkbox)//input)[3]")
	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeStepThreeName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox/label")
	WebElement selectedcheckboxEdgeStepThreeNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement checkboxEdgeGroupsAppGroupName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//label")
	WebElement selectedCheckboxEdgeGroupsAppGroupNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr//td)[1]//input")
	WebElement checkboxEdgeNameApplication;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox[1]/label/span[1]/input")
	WebElement checkboxApplicationEdgeDeviceConfig;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr//td)[1]//label")
	WebElement selectedCheckboxEdgeNameSacLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox[1]/label")
	WebElement selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//mat-checkbox//label)")
	WebElement selectedCheckboxAppNameConfigLabel;

	@FindBy(xpath = "//div[@role='tabpanel' and @aria-expanded='true']//table//mat-checkbox//input")
	WebElement selectedCheckboxAppNameConfigInputBoxField;

	@FindBy(xpath = "//div[@role='tabpanel' and @aria-expanded='true']//table//mat-checkbox//label")
	WebElement selectedCheckboxAppNameConfigLabelType;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//mat-checkbox//input)")
	WebElement selectedCheckboxAppNameConfiginputBox;

	@FindBy(xpath = "//div[contains(text(),'App Group Name ')]/../../..//mat-icon")
	WebElement appGroupNameDot;

	@FindBy(xpath = "//div[contains(text(),'  EDGE ')]/../../..//mat-icon")
	WebElement edgeDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")
	WebElement deployementEdgeGroupNameDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE ID ')]/../../..//mat-icon")
	WebElement edgeIDApplicationConfiguration;

	@FindBy(xpath = "//h2[@class='titleHeading']/../div/img[5]")
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

	@FindBy(xpath = "//h4/span")
	WebElement titleApplicationDeployment;

	@FindBy(xpath = "//button/span[contains(text(),'Confirm')]")
	WebElement confirmDeployButton;

	@FindBy(xpath = "//button[@type='submit'][2]")
	WebElement deployButton;

	@FindBy(xpath = "((//thead)[2])/tr/th[1]/mat-checkbox//label")
	WebElement allselectionEdgeDeviceLabel;

	@FindBy(xpath = "((//thead)[3])/tr/th[1]/mat-checkbox//label")
	WebElement allselectionEdgeDeviceLabelDeploymentlabel;

	public void headingConfigurationTitleClick() {
		// clickElement(headingTitle, "Clicking on Title of heading");
		headingConfigurationTitle.click();
	}

	public void BulkAppDeploymentButton() {
		BulkAppDeploymentButton.click();
		// clickElement(BulkAppDeploymentButton, getScreenshot());
		// ElementExist(BulkAppDeploymentButton, getScreenshot());

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
		appNameInput.sendKeys(Keys.ENTER);
		appNameInput.sendKeys(value);
	}

	public void edgeDeployment(String value) {
		edgeDeployment.sendKeys(value);
	}

	public void deployementEdgeGroupNameDot() {
		deployementEdgeGroupNameDot.click();
	}

	public void edgeGroupNamedeployment(String value) {
		edgeGroupNamedeployment.sendKeys(Keys.ENTER);
		edgeGroupNamedeployment.sendKeys(value);
	}

	public void checkboxEdgeGroupNameDeploymentStepOneName() {

		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxEdgeGroupNameDeploymentLabel));

			if (selectedCheckboxEdgeGroupNameDeploymentInput != null) {
				String checked = selectedCheckboxEdgeGroupNameDeploymentInput.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeGroupNameDeploymentLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxEdgeStepThreeName() {
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click()",
		// selectedcheckboxEdgeStepThreeNameLabel);
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

	public void checkboxEdgeGroupsAppGroups() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxEdgeGroupsAppGroupNameLabel));

			if (checkboxEdgeGroupsAppGroupName != null) {
				String checked = checkboxEdgeGroupsAppGroupName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeGroupsAppGroupNameLabel.click();
				}
			}
		} catch (Exception e) {

		}

	}

	public void checkboxEdgeNameStepFour() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", selectedCheckboxEdgeNameSacLabel);

			if (checkboxEdgeNameApplication != null) {
				String checked = checkboxEdgeNameApplication.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeNameSacLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfig() {
		try {
			Thread.sleep(6000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions
					.elementToBeClickable(selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel));

			if (checkboxApplicationEdgeDeviceConfig != null) {
				String checked = checkboxEdgeName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxApplicationConfiguration() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", selectedCheckboxAppNameConfigLabel);

			if (checkboxApplicationConfiguration != null) {
				String checked = checkboxApplicationConfiguration.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameConfigLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxApplicationConfigurationAppName() {
		try {

//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click()", selectedCheckboxAppNameConfigLabelType);

			if (selectedCheckboxAppNameConfigInputBoxField != null) {
				String checked = selectedCheckboxAppNameConfigInputBoxField.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameConfigLabelType.click();
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
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(allselectionEdgeDeviceLabel));
			if (checkboxEdgeDeviceAll != null) {
				String checked = checkboxEdgeDeviceAll.getDomAttribute("checked");
				if (checked != "checked") {
					allselectionEdgeDeviceLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxAllDeploymentEdgeDevice() {
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(allselectionEdgeDeviceLabelDeploymentlabel));
			if (checkboxEdgeDeviceAll != null) {
				String checked = checkboxEdgeDeviceAll.getDomAttribute("checked");
				if (checked != "checked") {
					allselectionEdgeDeviceLabelDeploymentlabel.click();
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

	public void edgeIDApplicationConfigurationThreeDot() {
		edgeIDApplicationConfiguration.click();
	}

	public void edgeIdConfigurationInput(String value) {
		edgeIdConfigurationInput.sendKeys(value);
	}

	public void titleApplicationDeployment() {
		titleApplicationDeployment.click();
	}

	@FindBy(xpath = "(//table)[3]//tr[1]//td[1]//mat-checkbox//label//span//input")
	WebElement checkboxAppNameSingleSelect;

	public void checkboxAppNameSingleSelectStepTwoName() {
		try {

			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(checkboxAppNameSingleSelectLabel));

			if (checkboxAppNameSingleSelect != null) {
				String checked = checkboxAppNameSingleSelect.getDomAttribute("checked");
				if (checked != "checked") {
					checkboxAppNameSingleSelectLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	
	public void checkboxAppNameSingleSelectStepTwoNamedouble() {
		try {

			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(checkboxAppNameSingleSelectLabelTwo));

			if (checkboxAppNameSingleSelect != null) {
				String checked = checkboxAppNameSingleSelect.getDomAttribute("checked");
				if (checked != "checked") {
					checkboxAppNameSingleSelectLabelTwo.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void previousButtonApplicationonDeployment() throws InterruptedException {

		Thread.sleep(5000);
		previousButtonApplicationonDeploymentButton.click();
	}
public void edgeAppNameDot() {
	edgeAppNameDot.click();
}
	public void checkboxEdgeGroupNameStepOneName() {
		try {

			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxEdgeGroupNameDeploymentLabel));

			if (selectedCheckboxEdgeGroupNameDeploymentInput != null) {
				String checked = selectedCheckboxEdgeGroupNameDeploymentInput.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeGroupNameDeploymentLabel.click();
				}
			}
		} catch (Exception e) {

		}

	}
}