package com.cdm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserSettingsEditPage extends CommonActions{

	public UserSettingsEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	@FindBy(xpath = "//input[@formcontrolname='firstname']") 
	WebElement firstNameInputEdit;
	

	@FindBy(xpath = "//input[@data-placeholder='Last Name']") 
	WebElement lastNameInputEdit;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Phone Number']")
	 
	WebElement phoneNumberInputEdit;
	
	@FindBy(xpath = "//input[@data-placeholder='Email ID']") 
	WebElement emailidInputEdit;
	
	@FindBy(xpath = "//input[@data-placeholder='Password']") 
	WebElement passwordInputEdit;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationEdit;
	
	
	@FindBy(xpath = "//mat-select[@formcontrolname='defaultdashboard']")
	WebElement dashboardEdit;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='rolemasterid']")
	WebElement roleNameEdit;
	
	@FindBy(xpath = "//button[@class='addButton']") 
	WebElement saveButtonEdit;
	
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]") 
	WebElement cancelButtonEdit;
	
	
	@FindBy(xpath="//h3[@class='subTitle']")
	WebElement headingTitleEdit;
	
	
	public void headingTitleEdit() {
		headingTitleEdit.click();
	}
	

	public void firstNameinputEdit(String value) {
		
		firstNameInputEdit.sendKeys(Keys.ENTER);
		firstNameInputEdit.sendKeys(value);
	}
	
	public void lastNameinputEdit(String value) {
		
		lastNameInputEdit.sendKeys(Keys.ENTER);
		lastNameInputEdit.sendKeys(value);
	}
	
	public void phoneNumberInputEdit(String value) {
		phoneNumberInputEdit.sendKeys(Keys.ENTER);
		phoneNumberInputEdit.sendKeys(value);
	}
	
	public void emailidinputEdit(String value) {
		emailidInputEdit.sendKeys(Keys.ENTER);
		emailidInputEdit.sendKeys(value);
	}
	
	public void passwordInputEdit(String value) {
		passwordInputEdit.sendKeys(Keys.ENTER);
		passwordInputEdit.sendKeys(value);
	}
	
	public void roleNameinputEdit(String value) {
		roleNameEdit.sendKeys(Keys.ENTER);
		roleNameEdit.sendKeys(value);
	}
	
	
	
	
	public void organizationEdit(String value) throws InterruptedException {

		SelectMatOption(organizationEdit, value);
	}
	
	public void dashboardEdit(String value) throws InterruptedException {

		SelectMatOption(dashboardEdit, value);
	}
	
	public void roleNameEdit(String value) throws InterruptedException {

		SelectMatOption(roleNameEdit, value);
	}
	
	
	
	public void saveButtonEdit() {
		saveButtonEdit.click();
		}
			public void cancelButtonEdit() {
				cancelButtonEdit.click();
			}
			
			public String firstNameEditgetText() {
				return firstNameInputEdit.getText();
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
				return phoneNumberInputEdit.getAttribute("value");
				
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
			
	
			public String removalofEnteredTextForFirstNameEdit() {

				return removalofEneredText(firstNameInputEdit);

			}
			
			public String removalofEnteredTextForLastNameEdit() {

				return removalofEneredText(lastNameInputEdit);
			

			}
			
			public String removalofEnteredTextForPhoneNoEdit() {

				return removalofEneredText(phoneNumberInputEdit);

			}
			
			public String removalofEnteredTextForEmailId() {

				return removalofEneredText(emailidInputEdit);

			}
			
			public String removalofEnteredTextForPassword() {

				return removalofEneredText(passwordInputEdit);

			}
			
			
			
}
