package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DeploymentsPage extends CommonActions {

	public DeploymentsPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/mat-checkbox[1]/label[1]/span[1]")
	WebElement applicationdeploymentCheckboxAll;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[4]")
	WebElement deploymenticonColumnsection;

	@FindBy(xpath = "//span[@class='titleHeadingsub']")
	WebElement headingTitle;
	
	
	
	@FindBy(xpath = "//input[@name='appname']")
	WebElement deploymenticonColumn;

	@FindBy(xpath = "//input[@name = 'status']")
	WebElement deploymentStatusInput;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]")
	WebElement deploymentStatusNamethreedots;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]")
	WebElement deploymentAppNamethreedots;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement EditButton;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropTransparent;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/span[1]/span[1]")
	WebElement deploymentAppNameTitle;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement deploymentStatusTitle;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement deploymentAppName;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeNameSearch;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]']")
	WebElement edgeAppNameSearch;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeNameInputUpdate;

	@FindBy(xpath = "//table[@matsortactive='created']")

	WebElement deploymentTable;

	@FindBy(xpath = "//input[@name='devicename']")

	WebElement EdgeNameDeploymentInput;

	@FindBy(xpath = "//input[@name='appname']")

	WebElement EdgeAppNameDeploymentInput;

	@FindBy(xpath = "//a[contains(text(),'Deployments')]")
	WebElement deployment_tab;

	@FindBy(xpath = "//img[@class='mat-tooltip-trigger ml-1 ng-star-inserted']")
	WebElement view_eye_btn;

	@FindBy(xpath = "//h3[@class='titleHeading']")
	WebElement Deploy_heading;

	@FindBy(xpath = "//img[@class='mat-tooltip-trigger ng-star-inserted']")
	WebElement refresh_btn;

	@FindBy(className = "mat-tooltip-trigger")
	WebElement i_mark;
	// Need to attach number of rows in table using WebElements

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
		try {
			backDropShowing.click();
		}catch(Exception ex){}
		}
	}

	public void backDropTransparent_Div_Click() {
		if (backDropTransparent != null) {
			try {    
				backDropTransparent.click();
			}
			catch(Exception ex){
				
			}
			}    
		}
	

	public void verifyTitle() {
		ElementExist(Deploy_heading, getScreenshot());
	}

	public void verifyimark() {
		ElementExist(i_mark, getScreenshot());
	}

	public void refresbtn() {
		refresh_btn.click();
	}

	public void deploymentAppName(String appName) {
		deploymentAppName.sendKeys(appName);
	}

	public void deploymenttabclick() {
		deployment_tab.click();
	}

	public void deploymentAppNamethreedots() {
		deploymentAppNamethreedots.click();
	}

	public void listDeploymentTable() {

		// Example: Iterate through rows and print cell values
		for (WebElement row : deploymentTable.findElements(By.tagName("tr"))) {
			for (WebElement cell : row.findElements(By.tagName("td"))) {
				String cellcolumn = cell.getText();
				System.out.print(cell.getText() + "\t");
			}
			System.out.println();
		}

	}

	public void clickEditButton() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditButton.click();
	}

	public void edgeNameSearchvalidate(String value) {

		backDropTransparent_Div_Click();
		edgeNameSearch.click();

		EdgeNameDeploymentInput.sendKeys(value);

	}

	public void deploymenticonColumnClick() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		deploymenticonColumn.click();
	}

	public void deploymentStatusNamethreedots() {
		backDropShowing_Div_Click();
		deploymentStatusNamethreedots.click();
	}

	public void deploymentStatusInput(String value) {
		deploymentStatusInput.sendKeys(value);

		deploymentStatusInput.sendKeys(Keys.ENTER);
	}

	public void  headingClick() {
		headingTitle.click();
		
	}
	public void edgeAppNameSearchvalidate(String value) {
		edgeAppNameSearch.click();

		EdgeAppNameDeploymentInput.sendKeys(value);

	}

	public String get_Text_EdgeDeploymentAppName() {

		String deploymentAppName = deploymentAppNameTitle.getText();
		System.out.println("Title on Edge Device List page-->" + deploymentAppName);
		return deploymentAppName;

	}

	public String get_Text_EdgeDeploymentStatus() {

		String deploymentStatus = deploymentStatusTitle.getText();
		System.out.println("Deployment status is ->" + deploymentStatus);
		return deploymentStatus;

	}
	
	public void deploymenticonColumnsection() {
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		deploymenticonColumnsection.click();
	}
	
	public void applicationdeploymentCheckboxAll() {
		applicationdeploymentCheckboxAll.click();
	}
}
