package com.cdm.Stepdefinitions;

import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;

import com.cdm.pages.HomePage;
import com.cdm.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps extends BaseTest {
	
	
	@Before
	public void getScenario(Scenario scenario) {
		//initiation();
		vTCName = scenario.getName();
		Collection<String> tagNames= scenario.getSourceTagNames();
		Iterator<String> itrator =tagNames.iterator();		
		while (itrator.hasNext()) {			 
			String temp=itrator.next();
			System.out.println("I am tag Name" + temp);
			if(temp.startsWith("@Sheet")) {
				tagName=temp.replace("@", "");
			System.out.println("I am tag Name" + tagName);
			}
		}
		initiationData();
		logger = extent.createTest(vTCName);
	}
	

@After
	public void savereport()
	{
		extent.flush();
		driver.close();
	}
	
	@Given("User launch application in chrome browser")               //methods
	public void user_should_be_on_login_page() throws InterruptedException {
		
		System.out.println("I am working in user_should_be_on_login_page");
		//WebDriverManager.chromedriver().setup();
		
		
		System.out.println(alldata.get(vTCName).get("Url"));
	    driver.get(prop.getProperty("AppUrl")+alldata.get(vTCName).get("Url"));
	    System.out.println("I am in End Of user_should_be_on_login_page" );
	 // Thread.sleep(5000);
	}
	@When("user enters credentials and click on login button")
	public void user_enters_valid_credentials_and_click_on_login_button() {
		System.out.println("I am working in user_enters_valid_credentials_and_click_on_login_button");
		LoginPage lp = new LoginPage(driver,logger); //object creation()
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
		
		
	}
	
	@When("user enters invalid credentials and click on login button")
	public void user_enters_invalid_credentials_and_click_on_login_button() {
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}
	
	@Then("Verify Error message for userid and password")
	public void Verify_Error_message_userid_password() {
		LoginPage lp = new LoginPage(driver,logger);
		lp.verifyErrorMsgusername();
		lp.verifyErrorMsgpwd();
	}
	
	
	@Then("verify page with resize the login page")
	public void verify_logipage_resize() throws InterruptedException {
		System.out.println("I am in start of verify_logipage_resize");
		LoginPage lp = new LoginPage(driver,logger);
		driver.manage().window().minimize();
		System.out.println("I am in start of verify_logipage_resize after maximize");
		
		logger.pass("window is resize to 50%");
		Thread.sleep(300);
		driver.manage().window().maximize();		
		logger.pass("window is resize to 100%");
		Thread.sleep(300);
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		logger.pass("window is resize to 150%");
		System.out.println("I am in start of verify_logipage_resize END");
		
		
	}
	
	@When("user register with valid data")
	public void user_register_with_valid_data() {
		System.out.println("I am in start of user_register_with_valid_data");
		
	}
	@Then("user should be login successfully")
	public void user_should_be_login_successfully() {
		System.out.println("I am in start of user_should_be_login_successfully");
		LoginPage lp = new LoginPage(driver,logger);
		lp.verifyDashboard();
	}
	
	@When("Verify forget password functionlity")
	public void verify_forget_password_functionlity() {
	    
	}
	
	@Then("Verify Error message")
	public void verify_error_message() {
		LoginPage lp = new LoginPage(driver,logger);
		lp.verifyErrorMsg();
	}

	@When("user enters valid userid")
	public void user_enters_valid_userid() throws InterruptedException {
		LoginPage lp = new LoginPage(driver,logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));		
		
	}

	@When("user enters valid password")
	public void user_enters_valid_password() throws InterruptedException {
		LoginPage lp = new LoginPage(driver,logger);
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		Thread.sleep(2000);
	}

	@When("click on show password")
	public void click_on_show_password() throws InterruptedException {
		LoginPage lp = new LoginPage(driver,logger);
		lp.clickshowpwd();
		Thread.sleep(2000);
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		LoginPage lp = new LoginPage(driver,logger);
		lp.clickLogin();
		Thread.sleep(5000);
	   
	}

	@When("click on change password and update new password")
	public void click_on_change_password_and_update_new_password() {
	   
	}

	@Then("login with new credentials")
	public void login_with_new_credentials() {
	    
	}

	

	@Given("User launch application in edge browser and perform login")
	public void user_launch_application_in_edge_browser() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get(prop.getProperty("AppUrl")+alldata.get(vTCName).get("Url"));
		Thread.sleep(5000);
		LoginPage lp = new LoginPage(d,logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	   
	}

	@When("Succesfull login should be happen")
	public void succesfull_login_should_be_happen() {
		LoginPage lp = new LoginPage(driver,logger);
		lp.verifyDashboard();
	}

	@When("Enter on login button")
	public void enter_on_login_button() {
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
	    logger.pass("press enter button from keyboard");
	}

	@When("calculate login time")
	public void calculate_login_time() {
	    
	}

	@When("click on cancel button")
	public void click_on_cancel_button() {
	   
	}

	@When("verify all fields should be clear")
	public void verify_all_fields_should_be_clear() {
	  
	}

	@When("verify all fields color and fonts")
	public void verify_all_fields_color_and_fonts() {
	    
	}

	@When("click on back button and verify page")
	public void click_on_back_button_and_verify_page() {
	    
	}

	@When("click on logout")
	public void click_on_logout() {
	    
	}

	@When("verify login page")
	public void verify_login_page() {
	    
	}

	@When("open new tab")
	public void open_new_tab() {
          
	}

	@When("user enters alphanumeric value in userid")
	public void user_enters_alphanumeric_value_in_userid() {
	   
	}
}
	
	