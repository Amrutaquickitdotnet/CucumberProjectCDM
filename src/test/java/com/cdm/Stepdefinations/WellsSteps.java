package com.cdm.Stepdefinations;

import com.cdm.pages.WellNameAddPage;
import com.cdm.pages.WellNameEditPage;
import com.cdm.pages.WellsPage;

import io.cucumber.java.en.Then;

public class WellsSteps extends BaseTest {

	@Then("verify page with resize option for Well  page")
	public void verify_page_with_resize_option_for_well_page() {
		WellsPage wells = new WellsPage(driver, logger);
		wells.setZoomLevel(800, 600);
	}

	@Then("Click on Wells tab from right panel of the screen")
	public void click_on_wells_tab_from_right_panel_of_the_screen() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		Thread.sleep(4000);
		wells.wellTab();
		Thread.sleep(4000);
	}

	@Then("apply filter on well name")
	public void apply_filter_on_well_name() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.wellNameThreeDot();
		Thread.sleep(4000);
		wells.serachWellName(alldata.get(vTCName).get("Value1").toString());
		wells.backDropShowing_Div_Click();
		Thread.sleep(4000);

	}

	@Then("apply filter on IP Address")
	public void apply_filter_on_ip_address() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.ipAddressThreeDot();
		Thread.sleep(4000);
		wells.serachipAddress(alldata.get(vTCName).get("Value2").toString());
		wells.backDropShowing_Div_Click();

	}

	@Then("click on refresh button")
	public void click_on_refresh_button() {
		WellsPage wells = new WellsPage(driver, logger);
		wells.clickrefreshbutton();
	}

	@Then("Click on Three Dots for Device Type")
	public void click_on_three_dots_for_device_type() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.deviceTypeThreeDot();
		Thread.sleep(4000);

	}

	@Then("apply filter on Device Type")
	public void apply_filter_on_device_type() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		Thread.sleep(4000);
		wells.serachDeviceType(alldata.get(vTCName).get("Value3").toString());
		wells.backDropShowing_Div_Click();
	}

	@Then("Click on Three Dots for RTU Address")
	public void click_on_three_dots_for_rtu_address() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.RTUAddressThreeDot();
		Thread.sleep(4000);
	}

	@Then("apply filter on RTU Address")
	public void apply_filter_on_rtu_address() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		Thread.sleep(4000);
		wells.searchRTUAddress(alldata.get(vTCName).get("Value4").toString());
		wells.backDropShowing_Div_Click();
		Thread.sleep(4000);
	}

	@Then("Click on Three Dots for Status")
	public void click_on_three_dots_for_status() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		Thread.sleep(4000);
		wells.statusThreeDot();
		Thread.sleep(4000);
	}

	@Then("select Status inActive")
	public void select_status_in_active() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.inputStatusInActive();
		Thread.sleep(4000);
	}

	@Then("Click on Add new icon")
	public void click_on_add_new_icon() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.addbutton();
	}

	@Then("Click on cancel button from add page")
	public void click_on_cancel_button_from_add_page() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		Thread.sleep(5000);
		wells.cancelButtonwell();
	}

	@Then("verify validation message if well name is not being entered")
	public void verify_validation_message_if_well_name_is_not_being_entered() throws InterruptedException {

		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessageWellName();
	}

	@Then("verify validation message if {string} is not entered while creating a new well")
	public void verify_validation_message_if_is_not_entered_while_creating_a_new_well(String string)
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessagePassword();
	}

	@Then("verify validation message if IP Address is not entered while creating a new well")
	public void verify_validation_message_if_ip_address_is_not_entered_while_creating_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessageIPAddress();
	}

	@Then("verify validation message if Port Number is not entered while creating a new well")
	public void verify_validation_message_if_port_number_is_not_entered_while_creating_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessagePort();
	}

	@Then("verify validation message if Device Type is left blank while adding a new Well")
	public void verify_validation_message_if_device_type_is_left_blank_while_adding_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessagedeviceType();
	}

	@Then("verify validation message if the non-mandatory field RTU Address is left blank while adding a new Well")
	public void verify_validation_message_if_the_non_mandatory_field_rtu_address_is_left_blank_while_adding_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessageRTUAddress();
	}

	@Then("enter the data for well")
	public void enter_the_data_for_well() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("Value1").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("Value2").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("Value3").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("Value4").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("Value5").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("Value6").toString());
		

	}
	@Then("enter the data for well and choose slider in inactive mode")
	public void enter_the_data_for_well_and_choose_slider_in_inactive_mode() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("Value1").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("Value2").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("Value3").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("Value4").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("Value5").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("Value6").toString());
		wellnameadd.moveSliderCondition("unchecked");
	}
	@Then("click on save button to save well")
	public void click_on_save_button_to_save_well() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		Thread.sleep(5000);
		wellnameadd.saveButton();
	}
	@Then("Click on download icon")
	public void click_on_download_icon() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		Thread.sleep(5000);
		wp.downloadButtonWell();
	}
	
	@Then("deselect Active status")
	public void deselect_active_status() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		Thread.sleep(5000);
		wp.activeStatusCheck();
	}
	
	@Then("Click on edit button for well given in the action column")
	public void click_on_edit_button_for_well_given_in_the_action_column() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		Thread.sleep(5000);
		wp.wellEditButton();
	}
	
	@Then("modify Well Name")
	public void modify_well_name() throws InterruptedException {
	WellNameEditPage we = new WellNameEditPage(driver, logger);
	we.setEditClearField();
	we.wellnameinputEdit(alldata.get(vTCName).get("Value2").toString());
	Thread.sleep(5000);
	we.saveButton();
	}
	@Then("modify Well Device Type")
	public void modify_well_device_type() throws InterruptedException {
		WellNameEditPage we = new WellNameEditPage(driver, logger);
		we.deviceTypeDropdownEdit(alldata.get(vTCName).get("Value2").toString());
		Thread.sleep(5000);
		we.saveButton();
	}
	

@Then("modify RTU Address")
public void modify_rtu_address() throws InterruptedException {
	WellNameEditPage we = new WellNameEditPage(driver, logger);
	we.setEditClearFieldforRTU();
	we.RTUAddressinputEdit(alldata.get(vTCName).get("Value3").toString());
	Thread.sleep(5000);
	we.saveButton();
}


@Then("modify password")
public void modify_password() {
	WellNameEditPage we = new WellNameEditPage(driver, logger);
	we.setEditClearFieldforPassword();
	we.passwordinputEdit(alldata.get(vTCName).get("Value2").toString());
}


@Then("modify port number")
public void modify_port_number() {
	WellNameEditPage we = new WellNameEditPage(driver, logger);
	we.setEditClearFieldforPortNumber();
}
@Then("verify validation message for password")
public void verify_validation_message_for_password() {
	WellNameEditPage we = new WellNameEditPage(driver, logger);
}
@Then("Click Delete button to delete well")
public void click_delete_button_to_delete_well() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("verify  well that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the Wells list")
public void verify_well_that_is_chosen_for_deleting_and_when_cancelled_to_do_so_it_does_not_get_deleted_and_exists_in_the_wells_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click on upload icon")
public void click_on_upload_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}

	




