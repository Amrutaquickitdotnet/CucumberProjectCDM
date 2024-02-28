package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.LicensesPage;

import io.cucumber.java.en.Then;

public class LicensesSteps extends BaseTest {

	@Then("Click on Licenses module from side menu bar")
	public void click_on_licenses_module_from_side_menu_bar() throws InterruptedException {

		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		lp.licensetabmodule();

	}

	@Then("verify tooltip for the License Tracker")
	public void verify_tooltip_for_the_license_tracker() {

	}

	@Then("Click on three dots of version filter")
	public void click_on_three_dots_of_version_filter() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		lp.versionInput(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on Three dots on Issue Date Filter")
	public void click_on_three_dots_on_issue_date_filter() throws InterruptedException {

		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issueDateThreeDot();
		Thread.sleep(2000);
	}

	@Then("enter the value for datepicker field")
	public void enter_the_value_for_datepicker_field() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		CalenderPage cal = new CalenderPage(driver, logger);
		lp.calenderIcon();

		Thread.sleep(5000);
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();

		cal.SelectDDDashMMDashYYYDay(year, month, day);

		Thread.sleep(2000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);
		Thread.sleep(2000);
		lp.applyButtoncalender();
		Thread.sleep(5000);
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.headingTitle();
	}

	@Then("Verification of  the refresh icon when Issued Date filter iss applied")

	public void verification_of_the_refresh_icon_when_issued_date_filter_iss_applied() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.refreshButton();
	}

	@Then("verify sorting alphabetically in ascending as well as descending order and then refresh the License Tracker")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_and_then_refresh_the_license_tracker()
			throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);

		lp.sorting();
	}

	@Then("Verification of  the refresh icon when Host Id filter is applied")
	public void verification_of_the_refresh_icon_when_host_id_filter_is_applied() throws InterruptedException {
		Thread.sleep(200);
		LicensesPage lp = new LicensesPage(driver, logger);

		lp.hostIdThreeDot();

		lp.hostidInput(alldata.get(vTCName).get("Value1").toString());
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.refreshButton();
	}

@Then("click on three dots for License Type")
public void click_on_three_dots_for_license_type() {
	LicensesPage lp = new LicensesPage(driver, logger);
	lp.licenseTypeThreeDot();
}
@Then("enter the value for the License Type")
public void enter_the_value_for_the_license_type() throws InterruptedException {
	LicensesPage lp = new LicensesPage(driver, logger);
	Thread.sleep(3000);
	lp.licenseTypeInput(alldata.get(vTCName).get("Value1").toString());
}

@Then("click on three dots for Version")
public void click_on_three_dots_for_version() {
	LicensesPage lp = new LicensesPage(driver, logger);
	lp.versionThreeDot();
}
@Then("enter the value for the Version")
public void enter_the_value_for_the_version() {
	LicensesPage lp = new LicensesPage(driver, logger);
    lp.versionInput(alldata.get(vTCName).get("Value1").toString());	
}

	@Then("Verification of the refresh icon when more than one filter is applied")
	public void verification_of_the_refresh_icon_when_more_than_one_filter_is_applied() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		
		lp.hostIdThreeDot();
		Thread.sleep(3000);
		lp.hostidInput(alldata.get(vTCName).get("Value1").toString());
		lp.backDropShowing_Div_Click();
        Thread.sleep(3000);
        lp.versionThreeDot();
        lp.versionInput(alldata.get(vTCName).get("Value2").toString());
        lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.refreshButton();

		
	}

	@Then("Verification of the refresh icon when License Type filter is applied")
	public void verification_of_the_refresh_icon_when_license_type_filter_is_applied() throws InterruptedException {
		Thread.sleep(200);
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.refreshButton();
	}

	@Then("Verification of the refresh icon when Expiry Date filter is applied")
	public void verification_of_the_refresh_icon_when_expiry_date_filter_is_applied() throws InterruptedException {
		
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.expiryDateThreeDot();
		Thread.sleep(3000);
		CalenderPage cal = new CalenderPage(driver, logger);
		lp.calenderIcon();

		Thread.sleep(5000);
		String year = alldata.get(vTCName).get("Value1").toString();
		String month = alldata.get(vTCName).get("Value2").toString();
		String day = alldata.get(vTCName).get("Value3").toString();
		String day2 = alldata.get(vTCName).get("Value4").toString();

		cal.SelectDDDashMMDashYYYDay(year, month, day);

		Thread.sleep(3000);
		
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);
		
		Thread.sleep(3000);
		lp.applyButtoncalender();
		Thread.sleep(5000);
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.headingTitle();

	}

	

	@Then("Click on Add license button")
	public void click_on_add_license_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.addButton();
	}

	@Then("upload license file and click on upload button")
	public void upload_license_file_and_click_on_upload_button() throws InterruptedException, AWTException {

		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("Value1").toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(4000);
		lp.uploadButton();
	}

	@Then("upload invalid license file and click on upload button")
	public void upload_invalid_license_file_and_click_on_upload_button() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("Value1").toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(4000);
		lp.uploadButton();
		try {
			lp.invalidLicenseValidationmessagetext();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("click on upload button to verify validation message")
	public void click_on_upload_button_to_verify_validation_message() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.uploadButton();
	}

	@Then("Click on three dots of host Id and enter the text for host id")
	public void click_on_three_dots_of_host_id_and_enter_the_text_for_host_id() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdThreeDot();
		lp.hostidInput(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on three dots of issued date for license")
	public void click_on_three_dots_of_issued_date_for_license() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issueDateThreeDot();
		Thread.sleep(5000);
		lp.opencalenderdot();

		String startDate = alldata.get(vTCName).get("Value1").toString();
		String endDate = alldata.get(vTCName).get("Value2").toString();
		try {
			lp.selectDateRange(startDate, endDate);
			Thread.sleep(500000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		 lp.applyButtoncalender();

	}

}
