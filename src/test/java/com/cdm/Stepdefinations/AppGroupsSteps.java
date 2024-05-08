package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;

import com.cdm.pages.AppGroupsEditPage;
import com.cdm.pages.AppGroupsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppGroupsSteps extends BaseTest {

	@Then("verify page with resize option with App groups page")
	public void verify_page_with_resize_option_with_app_groups_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.setZoomLevel(800, 600);

	}
	
	@Then("Verification of error message verbaige for entering invalid details for APP Group Name Text field in ADD New screen")
	public void verification_of_error_message_verbaige_for_entering_invalid_details_for_app_group_name_text_field_in_add_new_screen() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}
	

	@Then("Verification of error message verbaige for entering invalid details for APP Group Display Name Text field in ADD New screen")
	public void verification_of_error_message_verbaige_for_entering_invalid_details_for_app_group_display_name_text_field_in_add_new_screen() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@Then("Verification of loading properly in slow network")
	public void verification_of_loading_properly_in_slow_network() {
		
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@Then("Verification of visibilty duration to load the page")
	public void verification_of_visibilty_duration_to_load_the_page() {
		
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@Then("Verification of check filter icon availability for APP Group Name")
	public void verification_of_check_filter_icon_availability_for_app_group_name() {
		
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@Then("Verification of check filter icon availability for Status")
	public void verification_of_check_filter_icon_availability_for_status() {
		
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@Then("Verification of check filter icon visibility for APP Group Name")
	public void verification_of_check_filter_icon_visibility_for_app_group_name() {
		
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@Then("Verification of switching between inputs fields using TAB")
	public void verification_of_switching_between_inputs_fields_using_tab() {
		
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}



	@Then("Verification of check filter icon availability for APP Group Display Name")
	public void verification_of_check_filter_icon_availability_for_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}

	@When("Click on App Groups tab")
	public void click_on_app_groups_tab() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("Verification of standarize text format for success message in toast")
	public void verification_of_standarize_text_format_for_success_message_in_toast() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		
	}

	@Then("Verification of standarize text format below error message for APP Group Name text field")
	public void verification_of_standarize_text_format_below_error_message_for_app_group_name_text_field() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		
	}

	@Then("Verification of standarize text format below error message for APP Group Display Name text field")
	public void verification_of_standarize_text_format_below_error_message_for_app_group_display_name_text_field() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		
	}

	@Then("Verification of the rejection of blanks and spaced number in Contact Number field in the Identity section of User Add screen by Super admin\\/Admin user")
	public void verification_of_the_rejection_of_blanks_and_spaced_number_in_contact_number_field_in_the_identity_section_of_user_add_screen_by_super_admin_admin_user() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		
	}

	@Then("click on Add button")
	public void click_on_add_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		
	}

	@Then("click on cancel button")
	public void click_on_cancel_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.cancelButton();
	}

	@Then("Do not Fill all information on Add page and hit save button")
	public void do_not_fill_all_information_on_add_page_and_hit_save_button() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Thread.sleep(4000);
		agp.saveButton();
		Thread.sleep(4000);
	}

	@When("Click on the three dots of App Group Name")
	public void click_on_the_three_dots_of_app_group_name() {

		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("enter text in the field of App Group Name")
	public void enter_text_in_the_field_of_app_group_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appGroupNameInput(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();
	}

	@When("Click on the three dots of App Group Display Name")
	public void click_on_the_three_dots_of_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

@Then("Verification of descending order sorting functionality for the table list")
public void verification_of_descending_order_sorting_functionality_for_the_table_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Verification to check the labels of input text fields")
public void verification_to_check_the_labels_of_input_text_fields() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	@Then("enter text in the field of App Group Display Name")
	public void enter_text_in_the_field_of_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.appGroupDisplayNameInput(alldata.get(vTCName).get("AppGroupDisplayName").toString());
		agp.backDropShowing_Div_Click();
	}

	@When("Click on the Add icon at the right side of the page")
	public void click_on_the_add_icon_at_the_right_side_of_the_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.addButtonAppGroup();
	}

	@Then("Under Identity Section enter details for App Group Name and AppGroupDisplayName")
	public void under_identity_section_enter_details_for_app_group_name_and_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.appGroupNameInput(alldata.get(vTCName).get("AppGroupNameAdd").toString());
		agp.appGroupDisplayNameEnterData(alldata.get(vTCName).get("AppGroupDisplayNameAdd").toString());
	}

	@Then("click on Save button.")
	public void click_on_save_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.saveButton();
	}

	@When("Click on the Status Icon at the right side of the page")
	public void click_on_the_status_icon_at_the_right_side_of_the_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.statusThreeDot();
	}

	@Then("user should search for App Group Name and App Group Display name")
	public void user_should_search_for_app_group_name_and_app_group_display_name() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appNameThreeDot();
		agp.appNameSearch(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();

		Thread.sleep(4000);

		agp.appDisplayNameThreeDot();
		agp.appGroupNameSearch(alldata.get(vTCName).get("AppGroupDisplayName").toString());
	}

	@Then("click on bulk download button")
	public void click_on_bulk_download_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.bulkdownloadButton();
	}

	@Then("click on bulk upload functionality")
	public void click_on_bulk_upload_functionality() throws InterruptedException, AWTException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.bulkUploadButton();
		Thread.sleep(3000);
		agp.uploadfile();
		Thread.sleep(3000);
		StringSelection ss = new StringSelection(alldata.get(vTCName).get("FileUploadPath").toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
		agp.uploadFileTask(alldata.get(vTCName).get("FileUploadPath").toString());
		Thread.sleep(3000);
		agp.bulkUploadButtonSucess();
		Thread.sleep(3000);
	}

	@Then("verify tooltip for Edit button")
	public void verify_tooltip_for_edit_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit Button", "Edit", agp.get_Text_ToolTipforEditButton());
	}

	@Then("verify tooltip for Delete button")
	public void verify_tooltip_for_delete_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Delete Button", "Delete", agp.get_Text_ToolTipforDeleteButton());
	}

	@Then("verify tooltip for Add Application button")
	public void verify_tooltip_for_add_application_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Add application Button", "Add Applications",
				agp.get_Text_ToolTipforAddApplications());
	}

	@Then("click on three dots on App Group name and enter the value for AppName")
	public void click_on_three_dots_on_app_group_name_and_enter_the_value_for_app_name() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appNameThreeDot();
		Thread.sleep(4000);
		agp.appNameSearch(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();
		Thread.sleep(7000);
	}
	@Then("Verification of check filter icon visibility for APP Group Display Name")
	public void verification_of_check_filter_icon_visibility_for_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	}
	
	


	@Then("remove the existing value for AppGroupName and change with new value")
	public void remove_the_existing_value_for_app_group_name_and_change_with_new_value() {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
		agep.removalofEnteredTextForappGroupName();
		agep.appGroupNameEdit(alldata.get(vTCName).get("AppGroupNameUpdate").toString());
	}

	@Then("remove the existing value for AppDisplayName and change with new value")
	public void remove_the_existing_value_for_app_display_name_and_change_with_new_value() {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
		agep.removalofEnteredTextForappGroupDisplayNameEdit();
		agep.appGroupDisplayNameEdit(alldata.get(vTCName).get("AppGroupDisplayName").toString());
	}

	@Then("click on save button to save App groups")
	public void click_on_save_button_to_save_app_groups() throws InterruptedException {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
		agep.saveButton();
		Thread.sleep(5000);
	}

	@Then("Click on Edit button to edit app groups")
	public void click_on_edit_button_to_edit_app_groups() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.editButton();
	}

	@Then("Click on Delete button to delete app groups")
	public void click_on_delete_button_to_delete_app_groups() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.deleteButton();
		Thread.sleep(4000);
		agp.confirmationYesDeleteButton();
		Thread.sleep(5000);
	}
	
	@Then("Verification of alignment of i.e. ADD New,Refresh,bulk upload & bulk download buttons top right side")
	public void verification_of_alignment_of_i_e_add_new_refresh_bulk_upload_bulk_download_buttons_top_right_side() {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
	}


	@Then("Under Status column select Active checkbox from the List")
	public void under_status_column_select_active_checkbox_from_the_list() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.statusinActiveCheckbox();
		Thread.sleep(4000);
	}

}
