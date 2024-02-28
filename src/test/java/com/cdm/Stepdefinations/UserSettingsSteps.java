package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.UserGroupEditPage;
import com.cdm.pages.UserGroupsAddPage;
import com.cdm.pages.UserRoleAddPage;
import com.cdm.pages.UserRoleEditPage;
import com.cdm.pages.UserRolePage;
import com.cdm.pages.UserSettingsAddPage;
import com.cdm.pages.UserSettingsEditPage;
import com.cdm.pages.UserSettingsPage;
import com.screenrecord.utils.ScreenRecorderUtil;

import io.cucumber.java.en.Then;

public class UserSettingsSteps extends BaseTest {

	@Then("Click on Settings module from side menu bar")
	public void click_on_settings_module_from_side_menu_bar() throws Exception {
		ScreenRecorderUtil.startRecord("Click on Settings module from side menu bar");
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Setting_tab();
		ScreenRecorderUtil.stopRecord();
	}

	@Then("Click on Users tab from right panel of the screen")
		public void click_on_users_tab_from_right_panel_of_the_screen() throws Exception {
		ScreenRecorderUtil.startRecord("Click on Users tab from right panel of the screen");

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		Thread.sleep(3000);
		usp.Users_tab();
	}

	@Then("verify of displaying the Add button,Bulk upload & Download button icons on top right side of Users List screen by Super Admin\\/Admin user")
	public void verify_of_displaying_the_add_button_bulk_upload_download_button_icons_on_top_right_side_of_users_list_screen_by_super_admin_admin_user() throws Exception {
		ScreenRecorderUtil.startRecord("verify of displaying the Add button,Bulk upload & Download button icons on top right side of Users List screen by Super Admin");
		UserSettingsPage usp = new UserSettingsPage(driver, logger);

		Assert.assertTrue("Refresh button is not visible", usp.isVisibleRefresh());

		Assert.assertTrue("Add button is not visible", usp.isVisibleAdd());

		Assert.assertTrue("Upload button is not visible", usp.isVisibleUpload());

		Assert.assertTrue("Download button is not visible", usp.isVisibleDownload());

		System.out.println("All buttons are present");
	}

	@Then("verify search functionality in the users list")
	public void verify_search_functionality_in_the_users_list() throws Exception {
		ScreenRecorderUtil.startRecord("verify search functionality in the users list");
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
//		usp.FirstNameDot();
//		usp.firstNameinput(alldata.get(vTCName).get("Value1").toString());
		// usp.backDropShowing_Div_Click();
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
	public void verify_add_button_on_user_list_page() throws Exception {
		ScreenRecorderUtil.startRecord("verify add button on user list page");
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Users_tab();
		Thread.sleep(3000);
		usp.addButton();
	}

	@Then("fill all mandatory and optional field for Add users")
	public void fill_all_mandatory_and_optional_field_for_add_users() throws Exception {
		ScreenRecorderUtil.startRecord("Click on Settings module from side menu bar");
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("Value1").toString());
		usap.lastNameinputAdd(alldata.get(vTCName).get("Value2").toString());
		usap.phoneNumberInputAdd(alldata.get(vTCName).get("Value3").toString());
		usap.emailidinputAdd(alldata.get(vTCName).get("Value4").toString());
		usap.passwordInputAdd(alldata.get(vTCName).get("Value5").toString());
		usap.organizationAdd(alldata.get(vTCName).get("Value6").toString());
		usap.dashboardAdd(alldata.get(vTCName).get("Value7").toString());
		usap.roleNameinputAdd(alldata.get(vTCName).get("Value8").toString());
		Thread.sleep(7000);
		usap.saveButtonAdd();

	}

	@Then("Click on Cancel button")
	public void click_on_cancel_button() throws Exception {
		ScreenRecorderUtil.startRecord("Click on Cancel button");

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Setting_tab();
		usp.Users_tab();
		Thread.sleep(3000);
		usp.addButton();
		Thread.sleep(2000);
		usp.cancelButton();
	}

	@Then("verify bulk upload button on user list page")
	public void verify_bulk_upload_button_on_user_list_page() throws Exception {
		ScreenRecorderUtil.startRecord("verify bulk upload button on user list page");
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.BulkUpload_btn();
	}

	@Then("verify bulk download button on user list page")
	public void verify_bulk_download_button_on_user_list_page() throws Exception {
		ScreenRecorderUtil.startRecord("verify bulk download button on user list page");
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Download_btn();
	}

	@Then("Enter details for user add page")
	public void enter_details_for_user_add_page() throws Exception {
		ScreenRecorderUtil.startRecord("Click on Settings module from side menu bar");
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
	public void verification_of_the_acceptance_of_alphabet_values_in_first_name_text_field_in_user_add_screen_by_super_admin_admin_user() throws Exception {
		ScreenRecorderUtil.startRecord("Verification of the acceptance of alphabet values in First Name Text field in User Add screen");
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

	@Then("Verification of breaching the Max word limit in First Name Text field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_breaching_the_max_word_limit_in_first_name_text_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.firstNameinputAdd(alldata.get(vTCName).get("Value1").toString());
		usap.headingTitleAdd();
		Thread.sleep(4000);

		Assert.assertEquals("  Alphabets of length Min = 2, Max = 32 are allowed ! ",
				usap.verifyValidationMessageFirstNameUser());

	}

	@Then("Verification of the acceptance of valid number in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_valid_number_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("Value3").toString());
		usap.headingTitleAdd();
		Thread.sleep(4000);

	}

	@Then("Verification of the rejection of invalid number in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_rejection_of_invalid_number_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("Value3").toString());
		// usap.headingTitleAdd();
		//// usap.saveButtonAdd();
		Thread.sleep(4000);
		Assert.assertEquals("Numericals of length Min = 10 & Max = 16 characters are allowed !",
				usap.verifyValidationMessageContactInvalid());

	}

	@Then("Verification of breaching the Max word limit in Last Name Text field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_breaching_the_max_word_limit_in_last_name_text_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.lastNameinputAdd(alldata.get(vTCName).get("Value2").toString());
		usap.headingTitleAdd();
		Thread.sleep(4000);

		Assert.assertEquals("  Alphabets of length Min = 2, Max = 32 are allowed ! ",
				usap.verifyValidationMessageLastNameUser());
	}

	@Then("click on save button to save data")
	public void click_on_save_button_to_save_data() throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		Thread.sleep(8000);
		usap.saveButtonAdd();
	}

	@Then("Verification of copy pasting numeric digits in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_copy_pasting_numeric_digits_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		String contactNumberValue = alldata.get(vTCName).get("Value3").toString();
		usap.phoneNumberInputAdd(contactNumberValue);
		// Get the entered value from the Contact Number field
		String enteredValue = usap.getAttributeContact();

		// Perform the verification using regular expression
		if (enteredValue.matches("\\d+")) {
			System.out.println("Entered contact number '" + enteredValue + "' contains only numeric digits.");
		} else {
			Assert.assertEquals("Numericals of length Min = 10 & Max = 16 characters are allowed !",
					usap.verifyValidationMessageContactInvalid());
		}
	}

	@Then("Verification of the rejection of blanks and spaced number in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_rejection_of_blanks_and_spaced_number_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("Value3").toString());

		Thread.sleep(4000);
		Assert.assertEquals("Please enter a valid Phone Number !", usap.verifyValidationMessagedigitwithSpace());
	}

	@Then("Verification of the acceptance of {int} zeros in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_zeros_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user(
			Integer int1) throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("Value3").toString());

		Thread.sleep(4000);
		Assert.assertEquals("Please enter a valid Phone Number !", usap.verifyValidationMessagedigitwithZeros());
	}

	@Then("Verification of breaching the Min word limit in First Name Text field in the Identity section of User Add screen")
	public void verification_of_breaching_the_min_word_limit_in_first_name_text_field_in_the_identity_section_of_user_add_screen()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.firstNameinputAdd(alldata.get(vTCName).get("Value1").toString());
		usap.headingTitleAdd();
		Thread.sleep(4000);
		try {
			Assert.assertEquals("  Alphabets of length Min = 2, Max = 32 are allowed ! ",
					usap.verifyValidationMessageFirstNameUser());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("Verification of breaching the Min word limit in Last Name Text field in the Identity section of User Add screen by Super Admin\\/Admin user")
	public void verification_of_breaching_the_min_word_limit_in_last_name_text_field_in_the_identity_section_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.lastNameinputAdd(alldata.get(vTCName).get("Value2").toString());
		usap.headingTitleAdd();
		Thread.sleep(4000);
		try {
			Assert.assertEquals("  Alphabets of length Min = 2, Max = 32 are allowed ! ",
					usap.verifyValidationMessageLastNameUser());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("verify Edit button on user list page")
	public void verify_edit_button_on_user_list_page() throws InterruptedException {

		UserSettingsEditPage use = new UserSettingsEditPage(driver, logger);

		Thread.sleep(2000);
		use.removalofEnteredTextForFirstNameEdit();
		use.firstNameinputEdit(alldata.get(vTCName).get("Value1"));

		use.removalofEnteredTextForLastNameEdit();
		use.lastNameinputEdit(alldata.get(vTCName).get("Value2"));

		use.removalofEnteredTextForPhoneNoEdit();
		use.phoneNumberInputEdit(alldata.get(vTCName).get("Value3"));

		//use.removalofEnteredTextForEmailId();
		//use.emailidinputEdit(alldata.get(vTCName).get("Value4"));

//		use.removalofEnteredTextForPassword();
//		use.passwordInputEdit(alldata.get(vTCName).get("Value5"));
		Thread.sleep(3000);
		use.saveButtonEdit();
		Thread.sleep(3000);

	}

	@Then("click on Delete icon from actions column")
	public void click_on_delete_icon_from_actions_column() throws InterruptedException {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.deleteButton();
		Thread.sleep(6000);
		usp.confirmationYesButton();
	}

	@Then("click on Delete icon from actions column to delete user")
	public void click_on_delete_icon_from_actions_column_to_delete_user() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.deleteButtonUser();
		Thread.sleep(6000);
		usp.confirmationYesButton();
	}

	@Then("click on three dots for first name and enter the value in the place of first name")
	public void click_on_three_dots_for_first_name_and_enter_the_value_in_the_place_of_first_name()
			throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.FirstNameDot();
		usp.firstNameinput(alldata.get(vTCName).get("Value6"));
		usp.backDropShowing_Div_Click();

		Thread.sleep(3000);
	}

	@Then("click on edit icon from actions column")
	public void click_on_edit_icon_from_actions_column() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		Thread.sleep(3000);
		try {
			usp.edituserbutton();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("Click on Users Roles Tab from right panel of the screen")
	public void click_on_users_roles_tab_from_right_panel_of_the_screen() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Users_Role();
	}

	@Then("click on add button to add role")
	public void click_on_add_button_to_add_role() throws Exception {
		ScreenRecorderUtil.startRecord("Add Role");
		UserRolePage urp = new UserRolePage(driver, logger);
		urp.addbuttonuserRole();

		UserRoleAddPage urap = new UserRoleAddPage(driver, logger);

		urap.inputaddrole(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(5000);
		urap.saveuserrole();
	}

	@Then("click on three dots for role name and serach for role")
	public void click_on_three_dots_for_role_name_and_serach_for_role() throws InterruptedException {
		UserRolePage urp = new UserRolePage(driver, logger);
		urp.searchRoleName();
		Thread.sleep(4000);
		urp.sendsearchRoleName(alldata.get(vTCName).get("Value1"));

	}

	@Then("click on Edit button to edit role")
	public void click_on_edit_button_to_edit_role() {
		UserRolePage urp = new UserRolePage(driver, logger);
		try {
			urp.editRoleButton();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("update the value for role and click on save button")
	public void update_the_value_for_role_and_click_on_save_button() throws InterruptedException {
		UserRoleEditPage ure = new UserRoleEditPage(driver, logger);
		ure.removalofEnteredTextForUserRole();
		Thread.sleep(4000);
		ure.roleNameinputEdit(alldata.get(vTCName).get("Value2").toString());
		ure.saveButtonAdd();
	}

	@Then("Click on Users Groups Tab from right panel of the screen")
	public void click_on_users_groups_tab_from_right_panel_of_the_screen() {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.UserGroupstab();

	}

	@Then("click on add button to add user group")
	public void click_on_add_button_to_add_user_group() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.addbuttonicon();
		Thread.sleep(5000);
		uga.inputUserGroup(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(5000);
		uga.saveusergroups();
	}

	@Then("click on three dots for user group and serach for user group")
	public void click_on_three_dots_for_user_group_and_serach_for_user_group() {
		UserGroupEditPage ugep = new UserGroupEditPage(driver, logger);
		ugep.UserGroupDot();

	}

	@Then("click on Edit button to edit user group")
	public void click_on_edit_button_to_edit_user_group() throws Exception {
		UserGroupEditPage ugep = new UserGroupEditPage(driver, logger);
		ugep.usergroupinputsearch(alldata.get(vTCName).get("Value1").toString());

		ugep.usergroupEditicon();
		ugep.removalofEnteredTextForUserGroups();
		ugep.usergroupnameedit(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(5000);
		ugep.saveButtonAdd();

	}

	@Then("update the value for usergroup and click on save button")
	public void update_the_value_for_usergroup_and_click_on_save_button() throws InterruptedException {
		UserGroupEditPage ugep = new UserGroupEditPage(driver, logger);
		ugep.usergroupnameedit(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(5000);
		ugep.saveButtonAdd();
	}

	@Then("click on three dots for user group and search for user group")
	public void click_on_three_dots_for_user_group_and_search_for_user_group() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.usergroupThreeDot();
		Thread.sleep(4000);
		uga.searchUserGroup(alldata.get(vTCName).get("Value1").toString());
		uga.backDropShowing_Div_Click();
		Thread.sleep(4000);

	}

	@Then("click on Delete icon from actions column to delete user group name")
	public void click_on_delete_icon_from_actions_column_to_delete_user_group_name() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.deletebuttonicon();
		Thread.sleep(6000);
		uga.confirmationYesButton();
	}

}
