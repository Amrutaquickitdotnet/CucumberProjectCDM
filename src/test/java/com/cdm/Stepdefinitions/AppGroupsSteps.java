package com.cdm.Stepdefinitions;

import org.junit.Assert;

import com.cdm.pages.AppGroupsPage;
import com.cdm.pages.Menu;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppGroupsSteps extends BaseTest {

	@When("Click on App Groups tab")
	public void click_on_edge_group() {
		Menu edp = new Menu(driver, logger);
		edp.clickAppGroups();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on the three dots of App Group Name")
	public void click_on_the_three_dots_of_app_group_name() {

		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("enter text in the field of App Group Name")
	public void enter_text_in_the_field_of_app_group_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appGroupNameInput(alldata.get(vTCName).get("Value1").toString());
		agp.backDropShowing_Div_Click();
	}

	@When("Click on the three dots of App Group Display Name")
	public void click_on_the_three_dots_of_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("enter text in the field of App Group Display Name")
	public void enter_text_in_the_field_of_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
	
		agp.appGroupDisplayNameInput(alldata.get(vTCName).get("Value2").toString());
		agp.backDropShowing_Div_Click();
	}
	@When("Click on the Add icon at the right side of the page")
	public void click_on_the_add_icon_at_the_right_side_of_the_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.addButtonAppGroup();
	}
	@Then("Under Identity Section enter details for App Group Name and AppGroupDisplayName")
	public void under_identity_section_enter_details_for_app_group_name_and_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		
		agp.appGroupNameEnterData(alldata.get(vTCName).get("Value1").toString());
		agp.appGroupDisplayNameEnterData(alldata.get(vTCName).get("Value2").toString());
	}
	@Then("click on Save button.")
	public void click_on_save_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.saveButton();
	}
	@When("Click on the Status Icon at the right side of the page")
	public void click_on_the_status_icon_at_the_right_side_of_the_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.statusThreeDot();
	}
	@Then("Under Status column select Active checkbox from the List")
	public void under_status_column_select_active_checkbox_from_the_list() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.statusActiveCheckbox();
		agp.tabledata();
		
		
	}
	
	


}
