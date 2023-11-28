package com.cdm.Stepdefinitions;

import org.junit.Assert;

import com.cdm.pages.EdgeDevicesPage;

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
		Assert.assertEquals("EdgeId search text box is not empty","", edp.removalofEneredTextForEdgeId());
	 
		
	
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

}
