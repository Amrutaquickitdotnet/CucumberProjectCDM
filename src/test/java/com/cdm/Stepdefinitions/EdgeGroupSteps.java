package com.cdm.Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import com.cdm.pages.EdgeGroupConfigurationPage;
import com.cdm.pages.EdgeGroupsPage;
import com.cdm.pages.Menu;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EdgeGroupSteps extends BaseTest {

	@When("click on EDGE Group")
	public void click_on_edge_group() {
		Menu edp = new Menu(driver, logger);
		edp.clickEdgeGroups();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("land on the dashbord")
	public void land_on_the_dashbord() {
		System.out.println("User is landing on Dashboard");
	}

	@Then("verify Edge Group table is listed")
	public void verify_edge_group_table_is_listed() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		System.out.println(egp.getCellText(1, 2));
	}

	@Then("Click on Refreshing button")
	public void click_on_refreshing_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkrefreshbtn();
	}

	@Then("Click on Add button")
	public void click_on_add_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkAddbtn();
	}

	@Then("click on bulk Upload button EDGE Group")
	public void click_on_bulk_upload_button_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkbulkAppBtn();
	}

	@Then("Click on the three dots of GroupName")
	public void click_on_the_three_dots_of_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
		Thread.sleep(3000);

	}

	@Then("enter text in the field of GroupName")
	public void enter_text_in_the_field_of_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(2000);
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("click on bulk Download button EDGE Group")
	public void click_on_bulk_download_button_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkBulkDownloadButton();
	}

	@Then("Click on Edit Edge Group button")
	public void click_on_edit_edge_group_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.Edit_btn();
	}

	@Then("Click on Delete Edge Group button")
	public void click_on_delete_edge_group_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deleteEdgeGroupColumn();
	}

	@Then("confirmation message appeared for confirm delete Click on Yes to delete and No to Cancel")
	public void confirmation_message_appeared_for_confirm_delete_click_on_yes_to_delete_and_no_to_cancel() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		// egp.confirmationMessage();
		egp.confirmationNoMessage();
	}

	@Then("Click on Stop button")
	public void click_on_stop_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.stopButton();
	}

	@Then("Click on console button")
	public void click_on_console_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.consoleIcon();
	}

	@Then("Click on three dots on alaram raised functionality")
	public void click_on_three_dots_on_alaram_raised_functionality() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDot();
	}

	@Then("enter the value for Minimum searchbox for alaram raised")
	public void enter_the_value_for_minimum_searchbox_for_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDotInputMin(alldata.get(vTCName).get("Value1").toString());

	}

	@Then("enter the value for maximum searchbox for alaram raised")
	public void enter_the_value_for_maximum_searchbox_for_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDotInputMax(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on three dots on Device Connected functionality")
	public void click_on_three_dots_on_device_connected_functionality() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedThreeDot();
	}

	@Then("Click on three dots on Device Active functionality")
	public void click_on_three_dots_on_device_active_functionality() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveThreeDot();

	}

	@Then("enter the value for Minimum searchbox for device Active")
	public void enter_the_value_for_minimum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMin(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("enter the value for maximum searchbox for device Active")
	public void enter_the_value_for_maximum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMax(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("enter the value for maximum searchbox for device connected")
	public void enter_the_value_for_maximum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMax(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("enter the value for Minimum searchbox for device connected")
	public void enter_the_value_for_minimum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMin(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on EDIT icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_edit_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit button", "Edit", egp.get_Text_EditButtonToolTip());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on DELETE icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_delete_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Delete button", "Delete", egp.get_Text_DeleteButtonToolTip());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on STOP icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_stop_icon_button_verify_tooltip_functionality() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Stop button", "Stop", egp.get_Text_StopButtonToolTip());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on Console icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_console_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Console button", "Console", egp.get_Text_ConsoleButtonToolTip());

	}

	@Then("After landing on EDGE Group List screen and Click on Add button")
	public void after_landing_on_edge_group_list_screen_and_click_on_add_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkAddbtn();
	}

	@Then("enter details of Group_Id, Group_Name Under Identity Section")
	public void enter_details_of_group_id_group_name_under_identity_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySection(alldata.get(vTCName).get("Value1").toString());
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("under health column slide status toggle in Active Condition")
	public void under_health_column_slide_status_toggle_in_active_condition() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.moveSliderCondition("checked");

	}

	@Then("Scroll Down the page")
	public void scroll_down_the_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();

	}

	@Then("Pagination is in footer\\(Below) right side")
	public void pagination_is_in_footer_below_right_side() throws Exception {
		Pagination appgroup = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		appgroup.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("pagination all default records will display in Next page")
	public void pagination_all_default_records_will_display_in_next_page() throws Exception {
		Pagination appgroup3 = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		appgroup3.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup3.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup3.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("After pagination,previous page all default records will display")
	public void after_pagination_previous_page_all_default_records_will_display() throws Exception {
		Pagination appgroup4 = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		appgroup4.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup4.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup4.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on download icon of Licensing")
	public void click_on_download_icon_of_licensing() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.licenceDownloadButton();
	}

	@Then("Click on Refresh icon of Licensing")
	public void click_on_refresh_icon_of_licensing() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.refreshButtonforLicence();
	}

	@Then("Click on upload icon of Edge Configurations")
	public void click_on_upload_icon_of_edge_configurations() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.registrationUploadButton();
	}

	@Then("browse the upload document and upload for Registration section")
	public void browse_the_upload_document_and_upload_for_registration_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.controllerConfigurationCertificateUpload(alldata.get(vTCName).get("Value4").toString());

		egp.serialKey(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on License icon from Licensing section")
	public void click_on_license_icon_from_licensing_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.licenceUploadButton();
	}

	@Then("browse the upload document and upload for License section")
	public void browse_the_upload_document_and_upload_for_license_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.licenseUploadChooseFile(alldata.get(vTCName).get("Value4").toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		egp.licenseUploadButtonAfter();
	}

	@Then("Click on Onboarding Certificate icon of Edge Configurations")
	public void click_on_onboarding_certificate_icon_of_edge_configurations() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.onboardingCertificateIcon();

	}

	@Then("click on cancel button in EDGE Group")
	public void click_on_cancel_button_in_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.cancelButton();
	}

	@Then("without enter any values click on save then scroll down")
	public void without_enter_any_values_click_on_save_then_scroll_down() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();
		egp.saveButtonforEdgeGroup();
		Thread.sleep(5000);
	}

	@Then("scroll down page")
	public void scroll_down_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();
	}

	@Then("Click on download icon of Edge Configurations")
	public void click_on_download_icon_of_edge_configurations() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkBulkDownloadButton();
	}

	@Then("remove the text for Edge group Name which already entered and fill with new entry")
	public void remove_the_text_for_edge_group_name_which_already_entered_and_fill_with_new_entry() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
		Assert.assertEquals("EdgeName search text box is not empty", "", egp.removalofEneredTextForEdgeGroupName());

	}

	@Then("enter valid  values for all mandatory text fields & click on save.")
	public void enter_valid_values_for_all_mandatory_text_fields_click_on_save() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.saveButtonforEdgeGroup();
	}

	@Then("add Group Id, Group Name Under Identity section")
	public void add_group_id_group_name_under_identity_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySection(alldata.get(vTCName).get("Value1").toString());
		egp.groupNameInputSearch(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("make status active for health toggle")
	public void make_status_active_for_health_toggle() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.moveSliderCondition("checked");
	}

	@Then("scrolldown the page")
	public void scrolldown_the_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();
	}

	@Then("enter details for Server host address, Server port , Choose Application group from dropdown")
	public void enter_details_for_server_host_address_server_port_choose_application_group_from_dropdown()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value3").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("Value4").toString());
		egp.serverPort(alldata.get(vTCName).get("Value5").toString());
	}

	@Then("enter value for the maximum server nodes")
	public void enter_value_for_the_maximum_server_nodes() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.serverNodes(alldata.get(vTCName).get("Value6").toString());
	}

	@Then("After pagination all default records will display in First page")
	public void after_pagination_all_default_records_will_display_in_first_page() throws Exception {
		Pagination appgroup2 = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		appgroup2.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup2.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup2.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Pagination is in footer\\(Below) Left side")
	public void pagination_is_in_footer_below_left_side() throws Exception {
		Pagination appgroup1 = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		appgroup1.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup1.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup1.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Under Deployment page choose Application group , enter details of server port and Server host address")
	public void under_deployment_page_choose_application_group_enter_details_of_server_port_and_server_host_address()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value3").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("Value4").toString());
		egp.serverPort(alldata.get(vTCName).get("Value5").toString());
	}

	@Then("Click on Save button to save Edge group")
	public void click_on_save_button_to_save_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.saveButtonforEdgeGroup();
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.submitButtonForAll();
	}

	@Then("Click on save button to save certificates")
	public void click_on_save_button_to_save_certificates() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.saveButtonUpload();
	}

	@Then("enter valid values and click on save")
	public void enter_valid_values_and_click_on_save() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.saveButtonforEdgeGroup();
	}

	@Then("Enter alphanumeric with special char values into EDGE Group Name text fields")
	public void enter_alphanumeric_with_special_char_values_into_edge_group_name_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
		Assert.assertEquals("Edge ID validation for 64 char is not valid", "Expected messsage",
				egp.verifyValidationMessageEdgeName());

		Assert.assertEquals("EdgeId Min and max message not matching",
				"   Alphanumerics of length Min = 2, Max = 64 are allowed !", egp.verifyValidationMessageEdgeName());

	}

	@Then("Enter alphanumeric with special char values into EDGE Group ID text fields")
	public void enter_alphanumeric_with_special_char_values_into_edge_group_id_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySection(alldata.get(vTCName).get("Value1").toString());
		Assert.assertEquals("Edge ID validation for 64 char is not valid", "Expected messsage",
				egp.verifyValidationMessageEdgeId());

		Assert.assertEquals("EdgeId Min and max message not matching",
				"   Alphanumerics of length Min = 2, Max = 64 are allowed !", egp.verifyValidationMessageEdgeId());
	}

	@Then("After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side")
	public void after_landing_on_edge_group_list_screen_and_click_on_app_deploy_icon_button_on_the_top_right_side() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}

	@Then("verify for Edge Group functionality")
	public void verify_for_edge_group_name_functionality() throws InterruptedException {
	
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
         egcp.edgeGroupNameConfigDot();
         
         
		egcp.edgeGroupNamedeployment(alldata.get(vTCName).get("Value2").toString());
		egcp.backDropShowing_Div_Click();

		egcp.checkboxEdgeGroupNameStepOneName();

		egcp.NextButtonStep1();
	
	}

	@Then("verify for App Group functionality")
	public void verify_for_app_group_functionality() throws InterruptedException {

		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.appGroupNameDot();

		Thread.sleep(3000);

		egcp.appGroupNameInputdeploy(alldata.get(vTCName).get("Value3").toString());
		egcp.backDropShowing_Div_Click();

		egcp.checkboxAppNameStepTwoName();

		egcp.NextButtonStep2();

	}

	@Then("verify for Edge Name functionality")
	public void verify_for_edge_name_functionality() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeDot();
		Thread.sleep(3000);

		egcp.edgeDeployment(alldata.get(vTCName).get("Value4").toString());
		
		egcp.backDropShowing_Div_Click();
		
		egcp.headingConfigurationTitleClick();

		egcp.checkboxEdgeStepThreeName();

		egcp.NextButtonStep3();
	}

	@Then("verify for App Name functionality")
	public void verify_for_app_name_functionality() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.appNameDot();

		egcp.appNameInput(alldata.get(vTCName).get("Value5").toString());

		egcp.backDropShowing_Div_Click();

		egcp.checkboxEdgeNameStepFour();
		egcp.NextButtonStep4();
	}
	
	@Then("select the single check box valid Application name with latest version tag column and click on NEXT button")
	public void select_the_single_check_box_valid_application_name_with_latest_version_tag_column_and_click_on_next_button() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeVersionDot();

		egcp.edgeVersionNameInput(alldata.get(vTCName).get("Value6").toString());

		egcp.backDropShowing_Div_Click();

		egcp.checkboxEdgeNameStepFour();
	}


	@Then("click on App Deployment button EDGE Group")
	public void click_on_app_deployment_button_edge_group() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}
	
	@Then("Click on Confirm button and Click on Deploy button")
	public void click_on_confirm_button_and_click_on_deploy_button() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.confirmDeployButton();
	}


}
