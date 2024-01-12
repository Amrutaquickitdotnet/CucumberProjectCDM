package com.cdm.Stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import com.cdm.pages.ConfigurationsPage;
import com.cdm.pages.DeploymentsPage;
import com.cdm.pages.DeviceLogs;
import com.cdm.pages.EdgeAppConfigurationPage;
import com.cdm.pages.EdgeDeviceAdd;
import com.cdm.pages.EdgeDeviceEdit;
import com.cdm.pages.EdgeDevicesPage;
import com.cdm.pages.EdgeGroupConfigurationPage;
import com.cdm.pages.EnvironmentalVariablePage;
import com.cdm.pages.Menu;
import com.cdm.pages.Pagination;
import com.cdm.pages.WellMapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeploymentSteps extends BaseTest {
	@Then("verify page for resize option the login page")
	public void verify_page_for_resize_option_the_login_page() {
		driver.manage().window().fullscreen();
		DeploymentsPage dp = new DeploymentsPage(driver, logger);
		dp.setZoomLevel(800, 600);

	}
	
	@Then("user is landing on dashboard then click on Deployment tab at the left corner of the page")
	public void user_is_landing_on_dashboard_then_click_on_deployment_tab_at_the_left_corner_of_the_page() {
		DeploymentsPage dp = new DeploymentsPage(driver, logger);
		dp.deploymenttabclick();
	}
	
	@Then("click on three dots for Edge Name")
	public void click_on_three_dots_for_edge_name() {
		DeploymentsPage dp = new DeploymentsPage(driver, logger);
		
		dp.edgeNameSearchDot();
	}
	
	
	@Then("enter the value for Edge Name")
	public void enter_the_value_for_edge_name() {
		DeploymentsPage dp = new DeploymentsPage(driver, logger);
		dp.edgeNameInput(alldata.get(vTCName).get("Value2").toString());
	}




}