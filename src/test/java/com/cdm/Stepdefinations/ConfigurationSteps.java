package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.ConfigurationsPage;

import io.cucumber.java.en.Then;

public class ConfigurationSteps extends BaseTest {

	@Then("Click on Configurations module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configTabmain();
	}

	@Then("Click on refresh button for configuration")
	public void click_on_refresh_button_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.refreshbutton();
	}

	@Then("Scroll horizontal")
	public void scroll_horizontal() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.scrollingElementRightBar("div.example-container", "900");
	}

	@Then("verify tooltip for the View Response body button")
	public void verify_tooltip_for_the_view_response_body_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of response Body button", "View Response Body",
				cp.get_Text_ToolTipViewResponseBody());
	}

	@Then("Click on current view button for configuration")
	public void click_on_current_view_button_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.currentviewbuttonclick();
	}

	@Then("Click on Config Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_config_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();
		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field")
	public void click_on_time_stamp_three_dot_search_icon_and_enter_the_value_in_datepickercolumn_and_clear_the_field() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.timeStampThreeDot();

		CalenderPage cal = new CalenderPage(driver, logger);
		cp.calenderIcon();
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.applybuttoncalender();

	}

	@Then("Click on LastUpdatedThreeDotSearch icon and enter the value in datepickercolumn")
	public void click_on_last_updated_three_dot_search_icon_and_enter_the_value_in_datepickercolumn() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.timeStampThreeDot();

		CalenderPage cal = new CalenderPage(driver, logger);
		cp.calenderIcon();
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.applybuttoncalender();

	}

	@Then("Click on history view button for configuration")
	public void click_on_history_view_button_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		try {
			cp.historyviewbuttonclick();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("verify tooltip for the refresh button")
	public void verify_tooltip_for_the_refresh_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of refresh button", "Refresh", cp.get_Text_ToolTipRefreshConfig());
	}

	@Then("Click on EDGE Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeNameThreeDotConfig();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForEdgeName(alldata.get(vTCName).get("Value1").toString());

	}

	@Then("Click on App Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_app_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.appNameConfigThreeDot();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForAppName(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on Config Name invalid search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_config_name_invalid_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("Value4").toString());
	}

	@Then("Click on Response Name valid search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_response_name_invalid_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("Value5").toString());
	}

	@Then("Enter valid inputs into search text field and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeNameThreeDotConfig();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForEdgeName(alldata.get(vTCName).get("Value1").toString());
		cp.removalofEnteredTextForEdgeName();
	}

	@Then("Enter valid inputs into search text field of app name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_app_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.appNameConfigThreeDot();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForAppName(alldata.get(vTCName).get("Value2").toString());
		cp.removalofEnteredTextForAppName();
	}

	@Then("Enter valid inputs into search text field of config name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_config_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("Value3").toString());
		cp.removalofEnteredTextForConfigName();
	}

	@Then("Click on History View Button")
	public void click_on_history_view_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.currentviewbuttonclick();
		Thread.sleep(4000);

	}

	@Then("Click on view response body icon from Action Column")
	public void click_on_view_response_body_icon_from_action_column() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.scrollingElementRightBar("div.example-container", "900");
		cp.viewResponseBodyIcon();
	}

	@Then("Scroll horizontal and Click on download button from Action column")
	public void click_on_download_button_from_action_column() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);

		cp.scrollingElementRightBar("div.example-container", "900");
		Thread.sleep(4000);
		cp.downloadAction();
	}

	@Then("Enter valid inputs into search text field of response status name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_response_status_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.responseStatusThreeDot();
		Thread.sleep(3000);
		cp.sendValueSearchinputBoxForResponseStatus(alldata.get(vTCName).get("Value4").toString());
		cp.removalofEnteredTextForResponseStatus();
	}

}
