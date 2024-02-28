package com.cdm.Stepdefinations;

import org.openqa.selenium.JavascriptExecutor;

import com.cdm.pages.HardwareAddPage;
import com.cdm.pages.HardwareEditPage;
import com.cdm.pages.VolumesAddPage;

import io.cucumber.java.en.Then;

public class VolumesSteps extends BaseTest {

	@Then("Click on volumes tab from right panel of the screen")
	public void click_on_volumes_tab_from_right_panel_of_the_screen() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volume_tab();
	}

	@Then("verify add button on volumes list page")
	public void verify_add_button_on_volumes_list_page() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeAddPlusicon();
	}

	@Then("fill all mandatory and optional field for Add volume")
	public void fill_all_mandatory_and_optional_field_for_add_volume() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("Value1").toString());
		vap.volumeRepositoryNameAdd(alldata.get(vTCName).get("Value2").toString());
		vap.volumeRepositoryTypeAdd(alldata.get(vTCName).get("Value3").toString());
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("Value4").toString());
		vap.volumeLicenseTypeAdd(alldata.get(vTCName).get("Value5").toString());
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("Value6").toString());
		vap.volumetagAdd(alldata.get(vTCName).get("Value7").toString());
		vap.volumearchitectureAdd(alldata.get(vTCName).get("Value8").toString());
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("Value9").toString());
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("Value10").toString());

	}

	@Then("click on save button to save volume")
	public void click_on_save_button_to_save_volume() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
		Thread.sleep(5000);
	}

}
