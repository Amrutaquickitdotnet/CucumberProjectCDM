package com.cdm.Stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cdm.pages.ConfigurationsPage;
import com.cdm.pages.DeploymentsmodulePage;
import com.cdm.pages.EdgeDeploymentsPage;
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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeploymentsSteps extends BaseTest {
	 
	@Then("verify page with resize option for the deployment page")
	public void verify_page_with_resize_option_for_the_deployment_page() {
	    DeploymentsmodulePage dp = new DeploymentsmodulePage(driver, logger);
	    dp.setZoomLevel(800, 600);
	}
	@Then("Click on Deployments module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		 dmp.deploymenttabclick();
	}
								
	@Then("Click on the Bulk Download button")
	public void click_on_the_bulk_download_button() {
		DeploymentsmodulePage dmp= new DeploymentsmodulePage(driver, logger);
		dmp.bulkDownloadButton();
	}
	
	@Then("Click on the Refresh button")
	public void click_on_the_refresh_button() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.refresh_Button();
	}
	@Then("Click on the Current View button")
	public void click_on_the_current_view_button() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		 dmp.currentView();
	}

	@Then("Click on deployment pagination it will display default records will display")
	public void click_on_deployment_pagination_it_will_display_default_records_will_display() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
		
		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));
	}
	

	}

	


