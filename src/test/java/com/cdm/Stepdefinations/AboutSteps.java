package com.cdm.Stepdefinations;

import com.cdm.pages.AboutPage;

import io.cucumber.java.en.Then;

public class AboutSteps extends BaseTest {

	@Then("verify page with resize option for the About page")
	public void verify_page_with_resize_option_for_the_about_page() {
		AboutPage about = new AboutPage(driver, logger);
		about.setZoomLevel(800, 600);
	}

	@Then("Click on About tab from right panel of the screen")
	public void click_on_about_tab_from_right_panel_of_the_screen() throws InterruptedException {
		AboutPage about = new AboutPage(driver, logger);
		Thread.sleep(4000);
		about.aboutTab();
	}

	@Then("verify colour of the heading Title")
	public void verify_colour_of_the_heading_title() throws InterruptedException {
		AboutPage about = new AboutPage(driver, logger);
		Thread.sleep(4000);
		about.captureTitleColor();
		about.verifyTitleColor(alldata.get(vTCName).get("Value1").toString());
	}

}
