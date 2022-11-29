package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchSearchBoxFunction  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage SearchBoxFn = new BatchPage(FeatureHelper.getDriver());
	
	@When("Admin\\/User\\/Staff is on Manage Batch page for search box")
	public void admin_user_staff_is_on_manage_batch_page_for_search_box() {
		String title = SearchBoxFn.getBatchPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}
	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {
		SearchBoxFn.verifySearchBox();
		logger.info("Search text is visible");
	}

	@When("Admin\\/User\\/Staff enters Batch Name to be searched")
	public void admin_user_staff_enters_batch_name_to_be_searched() {
		SearchBoxFn.enterValidSearchBox("BatchName");
		logger.info("Entering Valid Name in the Search input field");
	}

	@Then("Entries for the searched BatchName are shown")
	public void entries_for_the_searched_batch_name_are_shown() {
		SearchBoxFn.verifyNameContainsInManageBatchList("");
		logger.info("Verify search text matching with Manager user name list.");
	}

	@When("Admin\\/User\\/Staff enters Batch Description to be searched")
	public void admin_user_staff_enters_batch_description_to_be_searched() {
		SearchBoxFn.enterValidSearchBox("BatchDescription");
		logger.info("Entering Valid Dscription is in the Search input field");
	}

	@Then("Entries for the searched Batch Description are shown")
	public void entries_for_the_searched_batch_description_are_shown() {
		SearchBoxFn.verifyNameContainsInManageBatchList("");
		logger.info("Verify search text matching with Manager user name list.");
	}
	
	@When("Admin\\/User\\/Staff enters Batch Status to be searched")
	public void admin_user_staff_enters_batch_status_to_be_searched() {
		SearchBoxFn.enterValidSearchBox("BatchStatus");
		logger.info("Entering Valid Dscription is in the Search input field");
	}

	@Then("Entries for the searched Batch status are shown.")
	public void entries_for_the_searched_batch_status_are_shown() {
		SearchBoxFn.verifyNameContainsInManageBatchList("");
		logger.info("Verify search text matching with Manager user name list.");
	}

	@When("Admin\\/User\\/Staff enters No Of Classes to be searched")
	public void admin_user_staff_enters_no_of_classes_to_be_searched() {
		SearchBoxFn.enterValidSearchBox("NoOfClasses");
		logger.info("Entering Valid Dscription is in the Search input field");   
	}

	@Then("Entries for the searched No Of Classes are shown.")
	public void entries_for_the_searched_no_of_classes_are_shown() {
		SearchBoxFn.verifyNameContainsInManageBatchList("");
		logger.info("Verify search text matching with Manager user name list.");
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
		SearchBoxFn.enterValidSearchBox("PrograName");
		logger.info("Entering Valid Dscription is in the Search input field");   
	}

	@Then("Entries for the searched Program Name are shown.")
	public void entries_for_the_searched_program_name_are_shown() {
	 SearchBoxFn.verifyNameContainsInManageBatchList("");
		logger.info("Verify search text matching with Manager user name list.");  
	}
}
