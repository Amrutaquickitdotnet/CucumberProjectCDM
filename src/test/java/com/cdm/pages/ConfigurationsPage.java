package com.cdm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class ConfigurationsPage extends CommonActions {

	public ConfigurationsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),' Apply ')]")
	public WebElement applybuttoncalender;

	@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	public WebElement arrowforyearandmonth;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement downloadbutton;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/i[1]")
	WebElement viewResponseBodyIcon;

	@FindBy(xpath = "//input[@placeholder=' EDGE Name ']")
	WebElement inputEdgeName;

	@FindBy(xpath = "//input[@placeholder='  App Name ']")
	WebElement inputAppName;

	@FindBy(xpath = "//input[@placeholder='Config Name ']")
	WebElement inputConfigName;

	@FindBy(xpath = "//input[@data-placeholder='Minimum']")
	WebElement inputResponseStatusMin;

	@FindBy(xpath = "//input[@data-placeholder='Maximum']")
	WebElement inputResponseStatusMax;

	@FindBy(css = ".cdk-overlay-container mat-tooltip-component div")
	WebElement refreshConfigButtonToolTip;

	@FindBy(xpath =  "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement viewResponseBodyToolTip;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameConfigThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeNameThreeDotConfig;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement configNameThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement responseStatusThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement timeStampThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement lastUpdatedThreeDot;

	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	WebElement configTabmain;

	@FindBy(xpath = "//div[@class='text-right']/img[1]")
	WebElement currentviewbuttonclick;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement row_present;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement responseBodyIcon;

	@FindBy(className = "titleHeading")
	WebElement Deploy_Heading;

	@FindBy(className = "mat-tooltip-trigger")
	WebElement view_response;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[5]/a/span")
	WebElement config_tab;

	@FindBy(xpath = "//div[@class='text-right']/img[1]")
	WebElement refreshBtn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-config-deploy-history[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement currentView;

	public void movetoconfiguration() {
		clickElement(config_tab, "confige moved on");
	}

	public void responseBodyIcon() {

		responseBodyIcon.click();
	}

	public void refreshbutton() {
		refreshBtn.click();

	}

	public String removalofEnteredTextForEdgeName() {

		return removalofEneredText(inputEdgeName);

	}

	public String removalofEnteredTextForAppName() {

		return removalofEneredText(inputAppName);

	}

	public String removalofEnteredTextForConfigName() {

		return removalofEneredText(inputConfigName);

	}

	public String removalofEnteredTextForResponseStatus() {

		return removalofEneredText(inputResponseStatusMax);

	}

	public void configTabmain() {
		configTabmain.click();
	}

	public String get_Text_ToolTipRefreshConfig() throws InterruptedException {
		Thread.sleep(2000);
		mouseHover(refreshBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String refreshconfigtoolTipText1 = refreshConfigButtonToolTip.getText();

		System.out.println("toolTipText-->" + refreshconfigtoolTipText1);

		return refreshconfigtoolTipText1;

	}

	public String get_Text_ToolTipViewResponseBody() throws InterruptedException {
		Thread.sleep(2000);
		mouseHover(viewResponseBodyIcon);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String refreshconfigtoolTipText1 = viewResponseBodyToolTip.getText();

		System.out.println("toolTipText-->" + refreshconfigtoolTipText1);

		return refreshconfigtoolTipText1;

	}

	public void currentviewbuttonclick() {
		currentviewbuttonclick.click();
	}

	public void historyviewbuttonclick() {
		doubleClick(currentView);
	}

	public void appNameConfigThreeDot() {
		appNameConfigThreeDot.click();
	}

	public void edgeNameThreeDotConfig() {
		edgeNameThreeDotConfig.click();
	}

	public void configNameThreeDot() {
		configNameThreeDot.click();
	}

	public void responseStatusThreeDot() {
		responseStatusThreeDot.click();
	}

	public void timeStampThreeDot() {
		timeStampThreeDot.click();
	}

	public void lastUpdatedThreeDot() {
		lastUpdatedThreeDot.click();
	}

	public void sendValueSearchinputBoxForEdgeName(String value) {
		inputEdgeName.sendKeys(Keys.ENTER);
		inputEdgeName.sendKeys(value);

	}

	public void sendValueSearchinputBoxForAppName(String value) {
		inputAppName.sendKeys(Keys.ENTER);
		inputAppName.sendKeys(value);

	}

	public void sendValueSearchinputBoxForConfigName(String value) {
		inputConfigName.sendKeys(Keys.ENTER);
		inputConfigName.sendKeys(value);

	}

	public void sendValueSearchinputBoxForResponseStatus(String value) {
		inputResponseStatusMin.sendKeys(Keys.ENTER);
		inputResponseStatusMax.sendKeys(value);

	}

	public void viewResponseBodyIcon() {
		viewResponseBodyIcon.click();
	}

	public void downloadAction() {
		downloadbutton.click();
	}

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

	public void applybuttoncalender() {
		applybuttoncalender.click();
	}
}
