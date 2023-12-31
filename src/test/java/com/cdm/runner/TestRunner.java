package com.cdm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Admin
 * 
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		// features = "src/test/resources/Features/",
		// features = "src/test/resources/Features/LoginApp.feature",
		glue = { "com.cdm.Stepdefinitions" },
		// features = "src/test/resources/Features/EDGEDevices.feature",
		//features = "src/test/resources/Features/EDGEGroups.feature",
				features = "src/test/resources/Features/AppGroups.feature",
		// glue = {"com.cdm.Stepdefinitions.EDGEDevices"},
		// glue = {"helpers","com.cdm.Stepdefinitions/loginSteps.java"},

		plugin = { "pretty", "json:target/cucumber-reports/Cucumber4.json",
				"junit:target/cucumber-reports/Cucumber4.xml", "html:target/cucumber-reports1.html", },

		// dryRun = true,
		tags = "@Test")
public class TestRunner {

}
