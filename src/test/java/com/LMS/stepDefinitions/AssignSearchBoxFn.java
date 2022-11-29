package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignSearchBoxFn extends FeatureHelper{
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage ASearchBoxFn = new AssignmentPage(FeatureHelper.getDriver());
	
	
	@When("Admin\\/User\\/Staff enter the {string} in the textbox")
	public void admin_user_staff_enter_the_in_the_textbox(String string) {
		ASearchBoxFn.enterAValidSearchBox(string);
		logger.info("Entering Valid Name in the Search input field");
	}

	@Then("Admin\\/User\\/Staff view the details of the searched Assignment")
	public void admin_user_staff_view_the_details_of_the_searched_assignment() {
		ASearchBoxFn.verifyNameContainsInManagegeAssignmentList(null);
		logger.info("Verify search text matching with Manager user name list.");
	}	
}
