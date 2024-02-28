package com.cdm.Stepdefinations;

import java.awt.AWTException;

import org.junit.Assert;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.DeploymentsmodulePage;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.Then;

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
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
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

	@Then("Click on EDGE Name search icon i.e. three dots & enter invalid inputs into search text field")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeNameThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputEdgeNameDeploy(alldata.get(vTCName).get("Value1").toString());
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

	@Then("Click on EDGE Name search icon of deployment page i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_name_search_icon_of_deployment_page_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeNameThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputEdgeNameDeploy(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on App Name search icon i.e. three dots & enter Valid inputs into search text field of App Name")
	public void click_on_app_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field_of_app_name()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on App Name search icon i.e. three dots & enter invalid inputs into search text field")
	public void click_on_app_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on Status Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_status_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputStatusDeploy(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("Click on Error search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_error_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.errorThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputErrorDeploy(alldata.get(vTCName).get("Value4").toString());
	}

	@Then("Click on Running Version search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_running_version_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputRunningVersion(alldata.get(vTCName).get("Value5").toString());
	}

	@Then("Click on Expected Version invalid search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_expected_version_invalid_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.expectedVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputExpectedVersion(alldata.get(vTCName).get("Value6").toString());
	}

	@Then("Enter valid inputs into search text field of Edge name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_edge_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeNameThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputEdgeNameDeploy(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForEdgeName();

	}

	@Then("Enter valid inputs into search text field of app name of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_app_name_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForappName();

	}

	@Then("Enter valid inputs into search text field of app name of deployment")
	public void enter_valid_inputs_into_search_text_field_of_app_name_of_deployment() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("Value2").toString());
		dmp.backDropShowing_Div_Click();
		Thread.sleep(2000);
	}

	@Then("Enter valid inputs into search text field of status name of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_status_name_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputStatusDeploy(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForStatus();
	}

	@Then("Enter valid inputs into search text field of error of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_error_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.errorThreeDotDeploy();
		Thread.sleep(3000);
		try {
			dmp.inputErrorDeploy(alldata.get(vTCName).get("Value4").toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

		Thread.sleep(5000);
		dmp.errorThreeDotDeploy();
		dmp.removalofEnteredTextForError();
	}

	@Then("Enter valid inputs into search text field of running version of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_running_version_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputRunningVersion(alldata.get(vTCName).get("Value5").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForRunningVersion();
	}

	@Then("Enter valid inputs into search text field of Expected Version of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_expected_version_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.expectedVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputExpectedVersion(alldata.get(vTCName).get("Value6").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForExpectedVersion();
	}

	@Then("click on the link show more from the Error column")
	public void click_on_the_link_show_more_from_the_error_column() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(5000);
		dmp.showMoreLink();
	}

	@Then("scroll horizontal and click on the info icon")
	public void scroll_horizontal_and_click_on_the_info_icon() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		dmp.infoicon();
	}

	@Then("scroll horizontal")
	public void scroll_horizontal() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

	}

	@Then("click on the info icon")
	public void click_on_the_info_icon() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(3000);
		dmp.infoicon();
	}

	@Then("Enter valid inputs into search text field of volume name  of volumename details page and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_of_volumename_details_page_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		try {

			dmp.volumeNamePopUpThreeDot();

		} catch (Exception e) {

		}
		dmp.inputVolumeNameDetailsPageDeploy(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(6000);

	}

	@Then("Enter valid inputs into search text field of volume name of status column deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_of_status_column_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException, AWTException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		// dmp.titleheadingvolumeDetailsPage();
		try {

			dmp.volumeDetailsStatusThreeDot();

		} catch (Exception e) {

		}
		dmp.inputVolumeStatusDetailsDeploy(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(6000);

	}

	@Then("Enter valid inputs into search text field of volume name of error column deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_of_error_column_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");
		// dmp.titleheadingvolumeDetailsPage();
		try {

			dmp.DeployedVolumeDetailserrorThreeDot();

		} catch (Exception e) {

		}
		dmp.inputErrorDetailsPageDeploy(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(6000);

	}

	@Then("Click on createdDateThreeDot icon and enter the value in datepickercolumn")
	public void click_on_created_date_three_dot_icon_and_enter_the_value_in_datepickercolumn() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.createdDateVolumeDeployDetailsThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		dmp.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dmp.applybuttoncalender();
	}

	@Then("Click on deploymentDateThreeDot icon and enter the value in datepickercolumn")
	public void click_on_deployment_date_three_dot_icon_and_enter_the_value_in_datepickercolumn() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);

		dmp.deploymentDateThreeDotDeploy();
		CalenderPage cal = new CalenderPage(driver, logger);
		dmp.calenderIcon();
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dmp.applybuttoncalender();
	}

	@Then("Click on lastupdatedThreeDot icon and enter the value in datepickercolumn")
	public void click_on_lastupdated_three_dot_icon_and_enter_the_value_in_datepickercolumn() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.lastUpdatedThreeDotDeploy();
		CalenderPage cal = new CalenderPage(driver, logger);
		dmp.calenderIcon();
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dmp.applybuttoncalender();
	}

	@Then("Enter valid inputs into search text field of created date of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_created_date_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");
		// dmp.titleheadingvolumeDetailsPage();
		try {

			dmp.createdDateVolumeDeployDetailsThreeDot();

		} catch (Exception e) {

		}
		dmp.inputErrorDetailsPageDeploy(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(6000);

	}

	@Then("Click on deployment pagination it will display records will display")
	public void click_on_deployment_pagination_it_will_display_records_will_display() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.volumepageRecord();

	}

	@Then("Click on close button")
	public void click_on_close_button() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(4000);
		dmp.closevolume();
	}

	@Then("verify progress bar")
	public void verify_progress_bar() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.downloadStatus();
	}

	@Then("Enter valid inputs into search text field of Volume name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_and_enter_backspace_click_on_enter() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		try {

			dmp.volumeNamePopUpThreeDot();

		} catch (Exception e) {

		}
		dmp.inputVolumeNameDetailsPageDeploy(alldata.get(vTCName).get("Value1").toString());
		dmp.removalofEnteredTextForVolumeName();

	}

	@Then("Enter valid inputs into search text field of status  and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_status_and_enter_backspace_click_on_enter() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		try {

			dmp.volumeDetailsStatusThreeDot();

		} catch (Exception e) {

		}
		dmp.inputVolumeStatusDetailsDeploy(alldata.get(vTCName).get("Value2").toString());
		dmp.removalofEnteredTextForStatusDetails();
	}

	@Then("Click on pagination part it will display default records will display")
	public void click_on_pagination_part_it_will_display_default_records_will_display() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);

		Thread.sleep(7000);
		Assert.assertTrue("Row count match for next page", p.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on pagination to check functionality of Full Backward arrow")
	public void click_on_pagination_to_check_functionality_of_full_backward_arrow() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);
		p.nextPageClickAndCountOnLastPage(rowPerPage);
		Assert.assertTrue("Row count match for first page", p.firstPageFullBackwardArrow(rowPerPage));
	}

	@Then("Click on pagination to check functionality of Full forward arrow")
	public void click_on_pagination_to_check_functionality_of_full_forward_arrow() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);

		Thread.sleep(7000);
		Assert.assertTrue("Row count match for full forward means Last page", p.fullforwardArrowClick(rowPerPage));
	}

	@Then("Click on pagination to check Next button\\(Forward arrow) functionality")
	public void click_on_pagination_to_check_next_button_forward_arrow_functionality() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);

		Thread.sleep(7000);
		Assert.assertTrue("Row count match for next page", p.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on pagination to check Previous Page button\\(Backward arrow) functionality")
	public void click_on_pagination_to_check_previous_page_button_backward_arrow_functionality() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(5000);
		Assert.assertTrue("Row count match for Previous page", p.previousPageClickAndCount(rowPerPage));
	}

	@Then("Enter valid inputs into search text field of error details list page  and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_error_details_list_page_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);

		dmp.scrollingElementRightBar("div.example-container", "900");

		try {
			Thread.sleep(3000);

			dmp.DeployedVolumeDetailserrorThreeDot();

		} catch (Exception e) {

		}
		dmp.inputErrorDetailsPageDeploy(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(5000);

		try {
			dmp.removalofEnteredTextForErrorDetails();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
