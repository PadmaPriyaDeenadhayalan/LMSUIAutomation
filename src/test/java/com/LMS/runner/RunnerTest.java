package com.LMS.runner;

	import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	
	@CucumberOptions(features = {"./src/test/resources/Feature"}, 
					glue = {"com.LMS.stepDefinitions","com.LMS.pageObjects" }, 
					plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"html:target/cucumber-reports/reports.html","timeline:test-output-thread/" })

	public class RunnerTest {

	}
	
	

	 




