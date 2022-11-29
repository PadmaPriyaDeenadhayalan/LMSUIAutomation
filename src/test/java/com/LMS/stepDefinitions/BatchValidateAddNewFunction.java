package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class BatchValidateAddNewFunction {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage VANFn = new BatchPage(FeatureHelper.getDriver());
	
	@Given("Admin\\/User\\/Staff is on Manage Batch page")
	public void admin_user_staff_is_on_manage_Batch_page() {
		String titleOfProgram = VANFn.getBatchPageTitle();
        String title = "Manage Batch";
		Assert.assertEquals(title, titleOfProgram);    
	}

	@When("Admin\\/User\\/Staff Enters newly added  Batch Name in Search Box")
	public void admin_user_staff_enters_newly_added_batch_name_in_search_box() {
		VANFn.enterValidSearchBox("Batchname");
	}

	@Then("Entry for the newly added Batch Name is shown")
	public void entry_for_the_newly_added_program_name_is_shown() {
		logger.info("\"Admin\\\\/User\\\\/Staff  view the newly added Batch");
	}

	/*
	 * @Given("User\\/Staff is on Manage Batch page") public void
	 * user_staff_is_on_manage_program_page() { String titleOfProgram =
	 * VANFn.getBatchPageTitle(); String title = "Manage Batch";
	 * Assert.assertEquals(title, titleOfProgram); }
	 */

	@When("User\\/Staff Clicks on  {string} button")
	public void user_staff_clicks_on_button(String string) {
	   VANFn.clicktAddNewBatch(); 
	}

	@Then("User\\/Staff see a Error message {string} in the Ad NewProgram function")
	public void user_staff_see_a_error_message_in_the_ad_new_program_function(String string) {
		String ErrorMSg = "only Admin Access";
		String ConfirmMSg =VANFn.getConfirmationMSg();
		if (ErrorMSg.equalsIgnoreCase(ConfirmMSg)) {
			logger.info(VANFn.getSuggestionBox());
		}
	}

}
