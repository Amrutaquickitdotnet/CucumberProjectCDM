package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.VolumesAddPage;
import com.cdm.pages.VolumesEditPage;
import com.cdm.pages.VolumesListPage;

import io.cucumber.java.en.Then;

public class VolumesSteps extends BaseTest {

	@Then("Click on volumes tab from right panel of the screen")
	public void click_on_volumes_tab_from_right_panel_of_the_screen() throws InterruptedException {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.volume_tab();
	}

	@Then("verify add button on volumes list page")
	public void verify_add_button_on_volumes_list_page() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeAddPlusicon();
	}

	@Then("verify toggle button for status")
	public void verify_toggle_button_for_status() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.moveSliderCondition("unchecked");

		Thread.sleep(3000);
		vap.moveSliderCondition("checked");
		Thread.sleep(3000);
		vap.moveSliderCondition("unchecked");
		Thread.sleep(3000);
	}

	@Then("click on profile icons from the top of the module")
	public void click_on_profile_icons_from_the_top_of_the_module() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.profileicon();

	}

	@Then("verify the toggle color should change to green")
	public void verify_the_toggle_color_should_change_to_green() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);

		vap.verifyToggleColor(alldata.get(vTCName).get("colourcode").toString());

	}

	@Then("Verification of breaching the Max word limit in Volume name Text field")
	public void verification_of_breaching_the_max_word_limit_in_volume_name_text_field() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphabets of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}

	@Then("Verification of breaching the Max word limit in repository link name Text field")
	public void verification_of_breaching_the_max_word_limit_in_repository_link_name_text_field()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("RepositoryLinkAdd").toString());

	}

	@Then("Verification of breaching the Max word limit in License Type")
	public void verification_of_breaching_the_max_word_limit_in_license_type() throws InterruptedException {
		{
			VolumesAddPage vap = new VolumesAddPage(driver, logger);
			vap.licensetypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
			vap.headingTitleAdd();
			Thread.sleep(4000);
			String str = "Alphabets of length Min = 1, Max = 32 are allowed !";
			String message = vap.verifyValidationMessageLicenseType();
			Assert.assertEquals(str, message);

		}
	}

	@Then("Verification of breaching the Max word limit in mount directory name text field")
	public void verification_of_breaching_the_max_word_limit_in_mount_directory_name_text_field()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());

	}

	@Then("Verification of breaching the Min word limit in SHA Key Text field in Volume> Add screen by Super Admin")
	public void verification_of_breaching_the_min_word_limit_in_sha_key_text_field_in_volume_add_screen_by_super_admin()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2 is allowed !";
		String message = vap.verifyValidationMessageSHAkey();
		Assert.assertEquals(str, message);
	}

	@Then("Verification of breaching the Max word limit in architecture name Text field")
	public void verification_of_breaching_the_max_word_limit_in_architecture_name_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
	}

	@Then("Verification of breaching the Min word limit in Architecture Text field in Volume")
	public void verification_of_breaching_the_min_word_limit_in_architecture_text_field_in_volume()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !";
		String message = vap.verifyValidationMessagearchitecture();
		Assert.assertEquals(str, message);
	}

	@Then("Verification of breaching the min word in Mount Directory Text field")
	public void verification_of_breaching_the_min_word_in_mount_directory_text_field() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());

		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !";
		String message = vap.verifyValidationMessagearchitecture();
		Assert.assertEquals(str, message);
	}

	@Then("Verify if user fill the invalid details and click on save button")
	public void verify_if_user_fill_the_invalid_details_and_click_on_save_button() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());

		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = " Alphanumerics & Special characters of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}

	@Then("fill all the mandatory valid details and click on save button")
	public void fill_all_the_mandatory_valid_details_and_click_on_save_button() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.volumeRepositoryNameAdd(alldata.get(vTCName).get("TypeAdd").toString());
		vap.volumeRepositoryTypeAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		vap.volumeSavebutton();
	}

	@Then("user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volume")
	public void user_fill_the_invalid_details_i_e_more_than_max_characters_with_invalid_inputs_and_click_on_save_button_in_volume()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());

		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = " Alphanumerics & Special characters of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}

	@Then("without entered any values in all the text fields and click on save button")
	public void without_entered_any_values_in_all_the_text_fields_and_click_on_save_button()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
	}

	@Then("Verification of breaching the Min word limit in Version\\/Tag Text field")
	public void verification_of_breaching_the_min_word_limit_in_version_tag_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("Verification of breaching the Max word limit in Version\\/Tag Text field text field")
	public void verification_of_breaching_the_max_word_limit_in_version_tag_text_field_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("Verification of breaching the Max word limit in MAX size name text field")
	public void verification_of_breaching_the_max_word_limit_in_max_size_name_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("MaxSizeAdd").toString());
	}

	@Then("Verification of breaching the Min word limit in License Type Text")
	public void verification_of_breaching_the_min_word_limit_in_license_type_text() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.licensetypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in Mount Directory Text field")
	public void enter_the_alphanumeric_and_special_character_value_in_mount_directory_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());
	}

	@Then("enter acceptance of Numbers in Max Size Text field in the Volume")
	public void enter_acceptance_of_numbers_in_max_size_text_field_in_the_volume() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("MaxSizeAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in SHA KeyText field")
	public void enter_the_alphanumeric_and_special_character_value_in_sha_key_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("SHAKeyAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in Volume Name Text")
	public void enter_the_alphanumeric_and_special_character_value_in_volume_name_text() {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);

		vep.removalofEnteredTextForVolumeName();

		vep.volumenameEdit(alldata.get(vTCName).get("VolumeNameEdit").toString());
	}

	@Then("enter the alphanumeric and special character value in Architecture Text field in the Volume")
	public void enter_the_alphanumeric_and_special_character_value_in_architecture_text_field_in_the_volume() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in Version\\/Tag Text field")
	public void enter_the_alphanumeric_and_special_character_value_in_version_tag_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("click on three dots of volume name and click on Edit button")
	public void click_on_three_dots_of_volume_name_and_click_on_edit_button() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);

		vap.volumeNameThreeDot();

		vap.volumesearch(alldata.get(vTCName).get("VolumeNameSearch").toString());

		vap.backDropShowing_Div_Click();

		vap.editbutton();
		Thread.sleep(4000);

	}

	@Then("choose type using dropdown")
	public void choose_type_using_dropdown() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.typeEdit(alldata.get(vTCName).get("TypeEdit").toString());
	}

	@Then("choose repository name using dropdown")
	public void choose_repository_name_using_dropdown() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.repositoryNameEdit(alldata.get(vTCName).get("RepositoryNameEdit").toString());
	}

	@Then("enter the alphanumeric and special character value in repository Name field")
	public void enter_the_alphanumeric_and_special_character_value_in_repository_name_field() {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.removalofEnteredTextForRepositoryLink();
		vep.repositorylinkEdit(alldata.get(vTCName).get("RepositoryLinkEdit").toString());
	}

	@Then("update the value for volume page")
	public void update_the_value_for_volume_page() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.removalofEnteredTextForVolumeName();
		vep.volumenameEdit(alldata.get(vTCName).get("VolumeNameEdit"));

		vep.repositoryNameEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

		vep.typeEdit(alldata.get(vTCName).get("TypeEdit"));

		vep.removalofEnteredTextForRepositoryLink();
		vep.repositorylinkEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

		vep.removalofEnteredTextForlicensetypeEdit();
		vep.licensetypeEdit(alldata.get(vTCName).get("LicenseTypeEdit"));

		vep.removalofEnteredTextForMountDirectory();
		vep.mountdirectoryEdit(alldata.get(vTCName).get("MountDirectoryEdit"));

		vep.removalofEnteredTextFortagEdit();
		vep.tagEdit(alldata.get(vTCName).get("VersionTagEdit"));

		vep.removalofEnteredTextForarchitectureEdit();
		vep.architectureEdit(alldata.get(vTCName).get("ArchitectureEdit"));

		vep.removalofEnteredTextFormaxsizeEdit();
		vep.maxsizeEdit(alldata.get(vTCName).get("MaxSizeEdit"));

		vep.removalofEnteredTextForShaKey();
		vep.shakeyEdit(alldata.get(vTCName).get("SHAKeyEdit"));

		vep.saveEditVolume();

	}

	@Then("fill all mandatory and optional field for Add volume")
	public void fill_all_mandatory_and_optional_field_for_add_volume() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.volumeRepositoryNameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		vap.volumeRepositoryTypeAdd(alldata.get(vTCName).get("TypeAdd").toString());
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("RepositoryLinkAdd").toString());
		vap.volumeLicenseTypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("MaxSizeAdd").toString());
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("SHAKeyAdd").toString());

	}

	@Then("verify tooltip for License Type text field")
	public void verify_tooltip_for_license_type_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipType();
	}

	@Then("verify tooltip for type dropdown")
	public void verify_tooltip_for_type_dropdown() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipType();
		Thread.sleep(2000);
	}

	@Then("verify tooltip for mount directory")
	public void verify_tooltip_for_mount_directory() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipmountDirectory();
	}

	@Then("verify tooltip for architecture text field")
	public void verify_tooltip_for_architecture_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTiparchitecture();

	}

	@Then("verify tooltip for version")
	public void verify_tooltip_for_version() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipversion();
	}

	@Then("verify tooltip for max size")
	public void verify_tooltip_for_max_size() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipmaxSize();
	}

	@Then("verify tooltip for Repository Link text field")
	public void verify_tooltip_for_repository_link_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTiprepositoryLink();
	}

	@Then("verify tooltip for English\\(US)")
	public void verify_tooltip_for_english_us() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipEnglishLogo();
	}

	@Then("verify tooltip for Repository Name for repository")
	public void verify_tooltip_for_repository_name_for_repository() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipRepositoryName();
	}

	@Then("click on the refresh button at the top right corner of the page")
	public void clik_on_the_refresh_button_at_the_top_right_corner_of_the_page() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.refreshbutton();
	}

	@Then("click on bell icons from the top of the module")
	public void click_on_bell_icons_from_the_top_of_the_module() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
//		vap.belliconclick();
	}

	@Then("verify tooltip for profile icon")
	public void verify_tooltip_for_profile_icon() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipprofile();
	}

	@Then("verify tooltip for Bell icon")
	public void verify_tooltip_for_bell_icon() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
//		vap.get_Text_ToolTipbellicon();
	}

	@Then("verify tooltip for volume name for repository")
	public void verify_tooltip_for_volumn_name_for_repository() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipVolumeName();
	}

	@Then("click on save button to save volume")
	public void click_on_save_button_to_save_volume() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
		Thread.sleep(5000);
	}

	@Then("click on three dots of volume name and enter the value for volume name search")
	public void click_on_three_dots_of_volume_name_and_enter_the_value_for_volume_name_search() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.VolumeNameThreeDot();
		vlp.inputvolumename(alldata.get(vTCName).get("VolumeNameSearch").toString());
		vlp.backDropShowing_Div_Click();
	}

	@Then("Click on button convert volume to application")
	public void click_on_button_convert_volume_to_application() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.convertToApplication();

		Assert.assertEquals("Verify toast message", "Volume converted to app successfully ",
				vlp.toastcontainermessage());

	}


	@Then("without entering any details in any fields in the Volume click on save button")
	public void without_entering_any_details_in_any_fields_in_the_volume_click_on_save_button()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
		Thread.sleep(5000);
	}

	@Then("enter the alphanumeric and special character value in repository link Text field")
	public void enter_the_alphanumeric_and_special_character_value_in_repository_link_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("RepositoryLinkAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in License Type text field")
	public void enter_the_alphanumeric_and_special_character_value_in_license_type_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.licensetypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
	}

	@Then("click on cancel button on volumeAdd page")
	public void click_on_cancel_button_on_volume_add_page() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.cancelButton();
	}

	@Then("update the value for volume Name")
	public void update_the_value_for_volume_name() {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.removalofEnteredTextForVolumeName();

		vep.volumenameEdit(alldata.get(vTCName).get("").toString());
	}

	@Then("apply filter on volume name and click on edit button")
	public void apply_filter_on_volume_name_and_click_on_edit_button() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.VolumeNameThreeDot();
		vlp.inputvolumename(alldata.get(vTCName).get("VolumeNameSearch").toString());
		vlp.editbutton();
	}

	@Then("if user modify data and click on save button in Volume")
	public void if_user_modify_data_and_click_on_save_button_in_volume() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.removalofEnteredTextForVolumeName();
		vep.volumenameEdit(alldata.get(vTCName).get("VolumeNameEdit"));

		vep.repositoryNameEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

		vep.typeEdit(alldata.get(vTCName).get("TypeEdit"));

		vep.removalofEnteredTextForRepositoryLink();
		vep.repositorylinkEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

		vep.removalofEnteredTextForlicensetypeEdit();
		vep.licensetypeEdit(alldata.get(vTCName).get("LicenseTypeEdit"));

		vep.removalofEnteredTextForMountDirectory();
		vep.mountdirectoryEdit(alldata.get(vTCName).get("MountDirectoryEdit"));

		vep.removalofEnteredTextFortagEdit();
		vep.tagEdit(alldata.get(vTCName).get("VersionTagEdit"));

		vep.removalofEnteredTextForarchitectureEdit();
		vep.architectureEdit(alldata.get(vTCName).get("ArchitectureEdit"));

		vep.removalofEnteredTextFormaxsizeEdit();
		vep.maxsizeEdit(alldata.get(vTCName).get("MaxSizeEdit"));

		vep.removalofEnteredTextForShaKey();
		vep.shakeyEdit(alldata.get(vTCName).get("SHAKeyEdit"));

		vep.saveEditVolume();

	}

}
