package com.cdm.Stepdefinitions;

import com.cdm.pages.LicensesPage;

import io.cucumber.java.en.Then;

public class LicensesSteps extends BaseTest {
	@Then("Click on Licenses module from side menu bar")
	public void click_on_licenses_module_from_side_menu_bar() {
	  LicensesPage lp = new LicensesPage(driver, logger);
	  lp.licensetabmodule();
	}


}
