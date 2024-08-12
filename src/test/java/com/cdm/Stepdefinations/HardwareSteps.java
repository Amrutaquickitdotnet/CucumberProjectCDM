package com.cdm.Stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.cdm.pages.HardwareAddPage;
import com.cdm.pages.HardwareEditPage;
import com.cdm.pages.HardwarePage;

import io.cucumber.java.en.Then;

public class HardwareSteps extends BaseTest {

	@Then("Click on Hardware tab from right panel of the screen")
	public void click_on_hardware_tab_from_right_panel_of_the_screen() throws InterruptedException {

		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardware_tab();
		Thread.sleep(4000);

	}

	@Then("Click on Refresh button")
	public void click_on_refresh_button() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.refreshlist();
		Thread.sleep(4000);
	}

	@Then("verify add button on hardware list page")
	public void verify_add_button_on_hardware_list_page() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareAddPlusicon();
		Thread.sleep(4000);
	}

	@Then("verify page with resize option the hardware page")
	public void verify_page_with_resize_option_the_hardware_page() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.setZoomLevel(800, 600);
		Thread.sleep(4000);
	}

	@Then("fill all mandatory and optional field for Add hardware")
	public void fill_all_mandatory_and_optional_field_for_add_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareName(alldata.get(vTCName).get("HardwareNameAdd").toString());
		hap.hardwareDisplayName(alldata.get(vTCName).get("HardwareDisplayNameAdd").toString());
		hap.hardwareDescription(alldata.get(vTCName).get("DescriptionAdd").toString());
		hap.hardwareModel(alldata.get(vTCName).get("ModelAdd").toString());
		hap.hardwareOS(alldata.get(vTCName).get("OSAdd").toString());
		hap.hardwareMake(alldata.get(vTCName).get("MakeAdd").toString());
		hap.hardwareProcessor(alldata.get(vTCName).get("ProcessorAdd").toString());
		Thread.sleep(4000);
	}

	@Then("click on save button to save hardware")
	public void click_on_save_button_to_save_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareSavebutton();
		Thread.sleep(4000);
	}

	@Then("click on add button icon")
	public void click_on_add_button_icon() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.hardwareAddPlusicon();
		Thread.sleep(4000);
	}

	@Then("search for hardware name")
	public void search_for_hardware_name() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwarethreedot();
		hap.hardwareNameSearch(alldata.get(vTCName).get("HardwareNameSearch").toString());
		hap.backDropShowing_Div_Click();
		Thread.sleep(4000);

	}

	@Then("scroll right to the page to see action column")
	public void scroll_right_to_the_page_to_see_action_column() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Thread.sleep(2000);
		hap.scrollingElementRightBar("div.example-container", "900");
		Thread.sleep(4000);

	}

	@Then("click on edit icon from actions column to Edit hardware")
	public void click_on_edit_icon_from_actions_column_to_edit_hardware() throws InterruptedException {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		hep.hardwareEditButton();
		Thread.sleep(4000);
		hep.removalofEnteredTextForhardwareNameEdit();
		hep.hardwareNameEdit(alldata.get(vTCName).get("HardWareNameEdit").toString());

		hep.removalofEnteredTextForhardwareDisplayNameEdit();
		hep.hardwareDisplayNameEdit(alldata.get(vTCName).get("HardwareDisplayNameEdit").toString());

		hep.removalofEnteredTextForhardwareDescriptionEdit();
		hep.hardwareDescriptionEdit(alldata.get(vTCName).get("DescriptionEdit").toString());

		hep.removalofEnteredTextForhardwareModelEdit();
		hep.hardwareModelEdit(alldata.get(vTCName).get("ModelEdit").toString());

		hep.removalofEnteredTextForhardwareOSEdit();
		hep.hardwareOSEdit(alldata.get(vTCName).get("OSEdit").toString());

		hep.removalofEnteredTextForhardwareMakeEdit();
		hep.hardwareMakeEdit(alldata.get(vTCName).get("MakeEdit").toString());

		hep.removalofEnteredTextForhardwareProcessorEdit();
		hep.hardwareProcessorEdit(alldata.get(vTCName).get("ProcessorEdit").toString());
		Thread.sleep(4000);
	}

	@Then("search for all fields for hardware")
	public void serach_for_all_fields_for_hardware() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.hardwarethreedot();
		hp.hardwareName(alldata.get(vTCName).get("HardwareNameSearch").toString());
		hp.backDropShowing_Div_Click();
		hp.hardware_tab();

//		hp.hardwareDisplayNamethreedot();
//		hp.hardwareDisplayName(alldata.get(vTCName).get("Value2").toString());
//		hp.backDropShowing_Div_Click();

		hp.hardwareMakethreedot();
		hp.hardwareMake(alldata.get(vTCName).get("MakeSearch").toString());
		hp.backDropShowing_Div_Click();
		hp.hardware_tab();
		hp.scrollingElementRightBar("div.example-container", "900");

		Thread.sleep(4000);

		hp.hardwareModelthreedot();
		hp.hardwareModel(alldata.get(vTCName).get("ModelSearch").toString());
		hp.backDropShowing_Div_Click();
		hp.hardware_tab();

		hp.hardwareProcessorthreedot();
		hp.hardwareProcessor(alldata.get(vTCName).get("ProcessorSearch").toString());
		hp.backDropShowing_Div_Click();
		hp.hardware_tab();

		hp.hardwareosthreedot();
		hp.hardwareOS(alldata.get(vTCName).get("OSSearch").toString());
		hp.backDropShowing_Div_Click();
		hp.hardware_tab();
		Thread.sleep(4000);
	}

	@Then("click on save button to save update the changes")
	public void click_on_save_button_to_save_update_the_changes() throws InterruptedException {
		HardwareEditPage hap = new HardwareEditPage(driver, logger);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();",saveAddDataBtn);
		js.executeScript("document.querySelector(\".addButton\").click()");
	}

	@Then("click on Delete icon from actions column to delete hardware")
	public void click_on_delete_icon_from_actions_column_to_delete_hardware() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.hardwareDelete();
		Thread.sleep(5000);
		// hp.confirmationYesButton();
		hp.confirmationNoButton();
		Thread.sleep(5000);
	}

	@Then("verify tooltip for hardware Displayname")
	public void verify_tooltip_for_hardware_displayname() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardwareDisplayName", "Display Name assigned for the Hardware",
				hap.get_Text_ToolTipHardwareDisplayName());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardwareName")
	public void verify_tooltip_for_hardware_name() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardwareName", "Unique Name assigned for the Hardware",
				hap.get_Text_ToolTipHardwareName());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Description")
	public void verify_tooltip_for_hardware_description() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardwareDescription", "Short specific information about the Hardware",
				hap.get_Text_ToolTipHardwareDescription());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Model")
	public void verify_tooltip_for_hardware_model() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware model", "Manufacturer of the EDGE Device",
				hap.get_Text_ToolTipHardwareModel());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware OS")
	public void verify_tooltip_for_hardware_os() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware OS", "Operating system running on the EDGE Device",
				hap.get_Text_ToolTipHardwareOS());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Make")
	public void verify_tooltip_for_hardware_make() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Make", "Model name or version of the EDGE Device",
				hap.get_Text_ToolTipHardwareMake());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Processor")
	public void verify_tooltip_for_hardware_processor() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Processor", "Processor associated with the EDGE Device",
				hap.get_Text_ToolTipHardwareProcessor());
		Thread.sleep(4000);
	}

	@Then("click on bell icon for alerts")
	public void click_on_bell_icon_for_alerts() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
//		hap.belliconClick();
//		Thread.sleep(4000);
	}

	@Then("verify dropdown functionality for Profile icon in Hardware")
	public void verify_dropdown_functionality_for_profile_icon_in_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.profileIconClick();
		Thread.sleep(4000);

	}

	@Then("click on expand button from navigation menu")
	public void click_on_expand_button_from_navigation_menu() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.expandtoggle();
		Thread.sleep(4000);
	}

	@Then("click on collapse button from navigation menu")
	public void click_on_collapse_button_from_navigation_menu() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.collapseToggle();
		Thread.sleep(4000);
	}

}
