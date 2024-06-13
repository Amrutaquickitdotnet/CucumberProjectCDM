package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.UserSettingsAddPage;
import com.cdm.pages.UserSettingsEditPage;
import com.cdm.pages.UserSettingsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSettingsSteps extends BaseTest {

	@Then("Click on Settings module from side menu bar")
	public void click_on_settings_module_from_side_menu_bar() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Setting_tab();
		

	}

	@Then("Click on Users tab from right panel of the screen")
	public void click_on_users_tab_from_right_panel_of_the_screen() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		
		usp.Users_tab();
		
	}

	@Then("verify of displaying the Add button,Bulk upload & Download button icons on top right side of Users List screen by Super Admin\\/Admin user")
	public void verify_of_displaying_the_add_button_bulk_upload_download_button_icons_on_top_right_side_of_users_list_screen_by_super_admin_admin_user()
			throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);

		Assert.assertTrue("Refresh button is not visible", usp.isVisibleRefresh());

		Assert.assertTrue("Add button is not visible", usp.isVisibleAdd());

		Assert.assertTrue("Upload button is not visible", usp.isVisibleUpload());

		Assert.assertTrue("Download button is not visible", usp.isVisibleDownload());

		System.out.println("All buttons are present");
	}

	@Then("verify search functionality in the users list")
	public void verify_search_functionality_in_the_users_list() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);

		
		usp.LastNameDot();
		usp.lastNameinput(alldata.get(vTCName).get("LastNameSearch").toString());
		usp.backDropShowing_Div_Click();
		
		usp.EmailDot();
		usp.emailidinput(alldata.get(vTCName).get("EmailIdSearch").toString());
		usp.backDropShowing_Div_Click();
		
		usp.RoleNameDot();
		usp.roleNameinput(alldata.get(vTCName).get("RoleNameSearch").toString());

	}

	@Then("choose the role from dropdown rolename")
	public void choose_the_role_from_dropdown_rolename() throws InterruptedException {
		UserSettingsAddPage usp = new UserSettingsAddPage(driver, logger);
		usp.roleNameAdd(alldata.get(vTCName).get("RoleNameAdd").toString().trim());
		
	}

	@Then("choose the role from dropdown rolename for edit screen")
	public void choose_the_role_from_dropdown_rolename_for_edit_screen() throws InterruptedException {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.roleNameEdit(alldata.get(vTCName).get("RoleNameEdit").toString());
		
	}

	@Then("enter the text in the Email Id field")
	public void enter_the_text_in_the_email_id_field() {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.removalofEnteredTextForEmailId();
		usep.emailidinputEdit(alldata.get(vTCName).get("EmailIDEdit").toString().trim());

	}

	@Then("choose the organization from dropdown on edit screen")
	public void choose_the_organization_from_dropdown_on_edit_screen() throws InterruptedException {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.organizationEdit(alldata.get(vTCName).get("OrganizationEdit").toString().trim());

	}

	@Then("verify add button on user list page")
	public void verify_add_button_on_user_list_page() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Users_tab();
		
		usp.addButton();
		
	}

	@Then("verify status toggle button")
	public void verify_status_toggle_button() throws InterruptedException {

		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.moveSliderCondition("unchecked");

		
		
	}

	@Then("verify status toggle button on edit screen")
	public void verify_status_toggle_button_on_edit_screen() throws InterruptedException {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.moveSliderCondition("unchecked");

		
		usep.moveSliderCondition("checked");
		
		usep.moveSliderCondition("unchecked");
		
	}

	@Then("fill all mandatory and optional field for Add users")
	public void fill_all_mandatory_and_optional_field_for_add_users() throws Exception {

		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());
		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());
		usap.emailidinputAdd(alldata.get(vTCName).get("EmailIDAdd").toString());
		usap.passwordInputAdd(alldata.get(vTCName).get("PasswordAdd").toString());
		usap.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		usap.dashboardAdd(alldata.get(vTCName).get("DashboardAdd").toString());
		usap.roleNameinputAdd(alldata.get(vTCName).get("RoleNameAdd").toString());
		Thread.sleep(7000);
		usap.saveButtonAdd();

	}

	@Then("Click on Cancel button")
	public void click_on_cancel_button() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Setting_tab();
		usp.Users_tab();
		
		usp.addButton();
		Thread.sleep(2000);
		usp.cancelButton();
	}

	@Then("verify bulk upload button on user list page")
	public void verify_bulk_upload_button_on_user_list_page() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.BulkUpload_btn();
	}

	@Then("verify bulk download button on user list page")
	public void verify_bulk_download_button_on_user_list_page() throws Exception {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Download_btn();
	}

	@Then("Enter details for user add page")
	public void enter_details_for_user_add_page() throws Exception {

		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
		Thread.sleep(6000);

		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());

		usap.emailidinputAdd(alldata.get(vTCName).get("EmailIDAdd").toString());

		usap.passwordInputAdd(alldata.get(vTCName).get("PasswordAdd").toString());

		usap.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());

		usap.dashboardAdd(alldata.get(vTCName).get("DashboardAdd").toString());

		usap.roleNameAdd(alldata.get(vTCName).get("RoleNameAdd").toString());

	}

	@Then("Enter details for user add page without adding password")
	public void enter_details_for_user_add_page_without_adding_password() throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
		Thread.sleep(6000);

		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());

		usap.emailidinputAdd(alldata.get(vTCName).get("EmailIDAdd").toString());

		usap.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());

		usap.dashboardAdd(alldata.get(vTCName).get("DashboardAdd").toString());

		usap.roleNameAdd(alldata.get(vTCName).get("RoleNameAdd").toString());

		usap.saveButtonAdd();
		
	}

	@Then("Verify validation message for password")
	public void verify_validation_message_for_password() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.verifyValidationMessagepasswordnotentered();
		Assert.assertEquals("Mandatory field - required !", usap.verifyValidationMessagepasswordnotentered());
	}

	@Then("Verification of the acceptance of alphabet values in First Name Text field in User Add screen")
	public void verification_of_the_acceptance_of_alphabet_values_in_first_name_text_field_in_user_add_screen()
			throws Exception {

		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
	

	}

	@Then("verify validation message for First Name")
	public void verify_validation_message_for_first_name() {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.verifyValidationMessageFirstNameUser();
	}

	@Then("Verification of the viewing of the password content when the view password icon is clicked in password field in the Identity section")
	public void verification_of_the_viewing_of_the_password_content_when_the_view_password_icon_is_clicked_in_password_field_in_the_identity_section()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.passwordeyeicon();
		Thread.sleep(2000);
	}

	@Then("Enter details for user add page for allowed charcters")
	public void enter_details_for_user_add_page_for_allowed_charcters() throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.passwordInputAdd(alldata.get(vTCName).get("PasswordAdd").toString());
		Thread.sleep(2000);
	}

	@Then("verify acceptance of copy content and paste in password field in the Identity section of User Add screen by Super Admin\\/Admin")
	public void verify_acceptance_of_copy_content_and_paste_in_password_field_in_the_identity_section_of_user_add_screen_by_super_admin_admin() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		String copiedContent = alldata.get(vTCName).get("PasswordAdd").toString();
		usap.passwordInputAddControl(copiedContent);
		usap.passwordInputAddBackspace(copiedContent);
		usap.passwordInputAddPaste(copiedContent);

		String enteredPassword = usap.passwordInputattribute();

		// Check if the pasted content matches the copied content
		if (enteredPassword.equals(copiedContent)) {
			System.out.println("Pasting content into the password field is accepted.");
		} else {
			System.out.println("Pasting content into the password field is not accepted.");
		}
	}

	@Then("Verify validation message for password acceptance of allowed charcters")
	public void verify_validation_message_for_password_acceptance_of_allowed_charcters() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		Assert.assertEquals(
				"Password needs to include at least One Upper Case Alphabet, One Lower Case Alphabet, One special character and One Number, also have a minimum of 8 characters !",
				usap.verifyValidationMessagepassword());

	}

	@Then("Verification of the acceptance of alphabet values in Last Name Text field of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_alphabet_values_in_last_name_text_field_of_user_add_screen_by_super_admin_admin_user() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());
		
	}

	@Then("Verification of breaching the Max word limit in First Name Text field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_breaching_the_max_word_limit_in_first_name_text_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
		usap.headingTitleAdd();
		

		Assert.assertEquals("Alphabets of length Min = 2, Max = 32 are allowed !",
				usap.verifyValidationMessageFirstNameUser());

	}

	@Then("Verification of the acceptance of valid number in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_valid_number_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());
		usap.headingTitleAdd();
		

	}

	@Then("Verification of the rejection of invalid number in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_rejection_of_invalid_number_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());
		// usap.headingTitleAdd();
		//// usap.saveButtonAdd();
		
		Assert.assertEquals("Numericals of length Min = 10 & Max = 16 characters are allowed !",
				usap.verifyValidationMessageContactInvalid());

	}

	@Then("Verification of breaching the Min word limit in Last Name Text field in the Identity section of User Add screen")
	public void verification_of_breaching_the_min_word_limit_in_last_name_text_field_in_the_identity_section_of_user_add_screen()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());
		usap.headingTitleAdd();

		usap.removalofEnteredTextForLastName();
		Assert.assertEquals("Mandatory field - required !", usap.verifyValidationMessageLastNameUser());
	}

	@Then("Verification of Display of error message with asterik mark due to blank Contact Number field")
	public void verification_of_display_of_error_message_with_asterik_mark_due_to_blank_contact_number_field()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.saveButtonAdd();
		Assert.assertEquals("Mandatory field - required !", usap.verifyValidationMessageContactmandatoryfield());
	}

	@When("I enter a valid email address")
	public void i_enter_a_valid_email_address() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.emailidinputAdd(alldata.get(vTCName).get("EmailIDAdd").toString());
	}

	@When("I press the Tab key")
	public void i_press_the_tab_key() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.pressTabKeyOnEmailInput();
	}

	@Then("I should be on the next field")
	public void i_should_be_on_the_next_field() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		Assert.assertTrue(usap.isNextFieldFocused());
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.passwordInputAdd(alldata.get(vTCName).get("PasswordAdd").toString());

	}

	@Then("Verification of breaching the Max word limit in Last Name Text field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_breaching_the_max_word_limit_in_last_name_text_field_of_user_add_screen_by_super_admin_admin_user()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());
		usap.headingTitleAdd();
		

		usap.removalofEnteredTextForLastName();
		Assert.assertEquals("Mandatory field - required !", usap.verifyValidationMessageLastNameUser());
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

		String contactNumberValue = alldata.get(vTCName).get("PhoneNumberAdd").toString();
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

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());

		
		Assert.assertEquals("Please enter a valid Phone Number !", usap.verifyValidationMessagedigitwithSpace());
	}

	@Then("Verification of the acceptance of {int} zeros in Contact Number field  of User Add screen by Super Admin\\/Admin user")
	public void verification_of_the_acceptance_of_zeros_in_contact_number_field_of_user_add_screen_by_super_admin_admin_user(
			Integer int1) throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());

		
		Assert.assertEquals("Please enter a valid Phone Number !", usap.verifyValidationMessagedigitwithZeros());
	}

	@Then("Verification of breaching the Min word limit in First Name Text field in the Identity section of User Add screen")
	public void verification_of_breaching_the_min_word_limit_in_first_name_text_field_in_the_identity_section_of_user_add_screen()
			throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);

		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
		usap.headingTitleAdd();
		
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

		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());
		usap.headingTitleAdd();
		
		try {
			Assert.assertEquals("  Alphabets of length Min = 2, Max = 32 are allowed ! ",
					usap.verifyValidationMessageLastNameUser());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("verify the acceptance of valid number in Contact number field")
	public void verify_the_acceptance_of_valid_number_in_contact_number_field() throws InterruptedException {

		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);

		

		usep.removalofEnteredTextForPhoneNoEdit();

		usep.phoneNumberInputEdit(alldata.get(vTCName).get("PhoneNumberEdit").toString());

		
		try {
			Assert.assertEquals("Numericals of length Min = 10 & Max = 16 characters are allowed !",
					usep.verifyValidationMessageContactInvalid());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify validation message for Last Name")
	public void verify_validation_message_for_last_name() throws InterruptedException {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);

		usep.lastNameinputEdit(alldata.get(vTCName).get("LastNameEdit").toString());
		usep.headingTitleEdit();
		
		try {
			Assert.assertEquals("Alphabets of length Min = 1, Max = 32 are allowed !",
					usep.verifyValidationMessageLastNameUser());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("click on eye icon beside password field")
	public void click_on_eye_icon_beside_password_field() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.eyeiconpassword();
		Thread.sleep(2000);
	}

	@Then("verify Edit button on user list page")
	public void verify_edit_button_on_user_list_page() throws InterruptedException {

		UserSettingsEditPage use = new UserSettingsEditPage(driver, logger);

		Thread.sleep(2000);
		use.removalofEnteredTextForFirstNameEdit();
		use.firstNameinputEdit(alldata.get(vTCName).get("FirstNameEdit"));

		use.removalofEnteredTextForLastNameEdit();
		use.lastNameinputEdit(alldata.get(vTCName).get("LastNameEdit"));

		use.removalofEnteredTextForPhoneNoEdit();
		use.phoneNumberInputEdit(alldata.get(vTCName).get("PhoneNumberEdit"));

		use.removalofEnteredTextForEmailId();
		use.emailidinputEdit(alldata.get(vTCName).get("EmailIDEdit"));

		use.removalofEnteredTextForPassword();
		use.passwordInputEdit(alldata.get(vTCName).get("PasswordEdit"));
		
		use.saveButtonEdit();
		

	}

	@Then("verify password field for edition")
	public void verify_password_field_for_edition() {
		UserSettingsEditPage use = new UserSettingsEditPage(driver, logger);
		use.removalofEnteredTextForPassword();
		use.passwordInputEdit(alldata.get(vTCName).get("PasswordEdit"));
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
		usp.firstNameinput(alldata.get(vTCName).get("FirstNameSearch"));
		usp.backDropShowing_Div_Click();

		
	}

	@Then("verify delete tooltip")
	public void verify_delete_tooltip() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		Assert.assertEquals("Tooltip of delete button for user ", "Delete", usp.get_Text_ToolTipDelete());
		
	}

	@When("I edit a valid email address")
	public void i_edit_a_valid_email_address() throws InterruptedException {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		Thread.sleep(2000);
		usep.removalofEnteredTextForEmailId();
		usep.emailidinputEdit(alldata.get(vTCName).get("EmailIDEdit").toString());
		
	}

	@Then("verify Edit tooltip")
	public void verify_edit_tooltip() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit button for user ", "Edit", usp.get_Text_ToolTipEdit());
		
	}

	@Then("Enter details for user add page without choosing User Role")
	public void enter_details_for_user_add_page_without_choosing_user_role() throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.firstNameinputAdd(alldata.get(vTCName).get("FirstNameAdd").toString());
		

		usap.lastNameinputAdd(alldata.get(vTCName).get("LastNameAdd").toString());

		usap.phoneNumberInputAdd(alldata.get(vTCName).get("PhoneNumberAdd").toString());

		usap.emailidinputAdd(alldata.get(vTCName).get("EmailIDAdd").toString());

		usap.passwordInputAdd(alldata.get(vTCName).get("PasswordAdd").toString());

		usap.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());

		usap.dashboardAdd(alldata.get(vTCName).get("DashboardAdd").toString());

	}

	@Then("click on three dots from status column of user module")
	public void click_on_three_dots_from_status_column_of_user_module() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.status();
		Thread.sleep(2000);
	}

	@Then("try to select value from organization dropdown")
	public void try_to_select_value_from_organization_dropdown() throws InterruptedException {
		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		
	}

	@Then("verify validation message for RoleName")
	public void verify_validation_message_for_role_name() throws InterruptedException {

		UserSettingsAddPage usap = new UserSettingsAddPage(driver, logger);
		usap.roleNameAdd(alldata.get(vTCName).get("RoleNameEdit").toString());
		usap.saveButtonAdd();
		
		usap.verifyvalidationmessageforroleName();
	}

	@Then("verify acceptance of copy content and paste in password field")
	public void verify_acceptance_of_copy_content_and_paste_in_password_field() {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.passwordInputEdit(alldata.get(vTCName).get("PasswordEdit").toString());
	}

	@Then("verify popup message after successful entry")
	public void verify_popup_message_after_successful_entry() {

		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		Assert.assertEquals("User updated successfully", usp.sucessmessage());
	}

	@Then("click on three dots for Last name and enter the value in the place of Last name")
	public void click_on_three_dots_for_last_name_and_enter_the_value_in_the_place_of_last_name()
			throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.LastNameDot();
		Thread.sleep(2000);
		usp.lastNameinput(alldata.get(vTCName).get("LastNameSearch").toString());
		usp.backDropShowing_Div_Click();

	}

	@Then("click on three dots for EmailId  and enter the value in the place of Email")
	public void click_on_three_dots_for_email_id_and_enter_the_value_in_the_place_of_email() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.EmailDot();
		usp.emailidinput(alldata.get(vTCName).get("EmailIdSearch").toString());
		usp.backDropShowing_Div_Click();
	}

	@Then("click on three dots for Role Name and enter the value in the place of RoleName")
	public void click_on_three_dots_for_role_name_and_enter_the_value_in_the_place_of_role_name()
			throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.RoleNameDot();
		Thread.sleep(2000);
		usp.roleNameinput(alldata.get(vTCName).get("RoleNameSearch").toString());

	}

	@Then("click on three dots on status and look at the active status")
	public void click_on_three_dots_on_status_and_look_at_the_active_status() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.status();
		Thread.sleep(2000);
	}

	@Then("click on three dots on status and check the inactive status and look at the inactive status")
	public void click_on_three_dots_on_status_and_check_the_inactive_status_and_look_at_the_inactive_status()
			throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.status();
		usp.activestatusSelection();
		Thread.sleep(2000);
		usp.statusinputinActive();
		Thread.sleep(2000);

	}

	@Then("keep the contact number field blank")
	public void keep_the_contact_number_field_blank() throws InterruptedException {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);
		usep.removalofEnteredTextForPhoneNoEdit();
		Thread.sleep(2000);
		usep.phoneNumberInputEdit(alldata.get(vTCName).get("PhoneNumberEdit").toString());
	}

	@Then("verify validation message for contact number")
	public void verify_validation_message_for_contact_number() {
		UserSettingsEditPage usep = new UserSettingsEditPage(driver, logger);

		Assert.assertEquals("Mandatory field - required !", usep.verifyValidationMessageEditContact());
	}

	@Then("click on save button to save user")
	public void click_on_save_button_to_save_user() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.saveButton();
	}

	@Then("click on edit icon from actions column")
	public void click_on_edit_icon_from_actions_column() throws InterruptedException {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		
		try {
			usp.edituserbutton();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(2000);

	}

}
