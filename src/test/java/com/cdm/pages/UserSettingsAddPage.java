package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserSettingsAddPage extends CommonActions{

	public UserSettingsAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
		PageFactory.initElements(driver, this);
		
	}
	
	
@FindBy(xpath = "//div[@class='tableCard']/div/div/img[1]")
	
	WebElement refreshButton;
	
	
	@FindBy(xpath = "//input[@formcontrolname='firstname']") 
	WebElement firstNameInputAdd;
	

	@FindBy(xpath = "//input[@data-placeholder='Last Name']") 
	WebElement lastNameInputAdd;
	
	@FindBy(xpath = "//input[@data-placeholder='Phone Number']")
	 
	WebElement phoneNumberInputAdd;
	
	@FindBy(xpath = "//input[@data-placeholder='Email ID']") 
	WebElement emailidInputAdd;
	
	@FindBy(xpath = "//input[@data-placeholder='Password']") 
	WebElement passwordInputAdd;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationAdd;
	
	
	@FindBy(xpath = "//mat-select[@formcontrolname='defaultdashboard']")
	WebElement dashboardAdd;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='rolemasterid']")
	WebElement roleNameAdd;
	
	@FindBy(xpath = "//button[@class='addButton']") 
	WebElement saveButtonAdd;
	
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]") 
	WebElement cancelButtonAdd;
	
	
	@FindBy(xpath="//h3[@class='subTitle']")
	WebElement headingTitleAdd;
	
	
	public void headingTitleAdd() {
		headingTitleAdd.click();
	}
	public void refreshButton() {
		refreshButton.click();
	}
	

	public void firstNameinputAdd(String value) {
		
		firstNameInputAdd.sendKeys(Keys.ENTER);
		firstNameInputAdd.sendKeys(value);
	}
	
	public void lastNameinputAdd(String value) {
		
		lastNameInputAdd.sendKeys(Keys.ENTER);
		lastNameInputAdd.sendKeys(value);
	}
	
	public void phoneNumberInputAdd(String value) {
		phoneNumberInputAdd.sendKeys(Keys.ENTER);
		phoneNumberInputAdd.sendKeys(value);
	}
	
	public void emailidinputAdd(String value) {
		emailidInputAdd.sendKeys(Keys.ENTER);
		emailidInputAdd.sendKeys(value);
	}
	
	public void passwordInputAdd(String value) {
		passwordInputAdd.sendKeys(Keys.ENTER);
		passwordInputAdd.sendKeys(value);
	}
	
	public void roleNameinputAdd(String value) throws InterruptedException {
		
		SelectMatOption(roleNameAdd, value);
	}
	
	
	
	
	public void organizationAdd(String value) throws InterruptedException {

		SelectMatOption(organizationAdd, value);
	}
	
	public void dashboardAdd(String value) throws InterruptedException {

		SelectMatOption(dashboardAdd, value);
	}
	
	public void roleNameAdd(String value) throws InterruptedException {

		SelectMatOption(roleNameAdd, value);
	}
	
	
	
	public void saveButtonAdd() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",saveAddDataBtn);
		js.executeScript("document.querySelector(\".addButton\").click();",saveButtonAdd);
		}
			public void cancelButtonAdd() {
				cancelButtonAdd.click();
			}
			
			public String firstNameAddgetText() {
				return firstNameInputAdd.getText();
			}
			
			public String verified_str(String inputStr)
			{
			    String regexString = "[A-Za-z]";//"^[A-Z+$]";

			    if (inputStr.matches("[" + regexString + "]+"))
			    {
			        System.out.println("valid Alphabet"); 
			    }
			    else{

			        System.out.println("Invalid character in Name field");
			    }
			    return null;

			}
//			public String verifyValidationMessageEdgeId1verifyValidationMessageFirstNameUser() {
//				
//				
//
//			}
			@FindBy(xpath = "(//input[@formcontrolname='firstname']/../../../../../span)[2]")
			WebElement validationMessageverifyValidationMessageFirstNameUser;

			@FindBy(xpath = "(//input[@formcontrolname='lastname']/../../../../div/../../span)")
			WebElement verifyValidationMessageLastNameUser;
			
			
			@FindBy(xpath = "//div[contains(text(),'Numericals of length Min = 10 & Max = 16 character')]")
			WebElement verifyValidationMessageContact;
			
			@FindBy(xpath = "	//div[contains(text(),'Please enter a valid Phone Number !')]")
			WebElement verifyValidationMessagedigitwithSpace;
			
			
			@FindBy(xpath = "	//div[contains(text(),'Please enter a valid Phone Number !')]")
			WebElement verifyValidationMessagedigitwithZeros;

			public String verifyValidationMessageFirstNameUser() {
				if (validationMessageverifyValidationMessageFirstNameUser == null) {
					return "";
				}
				String message = validationMessageverifyValidationMessageFirstNameUser.getText();

				return message.trim();
			}
			
		

			public String verifyValidationMessageLastNameUser() {
				if (verifyValidationMessageLastNameUser == null) {
					return "";
				}
				String message = verifyValidationMessageLastNameUser.getText();

				return message.trim();
			}
			
			public String verifyValidationMessageContact() {
				if (verifyValidationMessageContact == null) {
					return "";
				}
				String message = verifyValidationMessageContact.getText();

				return message.trim();
			}
			
			

			public String verifyValidationMessageContactInvalid() {
				if (verifyValidationMessageContact == null) {
					return "";
				}
				String message = verifyValidationMessageContact.getText();

				return message.trim();
			}
			
			public String getAttributeContact() {
				return phoneNumberInputAdd.getAttribute("value");
				
			}
			public String verifyValidationMessagedigitwithSpace() {
				if (verifyValidationMessageContact == null) {
					return "";
				}
				String message = verifyValidationMessagedigitwithSpace.getText();

				return message.trim();
			}
			
			
			public String verifyValidationMessagedigitwithZeros() {
				if (verifyValidationMessageContact == null) {
					return "";
				}
				String message = verifyValidationMessagedigitwithZeros.getText();

				return message.trim();
			}
			
			
			
}
