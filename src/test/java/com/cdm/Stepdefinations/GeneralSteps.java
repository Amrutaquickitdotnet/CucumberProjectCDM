package com.cdm.Stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.ConfigurationsPage;
import com.cdm.pages.GeneralPage;

import io.cucumber.java.en.Then;

public class GeneralSteps extends BaseTest {

	@Then("Click on Genearl tab from right panel of the screen")
	public void click_on_genearl_tab_from_right_panel_of_the_screen() {
	    GeneralPage general = new GeneralPage(driver, logger);
	    general.generalTab();
	}
	}


