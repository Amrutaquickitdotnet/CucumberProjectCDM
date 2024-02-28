package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;

import com.cdm.pages.EdgeGroupAddPage;
import com.cdm.pages.EdgeGroupApplicationDeployment;
import com.cdm.pages.EdgeGroupConfigurationPage;
import com.cdm.pages.EdgeGroupEditPage;
import com.cdm.pages.EdgeGroupsPage;
import com.cdm.pages.Menu;
import com.cdm.pages.Pagination;
import com.screenrecord.utils.ScreenRecorderUtil;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EdgeGroupSteps extends BaseTest {

	@When("click on EDGE Group")
	public void click_on_edge_group() throws Exception {
		ScreenRecorderUtil.startRecord("click on EDGE Group");
		ScreenRecorderUtil.startRecord("click_on_edge_group");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(2000);
		egp.clickEdgeGroups();
		ScreenRecorderUtil.stopRecord();

	}

	@Then("scroll down the page")
	public void scroll_down_the_page() throws Exception {
		ScreenRecorderUtil.startRecord("scroll_down_the_page");
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		egep.scrollingvertical();
		ScreenRecorderUtil.stopRecord();
	}

	@Then("select the value from application group dropdown")
	public void select_the_value_from_application_group_dropdown() throws Exception {
		ScreenRecorderUtil.startRecord("select the value from application group dropdown");
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		egep.applicationGroupName(alldata.get(vTCName).get("Value2").toString());
		ScreenRecorderUtil.stopRecord();
	}

	@Then("land on the dashbord")
	public void land_on_the_dashbord() {
		System.out.println("User is landing on Dashboard");
	}

	@Then("verify Edge Group table is listed")
	public void verify_edge_group_table_is_listed() throws Exception {
		ScreenRecorderUtil.startRecord("verify Edge Group table is listed");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		System.out.println(egp.getCellText(1, 2));
		ScreenRecorderUtil.stopRecord();
	}

	@Then("Click on Refreshing button")
	public void click_on_refreshing_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkrefreshbtn();
	}

	@Then("Click on Add button")
	public void click_on_add_button() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(3000);
		egp.checkAddbtn();
	}

	@Then("click on bulk Upload button EDGE Group")
	public void click_on_bulk_upload_button_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkbulkAppBtn();
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("Value1").toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO: handle exception
		}
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
		Thread.sleep(4000);
		egp.headingEdgeGroupListClick();
	}

	@Then("enter text in the field of GroupName for Edit")
	public void enter_text_in_the_field_of_group_name_for_edit() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("Value9").toString());
		Thread.sleep(2000);

		egp.backDropShowing_Div_Click();
		Thread.sleep(4000);
		egp.headingEdgeGroupListClick();
	}

	@Then("enter text in the GroupName")
	public void enter_text_in_the_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(2000);
		// egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();

	}

	@Then("enter value in the GroupName")
	public void enter_value_in_the_group_name() throws InterruptedException {
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
		egp.confirmationYesMessage();
		// egp.confirmationNoMessage();
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

	@Then("enter details of Group_Id, Group_Name  location and description Under Identity Section")
	public void enter_details_of_group_id_group_name_under_identity_section() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySectionGroupID(alldata.get(vTCName).get("Value1").toString());
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
		egp.locationedgeGroup(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(3000);
		egp.descriptionedgeGroup(alldata.get(vTCName).get("Value4").toString());

		Thread.sleep(3000);

	}

	@Then("under health column slide status toggle in Active Condition")
	public void under_health_column_slide_status_toggle_in_active_condition() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(5000);
		egp.moveSliderCondition("checked");

		Thread.sleep(5000);

	}

	@Then("under health column Change Slider in Inactive mode")
	public void under_health_column_change_slider_in_inactive_mode() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(5000);
		egp.moveslideronoff();
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

	@Then("after pagination all default records will display in Next page")
	public void after_pagination_all_default_records_will_display_in_next_page() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
		Thread.sleep(7000);
		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on the checkbox of Active under status column")
	public void click_on_the_checkbox_of_active_under_status_column() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.statusColumnThreeDot();
		Thread.sleep(2000);
		egp.statusColumnActive();

	}

	@Then("Click on download icon of Licensing")
	public void click_on_download_icon_of_licensing() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(4000);
		egp.licenceDownloadButton();
		Thread.sleep(4000);
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
	public void browse_the_upload_document_and_upload_for_registration_section()
			throws InterruptedException, Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.controllerConfigurationCertificateUpload(alldata.get(vTCName).get("Value5").toString());

		egp.saveButtononEdgeConfiguration();
		Thread.sleep(8000);

	}

	@Then("browse the upload document and upload for Registration section for OnBoarding Certificate")
	public void browse_the_upload_document_and_upload_for_registration_section_for_on_boarding_certificate()
			throws InterruptedException, Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(8000);
		try {
			egp.onboardingCertificateIcon();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(4000);
		

		egp.onboardingCertificateUpload(alldata.get(vTCName).get("Value7").toString());

		egp.serialKey(alldata.get(vTCName).get("Value10").toString());

		egp.saveButtonfinalonboarding();

	}

	@Then("choose App group for updation")
	public void choose_app_group_for_updation() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value7").toString());
	}

	@Then("Click on save button to save document")
	public void click_on_save_button_to_save_document() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.saveButtonUpload();
	}

	@Then("Click on save data for Edge Group")
	public void click_on_save_data_for_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.saveButtonforEdgeGroup();
	}

	@Then("Click on License icon from Licensing section")
	public void click_on_license_icon_from_licensing_section() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(4000);
		egp.licenceUploadButton();
	}

	@Then("browse the upload document and upload for License section")
	public void browse_the_upload_document_and_upload_for_license_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.licenseUploadChooseFile(alldata.get(vTCName).get("Value13").toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		egp.licenseCancelButton();
		// egp.licenseUploadButtonAfter();
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

	@Then("Click on download icon of Edge Configurations of License section")
	public void click_on_download_icon_of_edge_configurations_of_license_section() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		try {
			egp.licenceDownloadButton();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("remove the text for Edge group Name which already entered and fill with new entry")
	public void remove_the_text_for_edge_group_name_which_already_entered_and_fill_with_new_entry() throws Exception {
		ScreenRecorderUtil.startRecord("Edge Group name update");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForEdgeGroupName();
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
		ScreenRecorderUtil.stopRecord();

	}

	@Then("enter valid  values for all mandatory text fields & click on save.")
	public void enter_valid_values_for_all_mandatory_text_fields_click_on_save() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.saveButtonforEdgeGroup();
		ScreenRecorderUtil.stopRecord();
	}

	@Then("add Group Id, Group Name Under Identity section")
	public void add_group_id_group_name_under_identity_section() throws Exception {
		ScreenRecorderUtil.startRecord("identity fill");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.identitySectionGroupID(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(2000);
		egp.groupNameAdd(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(2000);
		ScreenRecorderUtil.stopRecord();
	}

	@Then("make status active for health toggle")
	public void make_status_active_for_health_toggle() throws Exception {
		ScreenRecorderUtil.startRecord("health toggle");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(4000);
		egp.moveSliderCondition("checked");
		Thread.sleep(4000);
		ScreenRecorderUtil.stopRecord();
	}

	@Then("scrolldown the page")
	public void scrolldown_the_page() throws Exception {
		ScreenRecorderUtil.startRecord("Scrolling page");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();
		ScreenRecorderUtil.stopRecord();

	}

	@Then("enter details for Server host address, Server port , Choose Application group from dropdown")
	public void enter_details_for_server_host_address_server_port_choose_application_group_from_dropdown()
			throws Exception {
		ScreenRecorderUtil.startRecord("enter details");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value3").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("Value4").toString());
		egp.serverPort(alldata.get(vTCName).get("Value5").toString());
		ScreenRecorderUtil.stopRecord();
	}

	@Then("enter the value for the maximum server nodes")
	public void enter_the_value_for_the_maximum_server_nodes() {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);

		egep.serverHostAddress(alldata.get(vTCName).get("Value4").toString());
		egep.serverPort(alldata.get(vTCName).get("Value5").toString());
	}

	@Then("enter value for the maximum server nodes")
	public void enter_value_for_the_maximum_server_nodes() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerNodes();
		egp.serverNodes(alldata.get(vTCName).get("Value6").toString());
	}
//	@Then("Click on pagination Previois Page \\(Backward arrow) it will display default records will display")
//	public void click_on_pagination_previous_page_backward_arrow_it_will_display_default_records_will_display() throws Exception {
//		Pagination appgroup2 = new Pagination(driver, logger);
//		String value = alldata.get(vTCName).get("Value1").toString();
//		appgroup2.SelectPageMatOption(value);
//		int rowPerPage = Integer.parseInt(value);
//		appgroup2.LastPageClickAndCount(rowPerPage);
//		appgroup2.previousPageClickAndCount(rowPerPage);
//	//	Assert.assertTrue("Row count match for last page", appgroup2.LastPageClickAndCount(rowPerPage));
//
//	//	Assert.assertTrue("Row count match for last page", appgroup2.previousPageClickAndCount(rowPerPage));
//	}
//	

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
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
		Thread.sleep(7000);
		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("Under Deployment page choose App group , enter details of server port, server nodes and Server host address")
	public void under_deployment_page_choose_ap_p_group_enter_details_of_server_port_server_nodes_and_server_host_address()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value5").toString());
		egp.serverNodes(alldata.get(vTCName).get("Value6").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("Value7").toString());
		egp.serverPort(alldata.get(vTCName).get("Value8").toString());

		Thread.sleep(4000);

	}

	@Then("Click on Save button to save Edge group")
	public void click_on_save_button_to_save_edge_group() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(3000);
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
		egp.saveButtonforEdgeGroup();
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
				egp.verifyValidationMessageEdgeId());

	}

	@Then("Enter alphanumeric with special char values  with max character into EDGE Group Name text fields")
	public void enter_alphanumeric_with_special_char_values_with_max_character_into_edge_group_name_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
		Assert.assertEquals("Edge Group Name Validation message is not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", egp.verifyValidationMessageEdgeName());

	}

	@Then("Enter alphanumeric with special char values into EDGE Group ID text fields")
	public void enter_alphanumeric_with_special_char_values_into_edge_group_id_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySectionGroupID(alldata.get(vTCName).get("Value1").toString());
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

	@Then("Click on upload button to return back on the details page")
	public void click_on_upload_button_to_return_back_on_the_details_page() {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		egep.saveButtonUploadforLicense();
	}

	@Then("verify for Edge Group functionality")
	public void verify_for_edge_group_name_functionality() throws InterruptedException {

		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);
		egad.edgeGroupNameConfigDot();

		egad.applicationDeploymentGroupNameSearch(alldata.get(vTCName).get("Value1").toString());
		// egcp.backDropShowing_Div_Click();
		egad.headingConfigurationTitleClick();

		egad.checkboxEdgeGroupNameStepOneName();

		egad.NextButtonStep1();
		Thread.sleep(5000);

	}

	@Then("verify for App Group functionality")
	public void verify_for_app_group_functionality() throws InterruptedException {
		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);

		egad.appGroupNameDot();

		egad.appGroupNameInputdeploy(alldata.get(vTCName).get("Value2").toString());
		egad.backDropShowing_Div_Click();
		try {
			egad.checkboxEdgeGroupsAppGroups();
			Thread.sleep(4000);
			egad.NextButtonStep2();

			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("select the single check box valid Application name with latest App Name column and click on NEXT button")
	public void select_the_single_check_box_valid_application_name_with_latest_app_name_column_and_click_on_next_button()
			throws InterruptedException {
		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);
		egad.edgeappNameDot();

		egad.edgeAppNameInput(alldata.get(vTCName).get("Value4").toString());

		egad.backDropShowing_Div_Click();
		Thread.sleep(4000);
		egad.checkboxEdgeNameStepFour();
		Thread.sleep(4000);
		egad.NextButtonStep4();
	}

	@Then("verify for Edge Name functionality")
	public void verify_for_edge_name_functionality() throws InterruptedException {
		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);
		egad.edgeDot();
		Thread.sleep(3000);

		egad.edgeDeployment(alldata.get(vTCName).get("Value3").toString());

		egad.backDropShowing_Div_Click();

		egad.headingConfigurationTitleClick();

		egad.checkboxEdgeStepThreeName();
		Thread.sleep(5000);

		egad.NextButtonStep3();
		Thread.sleep(5000);
	}

	@Then("verify for App Name functionality")
	public void verify_for_app_name_functionality() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
//		egcp.appNameDot();
//		
//
//		egcp.appNameInput(alldata.get(vTCName).get("Value4").toString());
//
//		egcp.backDropShowing_Div_Click();
//
//		egcp.checkboxEdgeNameStepFour();
//		Thread.sleep(4000);
		egcp.NextButtonStep4();
	}

	@Then("select the single check box valid Application name with latest version tag column and click on NEXT button")
	public void select_the_single_check_box_valid_application_name_with_latest_version_tag_column_and_click_on_next_button()
			throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeVersionDot();

		egcp.edgeVersionNameInput(alldata.get(vTCName).get("Value4").toString());

		egcp.backDropShowing_Div_Click();

		egcp.checkboxEdgeNameStepFour();
		egcp.NextButtonStep4();
	}

	@Then("select the single check box valid Application name with latest version tag column and click on NEXT button from Application page")
	public void select_the_single_check_box_valid_application_name_with_latest_version_tag_column_and_click_on_next_button_from_application_page() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeVersionDot();

		egcp.edgeVersionNameInput(alldata.get(vTCName).get("Value4").toString());

		egcp.backDropShowing_Div_Click();

	}

	@Then("click on App Deployment button EDGE Group")
	public void click_on_app_deployment_button_edge_group() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}

	@Then("Click on Confirm button and Click on Deploy button")
	public void click_on_confirm_button_and_click_on_deploy_button() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		Thread.sleep(5000);
		egcp.confirmDeployButton();
		Thread.sleep(5000);
		egcp.deployApp();
	}

	@Then("Click on Three dots of Group Name and enter the text for Group Name")
	public void click_on_three_dots_of_group_name_and_enter_the_text_for_group_name() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
		egp.groupNameInputSearch(alldata.get(vTCName).get("Value1").toString());
		egp.headingEdgeGroupListClick();
	}

	@Then("click on Three Dots of Group Name")
	public void click_on_three_dots_of_group_name() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
	}

	@Then("without enter any values click on save")
	public void without_enter_any_values_click_on_save() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.saveButtonforEdgeGroup();
		Thread.sleep(5000);
	}

	@Then("without enter any values scroll down")
	public void without_enter_any_values_scroll_down() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();

	}

	@Then("Enter numeric values to check character strength into Group NAME text fields")
	public void enter_numeric_values_to_check_character_strength_into_group_name_text_fields()
			throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.edgeGroupNameAdd(alldata.get(vTCName).get("Value1").toString());
		egap.headingTitleAdd();
		Thread.sleep(4000);

		Assert.assertEquals("EdgeId Min and max message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", egap.verifyValidationMessageGroupName());
	}

	@Then("Enter numeric values to check character strength into Group ID text fields")
	public void enter_numeric_values_to_check_character_strength_into_group_id_text_fields()
			throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.edgeGroupIdAdd(alldata.get(vTCName).get("Value1").toString());
		egap.headingTitleAdd();
		Thread.sleep(4000);

		Assert.assertEquals("EdgeId Min and max message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", egap.verifyValidationMessageGroupID());
	}

	@Then("enter the value of Minimum searchbox for alaram raised")
	public void enter_the_value_of_minimum_searchbox_for_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDotInputMin(alldata.get(vTCName).get("Value2").toString());
		egp.backDropShowing_Div_Click();

	}

	@Then("enter the value of maximum searchbox for alaram raised")
	public void enter_the_value_of_maximum_searchbox_for_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDotInputMax(alldata.get(vTCName).get("Value3").toString());
		egp.backDropShowing_Div_Click();

	}

	@Then("click on headingTitle of the page")
	public void click_on_heading_title_of_the_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.headingEdgeGroupListClick();
	}

	@Then("enter the value of Minimum searchbox for device connected")
	public void enter_the_value_of_minimum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMin(alldata.get(vTCName).get("Value4").toString());

	}

	@Then("enter the value of Maximum searchbox for device connected")
	public void enter_the_value_of_maximum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMax(alldata.get(vTCName).get("Value5").toString());

	}

	@Then("enter the value of Minimum searchbox for device Active")
	public void enter_the_value_of_minimum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMin(alldata.get(vTCName).get("Value6").toString());

	}

	@Then("enter the value of Maximum searchbox for device Active")
	public void enter_the_value_of_maximum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMax(alldata.get(vTCName).get("Value7").toString());

	}

	@Then("remove the text for GroupName")
	public void remove_the_text_for_group_name() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForGroupName();
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();

	}

	@Then("remove the value for minimum alaram raised")
	public void remove_the_value_for_minimum_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForAlaramRaisedMin();
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for maximum alaram raised")
	public void remove_the_value_for_maximum_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForAlaramRaisedMax();
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for minimum value for device connected")
	public void remove_the_value_for_minimum_value_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForDeviceConnectedMin();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for maximum device connected")
	public void remove_the_value_for_maximum_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextFordeviceConnectedInputMax();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for minimum device active")
	public void remove_the_value_for_minimum_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForDeviceConnectedMin();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for maximum device active")
	public void remove_the_value_for_maximum_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextFordeviceConnectedInputMax();
		egp.headingEdgeGroupListClick();
	}

	@Then("choose inactive mode from status column")
	public void choose_inactive_mode_from_status_column() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		try {
			egp.edgegroupstatusInactive();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("click on three dots from status column")
	public void click_on_three_dots_from_status_column() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.statusColumnThreeDot();

	}

	@Then("remove the text for Maximum Server node and fill with new entry")
	public void remove_the_text_for_maximum_server_node_and_fill_with_new_entry() throws Exception {
		ScreenRecorderUtil.startRecord("Updated Server node");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerNodes();
		egp.serverNodes(alldata.get(vTCName).get("Value8").toString());
		ScreenRecorderUtil.stopRecord();
	}

	@Then("remove the text for Server Host Address and fill with new entry")
	public void remove_the_text_for_server_host_address_and_fill_with_new_entry() throws Exception {
		ScreenRecorderUtil.startRecord("Updated Server host Address");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerHostAddress();
		egp.serverHostAddress(alldata.get(vTCName).get("Value11").toString());
		ScreenRecorderUtil.stopRecord();
	}

	@Then("remove the text for Server Port and fill with new entry")
	public void remove_the_text_for_server_port_and_fill_with_new_entry() throws Exception {
		ScreenRecorderUtil.startRecord("Updated Server port");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerPort();
		egp.serverPort(alldata.get(vTCName).get("Value12").toString());
		ScreenRecorderUtil.stopRecord();
	}

	@Then("Click on Save button to update Edge group")
	public void click_on_save_button_to_update_edge_group() throws Exception {
		ScreenRecorderUtil.startRecord("Save Edge Group");
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(7000);
		egp.saveButtonforEdgeGroup();
		Thread.sleep(3000);
		ScreenRecorderUtil.stopRecord();
	}

	@Then("remove the text for location which already entered and fill with new entry")
	public void remove_the_text_for_location_which_already_entered_and_fill_with_new_entry() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForLocation();
		egp.locationedgeGroup(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("remove the text for description which already entered and fill with new entry")
	public void remove_the_text_for_description_which_already_entered_and_fill_with_new_entry() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForDescription();
		egp.descriptionedgeGroup(alldata.get(vTCName).get("Value4").toString());
	}

}