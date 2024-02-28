package com.cdm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		//features = "src/test/resources/Features/Client.feature",

		//features = "src/test/resources/Features/Login.feature",
		//features = "src/test/resources/Features/EDGEGroups.feature",
		 features = "src/test/resources/Features/EDGEDevices.feature",

		// features = "src/test/resources/Features/Deployments.feature",
		// features = "src/test/resources/Features/Configurations.feature",
		// features = "src/test/resources/Features/Licenses.feature",
		// features = "src/test/resources/Features/AppGroups.feature",

		//features = "src/test/resources/Features/Reports.feature",

		// features = "src/test/resources/Features/UsersSettings.feature",

		// features = "src/test/resources/Features/About.feature",

		// features = "src/test/resources/Features/certificates.feature",
		// features = "src/test/resources/Features/Wells.feature",

		// features = "src/test/resources/Features/hardware.feature",
		// features = "src/test/resources/Features/Volumes.feature",
		glue = { "com.cdm.Stepdefinations" },

       plugin = { "pretty", "json:target/cucumber-reports/Cucumber4.json",
			"junit:target/cucumber-reports/Cucumber4.xml", "html:target/cucumber-reports1.html", 
			}

		//dryRun = true
		
//tags = "@Test"
	
	)

public class TestRunner {

}
