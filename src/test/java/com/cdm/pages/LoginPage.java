package com.cdm.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LoginPage extends CommonActions {

	public LoginPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']") // these all are locators
	WebElement username;

	@FindBy(xpath = "//h2[contains(text(),'Login')]")
	WebElement loginheaderTitle;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement LoginBtn;

	@FindBy(xpath = "//*[contains(text(),'Please Enter the Valid User Name and Password')]")
	WebElement errmsg;

	@FindBy(xpath = "//*[text()='Password is required']")
	WebElement errmsgpassword;

	@FindBy(xpath = "//*[text()='User Name is required']")
	WebElement errmsgusername;

	@FindBy(xpath = "//span[@class='far fa-eye-slash showpwd']")
	WebElement showpasswordicon;

	@FindBy(xpath = "//*[contains(text(),'default')]")
	WebElement dashboard;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/button[1]/span[1]/img[1]")
	WebElement profileIcon;

	@FindBy(xpath = "//span[contains(text(),'Super Admin')]")
	WebElement SuperAdmin;

	public void initializeWebDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		}
		// You can add more browsers based on your requirements
	}

	public void pressEnterKey() {
		password.sendKeys(Keys.ENTER);
	}

	public void verifyTitle() {

	}

	public void calculateLoginTime() {
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();

		// Calculate and print the login time
		long loginTime = endTime - startTime;
		System.out.println("Time taken to log in: " + loginTime + " milliseconds");

	}

	public void enterCredentials(String uname, String pwd) {

		username.sendKeys(uname);
		password.sendKeys(pwd);
	}

	public void clickLoginButton() {

		LoginBtn.click();
	}

	public void profileIcon() {
		profileIcon.click();
	}

	public void SuperAdmin() {
		SuperAdmin.click();
	}

	public void enteruserid(String userid) {
		SetInput(username, userid, userid + " has been entered into username field");
	}

	public void enterpwd(String pwd) {
		SetInput(password, pwd, pwd + " has been entered into password field");
	}

	public void clickshowpwd() {
		clickElement(showpasswordicon, "Clicked on show password");
	}

	public void clickLogin() {
		clickElement(LoginBtn, "Login button clicked");
	}

	public void login(String uid, String pass) {
		System.out.println("Login started");
		System.out.println(uid);
		System.out.println(pass);
		SetInput(username, uid, uid + " has been entered into username field");
		SetInput(password, pass, pass + " has been entered into password field");
		clickElement(LoginBtn, "Login button clicked");

	}

	public void verifyErrorMsg() {
		ElementExist(errmsg, "Error message validated successfully");
	}

	public void verifyDashboard() {
		ElementExist(dashboard, "Dashboard page displayed successfully");

	}

	public void verifyErrorMsgusername() {
		ElementExist(errmsgusername, "Error message User Name is required validated successfully");
	}

	public void verifyErrorMsgpwd() {
		ElementExist(errmsgpassword, "Error message Password is required validated successfully");

	}

	public void newTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}

	public void verifyFont(WebElement element, String expectedFont) {
		String actualFont = element.getCssValue("font-family");

		Assert.assertEquals(expectedFont, actualFont);
	}

	public void verifyTextColor(WebElement element, String expectedColor) {
		String actualColor = element.getCssValue("color");

		Assert.assertEquals(expectedColor, actualColor);
	}

	public void verifyColorCoding(WebElement element, String expectedColorCode) {
		String actualColorCode = element.getCssValue("background-color");

		Assert.assertEquals(expectedColorCode, actualColorCode);
	}

	public WebElement getUsernameInput() {
		return username;
	}

	public WebElement getPasswordInput() {
		return password;
	}

	public void enterCredentialsLogin(String username, String password) {
		getUsernameInput().sendKeys(username);
		getPasswordInput().sendKeys(password);

	}
}
