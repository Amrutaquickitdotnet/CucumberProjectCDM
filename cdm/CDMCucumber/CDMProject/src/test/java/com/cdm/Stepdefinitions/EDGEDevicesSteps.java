package com.cdm.Stepdefinitions;

import org.junit.Assert;

import com.cdm.pages.EdgeDeviceAdd;
import com.cdm.pages.EdgeDeviceEdit;
import com.cdm.pages.EdgeDevicesPage;
import com.cdm.pages.EdgeGroupConfiguration;
import com.cdm.pages.Menu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EDGEDevicesSteps extends BaseTest {

	@Then("Click on EDGE Device module from side menu bar")
	public void click_on_edge_device_module_from_side_menu_bar() {
		Menu edp = new Menu(driver, logger);
		edp.clickEdgeDevices();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Verify the all the buttons are present on the screen")
	public void verify_the_all_the_buttons_are_present_on_the_screen() throws InterruptedException {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertTrue("Refresh button is not visible", edp.isVisibleRefresh());
		Assert.assertTrue("Add button is not visible", edp.isVisibleAdd());
		Assert.assertTrue("Upload button is not visible", edp.isVisibleUpload());
		Assert.assertTrue("Download button is not visible", edp.isVisibleDownload());
		Assert.assertTrue("SettingButton button is not visible", edp.isVisibleSettingButton());
	}

	@Then("After landing on EDGE Device List screen, and Click on Refresh button")
	public void after_landing_on_edge_device_list_screen_and_click_on_refresh_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickRefreshButton();
	}

	@Then("After landing on EDGE Device List screen, Click on ADD New button")
	public void after_landing_on_edge_device_list_screen_click_on_add_new_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("After landing on EDGE Device List screen, Click on Search bar after entering data")
	public void after_landing_on_edge_device_list_screen_click_on_search_bar_after_entering_data() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());

	}

	@Then("After landing on EDGE Device List screen Click on Configuration icon button")
	public void after_landing_on_edge_device_list_screen_click_on_configuration_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickConfiguration();
	}

	@Then("After landing on EDGE Device List screen Click on Download icon button")
	public void after_landing_on_edge_device_list_screen_click_on_download_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickBulkUpload();
	}

	@Then("After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal_and_click_on_edit_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickEditButton();
	}

	@Then("After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal_and_click_on_delete_icon_button() {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// edp.scrollingBar();
		edp.clickDeleteButton();
	}

	@Then("confirmation message appear on the Screen for deletion with option Yes or No")
	public void confirmation_message_appear_on_the_screen_for_deletion_with_option_yes_or_no() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.Confirmation_NoButton();

		// edp.Confirmation_YesButton();
	}

	@Then("After landing on EDGE Device List screen And Mousehover on View ALERTS icon button")
	public void after_landing_on_edge_device_list_screen_and_mousehover_on_view_alerts_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip for View Alerts button", "View Alerts", edp.get_Text_ToolTipviewAlert());
	}

	@Then("Click on EDGE ID search icon i.e. three dots.")
	public void click_on_edge_id_search_icon_i_e_three_dots() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
	}

	@Then("Click on EDGE Group Name search icon i.e. three dots & enter Invalid inputs into search text field")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on EDGE Name search icon i.e. three dots & enter Valid inputs into search text field.")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value1").toString());
	}

	@When("After pagination all default records will display in Next page")
	public void after_pagination_all_default_records_will_display_in_next_page() {
		System.out.println("All records display successfully");
	}

	@When("Click on APP Group name search icon")
	public void click_on_app_group_name_search_icon() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
	}

	@Then("Click on three dots & enter Valid inputs into search text field.")
	public void click_on_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on search icon i.e. three dots & search text field visible with cursor")
	public void click_on_search_icon_i_e_three_dots_search_text_field_visible_with_cursor() {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());

		edp.backDropShowing_Div_Click();
		edp.headingClick();

		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
		edp.backDropShowing_Div_Click();

		edp.headingClick();

		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());

		edp.backDropShowing_Div_Click();

		edp.headingClick();

		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());

		edp.backDropShowing_Div_Click();

		edp.headingClick();

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());

		edp.headingClick();

		edp.scrollingElementRightBar("div.example-container", "0");
	}

	@Then("Click on search icon i.e. three dots & search text field visible")
	public void click_on_search_icon_i_e_three_dots_search_text_field_visible() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeIdSearch_Button();
		Assert.assertTrue("EdgeId search text box is not visible", edp.isVisibleEdgeIdSearchbox());

	}

	@Then("Enter valid inputs as per required from table details into search text field and enter backspace & click on enter")
	public void enter_valid_inputs_as_per_required_from_table_details_into_search_text_field_and_enter_backspace_click_on_enter() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.backDropShowing_Div_Click();
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		Assert.assertEquals("EdgeId search text box is not empty", "", edp.removalofEneredTextForEdgeId());

	}

	@Then("Click on search menu bar on the top of the screen.")
	public void click_on_search_menu_bar_on_the_top_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
	}

	@Then("Enter invalid inputs into search text field & click on search")
	public void enter_invalid_inputs_into_search_text_field_click_on_search() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.backDropShowing_Div_Click();
		edp.edgeIdSearch_Button();

		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());

		edp.headingClick();

		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());

		edp.headingClick();

		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());

		edp.headingClick();

		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());

		edp.headingClick();

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());

		edp.headingClick();

		// edp.scrollingElementRightBar("div.example-container", "0");
	}

	@Then("Click on ADD New button on the top right side")
	public void click_on_add_new_button_on_the_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("After landing on EDGE Device List screen")
	public void after_landing_on_edge_device_list_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Verify title of the breadcrumb does not match", "EDGE Devices",
				edp.get_Text_EdgeListHeading());
	}

	@Then("Click on ADD New button on the top right side & landed on EDGE>ADD Screen")
	public void click_on_add_new_button_on_the_top_right_side_landed_on_edge_add_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("without enter any values")
	public void without_enter_any_values() {
		System.out.println("Put all input field blanks");
	}

	@Then("scroll down")
	public void scroll_down() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.scrollingvertical();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	@Then("scroll down to deployment section")
	public void scroll_down_to_deployment_section() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.scrollingvertical();
	}

	@Then("click on save button")
	public void click_on_save_button() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
	}

	@Then("Click on ADD New button\\(+) icon on the top right side & landed on EDGE>ADD Screen")
	public void click_on_add_new_button_icon_on_the_top_right_side_landed_on_edge_add_screen()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
		Thread.sleep(5000);
	}

	@Then("click on cancel button in EDGE>ADD screen")
	public void click_on_cancel_button_in_edge_add_screen() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.cancelData();
		Thread.sleep(5000);
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Verify title of the breadcrumb does not match", "EDGE Devices",
				edp.get_Text_EdgeListHeading());

	}

	@Then("Click on Deploy apps button on the Actions column")
	public void click_on_deploy_apps_button_on_the_actions_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.clickondeployimage();

	}

	@Then("landed on EDGE>Application Deployment screen")
	public void landed_on_edge_application_deployment_screen() {

		EdgeGroupConfiguration egc = new EdgeGroupConfiguration(driver, logger);

		Assert.assertEquals("Edge Group Configuration breadcrum does not matching ",
				"EDGE Devices > Application Deployment", egc.verifyDeployBreadcrumb());
	}

	@Given("move to EdgeDevices tab")
	public void move_to_edge_devices_tab() {
		// Write code here that turns the phrase above into concrete actions
		initiationData();
	}

	@Then("EdgeDevices tab should open")
	public void edge_devices_tab_should_open() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("check for Heading")
	public void check_for_heading() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("check for the table rows")
	public void check_for_the_table_rows() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("check for collapse button")
	public void check_for_collapse_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("After landing on EDGE Device List screen And Mousehover on DELETE icon button")
	public void after_landing_on_edge_device_list_screen_and_mousehover_on_delete_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip of delete button", "Delete", edp.get_Text_ToolTipDelete());
	}

	@Then("enter valid values for all text fields")
	public void enter_valid_values_for_all_text_fields() throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInput((alldata.get(vTCName).get("Value1").toString()));

		System.out.println("I am working");
		eda.identityedgeName((alldata.get(vTCName).get("Value2").toString()));

		eda.organization(alldata.get(vTCName).get("Value3").toString());

		eda.edgeGroupName(alldata.get(vTCName).get("Value4").toString());

		System.out.println("I am completed edgeGroupName");
		eda.assignedTo((alldata.get(vTCName).get("Value5").toString()));
		System.out.println("I am completed assignTo");
		eda.hardWareName(alldata.get(vTCName).get("Value6").toString());

		System.out.println("I am completed HardwareName");
		eda.scrollingvertical();
		eda.applicationGroupSelect(alldata.get(vTCName).get("Value7").toString());
	}

	@Then("Enter numeric values into EDGE ID text fields")
	public void enter_numeric_values_into_edge_id_text_fields() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Thread.sleep(3000);
		eda.identityedgeIdInput(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Enter alphanumeric with special char values into EDGE Name text fields")
	public void enter_alphanumeric_with_special_char_values_into_edge_name_text_fields() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeName(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Enter numeric values to check character strength into EDGE ID text fields")
	public void enter_numeric_values_to_check_character_strength_into_edge_id_text_fields() {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInput(alldata.get(vTCName).get("Value1").toString());

		// Assert.assertEquals("Edge ID validation for 64 char is not valid", "Expected
		// messsage",eda.verifyValidationMessageEdgeId());

		Assert.assertEquals("EdgeId Min and max message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", eda.verifyValidationMessageEdgeId());

	}

	@Then("Enter numeric values to check character strength into EDGE NAME text fields")
	public void enter_numeric_values_to_check_character_strength_into_edge_name_text_fields() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeName(alldata.get(vTCName).get("Value2").toString());

		Assert.assertEquals("EdgeId Min and max message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", eda.verifyValidationMessageEdgeName());

	}

	@Then("select options from Organization drop down")
	public void select_options_from_organization_drop_down() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.organization(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("select options from EDGE Group Name drop down")
	public void select_options_from_edge_group_name_drop_down() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeGroupName(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("click on save button on add page")
	public void click_on_save_button_on_add_page() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.saveAddData();
	}
	@Then("Click on EDIT \\(Pen icon) button on the Actions column & landed on EDGE>UPDATE Screen")
	public void click_on_edit_pen_icon_button_on_the_actions_column_landed_on_edge_update_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.scrollingElementRightBar("div.example-container", "900");
		
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.editEdgeDeviceClick();
	}
	@Then("modify few text fields like EDGE NAME & click on Save button")
	public void modify_few_text_fields_i_e_edge_id_edge_name_click_on_save_button() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
           ede.setEditClearField();
           try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           ede.identityedgeName(alldata.get(vTCName).get("Value2").toString());
		
	}
	@Then("fill details of Edge Id , Edge Name , Select dropdown organization")
	public void fill_details_of_edge_id_edge_name_select_dropdown_organization() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInput((alldata.get(vTCName).get("Value1").toString()));

		eda.identityedgeName((alldata.get(vTCName).get("Value2").toString()));

		eda.organization(alldata.get(vTCName).get("Value3").toString());

		
	}
	@Then("select value from dropdown Edge Group Name")
	public void select_value_from_dropdown_edge_group_name() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeGroupName(alldata.get(vTCName).get("Value4").toString());

	}
	@Then("enter the role of assigner")
	public void enter_the_role_of_assigner() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.assignedTo((alldata.get(vTCName).get("Value5").toString()));
		
	}
	@Then("select hardwareName from hardware dropdown")
	public void select_hardware_name_from_hardware_dropdown() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.hardWareName(alldata.get(vTCName).get("Value6").toString());

		eda.scrollingvertical();
		
	}
	@Then("Scrolldown bar and inside regisration accordion add Serial Number , Onboarding Key, Image Version")
	public void scrolldown_bar_and_inside_regisration_accordion_add_serial_number_onboarding_key_image_version()
	{
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.onBoardingKeyInput(alldata.get(vTCName).get("Value10").toString());
	}
	
	    
	@Then("Scroll down the page and enter server port from the deployment dropdown and select application group dropdown")
	public void scroll_down_the_page_and_enter_server_port_from_the_deployment_dropdown_and_select_application_group_dropdown() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.applicationGroupSelect(alldata.get(vTCName).get("Value7").toString());
	}
	@Then("enter Edge user and password inside well mapping accordion")
	public void enter_edge_user_and_password_inside_well_mapping_accordion() {
		
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeUserInput(alldata.get(vTCName).get("Value8").toString());
		
		eda.edgeUserPassword(alldata.get(vTCName).get("Value9").toString());
	    
	}
	
	@Then("click on save")
	public void click_on_save() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
		Thread.sleep(3000);
	}



	
}
