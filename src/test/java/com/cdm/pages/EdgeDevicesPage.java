package com.cdm.pages;

import java.util.Iterator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDevicesPage extends CommonActions {

	public EdgeDevicesPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Add')]")
	WebElement AddButtonEdgeDevice;

	@FindBy(xpath = "//h2[@class='titleHeading']")
	WebElement WebDevices_heading;

	// ScrollIntoView
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-device/div/div[2]/div/table/thead/tr/th[6]/div/span/div/div[1]")
	WebElement Status_Heading;

	@FindBy(xpath = "//td[@class='mat-cell cdk-cell table-data cdk-column-devicename mat-column-devicename ng-star-inserted']")
	WebElement Number_of_devices;

	@FindBy(how = How.XPATH, using = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Refresh_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement Add_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[3]")
	WebElement BulkUpload_btn;

	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[4]")
	WebElement Download_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device[1]/div[1]/div[1]/div[1]/img[5]")
	WebElement Configuration_Icon_Button;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeIdsearchClickDot;
	
	
	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeGroupNameIconDot;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeNameSearchIconDot;

	
	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeappGroupsIconDot;
	
	@FindBy(xpath="//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareName;
	
	@FindBy(xpath="//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement status;
	
	
	
	@FindBy(xpath = "//input[@name='devicename']")
	WebElement edgeIdInput;
	

	@FindBy(xpath = "//input[@name= 'displayname']")
	WebElement edgeNameInput;
	
	@FindBy(xpath = "//input[@name= 'appgroupname']")
	 WebElement edgeAppgroupsInput;
	

	@FindBy(xpath = "//input[@name='controllername']")
	WebElement edgeGroupNameInput;
	
	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardWareNameInput;
	
	
	@FindBy(xpath = "//h2[contains(text(),'EDGE Devices')]")
	WebElement headingTitle;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement EditButton;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[2]")
	WebElement DeleteButton;

	@FindBy(xpath = "//span[normalize-space()='Yes']")
	WebElement ConfirmationYesButton;

	@FindBy(xpath = "//span[contains(text(),'No')]")
	WebElement ConfirmationNoButton;

	@FindBy(css = ".mat-tooltip.mat-tooltip-show")
	WebElement DeleteButtonToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[3]")
	WebElement viewAlertButton;

	@FindBy(css = ".mat-tooltip.mat-tooltip-show")
	WebElement AlertButtonToolTip;

	
	//
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	@FindBy(css = ".cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing")
	WebElement backDropTransparent;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[4]")
	WebElement deployclickfromActionsColumn;
	
	/*
	 * @FindBy(xpath =
	 * "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/h4[1]")
	 * WebElement deployListpageVerification;
	 */
	
	
	public void clickondeployimage() {
		
		clickElement(deployclickfromActionsColumn, "Clicking on deploy icon from the list page");
		//deployclickfromActionsColumn.click();
	}
	
	
	public String get_Text_ToolTipviewAlert() {
		scrollingElementRightBar("div.example-container", "900");
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mouseHover(viewAlertButton);

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// mouseRollHoverDelete();
		String toolTipAlert = AlertButtonToolTip.getText();
		System.out.println("toolTipText-->" + toolTipAlert);
		return toolTipAlert;
	}

	public void mouseRollHoverDelete() {
		scrollingElementRightBar("div.example-container", "900");
		mouseHover(DeleteButton);
	}

	
	
	
	public String get_Text_ToolTipDelete() {
		// To get the tool tip text and assert
		scrollingElementRightBar("div.example-container", "900");
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mouseHover(DeleteButton);

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// mouseRollHoverDelete();

		String deletetoolTipText = DeleteButtonToolTip.getText();

		System.out.println("toolTipText-->" + deletetoolTipText);

		return deletetoolTipText;
	}

	public void edgeIdSearch_Button() {
		
		clickElement(edgeIdsearchClickDot, "Clicking on 3 dots for Edge Id ");

		//edgeIdsearchClickDot.click();
	}

	public void edgeNameSearch_Button() {
		
		clickElement(edgeNameSearchIconDot, "Clicking on 3 dots for Edge Name ");
		//edgeNameSearchIconDot.click();
	}
	
	public void backDropShowing_Div_Click() {
		if(backDropShowing!=null) {
			backDropShowing.click();
		}
	}
	
	public void backDropTransparent_Div_Click() {
		if(backDropTransparent!=null) {
			backDropTransparent.click();
		}
	}
	
	public void edgeGroupNameSearch_Button() {

		clickElement(edgeGroupNameIconDot, "Clicking on 3 dots of edgeGroupName");
		//edgeGroupNameIconDot.click();
	}
	
	public void edgeAppGroupsSearch_Button() {
		clickElement(edgeappGroupsIconDot, "Clicking on 3 dots of edgeAppGroups");
		//edgeappGroupsIconDot.click();
	}
	
	public void hardwareNameSearchDot() {
		clickElement(hardwareName, "Clicking on 3 dots of HardwareName");

		//hardwareName.click();
	}
	public void  headingClick() {
		clickElement(headingTitle, "Clicking on Title of heading");
		//headingTitle.click();
	}
	public void Confirmation_YesButton() {
		clickElement(ConfirmationYesButton, "Clicking on confirmation message");
		//ConfirmationYesButton.click();
	}

	public void Confirmation_NoButton() {
		clickElement(ConfirmationNoButton, "Clicking on confirmation on Cancel button");
		ConfirmationNoButton.click();
	}

	public void clickRefreshButton() {
		clickElement(Refresh_btn, "Clicking on confirmation on refresh button");
		Refresh_btn.click();
	}

	public void sendValueSearchIcon(String value) {

		edgeIdInput.sendKeys(value);
		edgeIdInput.sendKeys(Keys.ENTER);
	}

	public void sendValueSearchIconByEdgeName(String value) {

		edgeNameInput.sendKeys(value);
		edgeNameInput.sendKeys(Keys.ENTER);
		
	}
	
	public void editValueSearchIconByEdgeName(String value) {
        edgeNameInput.sendKeys(Keys.ENTER);
        
		edgeNameInput.sendKeys(value);
		edgeNameInput.sendKeys(Keys.ENTER);
		
	}
	
	public void sendValueSearchinputBoxForEdgeGroupName(String value) {

		edgeGroupNameInput.sendKeys(value);
	}

	
	public void sendValueSearchIconByAppGroups(String value) {

		edgeAppgroupsInput.sendKeys(value);
	}
	public void hardwareNameInput(String value) {

		hardWareNameInput.sendKeys(value);
	}
	
	
	
public String removalofEneredTextForEdgeId() {
		
	return removalofEneredText(edgeIdInput);
		 
	}

public String removalofEneredTextForEdgeName() {
	
	return removalofEneredText(edgeNameInput);
		 
	}
	


	
	public void clickAddButton() {
		clickElement(Add_btn, "Clicking on add button");
		//Add_btn.click();
	}

	public void clickBulkUpload() {
		clickElement(BulkUpload_btn, "Clicking on bulkUpload button");
		BulkUpload_btn.click();
	}

	public void clickDownload() {

		Download_btn.click();
	}

	public void clickConfiguration() {

		Configuration_Icon_Button.click();
	}

	public boolean isVisibleRefresh() {

		return Refresh_btn != null && Refresh_btn.isDisplayed();
	}

	public boolean isVisibleAdd() {

		return Add_btn != null && Add_btn.isDisplayed();
	}
	
	public boolean isVisibleEdgeIdSearchbox() {

		return edgeIdInput != null && edgeIdInput.isDisplayed();
	}

	public boolean isVisibleUpload() {

		return BulkUpload_btn != null && BulkUpload_btn.isDisplayed();
	}

	public boolean isVisibleDownload() {

		return Download_btn != null && Download_btn.isDisplayed();
	}

	public boolean isVisibleSettingButton() {

		return Configuration_Icon_Button != null && Configuration_Icon_Button.isDisplayed();
	}

	public void clickEditButton() {

		scrollingElementRightBar("div.example-container", "900");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditButton.click();
	}

	public void clickDeleteButton() {

		scrollingElementRightBar("div.example-container", "900");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DeleteButton.click();
	}
	
public String get_Text_AddEdgeDevice() {
	
	String BreadcrumbAdd = AddButtonEdgeDevice.getText();
	System.out.println("toolTipText-->" + BreadcrumbAdd);
	return BreadcrumbAdd;
	
		
	}

public String get_Text_EdgeListHeading() {
	
	String EdgeDeviceList = WebDevices_heading.getText();
	System.out.println("Title on Edge Device List page-->" + EdgeDeviceList);
	return EdgeDeviceList;
	
		
	}


public  void setZoomLevel(int height , int width) {
	Dimension d = new Dimension(height, width);
	driver.manage().window().setSize(d);
}
public void WebDevices_heading() 
{
	WebDevices_heading.click();
	}




}