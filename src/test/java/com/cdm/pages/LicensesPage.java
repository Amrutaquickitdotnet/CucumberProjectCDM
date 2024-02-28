package com.cdm.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LicensesPage extends CommonActions {

	public LicensesPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	
	
	   @FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]")
		WebElement sortissuedate;
	   
	   @FindBy(xpath = "//h2")
		WebElement headingTitle;
	 
	   
	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	@FindBy(xpath = "//body/div[3]/div[4]/div[1]/mat-datepicker-content[1]/div[2]/div[1]/button[2]")
	WebElement applyButtoncalender;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement opencalenderdot;

	@FindBy(xpath = "//input[@formcontrolname='start']")
	WebElement startDateforissuedDate;

	@FindBy(xpath = "//input[@formcontrolname='end']")
	WebElement endDateforIssuedDate;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hostIdThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement issueDateThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement expiryDateThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement licenseTypeThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement versionThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;

	@FindBy(xpath = "//input[@name='hostid']")
	WebElement hostidInput;

	@FindBy(xpath = "//input[@name='licensetype']")
	WebElement licenseTypeInput;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-nav-list[1]/ul[1]/li[6]/a[1]")
	WebElement licensetabmodule;

	@FindBy(xpath = "//input[@name='version']")
	WebElement versionInput;
	
	

	@FindBy(xpath = "//span[contains(text(),'Upload')]")

	WebElement uploadButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[3]")
	WebElement addButton;

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement invalidLicenseValidationmessage;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[1]")
	WebElement refreshButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[2]")
	WebElement requestLicenseButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement License_Tracker_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-license[1]/div[1]/div[1]/div[1]/span[1]/img[4]")
	WebElement Bulk_dwnd_btn;

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']/../div")
	WebElement validationmessageforupload;

	// can use FindAll

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement licenseinfo;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[2]")
	WebElement licenseDeployment;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[3]")
	WebElement licenseRevoke;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[4]")
	WebElement licenseAcceptance;

	public void licenseinfo() {
		licenseinfo.click();
	}

	public void licenseDeployment() {
		licenseDeployment.click();
	}

	public void licenseRevoke() {
		licenseRevoke.click();
	}

	public void licenseAcceptance() {
		licenseAcceptance.click();
	}

	public void movetoLicensetab() {
		licensetabmodule.click();
	}

	public void check_downloadBtn() {
		Bulk_dwnd_btn.click();
	}

	public void refreshButton() {
		refreshButton.click();
	}

	public void addButton() {
		addButton.click();
	}

	public void License_Tracker_btn() {
		License_Tracker_btn.click();
	}

	public void requestLicenseButton() {
		requestLicenseButton.click();
	}

	public void hostidInput(String value) {
		hostidInput.sendKeys(Keys.ENTER);
		hostidInput.sendKeys(value);
	}

	public void licenseTypeInput(String value) throws InterruptedException {
		licenseTypeInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		


		licenseTypeInput.sendKeys(value);
	}

	public void versionInput(String value) {
		versionInput.sendKeys(Keys.ENTER);
		versionInput.sendKeys(value);
	}

	public void licensetabmodule() {
		licensetabmodule.click();
	}

	public void uploadButton() {
		uploadButton.click();
	}

	public void invalidLicenseValidationmessagetext() {
		invalidLicenseValidationmessage.getText();
	}

	public void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	
	public void calenderIcon() {
		calenderIcon.click();
	}

	public void validationmessageforupload() {
		validationmessageforupload.getText();
	}

	public void hostIdThreeDot() {
		hostIdThreeDot.click();
	}
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void issueDateThreeDot() {
		issueDateThreeDot.click();
	}

	public void opencalenderdot() {
		opencalenderdot.click();
	}
	
	public void sortissuedate() {
		sortissuedate.click();
	}

	public void startDateforissuedDate() {
		startDateforissuedDate.click();
	}

	public void endDateforIssuedDate() {
		endDateforIssuedDate.click();
	}

	public void sendStartDate(String value) {
		startDateforissuedDate.sendKeys(value);
	}

	public void sendEndDate(String value) {
		endDateforIssuedDate.sendKeys(value);
	}
	public void applyButtoncalender() {
		applyButtoncalender.click();
	}
	
	public  void selectDateRange(String startDate, String endDate) {
        // Convert string dates to WebElements for better manipulation
        WebElement startElement = driver.findElement(By.xpath("//*[@id='mat-datepicker-1']/div/mat-month-view/table//button[starts-with(@aria-label,'"+ startDate+"')]"));
        WebElement endElement =  driver.findElement(By.xpath("//*[@id='mat-datepicker-1']/div/mat-month-view/table//button[starts-with(@aria-label,'"+ endDate+"')]"));

        startElement.click();
        endElement.click();
    }
	public void sorting() throws InterruptedException {
		
		List<WebElement> columns =     driver.findElements(By.xpath("//*[@id= 'matTable']/table/tbody/tr[2]/td"));
	String[] beforeSort = new String[columns.size()];
	for(int i=0; i<beforeSort.length; i++) {
	    beforeSort[i]=	columns.get(i).getText();
	    System.out.println(beforeSort[i]);
	    
	}
	for(int i=0;i<columns.size();i++) {
		Arrays.sort(beforeSort);
		String sort = beforeSort[i];
		System.out.println(sort);
	}
	    
	Thread.sleep(4000);
	driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]")).click();
	Thread.sleep(4000);
	    
	    columns    =     driver.findElements(By.xpath("//*[@id= 'matTable']/table/tbody/tr[2]/td"));
	    
	    sortissuedate.click();
	    
	    String[] afterSort = new String[columns.size()];
		try {
			for(int i=0; i<columns.size(); i++) {
				afterSort[i]=	columns.get(i).getText().trim();
			    System.out.println(afterSort[i]);
		}
			for(int i=0;i<columns.size();i++) {
				Collections.reverse(columns);
				String sort = afterSort[i];
				System.out.println(sort);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
	public void licenseTypeThreeDot() {
		licenseTypeThreeDot.click();
	}

	public void headingTitle() {
		headingTitle.click();
		
	}
	
	public void expiryDateThreeDot() {
		expiryDateThreeDot.click();
	}
	
	public void versionThreeDot() {
		versionThreeDot.click();
	}
	
}
