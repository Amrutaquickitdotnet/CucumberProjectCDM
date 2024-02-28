package com.cdm.Stepdefinations;

import com.cdm.pages.ReportsPage;

import org.junit.Assert;

import com.cdm.pages.CalenderPage;

import io.cucumber.java.en.Then;

public class ReportSteps extends BaseTest {

	@Then("Click on Report module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() {
		ReportsPage report = new ReportsPage(driver, logger);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		report.reportsTab();
	}

	@Then("Minimise the screen and observe the UI carefully.")
	public void minimise_the_screen_and_observe_the_ui_carefully() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.minimiseWindow();
	}

	@Then("Maximize the screen")
	public void maximise_the_screen() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.maximiseWindow();

	}

	@Then("Open Networks tab and observe the UI carefully.")
	public void open_networks_tab_and_observe_the_ui_carefully() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.networkGreen();
		report.networkOrange();
	}
	
	@Then("Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message")
	public void without_selecting_audit_report_start_date_end_date_simply_hit_download_cta_and_observe_the_error_message() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.downloadButton();
		
		Assert.assertEquals("Mandatory field - required !","   Mandatory field - required ! ",report.verifyValidationMessageforReports());
	}
	
	

	@Then("verify page with resize option for the Reports page")
	public void verify_page_with_resize_option_for_the_reports_page() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.setdimension(300, 200);
		
	}

	@Then("Select Audit Report from the Report Type dropdown.")
	public void select_audit_report_from_the_report_type_dropdown() throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		report.reportTypeDropdown(alldata.get(vTCName).get("Value4").toString());
	}

	@Then("Select same date in the Start Date & End Date")
	public void select_same_date_in_the_start_date_end_date() throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		report.calicon();
		Thread.sleep(2000);

		CalenderPage cp = new CalenderPage(driver, logger);
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		cp.SelectDay(year, month, day);
		Thread.sleep(4000);
		
		report.caliconEndDate();
		Thread.sleep(2000);
		String yearEndDate = alldata.get(vTCName).get("Value5").toString();
		String monthEnd = alldata.get(vTCName).get("Value6").toString();
		String dayEnd = alldata.get(vTCName).get("Value7").toString();
		cp.SelectDay(yearEndDate, monthEnd, dayEnd);
		Thread.sleep(4000);
		
		
		
		
	}
	@Then("Click on download button")
	public void click_on_download_button() throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		Thread.sleep(4000);
		report.downloadButton();
		Thread.sleep(4000);
		
	}

}
