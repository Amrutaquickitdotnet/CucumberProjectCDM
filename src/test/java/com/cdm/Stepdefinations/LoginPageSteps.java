package com.cdm.Stepdefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.cdm.pages.DashboardPage;
import com.cdm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseTest {

	@When("user enters valid credentials and click on login button")
	public void user_enters_invalid_credentials_and_click_on_login_button() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
		long startTime = System.currentTimeMillis();
	}

	@Then("Verify Error message for userid and password")
	public void Verify_Error_message_userid_password() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyErrorMsgusername();
		lp.verifyErrorMsgpwd();
	}

	@When("user register with valid data")
	public void user_register_with_valid_data() {
		System.out.println("I am in start of user_register_with_valid_data");

	}

	@Then("user should be login successfully")
	public void user_should_be_login_successfully() {
		System.out.println("I am in start of user_should_be_login_successfully");
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyDashboard();
	}

	@When("Verify forgot password functionlity")
	public void verify_forgot_password_functionlity() {
		LoginPage lp = new LoginPage(driver, logger);
	}

	@When("the user enters valid credentials {string} and {string} and clicks login")
	public void the_user_enters_valid_credentials_and_and_clicks_login(String string, String string2) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterCredentials(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}

	@When("the user enters valid credentials and presses the {string} key")
	public void the_user_enters_valid_credentials_and_presses_the_key(String string) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.pressEnterKey();
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver, logger);
		Thread.sleep(5000);
		dashboardPage.verifyUserIsOnDashboard();
		Thread.sleep(5000);
	}

	@Then("Verify Error message")
	public void verify_error_message() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyErrorMsg();
	}

	@When("user enters valid userid")
	public void user_enters_valid_userid() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));

	}

	@When("user enters valid password")
	public void user_enters_valid_password() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		Thread.sleep(2000);
	}

	@When("click on show password")
	public void click_on_show_password() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickshowpwd();
		Thread.sleep(2000);
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickLogin();
		Thread.sleep(5000);

	}

	@When("click on change password and update new password")
	public void click_on_change_password_and_update_new_password() {

	}

	@Then("login with new credentials")
	public void login_with_new_credentials() {

	}

	@Given("User launch application in edge browser and perform login")
	public void user_launch_application_in_edge_browser() throws InterruptedException {

		WebDriver d = new EdgeDriver();
		d.get(prop.getProperty("AppUrl") + alldata.get(vTCName).get("Url"));
		Thread.sleep(5000);
		LoginPage lp = new LoginPage(d, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));

	}

	@When("Enter on login button")
	public void enter_on_login_button() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		logger.pass("press enter button from keyboard");
	}

	@Then("the user should be redirected to the dashboard and login time should be measured")
	public void the_user_should_be_redirected_to_the_dashboard_and_login_time_should_be_measured() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.verifyUserIsOnDashboard();

		// Capture end time after the user is redirected to the dashboard
		long endTime = System.currentTimeMillis();
		long startTime = 0;
		long loginTime = endTime - startTime;
		System.out.println("Time taken to log in: " + loginTime + " milliseconds");
	}

	@When("open new tab")
	public void open_new_tab() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.newTab();
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		BaseTest bt = new BaseTest();

		bt.launchApp();
	}

	@When("the Super admin enters valid credentials and clicks login")
	public void the_super_admin_enters_valid_credentials_and_clicks_login() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}

	@Then("the Super admin should be redirected to the Super admin dashboard")
	public void the_super_admin_should_be_redirected_to_the_super_admin_dashboard() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		Thread.sleep(4000);
		lp.profileIcon();
		Thread.sleep(4000);
		lp.SuperAdmin();
	}

	@When("the user should verify compliance with login page standards")
	public void the_user_should_verify_compliance_with_login_page_standards() {
		LoginPage lp = new LoginPage(driver, logger);

		WebElement uname = lp.getUsernameInput();

		WebElement pwd = lp.getUsernameInput();

		lp.verifyFont(uname, "Roboto");
		lp.verifyFont(pwd, "Roboto");

		lp.verifyTextColor(uname, "rgba(0, 0, 0, 1)");
		lp.verifyTextColor(pwd, "rgba(0, 0, 0, 1)");

	}

	@Then("the user waits for an extended period to simulate session timeout")
	public void the_user_waits_for_an_extended_period_to_simulate_session_timeout() throws InterruptedException {
		Thread.sleep(2000); // 30 minute
	}

	@Then("the user attempts to interact with the application")
	public void the_user_attempts_to_interact_with_the_application() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.verifyUserIsOnDashboard();
	}

	@Then("the user should be redirected to the login page due to session timeout")
	public void the_user_should_be_redirected_to_the_login_page_due_to_session_timeout() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyTitle(alldata.get(vTCName).get("Value1"));
	}

	@When("the user logs in with valid credentials {string} and {string}")
	public void the_user_logs_in_with_valid_credentials_and(String string, String string2) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		lp.clickLoginButton();
	}

	@When("click on back button and verify page")
	public void click_on_back_button_and_verify_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("verify login page")
	public void verify_login_page() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyTitle();
	}

	@When("another user logs in with valid credentials {string} and {string}")
	public void another_user_logs_in_with_valid_credentials_and(String string, String string2) {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String mainWindow = iterator.next();
		String newWindow = iterator.next();
		driver.switchTo().window(newWindow);

		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		lp.clickLoginButton();
	}

	@Then("both users should be redirected to their respective dashboards")
	public void both_users_should_be_redirected_to_their_respective_dashboards() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.verifyUserIsOnDashboard();
	}

}
