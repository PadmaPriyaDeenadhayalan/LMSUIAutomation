package com.LMS.runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	
	@CucumberOptions(features = {"./src/test/resources/Feature/User/cancelIcon.feature"}, 
					glue = {"com.LMS.stepDefinitions" }, 
					monochrome = true, 
					dryRun = false, 
					plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"html:target/cucumber-reports/reports.html" }, 
					publish = true)

	public class Runner {

	}
	
	

	 




