package com.cdm.Stepdefinations;

import com.cdm.pages.CertificatesPage;

import io.cucumber.java.en.Then;

public class CertificateSteps extends BaseTest {
	@Then("verify page with resize option for the certificate page")
	public void verify_page_with_resize_option_for_the_certificate_page() {
		
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.setZoomLevel(800, 600);
	}

	@Then("Click on Certificate tab from right panel of the screen")
	public void click_on_certificate_tab_from_right_panel_of_the_screen() throws InterruptedException {

		
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateTabClick();
		Thread.sleep(4000);
	}
	
	
	@Then("choose option Server LTs from certicate dropdown")
	public void choose_option_server_l_ts_from_certicate_dropdown() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateType(alldata.get(vTCName).get("Value1").toString());
	}
	
	@Then("choose option Server onboarding from certicate dropdown")
	public void choose_option_server_onboarding_from_certicate_dropdown() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateType(alldata.get(vTCName).get("Value2").toString());
	}

}
