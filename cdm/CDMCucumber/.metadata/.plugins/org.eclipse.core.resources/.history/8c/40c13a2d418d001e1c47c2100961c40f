package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroups extends CommonActions{

	private WebDriver driver;
	
	public EdgeGroups(WebDriver driver,ExtentTest logger) {
		
		
		super(driver,logger);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//span[@class='full-width ng-star-inserted full-active']")
	WebElement EdgeGroup_btn;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[1]")
	WebElement Refresh_btn;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[1]/div/p/img")
	WebElement Collapse_btn;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[2]")
	WebElement Add_btn;
	
	//@FindBy(id =mat-input-36)
	//@FindBy(xpath="//input[@id='mat-input-36']")    tHis is to id locator with Page FActory
	WebElement Add_btn_function_Check;
	
	@FindBy(xpath="//button[@class='calButton']")
	WebElement Cancel_btn;
	
	@FindBy(xpath="//button[@class='addButton']")
	WebElement Save_btn;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-controller/div/div[1]/div/img[5]")
    WebElement Bulk_App_btn;
	
	@FindBy(xpath="//span[@class='titleHeadingsub']")
	WebElement Buld_App_Validation;
	
	@FindBy(xpath="//img[@class='mat-tooltip-trigger mr-2 ng-star-inserted']")
	WebElement Edit_btn;

	
	public void checkEdgeGrouptab() {
		
		clickElement(EdgeGroup_btn, "checkgroup tab");
		System.out.println("this has been run honey");
	}
	
	public void checkrefreshbtn() {
		ElementExist(Refresh_btn, getScreenshot());
	}
	
	public void checkAddbtn() {
		ElementExist(Add_btn, getScreenshot());
	}
	
	
}
