package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DashboardPage extends CommonActions {
	
	
private WebDriver driver;
	
	public DashboardPage(WebDriver driver,ExtentTest logger) //created WebDriver Constructor
	{
		super(driver,logger);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	WebElement username;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginBtn;
	
	
	public void enteruserid(String userid)
	{
		SetInput(username, userid,userid+" has been entered into username field");
	}
	public void enterpwd(String pwd)
	{
		SetInput(password, pwd,pwd+" has been entered into password field");
	}
	public void clickLogin()
	{
		clickElement(LoginBtn,"Login button clicked");
	}

	

}
