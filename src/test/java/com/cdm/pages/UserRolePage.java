package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserRolePage extends CommonActions {

	public UserRolePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	
                                                       
	}
	

	  @FindBy(xpath = "//div[contains(text(),'Role Name')]/../../..//mat-icon") 
    WebElement searchRoleName;
	  
	  
	  @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]/img[2]") 
	    WebElement editRoleButton;
	
	  
	  public void backDropShowing_Div_Click() {
			if (backDropShowing != null) {
				backDropShowing.click();
			}
		}

		@FindBy(css = ".cdk-overlay-backdrop-showing")
		WebElement backDropShowing;
	  
	  @FindBy(xpath = "//input[@name='rolename']") 
	    WebElement sendserchRoleName;
	  
	
	  @FindBy(xpath = "//div[@class='tableCard']/div/div/img[2]") 
      WebElement addbuttonuserRole;
	  
	  
	  public void addbuttonuserRole() {
		  addbuttonuserRole.click();
	  }
	  
	  public void searchRoleName() {
		  searchRoleName.click();
	  }
	  public void sendsearchRoleName(String value) {
//		  sendserchRoleName.sendKeys(Keys.ENTER);
//			((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", value, searchRoleName);
			sendserchRoleName.sendKeys(Keys.ENTER);
			sendserchRoleName.sendKeys(value);
	  }
	public void editRoleButton() throws InterruptedException {
		Thread.sleep(7000);
		editRoleButton.click();
	}
	
	
}
