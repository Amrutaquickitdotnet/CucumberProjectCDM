package com.cdm.Stepdefinition.EDGEDevices;

import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.cdm.Stepdefinitions.BaseTest;
import com.cdm.pages.EdgeDevicesPage;
import com.cdm.pages.LoginPage;
import com.cdm.pages.Menu;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EDGEDevicesSteps extends BaseTest{

	
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
	public void savereport() {
		extent.flush();
		driver.close();
	}

	@Given("User launch application in chrome browser")
	public void user_launch_application_in_chrome_browser() {
		
		 driver.get(prop.getProperty("AppUrl")+alldata.get(vTCName).get("Url"));
 
	}
	@When("user enters credentials and click on login button")
	public void user_enters_credentials_and_click_on_login_button() {
		LoginPage lp = new LoginPage(driver,logger); //object creation()
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	
	}
	@When("Succesfull login should be happen")
	public void succesfull_login_should_be_happen() {
		LoginPage lp = new LoginPage(driver,logger);
		lp.verifyDashboard();
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
	 
	
	@Then("Click on EDGE Device module from side menu bar")
	public void click_on_edge_device_module_from_side_menu_bar() {
		Menu edp=new Menu(driver,logger);
		edp.clickEdgeDevices();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		@Given("move to EdgeDevices tab")
		public void move_to_edge_devices_tab() {
		    // Write code here that turns the phrase above into concrete actions
			initiationData();
		}

		@Then("EdgeDevices tab should open")
		public void edge_devices_tab_should_open() {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@Then("check for Heading")
		public void check_for_heading() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("check for the table rows")
		public void check_for_the_table_rows() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("check for collapse button")
		public void check_for_collapse_button() {
		    // Write code here that turns the phrase above into concrete actions
		     
		}

}
