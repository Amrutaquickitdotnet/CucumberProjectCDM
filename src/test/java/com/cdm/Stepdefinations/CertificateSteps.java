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
	@Then("fill the value for Certificate name Organization and validity")
	public void fill_the_value_for_certificate_name_organization_and_validity() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateName(alldata.get(vTCName).get("CertificateName"));
		cert.OrganizationField(alldata.get(vTCName).get("CertificateOrganization"));
        cert.validitydaysinputOnboarding(alldata.get(vTCName).get("CertificateValidity"));
	}

	@Then("Verification of the accessible the screen by using wi-fi network")
	public void verification_of_the_accessible_the_screen_by_using_wi_fi_network() {
	   //Can not automate
	}

	
	@Then("choose option Server TLS from certificate dropdown")
	public void choose_option_server_tls_from_certificate_dropdown() throws InterruptedException {

		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
	}

	@Then("choose option Server onboarding from certificate dropdown")
	public void choose_option_server_onboarding_from_certificate_dropdown() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
	}
	
	@Then("verify visibility duration to load page of certificate")
	public void verify_visibility_duration_to_load_page_of_certificate() {
	   
	}

	@Then("fill the value for IP Group and validity")
	public void fill_the_value_for_ip_group_and_validity() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.IPinput(alldata.get(vTCName).get("ServerIP").toString());
		cert.groupInput(alldata.get(vTCName).get("ServerGroup").toString());
		cert.validitydaysinput(alldata.get(vTCName).get("ServerValidity").toString());
	}

	@Then("click on download button")
	public void click_on_download_button() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.downloadButton();
	}

	@Then("fill the value for Certificate Name Organization Validity and click on download button")
	public void fill_the_value_for_certificate_name_organization_validity_and_click_on_download_button()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Thread.sleep(4000);
		cert.certificateName(alldata.get(vTCName).get("CertificateName").toString());
		cert.OrganizationField(alldata.get(vTCName).get("CertificateOrganization").toString());
		cert.validitydaysinputOnboarding(alldata.get(vTCName).get("CertificateValidity").toString());
	}
}
