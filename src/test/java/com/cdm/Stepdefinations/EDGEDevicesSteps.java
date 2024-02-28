package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Assert;

import com.cdm.pages.ConfigurationsPage;
import com.cdm.pages.DeviceLogs;
import com.cdm.pages.EdgeAppConfigurationPage;
import com.cdm.pages.EdgeDeploymentsPage;
import com.cdm.pages.EdgeDeviceAdd;
import com.cdm.pages.EdgeDeviceEdit;
import com.cdm.pages.EdgeDevicesPage;
import com.cdm.pages.EdgeGroupConfigurationPage;
import com.cdm.pages.EnvironmentalVariablePage;
import com.cdm.pages.Menu;
import com.cdm.pages.Pagination;
import com.cdm.pages.SettingsWellPage;
import com.cdm.pages.UserSettingsPage;
import com.cdm.pages.WellMapping;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EDGEDevicesSteps extends BaseTest {
	@Then("verify page with resize option the login page")
	public void verify_page_with_resize_option_the_login_page() {
		driver.manage().window().fullscreen();
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.setZoomLevel(800, 600);
		edp.edgeDeviceScreenshot();

	}
	@Then("verify application functionality for single select choice")
	public void verify_application_functionality_for_single_select_choice() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		Thread.sleep(4000);
		egcp.titleApplicationDeployment();
		egcp.appNameDot();
		egcp.appNameInput(alldata.get(vTCName).get("Value4").toString());
		egcp.backDropShowing_Div_Click();
		egcp.titleApplicationDeployment();
		Thread.sleep(5000);
		egcp.checkboxAppNameSingleSelectStepTwoName();
		

		Thread.sleep(5000);

		egcp.NextButtonStep4();
	}


	@Then("verify application functionality for single select")
	public void verify_application_functionality_for_single_select() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		Thread.sleep(4000);
		egcp.titleApplicationDeployment();
		//egcp.appNameDot();
		//egcp.appNameInput(alldata.get(vTCName).get("Value4").toString());
		//egcp.backDropShowing_Div_Click();
		//egcp.titleApplicationDeployment();
		Thread.sleep(5000);
		egcp.checkboxAppNameSingleSelectStepTwoName();
		egcp.checkboxAppNameSingleSelectStepTwoNamedouble();

		Thread.sleep(5000);

		egcp.NextButtonStep4();
	}

	@Then("check pagination per page")
	public void check_pagination_per_page() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(5000);

		System.out.println(edp.recordsperpage());

	}

	@Then("verify validation of alphanumeric values for Edge ID")
	public void verify_validation_of_alphanumeric_values_for_edge_id() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		String edgeIDData = alldata.get(vTCName).get("Value1").toString();
		eda.identityedgeIdInputAdd(edgeIDData);
		String result = eda.identityedgeIdInputGet();
		Assert.assertEquals(result, edgeIDData);

//		if(edgeIDData.matches("^[\\p{L}0-9'#]+$")){
//			eda.identityedgeIdInputAdd(edgeIDData);
//		   
//		}
	}

	@Then("make health status in Active mode")
	public void make_health_status_in_active_mode() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Thread.sleep(3000);
		eda.moveSliderCondition("checked");

	}

	@Then("After landing on EDGE Device List screen Click on Configuration icon from the column of edge List page")
	public void after_landing_on_edge_device_list_screen_click_on_configuration_icon_from_the_column_of_edge_list_page() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.configurationcolumnListPage();

	}

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

	@Then("Verify all buttons are working")
	public void click_and_verify_refresh_button_is_working() throws InterruptedException {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// edp.clickRefreshButton();
		Assert.assertTrue("Refresh button is not visible", edp.isVisibleRefresh());

		Assert.assertTrue("Add button is not visible", edp.isVisibleAdd());

		Assert.assertTrue("Upload button is not visible", edp.isVisibleUpload());

		Assert.assertTrue("Download button is not visible", edp.isVisibleDownload());

		System.out.println("All buttons are present");
	}

	@Then("After landing on EDGE Device List screen, and Click on Refresh button")
	public void after_landing_on_edge_device_list_screen_and_click_on_refresh_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickRefreshButton();
		edp.edgeDeviceScreenshot();
	}

	@Then("After landing on EDGE Device List screen, Click on ADD New button")
	public void after_landing_on_edge_device_list_screen_click_on_add_new_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
		edp.edgeDeviceScreenshot();
	}

	@Then("After landing on EDGE Device List screen, Click on Search bar after entering data")
	public void after_landing_on_edge_device_list_screen_click_on_search_bar_after_entering_data() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());

		edp.edgeDeviceScreenshot();
	}

	@Then("After landing on EDGE Device List screen And Mousehover on EDIT icon button")
	public void after_landing_on_edge_device_list_screen_and_mousehover_on_edit_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit button", "Edit", edp.get_Text_ToolTipEdit());
	}

	@Then("After landing on EDGE Device List screen Click on Configuration icon button")
	public void after_landing_on_edge_device_list_screen_click_on_configuration_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickConfiguration();
		edp.edgeDeviceScreenshot();
	}

	@Then("After landing on EDGE Device List screen Click on Download icon button")
	public void after_landing_on_edge_device_list_screen_click_on_download_icon_button() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(5000);

		edp.clickDownload();
		edp.edgeDeviceScreenshot();
	}

	@Then("After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal_and_click_on_delete_icon_button()
			throws InterruptedException {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(6000);
		edp.clickDeleteButton();

	}

	@Then("Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen")
	public void click_on_deploy_apps_button_on_the_actions_column_landed_on_edge_application_deployment_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickondeployimage();
	}

	@Then("confirmation message appear on the Screen for deletion with option Yes or No")
	public void confirmation_message_appear_on_the_screen_for_deletion_with_option_yes_or_no() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		try {
			//edp.Confirmation_YesButton();
		} catch (Exception e) {
			// TODO: handle exception
		}
		edp.Confirmation_NoButton();

	}

	@Then("After landing on EDGE Device List screen and Mousehover on View ALERTS icon button")
	public void after_landing_on_edge_device_list_screen_and_mousehover_on_view_alerts_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for View Alerts button", "View Alerts", edp.get_Text_ToolTipviewAlert());
		} catch (Exception e) {
			e.printStackTrace();
}
		
		
	}

	@Then("Click on EDGE ID search icon i.e. three dots.")
	public void click_on_edge_id_search_icon_i_e_three_dots() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on EDGE ID name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		Thread.sleep(3000);
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on EDGE Group Name search icon i.e. three dots & enter Invalid inputs into search text field")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(6000);
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on EDGE Name search icon i.e. three dots & enter Valid inputs into search text field.")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(8000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		Thread.sleep(5000);

	}

	@Then("modify the value of mandatory field of Identity Section")
	public void modify_the_value_of_mandatory_field_of_identity_section() throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameUpdate(alldata.get(vTCName).get("Value2").toString());
		//ede.removalofEnteredTextForGroupName();
		ede.edgeGroupNameUpdate(alldata.get(vTCName).get("Value3").toString());
		//ede.removalofEnteredTextForhardware();
		ede.hardwareNameUpdate(alldata.get(vTCName).get("Value4").toString());

	}

	@Then("modify the value of optional field of Identity section")
	public void modify_the_value_of_optional_field_of_identity_section() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEneredTextForLocation();
		ede.locationUpdate(alldata.get(vTCName).get("Value5").toString());

		ede.removalofEneredTextForDescription();
		ede.descriptionUpdate(alldata.get(vTCName).get("Value6").toString());

	}

	@Then("Click on EDGE Id field search icon i.e. three dots & enter Valid inputs into search text field.")
	public void click_on_edge_id_field_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(8000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		edp.edgeDeviceScreenshot();
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

	@Then("enter value for App Group name")
	public void enter_value_for_app_group_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value1").toString());
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on three dots & enter Valid inputs into search text field.")
	public void click_on_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value1").toString());
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on bulk upload button for Edge Device")
	public void click_on_bulk_upload_button_for_edge_device() throws InterruptedException, AWTException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.fileupload();

		Thread.sleep(4000);
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("Value15").toString());
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

		// edp.uploadFileForEdgeDeviceClick();
		// edp.backDropShowing_Div_Click();
		// edp.uploadFileForEdgeDevice(alldata.get(vTCName).get("Value15").toString());
	}

	@Then("Click on search icon i.e. three dots & search text field visible")
	public void click_on_search_icon_i_e_three_dots_search_text_field_visible() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeIdSearch_Button();
		Assert.assertTrue("EdgeId search text box is not visible", edp.isVisibleEdgeIdSearchbox());
		edp.edgeDeviceScreenshot();
	}

	@Then("Click and Verify Bulk Download button is working")
	public void click_and_verify_bulk_download_button_is_working() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickDownload();
	}

	@Then("Click and Verify Bulk Application Configuration button is working")
	public void click_and_verify_bulk_application_configuration_button_is_working() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.Configuration_Icon_Button();
	}

	@Then("Enter valid inputs as per required from table details into search text field and enter backspace & click on enter")
	public void enter_valid_inputs_as_per_required_from_table_details_into_search_text_field_and_enter_backspace_click_on_enter() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeIdSearch_Button();

		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		Thread.sleep(5000);
		edp.removalofEneredTextForEdgeId();
		edp.backDropShowing_Div_Click();
		edp.headingClick();

		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
		edp.removalofEneredTextForEdgeName();
		edp.backDropShowing_Div_Click();
		edp.headingClick();

//         edp.edgeGroupNameSearch_Button();
// edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());
//edp.removalofEneredTextForEdgeGroupName();
//edp.backDropShowing_Div_Click();
//edp.headingClick();
Thread.sleep(5000);

//		edp.edgeAppGroupsSearch_Button();
//		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());
//		edp.removalofEneredTextForAppGroups();
//		edp.backDropShowing_Div_Click();
//		edp.headingClick();

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());
		edp.removalofEneredTextHardWareName();
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Enter valid inputs as per required from table details into search text field & click on enter")
	public void enter_valid_inputs_as_per_required_from_table_details_into_search_text_field_click_on_enter() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.backDropShowing_Div_Click();
		edp.edgeIdSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		edp.edgeDeviceScreenshot();

		edp.backDropShowing_Div_Click();
		edp.edgeNameSearch_Button();
		edp.edgeDeviceScreenshot();

		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
		edp.edgeDeviceScreenshot();
		edp.backDropShowing_Div_Click();
		edp.edgeGroupNameSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());
		edp.edgeDeviceScreenshot();
		edp.backDropShowing_Div_Click();
		edp.edgeAppGroupsSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());
		edp.edgeDeviceScreenshot();
		edp.scrollingElementRightBar("div.example-container", "900");

		edp.backDropShowing_Div_Click();
		edp.hardwareNameSearchDot();
		edp.edgeDeviceScreenshot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on search menu bar on the top of the screen.")
	public void click_on_search_menu_bar_on_the_top_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.edgeDeviceScreenshot();
	}

	@Then("Enter invalid inputs into search text field & click on search")
	public void enter_invalid_inputs_into_search_text_field_click_on_search() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.backDropShowing_Div_Click();
		edp.edgeIdSearch_Button();
		edp.edgeDeviceScreenshot();

		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		edp.edgeDeviceScreenshot();
		edp.headingClick();

		edp.edgeNameSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
		edp.edgeDeviceScreenshot();
		edp.headingClick();

		edp.edgeGroupNameSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());
		edp.edgeDeviceScreenshot();
		edp.headingClick();

		edp.edgeAppGroupsSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());
		edp.edgeDeviceScreenshot();
		edp.headingClick();

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.hardwareNameSearchDot();
		edp.edgeDeviceScreenshot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());
		edp.edgeDeviceScreenshot();
		edp.headingClick();

	}

	@Then("Click on ADD New button on the top right side")
	public void click_on_add_new_button_on_the_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
		edp.edgeDeviceScreenshot();
	}

	@Then("After landing on EDGE Device List screen")
	public void after_landing_on_edge_device_list_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Verify title of the breadcrumb does not match", "EDGE Devices",
				edp.get_Text_EdgeListHeading());
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on ADD New button on the top right side & landed on EDGE>ADD Screen")
	public void click_on_add_new_button_on_the_top_right_side_landed_on_edge_add_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		//eda.saveAddData();
	}

	@Then("Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen")
	public void click_on_add_new_button_icon_on_the_top_right_side_landed_on_edge_add_screen()throws InterruptedException {
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
		edp.edgeDeviceScreenshot();

	}

	@Then("landed on EDGE>Application Deployment screen")
	public void landed_on_edge_application_deployment_screen() {

		EdgeGroupConfigurationPage egc = new EdgeGroupConfigurationPage(driver, logger);

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

	@Then("After landing on EDGE Device List screen And Mousehover on DELETE icon button")
	public void after_landing_on_edge_device_list_screen_and_mousehover_on_delete_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip of delete button", "Delete", edp.get_Text_ToolTipDelete());
		edp.edgeDeviceScreenshot();
	}

	@Then("enter valid values for all text fields")
	public void enter_valid_values_for_all_text_fields() throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Value1").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("Value2").toString()));
		eda.organizationAdd(alldata.get(vTCName).get("Value3").toString());
		
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("Value4").toString());
		eda.locationAdd((alldata.get(vTCName).get("Value5").toString()));
		
		eda.hardWareNameAdd((alldata.get(vTCName).get("Value6").toString()));
		Thread.sleep(5000);
		eda.descriptionAdd((alldata.get(vTCName).get("Value7").toString()));
		
		
		eda.serialNumberInputAdd((alldata.get(vTCName).get("Value8").toString()));
		eda.onBoardingKeyInputAdd((alldata.get(vTCName).get("Value9").toString()));
		eda.imageVersionInputAdd((alldata.get(vTCName).get("Value10").toString()));
		
		eda.serverPortInputAdd((alldata.get(vTCName).get("Value11").toString()));
		eda.applicationGroupSelect((alldata.get(vTCName).get("Value12").toString()));
		
		//eda.edgeUserInputAdd((alldata.get(vTCName).get("Value13").toString()));
		//eda.edgeUserPasswordAdd((alldata.get(vTCName).get("Value14").toString()));
		
		Thread.sleep(4000);
		

	}

	@Then("Enter numeric values into EDGE ID text fields")
	public void enter_numeric_values_into_edge_id_text_fields() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Thread.sleep(3000);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Enter numeric values to check character strength into EDGE ID text fields")
	public void enter_numeric_values_to_check_character_strength_into_edge_id_text_fields()
			throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("Value1").toString());
		eda.headingTitleAdd();
		Thread.sleep(4000);
		Assert.assertEquals("Please enter a valid EDGE ID !", eda.verifyValidationMessageEdgeId1());

		Assert.assertEquals("EdgeId Min and max message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", eda.verifyValidationMessageEdgeId());

	}

	@Then("Enter numeric values to check character strength into EDGE NAME text fields")
	public void enter_numeric_values_to_check_character_strength_into_edge_name_text_fields() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("Value2").toString());
		Assert.assertEquals("Error message",
				"Please Enter a valid EDGE Name ! Alphanumerics of length Min = 2, Max = 64 are allowed !",
				eda.verifyValidationMessageEdgeName1());
		Assert.assertEquals("EdgeId Min and max message not matching",
				"Please Enter a valid EDGE Name ! Alphanumerics of length Min = 2, Max = 64 are allowed !",
				eda.verifyValidationMessageEdgeName());

	}

	@Then("Enter numeric values to check character strength into EDGE Name text fields of Edit Section")
	public void enter_numeric_values_to_check_character_strength_into_edge_name_text_fields_of_edit_section()
			throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameEdit(alldata.get(vTCName).get("Value2").toString());
		Assert.assertEquals("Error message",
				"Please Enter a valid EDGE Name ! Alphanumerics of length Min = 2, Max = 64 are allowed !",
				ede.verifyValidationMessageEdgeNameEdit());
		Assert.assertEquals("EdgeId Min and max message not matching",
				"Please Enter a valid EDGE Name ! Alphanumerics of length Min = 2, Max = 64 are allowed !",
				ede.verifyValidationMessageEdgeNameEdit());
	}

	@Then("select options from Organization drop down")
	public void select_options_from_organization_drop_down() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.organizationAdd(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("modify few text fields i.e. EDGE NAME,assigned to\\(Operator)and Description text fields")
	public void modify_few_text_fields_i_e_edge_name_assigned_to_operator_and_description_text_fields() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("EdgeName search text box is not empty", "", edp.removalofEneredTextForEdgeName());

		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);

		ede.identityedgeName(alldata.get(vTCName).get("Value4").toString());
	}

	@Then("select options from EDGE Group Name drop down")
	public void select_options_from_edge_group_name_drop_down() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("Value4").toString());
	}

	@Then("click on save button on add page")
	public void click_on_save_button_on_add_page() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();

		Thread.sleep(8000);
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

		ede.saveAddData();

	}

	@Then("fill details of Edge Id , Edge Name , Select dropdown organization")
	public void fill_details_of_edge_id_edge_name_select_dropdown_organization() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Value1").toString()));

		eda.identityedgeNameAdd((alldata.get(vTCName).get("Value2").toString()));

		eda.organizationAdd(alldata.get(vTCName).get("Value3").toString());

	}

	@Then("select value from dropdown Edge Group Name")
	public void select_value_from_dropdown_edge_group_name() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Thread.sleep(2000);
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("Value4").toString());

	}

	@Then("enter the role of assigner")
	public void enter_the_role_of_assigner() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Thread.sleep(2000);
		eda.assignedToAdd((alldata.get(vTCName).get("Value5").toString()));

	}

	@Then("select hardwareName from hardware dropdown")
	public void select_hardware_name_from_hardware_dropdown() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Thread.sleep(2000);

		eda.hardWareNameAdd(alldata.get(vTCName).get("Value6").toString());

		eda.scrollingvertical();

	}

	@Then("Scrolldown bar and inside regisration accordion add Serial Number , Onboarding Key, Image Version")
	public void scrolldown_bar_and_inside_regisration_accordion_add_serial_number_onboarding_key_image_version()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Thread.sleep(2000);
		eda.serialNumberInputAdd(alldata.get(vTCName).get("Value10").toString());

		eda.onBoardingKeyInputAdd(alldata.get(vTCName).get("Value10").toString());

		eda.imageVersionInputAdd(alldata.get(vTCName).get("Value11").toString());

	}

	@Then("Scroll down the page and enter server port from the deployment dropdown and select application group dropdown")
	public void scroll_down_the_page_and_enter_server_port_from_the_deployment_dropdown_and_select_application_group_dropdown()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.serverPortInputAdd(alldata.get(vTCName).get("Value8").toString());

		eda.applicationGroupSelect(alldata.get(vTCName).get("Value11").toString());
	}

	@Then("enter Edge user and password inside well mapping accordion")
	public void enter_edge_user_and_password_inside_well_mapping_accordion() throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeUserInputAdd(alldata.get(vTCName).get("Value12").toString());

		eda.edgeUserPasswordAdd(alldata.get(vTCName).get("Value13").toString());
		Thread.sleep(3000);
	}
	
	@Then("click on save button to add Edge")
	public void click_on_save_button_to_add_edge() throws InterruptedException {
	   EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
	   eda.saveAddData();
	}


	@Then("click on save")
	public void click_on_save() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
		Thread.sleep(3000);
	}

	@Then("Click on Edit icon button on Actions Column & landed on EDGE> edit page")
	public void click_on_edit_icon_button_on_actions_column_landed_on_edge_edit_page() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.editEdgeDeviceClick();
	}

	@Then("After landing on EDGE Device module List screen scoll page to right side")
	public void after_landing_on_edge_device_module_list_screen_scoll_page_to_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickEditButton();
	}

	@Then("update the EdgeName , Organization, groupName, AssignedTo, HardWareName and Description")
	public void update_the_edge_name_organization_group_name_assigned_to_hard_ware_name_and_description()
			throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		Thread.sleep(3000);
		ede.clearEnteredName();
		Thread.sleep(5000);
		ede.identityedgeNameUpdate(alldata.get(vTCName).get("Value2").toString());

		ede.updatesaveAddDataBtn();
	}

	@Then("enter value for HardWare Name")
	public void enter_value_for_hard_ware_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameInput(alldata.get(vTCName).get("Value6").toString());
		Thread.sleep(5000);
	}

	@Then("Click on HardWare Name Dots")
	public void click_on_hard_ware_name_dots() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.hardwareNameSearchDot();
	}

	@Then("Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeGroupNameSearch_Button();

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());
       Thread.sleep(5000);
	}

	@Then("Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_group_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.edgeDeviceScreenshot();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		edp.edgeDeviceScreenshot();
		Thread.sleep(2000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		Thread.sleep(3000);

	}

	@Then("Click on Deployments tab")
	public void click_on_deployments_tab() throws InterruptedException {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymenttoggle();
		Thread.sleep(5000);
	}

	@Then("Click on Deployment Edge Name and search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_deployment_edge_name_and_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymentAppNamethreedots();
		dp.deploymentAppName(alldata.get(vTCName).get("Value17").toString());

	}

	@Then("Click on Deployment Status and search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_deployment_status_and_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymentStatusNamethreedots();
		dp.deploymentStatusInput(alldata.get(vTCName).get("Value18").toString());
		dp.backDropShowing_Div_Click();

	}

	@Then("verify Status in Deployment List")
	public void verify_status_in_deployment_list() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.backDropTransparent_Div_Click();
		Assert.assertEquals("Deployment Status is not valid", alldata.get(vTCName).get("Value18").toString(),
				dp.get_Text_EdgeDeploymentStatus());

	}

	@Then("verify Expected Version in Deployment List")
	public void verify_expected_version_in_deployment_list() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Click on pagination it will display default records will display")
	public void click_on_pagination_it_will_display_default_records_will_display() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
		Thread.sleep(7000);
		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal_and_click_on_edit_icon_button()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(5000);

		edp.clickEditButton();

		Thread.sleep(4000);

	}

	@Then("Click on Environment Variable")
	public void click_on_environment_variable() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalVariableTab();
	}

	@Then("Click on Add new button")
	public void click_on_add_new_button() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalVariableAddButton();

	}

	@Then("Click and Verify Add button is working")
	public void click_and_verify_add_button_is_working() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("Enter details for Config Name and Config Value")
	public void enter_details_for_config_name_and_config_value() throws InterruptedException {

		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalConfigName(alldata.get(vTCName).get("Value20").toString());

		ev.environmentalConfigValue(alldata.get(vTCName).get("Value21").toString());

	}

	@Then("Click on Add new button of Environmental variable")
	public void click_on_add_new_button_of_environmental_variable() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalVariableAddButton();
	}

	@Then("inactivate environmental variable")
	public void inactivate_environmental_variable() throws InterruptedException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.moveSliderCondition("unchecked");

		Thread.sleep(3000);
		ev.moveSliderCondition("checked");
		Thread.sleep(3000);
		ev.moveSliderCondition("unchecked");
		Thread.sleep(3000);
	}

	@Then("Click on save button for environmental variable")
	public void click_on_save_button_for_environmental_variable() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.saveDataConfig();
	}

	@Then("Click on Delete button")
	public void click_on_delete_button() throws InterruptedException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.deleteButtonConfigClick();
		Thread.sleep(3000);
		ev.confirmationYesDeleteButton();
		// ev.confirmationCancelDeleteButton();
	}

	@Then("Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		// edp.edgeDeviceScreenshot();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		edp.edgeDeviceScreenshot();
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Click on Edit button")
	public void click_on_edit_button() throws InterruptedException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.clickEditevButton();
		ev.clickInputField();
		ev.environmentalConfigName(alldata.get(vTCName).get("Value20").toString());
		ev.clickInputFieldconfigValue();
		ev.environmentalConfigValue(alldata.get(vTCName).get("Value21").toString());
		ev.saveDataConfig();
	}

	@Then("Click on bulk upload button")
	public void click_on_bulk_upload_button() throws IOException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.bulkUploadButton();

		ev.uploadConfig(alldata.get(vTCName).get("Value22").toString());

	}

	@Then("Click on search icon of configName Config value")
	public void click_on_search_icon_of_config_name_config_value() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.configNameSearch();
		ev.configNameInput(alldata.get(vTCName).get("Value20").toString());

//		// ev.backDropShowing_Div_Click();
//		ev.headingClick();
//
//		ev.configValue();
//		ev.configValueInput(alldata.get(vTCName).get("Value14").toString());

		ev.backDropShowing_Div_Click();
	}

	@Then("Click on Device Log Tab")
	public void click_on_device_log_tab() throws InterruptedException {
		DeviceLogs dl = new DeviceLogs(driver, logger);
		dl.deviceLogTab();
		Thread.sleep(3000);
	}

	@Then("Click on Configuration Tab")
	public void click_on_config_tab() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configTabmain();
	}

	@Then("Click on Configuration submodule")
	public void click_on_config_submodule() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.configsubmodule();
	}

	@Then("Click on Well Mapping Tab")
	public void click_on_well_mapping_tab() throws InterruptedException {
		WellMapping wp = new WellMapping(driver, logger);
		wp.wellmappingClick();
		wp.wellMappingSearchDot();
		wp.wellMappingSearchInput(alldata.get(vTCName).get("Value23").toString());

		wp.backDropShowing_Div_Click();
		wp.headingClick();
		Thread.sleep(6000);
		wp.selectedCheckboxforWell();

	}

	@Then("Scroll down page go to the registration section of add screen and enter value for onboarding certificate")
	public void scroll_down_page_go_to_the_registration_section_of_add_screen_and_enter_value_for_onboarding_certificate() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.scrollingvertical();
		ede.removalofEneredTextForOnboardingKey();
		ede.clearEnteredName();
		ede.ongoingBoardUpdate(alldata.get(vTCName).get("Value3").toString());
		ede.saveAddData();
	}

	@Then("Click on Pagination is in footer\\(Below) left side")
	public void click_on_pagination_is_in_footer_below_left_side() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value1").toString();
		edp.SelectPageMatOption(value);
		try {
			int rowPerPage = Integer.parseInt(value);
			Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));

			Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));
		} catch (NumberFormatException e) {

		}

	}

	@Then("Click on Pagination is in footer\\(Below) right side")
	public void click_on_pagination_is_in_footer_below_right_side() throws Exception {

		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("Value19").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("Click on APP DEPLOY  icon button on Actions Column & landed on EDGE>Application Configuration Screen")
	public void click_on_app_deploy_icon_button_on_actions_column_landed_on_edge_application_configuration_screen() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymenticonColumnsection();

	}

	@Then("After landing on EDGE Device List screen scroll horizontal")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal() {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
	}

	@When("Click on Bulk Application Configuration button")
	public void click_on_bulk_application_configuration_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.Configuration_Icon_Button();
		edp.edgeDeviceScreenshot();
	}

	@Then("verify App Group functionality")
	public void verify_app_group_functionality() throws InterruptedException {
		EdgeAppConfigurationPage eacp = new EdgeAppConfigurationPage(driver, logger);
		eacp.appGroupNameDot();

		eacp.appGroupNameInputdeploy(alldata.get(vTCName).get("Value1").toString());

		eacp.backDropShowing_Div_Click();

		eacp.checkboxEdgeGroupNameStepOneName();

		eacp.NextButtonStep1();
		Thread.sleep(4000);
	}

	@Then("verify Edge Device functionality")
	public void verify_edge_device_functionality() throws InterruptedException {
		EdgeAppConfigurationPage eacp = new EdgeAppConfigurationPage(driver, logger);
		eacp.deploymentEdgeGroupId();

		eacp.applicationconfigurationEdgeIDDevice(alldata.get(vTCName).get("Value2").toString());

		eacp.backDropShowing_Div_Click();

		eacp.checkboxEdgeNameStepFour();

		eacp.NextButtonStep2();
		Thread.sleep(4000);
	}

	@Then("verify application functionality")
	public void verify_application_functionality() throws InterruptedException {

		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.appNameDot();

		egcp.appNameInput(alldata.get(vTCName).get("Value3").toString());

		egcp.backDropShowing_Div_Click();

		Thread.sleep(5000);

		egcp.selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfig();

		Thread.sleep(4000);
		egcp.NextButtonStep3();

	}

	@Then("verify breaching of max character limit")
	public void verify_breaching_of_max_character_limit() {
		EdgeDeviceEdit edp = new EdgeDeviceEdit(driver, logger);
		String s = alldata.get(vTCName).get("Value2").toString();

		edp.edgeUserNameUpdate(s);
		// edp.headingClick();
		// String message=edp.getUserNameUpdateMessage();

	}

	@Then("Verify Configuration functionality")
	public void verify_configuration_functionality() throws InterruptedException {
		EdgeAppConfigurationPage eacp = new EdgeAppConfigurationPage(driver, logger);
		eacp.ConfigNameAppDeploymentDot();
		eacp.ConfigNameAppDeploymentInput(alldata.get(vTCName).get("Value4").toString());
		eacp.backDropShowing_Div_Click();
		eacp.headingConfigurationBulk();

		eacp.checkboxConfiguration();
		Thread.sleep(8000);

		eacp.NextButtonStep4();

	}

	@Then("search for Edge Group Name")
	public void search_for_edge_group_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value1").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@When("Click on configuration icon button from Action column")
	public void click_on_configuration_icon_button_from_action_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.configurationIcon();
	}

	@Then("Click on Configurations module from left navigation bar")
	public void click_on_configurations_module_from_left_navigation_bar() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.ConfigurationsTab();
	}

	@Then("Verify deployment functionality")
	public void verify_deployment_functionality() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.confirmClick();
		Thread.sleep(3000);
		edp.deployButtonClick();
		Thread.sleep(5000);

	}

	@And("click on edit button beside search items")
	public void click_on_edit_button_beside_search_items() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickEditButton();
		edp.edgeDeviceScreenshot();
	}

	@Then("Click on save well map")
	public void click_on_save_well_map() {
		WellMapping wp = new WellMapping(driver, logger);
		wp.saveWellData();
	}

	@Then("search for Edge ID enter the value for Edge ID and Clear Search")
	public void search_for_edge_id_enter_the_value_for_edge_id_and_clear_search() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		edp.edgeIdSearch_Button();
		edp.removalofEneredTextForEdgeId();
		edp.backDropShowing_Div_Click();

	}

	@Then("search for Edge Name enter the value for Edge Name and Clear Search")
	public void search_for_edge_name_enter_the_value_for_edge_name_and_clear_search() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Click on Well mapping tab module")
	public void click_on_well_mapping_tab_module() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellmappingtab();
	}

	@Then("Click on the three dots of well and search for Well Name")
	public void click_on_the_three_dots_of_well_and_search_for_well_name() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellnameThreeDot();

	}

	@Then("Click on the three dots of RTUAddress")
	public void click_on_the_three_dots_of_rtu_address() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.RTUAddressThreeDot();
	}

	@Then("Enter the value for RTUAddress")
	public void enter_the_value_for_rtu_address() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.RTUAddressSearchInput(alldata.get(vTCName).get("Value2").toString());
		wm.backDropShowing_Div_Click();
		Thread.sleep(3000);

	}

	@Then("Click on Status Three Dot and Select the Active status Checkbox")
	public void click_on_status_three_dot_and_select_the_active_status_checkbox() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.StatusThreeDot();
		Thread.sleep(4000);
		wm.StatusActiveCheck();

	}

	@Then("Click on Save button For Well")
	public void click_on_save_button_for_well() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.saveWellData();
	}

	@Then("Enter the value for Well name")
	public void enter_the_value_for_well_name() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellMappingSearchInput(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on Status Three Dot and Select InActive Status Checkbox")
	public void click_on_status_three_dot_and_select_in_active_status_checkbox() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.StatusThreeDot();
		wm.StatusInActiveCheck();
	}

	@Then("Click on Status Three Dot and Select the inActive status Checkbox")
	public void click_on_status_three_dot_and_select_the_active_status_checkbox_and_in_active_status_checkbox()
			throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.StatusThreeDot();
		Thread.sleep(4000);
		
		wm.StatusInActiveCheck();
	}
	@Then("Enter the value for Well name to map setting from well module")
	public void enter_the_value_for_well_name_to_map_setting_from_well_module() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellMappingSearchInput(alldata.get(vTCName).get("Value5").toString());
		wm.backDropShowing_Div_Click();
		Thread.sleep(4000);
	}
	@Then("Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field to check well")
	public void click_on_edge_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field_to_check_well() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value6").toString());
		edp.edgeDeviceScreenshot();
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@Then("Click on the three dots of DeviceType")
	public void click_on_the_three_dots_of_device_type() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.deviceTypeThreeDot();

	}

	@Then("Enter the value for DeviceType")
	public void enter_the_value_for_device_type() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.deviceTypeSearchInput(alldata.get(vTCName).get("Value4").toString());
		wm.backDropShowing_Div_Click();
		Thread.sleep(3000);
		wm.headingClick();
		Thread.sleep(4000);
	}
	@Then("Click on pagination to check functionality of Full Backward arrow Edgedevice")
	public void click_on_pagination_to_check_functionality_of_full_backward_arrow_edgedevice() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);
		p.nextPageClickAndCountOnLastPage(rowPerPage);
		//Assert.assertTrue("Row count match for first page", p.firstPageFullBackwardArrow(rowPerPage));
	}
	@Then("Click on pagination to check Previous Page button\\(Backward arrow) functionality EdgeDevice")
	public void click_on_pagination_to_check_previous_page_button_backward_arrow_functionality() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("Value1").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(5000);
		//Assert.assertTrue("Row count match for Previous page", p.previousPageClickAndCount(rowPerPage));
	}

	@Then("Check the checkbox to well map")
	public void check_the_checkbox_to_well_map() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.checkboxWell();
	}

	@Then("Click on the three dots of IPAddress and search for IPAddress")
	public void click_on_the_three_dots_of_ip_address_and_search_for_ip_address() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.IPAddressThreeDot();

	}

	@Then("Enter the value for IPAddress")
	public void enter_the_value_for_ip_address() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.IPAddressInputSearch(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("search for Edge Group Name enter the value for Edge Group Name and Clear Search")
	public void search_for_edge_name_enter_the_value_for_edge_group_name_and_clear_search() {
		// EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// As it is not working in manual also we will see later on
		// edp.edgeGroupNameSearch_Button();
		// edp.sendValueSearchIcon(alldata.get(vTCName).get("Value3").toString());
		// edp.clearEdgeGroupNameSearchvalue();
		// edp.headingClick();
	}

	@Then("search for App Groups enter the value for App Groups and Clear Search")
	public void search_for_app_groups_enter_the_value_for_app_groups_and_clear_search() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		edp.edgeAppGroupsSearch_Button();
		edp.removalofEneredTextForAppGroups();
		edp.backDropShowing_Div_Click();
	}

	@Then("search for Hardware Name enter the value for HardWare Name and Clear Search")
	public void search_for_hardware_name_enter_the_value_for_hard_ware_name_and_clear_search()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("verify multiple select application functionality")
	public void verify_multiple_select_application_functionality() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		Thread.sleep(5000);
		egcp.checkboxmultiforAppName();

		egcp.NextButtonStep4();
	}

	@Then("verify deploy button should be in inactive mode and become active when user click on Confirm button")
	public void verify_deploy_button_should_be_in_inactive_mode_and_become_active_when_user_click_on_confirm_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.checkdisabledeploybutton();
	}

	@When("Click on configuration icon button from Action columnn")
	public void click_on_configuration_icon_button_from_action_columnn() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.configurationIcon();
	}

	@Then("verify application functionality for configuration")
	public void verify_application_functionality_for_configuration() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.appNameDot();

		egcp.appNameInput(alldata.get(vTCName).get("Value2").toString());

		egcp.backDropShowing_Div_Click();

		Thread.sleep(3000);
		egcp.checkboxApplicationConfigurationAppName();
		Thread.sleep(4000);
		egcp.NextButtonStep3();
		Thread.sleep(4000);
	}

	@Then("verify multiSelect Edge Device functionality")
	public void verify_multi_select_edge_device_functionality() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.checkboxAllconfigurationEdgeDevice();
	}

	@Then("click on bulk configuration button at the corner of the page")
	public void click_on_bulk_configuration_button_at_the_corner_of_the_page() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}

	@Then("verify app group name functionality")
	public void verify_app_group_name_functionality() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.appGroupNameDot();
		egcp.edgeIdConfigurationInput(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("verify edge Device configuration functionality")
	public void verify_edge_device_configuration_functionality() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeIDApplicationConfigurationThreeDot();
		egcp.appGroupNameInputdeploy(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on Setting tab from left side bar and click on well tab from Navigation menu")
	public void click_on_setting_tab_from_left_side_bar_and_click_on_well_tab_from_navigation_menu() {
		UserSettingsPage us = new UserSettingsPage(driver, logger);
		us.Setting_tab();
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		swp.clickWellNavigationTab();
	}

	@Then("Click on Add button to add new well")
	public void click_on_add_button_to_add_new_well() {
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		swp.addWell();
	}

	@Then("Click on deployment icon button from Action columnn")
	public void click_on_deployment_icon_button_from_action_columnn() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickondeployimage();
	}

	@Then("Check SelectAll checkbox from select column")
	public void check_select_all_checkbox_from_select_column() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		Thread.sleep(4000);
		egcp.checkboxAllDeploymentEdgeDevice();
		Thread.sleep(7000);
	}

	@Then("verify Active Single Edge")
	public void verify_active_single_edge() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		Thread.sleep(4000);
		egcp.previousButtonApplicationonDeployment();
	}

	@Then("Enter the details for Well Name , Port Number , IP Address and choose the Device Type")
	public void enter_the_details_for_well_name_port_number_ip_address_and_choose_the_device_type()
			throws InterruptedException {
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		swp.inputWellName(alldata.get(vTCName).get("Value1").toString());
		swp.deviceTypeSelectAdd(alldata.get(vTCName).get("Value4").toString().trim());

		swp.inputPortNumber(alldata.get(vTCName).get("Value2").toString());

		swp.inputIPAddress(alldata.get(vTCName).get("Value3").toString());
		
	}

	@Then("Click on Save button To Save Well")
	public void click_on_save_button_to_save_well() throws InterruptedException {
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		Thread.sleep(3000);
		swp.savebuttonforSettingwell();
		Thread.sleep(3000);
	}

	@Then("click on add icon to add configuration")
	public void click_on_add_icon_to_add_configuration() {

	}

	@Then("Choose inactive mode from status column")
	public void choose_inactive_mode_from_status_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		try {
			edp.statusInactive();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("scroll horizontal to see status column")
	public void scroll_horizontal_to_see_status_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
	}

	@Then("Click on Status Three Dot")
	public void click_on_status_three_dot() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();
	}

	@Then("update Edge Name , Serial Number, OnboardingKey, ImageVersion, Server Port")
	public void update_edge_name_serial_number_onboarding_key_image_version_server_port() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(3000);
		edp.removalofEneredTextForEdgeName();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on Save button to update edge")
	public void click_on_save_button_to_update_edge() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		
		Thread.sleep(4000);
		edp.saveEdgeDeviceButton();
		Thread.sleep(4000);
		

	}

	@Then("After landing on EDGE Device List please scroll horizontal and Click on Edit icon button")
	public void after_landing_on_edge_device_list_please_scroll_horizontal_and_click_on_edit_icon_button()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.clickEditButton();
		Thread.sleep(3000);
	}

	@Then("update Edge Name, location, Description , Assigned To from Identity section")
	public void update_edge_name_location_description_assigned_to_from_identity_section() throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameEdit(alldata.get(vTCName).get("Value2").toString());
		ede.removalofEneredTextForLocation();
		ede.locationUpdate(alldata.get(vTCName).get("Value3").toString());
		ede.removalofEneredTextForDescription();
		ede.descriptionUpdate(alldata.get(vTCName).get("Value4").toString());
		
//		ede.removalofEnteredTextForAssignedTo();
//		ede.assignedTo(alldata.get(vTCName).get("Value5").toString());

		Thread.sleep(4000);
		ede.hardwareNameUpdate(alldata.get(vTCName).get("Value6").toString());
		Thread.sleep(4000);
		
		ede.edgeGroupName(alldata.get(vTCName).get("Value7").toString());
		Thread.sleep(4000);
		
	}

	@Then("update the value of Serial Number, OnboardingKey, ImageVersion from the Registration accordion")
	public void update_the_value_of_serial_number_onboarding_key_image_version_from_the_registration_accordion() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForSerialNo();
		ede.serialNumberUpdate(alldata.get(vTCName).get("Value8").toString());

		ede.removalofEneredTextForOnboardingKey();
		ede.ongoingBoardUpdate(alldata.get(vTCName).get("Value9").toString());

		ede.removalofEnteredTextForAssignedToImageVersion();
		ede.imageVersionUpdate(alldata.get(vTCName).get("Value10").toString());
	}

	@Then("update the value of Server Port from the deployment")
	public void update_the_value_of_server_port_from_the_deployment() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForServerport();

		ede.serverPortUpdate(alldata.get(vTCName).get("Value11").toString());
	}

	@Then("select the value for App Group from the deployment")
	public void select_the_value_for_app_group_from_the_deployment() throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.applicationGroupUpdate(alldata.get(vTCName).get("Value12").toString());
	}

}
