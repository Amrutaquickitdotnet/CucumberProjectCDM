package com.cdm.Stepdefinitions;

import org.junit.Assert;

import com.cdm.pages.EdgeDeviceAdd;
import com.cdm.pages.UserSettingsAddPage;
import com.cdm.pages.UserSettingsPage;

import io.cucumber.java.en.Then;

public class UserSettingsSteps extends BaseTest {

	@Then("Click on Settings module from side menu bar")
	public void click_on_settings_module_from_side_menu_bar() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Setting_tab();
	}

	@Then("Click on Users tab from right panel of the screen")
	public void click_on_users_tab_from_right_panel_of_the_screen() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		Thread.sleep(3000);
		usp.Users_tab();
	}

	@Then("verify of displaying the Add button,Bulk upload & Download button icons on top right side of Users List screen by Super Admin\\/Admin user")
	public void verify_of_displaying_the_add_button_bulk_upload_download_button_icons_on_top_right_side_of_users_list_screen_by_super_admin_admin_user() {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);

		Assert.assertTrue("Refresh button is not visible", usp.isVisibleRefresh());

		Assert.assertTrue("Add button is not visible", usp.isVisibleAdd());

		Assert.assertTrue("Upload button is not visible", usp.isVisibleUpload());

		Assert.assertTrue("Download button is not visible", usp.isVisibleDownload());

		System.out.println("All buttons are present");
	}

	@Then("verify search functionality in the users list")
	public void verify_search_functionality_in_the_users_list() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.FirstNameDot();
		usp.firstNameinput(alldata.get(vTCName).get("Value1").toString());
		usp.backDropShowing_Div_Click();
		Thread.sleep(3000);
		usp.LastNameDot();
		usp.lastNameinput(alldata.get(vTCName).get("Value2").toString());
		usp.backDropShowing_Div_Click();
		Thread.sleep(3000);
		usp.EmailDot();
		usp.emailidinput(alldata.get(vTCName).get("Value3").toString());
		usp.backDropShowing_Div_Click();
		Thread.sleep(3000);
		usp.RoleNameDot();
		usp.roleNameinput(alldata.get(vTCName).get("Value4").toString());

	}

	@Then("verify add button on user list page")
	public void verify_add_button_on_user_list_page() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Users_tab();
		Thread.sleep(3000);
		usp.addButton();
	}

	@Then("Click on Cancel button")
	public void click_on_cancel_button() throws InterruptedException {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Setting_tab();
		usp.Users_tab();
		Thread.sleep(3000);
		usp.addButton();
		Thread.sleep(2000);
		usp.cancelButton();
	}

	@Then("verify bulk upload button on user list page")
	public void verify_bulk_upload_button_on_user_list_page() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.BulkUpload_btn();
	}

	@Then("verify bulk download button on user list page")
	public void verify_bulk_download_button_on_user_list_page() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Download_btn();
	}

	@Then("Enter details for user add page")
	public void enter_details_for_user_add_page() throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(6000);

		usap.lastNameinputAdd(alldata.get(vTCName).get("Value2").toString());

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("Value3").toString());

		usap.emailidinputAdd(alldata.get(vTCName).get("Value4").toString());

		usap.passwordInputAdd(alldata.get(vTCName).get("Value5").toString());

		usap.organizationAdd(alldata.get(vTCName).get("Value6").toString());

		usap.dashboardAdd(alldata.get(vTCName).get("Value7").toString());

		usap.roleNameAdd(alldata.get(vTCName).get("Value8").toString());

	}

	@Then("Verification of the acceptance of alphabet values in First Name Text field in User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_alphabet_values_in_first_name_text_field_in_user_add_screen_by_super_admin_admin_user() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
      usap.firstNameinputAdd(alldata.get(vTCName).get("Value1").toString());
		usap.verified_str(alldata.get(vTCName).get("Value1").toString());

	}
	
	@Then("Verification of the acceptance of alphabet values in Last Name Text field of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_alphabet_values_in_last_name_text_field_of_user_add_screen_by_super_admin_admin_user() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
	      usap.lastNameinputAdd(alldata.get(vTCName).get("Value2").toString());
			usap.verified_str(alldata.get(vTCName).get("Value2").toString());
	}
//	@Then("Verification of breaching the Max word limit in First Name Text field  of User Add screen by Super Admin\\/Admin user")
//	public void verification_of_breaching_the_max_word_limit_in_first_name_text_field_of_user_add_screen_by_super_admin_admin_user() {
//		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
//		
//		  usap.firstNameinputAdd(alldata.get(vTCName).get("Value1").toString());
//		usap.headingTitleAdd();
//		Thread.sleep(4000);
//		Assert.assertEquals("Please enter a valid EDGE ID !", usap.verifyValidationMessageFirstNameUser());
//
//		Assert.assertEquals("EdgeId Min and max message not matching",
//				"Alphanumerics of length Min = 2, Max = 64 are allowed !", usap.verifyValidationMessageEdgeId());
//
//	}


	@Then("click on save button to save data")
	public void click_on_save_button_to_save_data() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.saveButtonAdd();
	}
	
	

}
