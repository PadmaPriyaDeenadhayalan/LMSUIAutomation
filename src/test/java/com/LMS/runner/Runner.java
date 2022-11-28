package com.LMS.runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	
	@CucumberOptions(features = {"./src/test/resources/Feature/Attendance"}, 
					glue = {"com.LMS.stepDefinitions","com.LMS.pageObjects" }, 
					monochrome = true, 
					dryRun = false, 
					plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"html:target/cucumber-reports/reports.html","timeline:test-output-thread/" }, 
					publish = true)

	public class Runner {

	}
	
	

	 




