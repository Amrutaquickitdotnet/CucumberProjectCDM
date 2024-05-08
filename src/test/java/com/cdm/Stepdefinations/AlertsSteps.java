package com.cdm.Stepdefinations;

import java.awt.AWTException;

import org.junit.Assert;

import com.cdm.pages.AlertsAcknowledgePage;
import com.cdm.pages.AlertsPage;
import com.cdm.pages.CalenderPage;
import com.cdm.pages.AlertsPage;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.Then;

public class AlertsSteps extends BaseTest {

	@Then("verify page with resize option for the Alert page")
	public void verify_page_with_resize_option_for_the_alert_page() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.setZoomLevel(800, 600);

	}

	@Then("Click on Alerts module from side menu bar")
	public void click_on_alerts_module_from_side_menu_bar() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.movetoalerttab();
	}
	
	@Then("click on bulk download button of alerts")
	public void click_on_bulk_download_button_of_alerts() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.bulkDownloadButton();
	}

	@Then("Click on the Refresh button for alerts")
	public void click_on_the_refresh_button_for_alerts() throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.refresh_Button();
		Thread.sleep(4000);
	}

	@Then("click on three dots of AssignedTo field and enter the value for AssignedTo Field")
	public void click_on_three_dots_of_assigned_to_field_and_enter_the_value_for_assigned_to_field()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.assignedToThreeDot();
		alerts.assignedToInput(alldata.get(vTCName).get("AssignedToSearch"));
		Thread.sleep(5000);
	}

	@Then("click on three dots of Priority Level field and enter the value for Priority Level Field")
	public void click_on_three_dots_of_priority_level_field_and_enter_the_value_for_priority_level_field() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.priorityThreeDot();
		alerts.priorityInputLow();
	}

	@Then("Click on Alert ID search icon of alert page i.e. three dots & enter Valid inputs into search text field")
	public void click_on_alert_id_search_icon_of_alert_page_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertIDThreeDot();

		alerts.alertIDInput(alldata.get(vTCName).get("AlertIDSearch"));
		alerts.backDropShowing_Div_Click();
		Thread.sleep(5000);
	}

	@Then("Click on Alert ID search icon of alert page i.e. three dots & enter inValid inputs into search text field")
	public void click_on_alert_id_search_icon_of_alert_page_i_e_three_dots_enter_in_valid_inputs_into_search_text_field()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertIDThreeDot();

		alerts.alertIDInput(alldata.get(vTCName).get("AlertIDSearch"));
		alerts.backDropShowing_Div_Click();
		Thread.sleep(5000);
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & enter Valid inputs into search text field")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();

	}

	@Then("Click on Summary search icon i.e. three dots & enter valid inputs into search text field")
	public void click_on_summary_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.summaryThreeDot();
		Thread.sleep(4000);
		alerts.alertSummary(alldata.get(vTCName).get("SummarySearch"));
	}

	@Then("Click on edge name search icon i.e. three dots & enter valid inputs into search text field")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.edgenamethreeDot();
		Thread.sleep(4000);
		alerts.edgenameInput(alldata.get(vTCName).get("EdgeNameSearch"));
		alerts.backDropShowing_Div_Click();
		Thread.sleep(4000);
	}

	@Then("Click on raisedOnThreeDots icon and enter the value in datepickercolumn")
	public void click_on_raised_on_three_dots_icon_and_enter_the_value_in_datepickercolumn()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.raisedOnThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		alerts.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("RaisedOnYear").toString();
		String month = alldata.get(vTCName).get("RaisedOnMonth").toString();
		String day = alldata.get(vTCName).get("RaisedOnStartDate").toString();
		String day2 = alldata.get(vTCName).get("RaisedOnEndDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alerts.applybuttoncalender();

	}

	@Then("remove search result")
	public void remove_search_result() throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.edgenamethreeDot();
		alerts.removalofEnteredTextForEdgeName();
		Thread.sleep(4000);
	}

	@Then("remove text from alert ID")
	public void remove_text_from_alert_id() throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertIDThreeDot();
		alerts.removalofEnteredTextForAlertID();
		Thread.sleep(4000);
	}

	@Then("remove text from alert summary")
	public void remove_text_from_alert_summary() throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.summaryThreeDot();
		alerts.removalofEnteredTextForSummary();
		Thread.sleep(4000);
	}

	@Then("Click on ExpectedClosureDateThreeDot icon and enter the value in datepickercolumn")
	public void click_on_expected_closure_date_three_dot_icon_and_enter_the_value_in_datepickercolumn()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.expectedClosureDateThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		alerts.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("ExpectedClosureYear").toString();
		String month = alldata.get(vTCName).get("ExpectedClosureMonth").toString();
		String day = alldata.get(vTCName).get("ExpectedStartDate").toString();
		String day2 = alldata.get(vTCName).get("ExpectedEndDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alerts.applybuttoncalender();

	}

	@Then("Click on ActualClosureDate icon and enter the value in datepickercolumn")
	public void click_on_actual_closure_date_icon_and_enter_the_value_in_datepickercolumn()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.actualClosureDateThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		alerts.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("ActualClosureYear").toString();
		String month = alldata.get(vTCName).get("ActualClosureMonth").toString();
		String day = alldata.get(vTCName).get("ActualClosureStartDate").toString();
		String day2 = alldata.get(vTCName).get("ActualClosureEndDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alerts.applybuttoncalender();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as server connectivity issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_server_connectivity_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.alertCategoryserverconnectivityissue();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as device connectivity issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_device_connectivity_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.Deviceconnectivityissue();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as network connectivity issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_network_connectivity_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.networkconnectivityissue();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as storage space exceeded issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_storage_space_exceeded_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.storagespaceexceeded();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as License Certified expired issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_license_certified_expired_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.licensecertificateExpired();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as Edge Device Hardware Down issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_edge_device_hardware_down_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.EdgeDeviceHardwareDown();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as Configuration file unavailable")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_configuration_file_unavailable() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.configurationFileUnavailable();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as DataBase Connectivity issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_data_base_connectivity_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.DatabaseConnectivityIssue();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as container issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_container_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.containerissue();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as application issue")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_alert_type_as_application_issue() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.alertCategoryThreeDot();
		alerts.applicationissue();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose priority Type as Low")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_priority_type_as_low() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.priorityThreeDot();
		alerts.priorityInputLow();
	}

	@Then("Click on status search icon of alert page i.e. three dots & choose Status Type")
	public void click_on_status_search_icon_of_alert_page_i_e_three_dots_choose_status_type()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.statusThreeDotAlert();
		Thread.sleep(4000);
		alerts.statusOpen();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose priority Type as Medium")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_priority_type_as_medium() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.priorityThreeDot();
		alerts.priorityInputMedium();
	}

	@Then("scroll horizontal at the end of the screen")
	public void scroll_horizontal_at_the_end_of_the_screen() throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.scrollingElementRightBar("div.example-container", "5000");
		Thread.sleep(5000);
	}

	@Then("Click on status search icon of alert page i.e. three dots & choose Status Type Closed")
	public void click_on_status_search_icon_of_alert_page_i_e_three_dots_choose_status_type_closed()
			throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.statusThreeDotAlert();
		Thread.sleep(4000);
		alerts.statusClosed();
	}

	@Then("Click on Alert Category search icon of alert page i.e. three dots & choose priority Type as High")
	public void click_on_alert_category_search_icon_of_alert_page_i_e_three_dots_choose_priority_type_as_high() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.priorityThreeDot();
		alerts.priorityInputHigh();
	}

	@Then("Click on status search icon of alert page i.e. three dots & choose Status Type In Progress")
	public void click_on_status_search_icon_of_alert_page_i_e_three_dots_choose_status_type_in_progress() {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.statusThreeDotAlert();
		alerts.statusInProgress();
	}
	@Then("Click on edit icon to complete action")
	public void click_on_edit_icon_to_complete_action() throws InterruptedException {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.editiconclick();
		Thread.sleep(3000);
//		AlertsAcknowledgePage ack= new AlertsAcknowledgePage(driver, logger);
//		//ack.AssignedTo(alldata.get(vTCName).get("Value3").toString());
//		ack.addRemarksforAcknowledgement();
//		Thread.sleep(4000);
//		
//		Thread.sleep(4000);
//		ack.AcknowledgeButton();
	}
	
	
	@Then("Click on acknowledge button to complete alert acknoledgement")
	public void click_on_acknowledge_button_to_complete_alert_acknoledgement() throws InterruptedException {
		
		AlertsAcknowledgePage ack= new AlertsAcknowledgePage(driver, logger);
		ack.AcknowledgeButton();
	
		Thread.sleep(4000);
		
	}
	
	@Then("Click on edit icon to complete action for completion")
	public void click_on_edit_icon_to_complete_action_for_completion() throws InterruptedException  {
		AlertsPage alerts = new AlertsPage(driver, logger);
		alerts.editiconclick();
		
	}
	@Then("Click on Add button to add remarks")
	public void click_on_add_button_to_add_remarks() throws InterruptedException {
		AlertsAcknowledgePage ack= new AlertsAcknowledgePage(driver, logger);
		ack.addRemarksforAcknowledgement();
		Thread.sleep(4000);
	}
	@Then("enter the value for the remarks and click on submit button")
	public void enter_the_value_for_the_remarks_and_click_on_submit_button() throws InterruptedException {
		AlertsAcknowledgePage ack= new AlertsAcknowledgePage(driver, logger);
		ack.remarkInput(alldata.get(vTCName).get("remarkInput").toString());
        ack.submitbuttonforRemark();
        Thread.sleep(3000);
	}
	@Then("Click on complete button to complete alert")
	public void click_on_complete_button_to_complete_alert() throws InterruptedException {
		AlertsAcknowledgePage ack= new AlertsAcknowledgePage(driver, logger);
		ack.completeButton();
	}






}
