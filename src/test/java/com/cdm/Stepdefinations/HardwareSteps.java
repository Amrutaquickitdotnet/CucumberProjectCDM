package com.cdm.Stepdefinations;

import org.openqa.selenium.JavascriptExecutor;

import com.cdm.pages.HardwareAddPage;
import com.cdm.pages.HardwareEditPage;

import io.cucumber.java.en.Then;

public class HardwareSteps extends BaseTest {

	@Then("Click on Hardware tab from right panel of the screen")
	public void click_on_hardware_tab_from_right_panel_of_the_screen() throws InterruptedException {
		
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardware_tab();

	}

	@Then("verify add button on hardware list page")
	public void verify_add_button_on_hardware_list_page() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareAddPlusicon();
	}

	@Then("fill all mandatory and optional field for Add hardware")
	public void fill_all_mandatory_and_optional_field_for_add_hardware() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareName(alldata.get(vTCName).get("Value1").toString());
		hap.hardwareDisplayName(alldata.get(vTCName).get("Value2").toString());
		hap.hardwareDescription(alldata.get(vTCName).get("Value3").toString());
		hap.hardwareModel(alldata.get(vTCName).get("Value4").toString());
		hap.hardwareOS(alldata.get(vTCName).get("Value5").toString());
		hap.hardwareMake(alldata.get(vTCName).get("Value6").toString());
		hap.hardwareProcessor(alldata.get(vTCName).get("Value7").toString());
	}

	@Then("click on save button to save hardware")
	public void click_on_save_button_to_save_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareSavebutton();
	}

	@Then("search for hardware name")
	public void search_for_hardware_name() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwarethreedot();
		hap.hardwareNameSearch(alldata.get(vTCName).get("Value1").toString());
		hap.backDropShowing_Div_Click();

	}

	@Then("scroll right to the page to see action column")
	public void scroll_right_to_the_page_to_see_action_column() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Thread.sleep(2000);
		hap.scrollingElementRightBar("div.example-container", "900");

	}

@Then("click on edit icon from actions column to Edit hardware")
public void click_on_edit_icon_from_actions_column_to_edit_hardware() throws InterruptedException {
    HardwareEditPage hep = new HardwareEditPage(driver, logger);
    hep.hardwareEditButton();
    Thread.sleep(4000);
    hep.removalofEnteredTextForhardwareNameEdit();
    hep.hardwareNameEdit(alldata.get(vTCName).get("Value2").toString());
    
    hep.removalofEnteredTextForhardwareDisplayNameEdit();
    hep.hardwareDisplayNameEdit(alldata.get(vTCName).get("Value3").toString());
    
    hep.removalofEnteredTextForhardwareDescriptionEdit();
    hep.hardwareDescriptionEdit(alldata.get(vTCName).get("Value4").toString());
    
    hep.removalofEnteredTextForhardwareModelEdit();
    hep.hardwareModelEdit(alldata.get(vTCName).get("Value5").toString());
    
    hep.removalofEnteredTextForhardwareOSEdit();
    hep.hardwareOSEdit(alldata.get(vTCName).get("Value6").toString());
    
    hep.removalofEnteredTextForhardwareMakeEdit();
    hep.hardwareMakeEdit(alldata.get(vTCName).get("Value7").toString());
    
    hep.removalofEnteredTextForhardwareProcessorEdit();
    hep.hardwareProcessorEdit(alldata.get(vTCName).get("Value8").toString());
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
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareDelete();
		Thread.sleep(5000);
		hap.confirmationYesButton();
		Thread.sleep(5000);
	}

}
