package com.cdm.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LoginPage extends CommonActions {
	
	
	
	public LoginPage(WebDriver driver,ExtentTest logger) //created WebDriver Constructor
	{
		super(driver,logger);
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")  //these all are locators
	WebElement username;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginBtn;

	@FindBy(xpath="//*[contains(text(),'Please Enter the Valid User Name and Password')]")
	WebElement errmsg;
	
	@FindBy(xpath="//*[text()='Password is required']")
	WebElement errmsgpassword;
	
	@FindBy(xpath="//*[text()='User Name is required']")
	WebElement errmsgusername;
	
	@FindBy(xpath="//span[@class='far fa-eye-slash showpwd']")
	WebElement showpasswordicon;
	
	@FindBy(xpath="//*[contains(text(),'Dashboard')]")
	WebElement dashboard;
	
	
	
	public void enteruserid(String userid)
	{
		SetInput(username, userid,userid+" has been entered into username field");
	}
	
	public void enterpwd(String pwd)
	{
		SetInput(password, pwd,pwd+" has been entered into password field");
	}
	
	public void clickshowpwd()
	{
		clickElement(showpasswordicon,"Clicked on show password");
	}
	
	public void clickLogin()
	{
		clickElement(LoginBtn,"Login button clicked");
	}
	
	public void login(String uid, String pass)
	{
		System.out.println("Login started");
		System.out.println(uid);
		System.out.println(pass);
		SetInput(username, uid,uid+" has been entered into username field");
		SetInput(password, pass,pass+" has been entered into password field");
		clickElement(LoginBtn,"Login button clicked");

	}
	
	public void verifyErrorMsg()
	{
		ElementExist(errmsg, "Error message validated successfully");
	}
	
	public void verifyDashboard()
	{
		ElementExist(dashboard, "Dashboard page displayed successfully");
	
	} 
	
	public void verifyErrorMsgusername()
	{
		ElementExist(errmsgusername, "Error message User Name is required validated successfully");
	}
	
	public void verifyErrorMsgpwd()
	{
		ElementExist(errmsgpassword, "Error message Password is required validated successfully");
		
	}	
	
	public void newTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
}


