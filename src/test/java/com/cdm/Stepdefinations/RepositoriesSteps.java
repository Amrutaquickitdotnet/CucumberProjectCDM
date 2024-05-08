package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.EdgeGroupsPage;
import com.cdm.pages.RepositoriesAddPage;
import com.cdm.pages.RepositoriesPage;

import io.cucumber.java.en.Then;

public class RepositoriesSteps extends BaseTest {

	@Then("Click on Settings module from side menu bar & switching to Repositories tab")
	public void click_on_settings_module_from_side_menu_bar_switching_to_repositories_tab()
			throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		Thread.sleep(4000);
		rs.Setting_tab();
		Thread.sleep(4000);
		rs.repositories_tab();
	}

	@Then("Try increasing & decreasing the Zoom% \\(from {int}% to {int}%) from browsers.")
	public void try_increasing_decreasing_the_zoom_from_to_from_browsers(Integer int1, Integer int2) {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.setZoomLevel(800, 600);
	}

	@Then("Click on Add button icon on top right side of repositories")
	public void click_on_add_button_icon_on_top_right_side_of_repositories() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);

		Thread.sleep(4000);
		rs.addButton();
		Thread.sleep(4000);
	}

	@Then("User Name optional Text field in the Repository > Add screen")
	public void user_name_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
	}

	@Then("verify message for User Name optional Text field in the Repository > Add screen")
	public void verify_message_for_user_name_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories validation message for username",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				rap.verifyValidationMessageUsername());

	}

	@Then("Password optional Text field in the Repository > Add screen")
	public void password_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryPasswordAdd(alldata.get(vTCName).get("RepositoryPasswordAdd").toString());
	}

	@Then("enter the value for username")
	public void enter_the_value_for_username() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
	}

	@Then("On the top of the left side Click on accordion")
	public void on_the_top_of_the_left_side_click_on_accordion() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.accordionexpandbutton();
		Thread.sleep(4000);
	}

	@Then("check collapsible accordion functionality")
	public void check_collapsible_accordion_functionality() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.accordionexpandbutton();
		Thread.sleep(4000);
		rap.accordionexpandbutton();
	}

	@Then("fill the details under Repository path optional Text field in the Repository > Add screen")
	public void fill_the_details_under_repository_path_optional_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorypathAdd(alldata.get(vTCName).get("RepositoryPathAdd").toString());
		Thread.sleep(4000);
	}

	@Then("enter the User Name optional Text field in the Repository > Add screen.")
	public void enter_the_user_name_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
	}

	@Then("click on Edit button to edit repositories")
	public void click_on_edit_button_to_edit_repositories() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.editbuttonRepository();
		
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.removalofEnteredTextForRepositoryName();
		
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		
		rap.removalofEnteredTextForRepositoryPath();
		
		
		rap.repositorypathAdd(alldata.get(vTCName).get("RepositoryPathAdd").toString());
		
		
		rap.removalofEnteredTextForURL();
		
		
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		
		rap.removalofEneredTextForUSername();
		
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
		
		rap.removalofEneredTextPassword();
		
		rap.repositoryPasswordAdd(alldata.get(vTCName).get("RepositoryPasswordAdd").toString());
		
		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
		Thread.sleep(4000);
		
		rap.savebuttonrepository();
		
		Thread.sleep(4000);
		
		
	}

	@Then("observe search functionality")
	public void observe_search_functionality() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);

		rs.repositoriesNameThreeDot();
		rs.repositoryNameInput(alldata.get(vTCName).get("RepositoryNameSearch").toString());
		rs.backDropShowing_Div_Click();

		rs.dataStorageIndexThreeDot();
		rs.dataStorageIndex(alldata.get(vTCName).get("DataStorageIndexSearch").toString());
		rs.backDropShowing_Div_Click();

		rs.usernameThreeDot();
		rs.usernameInput(alldata.get(vTCName).get("UserNameSearch").toString());
		rs.backDropShowing_Div_Click();
	}

	@Then("click on three dots of repositories name and enter the value for the repositories")
	public void click_on_three_dots_of_repositories_name_and_enter_the_value_for_the_repositories()
			throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.repositoriesNameThreeDot();
		Thread.sleep(4000);
		try {
			rs.repositoryNameInput(alldata.get(vTCName).get("RepositoryNameSearch").toString());
			rs.backDropShowing_Div_Click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(4000);
	}

	@Then("click on Delete button")
	public void click_on_delete_button() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.deleteButton();

		Thread.sleep(4000);
		// rs.confirmationYesButton();
		Thread.sleep(4000);
		rs.confirmationNoButton();
	}

	@Then("verify tooltip for Edit button for repository")
	public void hover_the_mouse_on_edit_button_from_actions_columns() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.get_Text_ToolTipEditRepository();
	}

	@Then("click on Edit button to edit repository")
	public void click_on_edit_button_to_edit_repository() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.editbuttonRepository();
	}

	@Then("verify tooltip for Delete button for repository")
	public void verify_tooltip_for_delete_button_for_repository() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.get_Text_ToolTipDeleteRepository();
	}

	@Then("using drop drown of data storage index in Data storage index Text field in the Repository > Add screen")
	public void using_drop_drown_of_data_storage_index_in_data_storage_index_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
	}

	@Then("Hover the mouse on Add New button on the top right side")
	public void hover_the_mouse_on_add_new_button_on_the_top_right_side() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.get_Text_ToolTipAddButtonRepository();
	}

	@Then("without entering any details click on save button")
	public void without_entering_any_details_click_on_save_button() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.savebuttonrepository();
		Thread.sleep(4000);
	}

	@Then("click on cancel button from repositories details page to list screen")
	public void click_on_cancel_button_from_repositories_details_page_to_list_screen() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.cancelRepository();
		Thread.sleep(4000);
	}

	@Then("Click on Settings module & switch to Repositories tab & Click on \"+' Icon i.e. ADD button")
	public void click_on_settings_module_switch_to_repositories_tab_click_on_icon_i_e_add_button()
			throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.addButton();
		Thread.sleep(5000);
	}

	@Then("fill all mandatory fields for respositories add section")
	public void fill_all_mandatory_fields_for_respositories_add_section() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
	}

	@Then("hit on save button to save repositories")
	public void hit_on_save_button_to_save_repositories() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.savebuttonrepository();
	}

	@Then("Type alphanumeric with special characters in Repository URL Text field in the Repository > Add screen")
	public void type_alphanumeric_with_special_characters_in_repository_url_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Thread.sleep(4000);
	}

	@Then("Message appears that only valid URL are allowed i.e. minimum {int} & max No limit")
	public void message_appears_that_only_valid_url_are_allowed_i_e_minimum_max_no_limit(Integer int1) {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories url validation message", "Please enter valid url !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("Type valid name of the application url in URL Text field in the Repository > Add screen")
	public void type_valid_name_of_the_application_url_in_url_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Thread.sleep(4000);
	}

	@Then("Status Toggle button in the Repository > Add screen")
	public void status_toggle_button_in_the_repository_add_screen() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.moveSliderCondition("unchecked");

		Thread.sleep(3000);
		rap.moveSliderCondition("checked");
		Thread.sleep(3000);
		rap.moveSliderCondition("unchecked");
		Thread.sleep(3000);
	}

	@Then("verify colour of the toggle")
	public void verify_colour_of_the_toggle() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		String expectedColor = alldata.get(vTCName).get("ExpectedColourToggle").toString();
		Assert.assertEquals(rap.toggleElementcolour(), expectedColor);
	}

	@Then("verify Message appears that only valid URL are allowed")
	public void verify_message_appears_that_only_valid_url_are_allowed() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories url validation message", "Please enter valid url !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("Type alphabeitc characters in Repository Name Text field in the Repository > Add screen.")
	public void type_alphabeitc_characters_in_repository_name_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());

	}

	@Then("verify Message appears that only alphabetic characters are allowed")
	public void verify_message_appears_that_only_alphabetic_characters_are_allowed() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				rap.verifyValidationMessageRepositoryName());
	}

}
