package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.AppsEditPage;
import com.cdm.pages.AppsPage;

import io.cucumber.java.en.Then;

public class AppsSteps extends BaseTest {

	@Then("Click on Apps tab from right panel of the screen")
	public void click_on_apps_tab_from_right_panel_of_the_screen() throws InterruptedException {
		AppsPage ap = new AppsPage(driver, logger);
		ap.Apps_tab();
	}

	@Then("verify page with resize option for App page")
	public void verify_page_with_resize_option_for_app_page() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.setZoomLevel(800, 600);
	}

	@Then("verify tooltip for License Type from update Screen")
	public void verify_tooltip_for_license_type_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of License Type", "Type of License supported by Application",
				aep.get_Text_ToolTiplicenseTypeToolTip());
	}

	@Then("serach for application name , architecture, Version")
	public void serach_for_application_name_architecture_version() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.applicationthreedot();
		ap.applicationName(alldata.get(vTCName).get("ApplicationSearch").toString());
		ap.backDropShowing_Div_Click();
		ap.architecturethreedot();
		ap.architecture(alldata.get(vTCName).get("ArchitectureSearch").toString());
		ap.backDropShowing_Div_Click();
		ap.versionThreeDot();
		ap.versionTag(alldata.get(vTCName).get("VersionSearch").toString());
		ap.backDropShowing_Div_Click();
	}

	@Then("click on View VolumeDetails icon from actions column")
	public void click_on_view_volume_details_icon_from_actions_column() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.viewVolumeDetails();
	}

	@Then("click on refresh button for apps")
	public void click_on_refresh_button_for_apps() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.refreshlist();
	}

	@Then("verify tooltip for Status")
	public void verify_tooltip_for_status() {
		AppsPage ap = new AppsPage(driver, logger);
		Assert.assertEquals("Tooltip of Status", "Search", ap.get_Text_ToolTipStatus());
	}

	@Then("cilck on Pencil icon i.e. EDIT button")
	public void click_on_edit_button() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.editButtonConfig();
	}

	@Then("verify tooltip for App Name from update Screen")
	public void verify_tooltip_for_app_name_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of AppName", "Unique Name assigned for the Application Group",
				aep.get_Text_ToolTipAppName());
	}

	@Then("verify tooltip for App Display Name from update Screen")
	public void verify_tooltip_for_app_display_name_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of App Display Name", "Display Name assigned for the Application Group",
				aep.get_Text_ToolTipAppDisplayName());
	}

	@Then("verify tooltip for Repository Link from update Screen")
	public void verify_tooltip_for_repository_link_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of App Display Name", "Path of Repository: URL, IP Address",
				aep.get_Text_ToolTipRepositoryLink());
	}

	@Then("verify tooltip for root volume from update Screen")
	public void verify_tooltip_for_root_volume_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of root volume", "Name assigned for core Application Volume",
				aep.get_Text_ToolTipRootVolume());
	}

	@Then("verify tooltip for Architecture from update Screen")
	public void verify_tooltip_for_architecture_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of architecture", "Type of Architecture of the Application",
				aep.get_Text_ToolTiparchitecture());
	}

	@Then("verify tooltip for version from update Screen")
	public void verify_tooltip_for_version_from_update_screen() throws InterruptedException {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of version", "Version number of the Application", aep.get_Text_ToolTiptag());

	}

	@Then("verify tooltip for Config Master from update Screen")
	public void verify_tooltip_for_config_master_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of App config master",
				"List of configurations allowed by application for CDM EDGE configuration module (JSON format)",
				aep.get_Text_ToolTipconfigMaster());
	}

	@Then("click on three dots on application list and enter the value for search and click on Edit button")
	public void click_on_three_dots_on_application_list_and_enter_the_value_for_search_and_click_on_edit_button()
			throws InterruptedException {
		AppsPage ap = new AppsPage(driver, logger);
		ap.applicationthreedot();
		ap.applicationName(alldata.get(vTCName).get("ApplicationSearch"));
		ap.backDropShowing_Div_Click();

		ap.editButtonConfig();

	}

	@Then("edit all the field listed on the update page")
	public void edit_all_the_field_listed_on_the_update_page() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		aep.removalofEnteredTextForappName();
		aep.applicationName(alldata.get(vTCName).get("AppNameEdit"));

		aep.removalofEnteredTextForappDisplayName();
		aep.applicationDisplayName(alldata.get(vTCName).get("AppDisplayNameEdit"));

		aep.removalofEnteredTextForrepositoryLink();
		aep.repositoryLink(alldata.get(vTCName).get("RepositoryLinkEdit"));

		aep.removalofEnteredTextForlicenseType();
		aep.licenseType(alldata.get(vTCName).get("LicenseTypeEdit"));

		aep.removalofEnteredTextForconfigmaster();
		aep.configMaster(alldata.get(vTCName).get("ConfigMasterEdit"));

		aep.removalofEnteredTextForversionTag();
		aep.version(alldata.get(vTCName).get("VersionEdit"));

		aep.removalofEnteredTextForarchitecture();
		aep.architecture(alldata.get(vTCName).get("ArchitectureEdit"));

		aep.removalofEnteredTextForRootVolume();
		aep.rootVolume(alldata.get(vTCName).get("RootVolumeEdit"));
	}

	@Then("click on save button to save app")
	public void click_on_save_button_to_save_app() throws InterruptedException {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		aep.saveapp();
	}

	@Then("click on cancel button to Cancel updation")
	public void click_on_cancel_button_to_cancel_updation() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		aep.cancelapp();
	}

	@Then("click on inactive button to deactivate application")
	public void click_on_inactive_button_to_deactivate_application() throws InterruptedException {
		AppsPage ap = new AppsPage(driver, logger);
		ap.inactivecrossbar();
		ap.confirmationYesButton();
	}

}