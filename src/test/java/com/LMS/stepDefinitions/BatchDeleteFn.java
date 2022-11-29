package com.LMS.stepDefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class BatchDeleteFn{
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage BDFn = new BatchPage(FeatureHelper.getDriver());
	
	@When("Admin Clicks on any Delete button located on the right side of specificRow for Validate Delte Fn")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side_of_specific_row_for_validate_delte_fn() {
	    BDFn.clickDelete1();
	}

	@Then("Admin see header text as {string}  after validate Delete button Function")
	public void admin_see_header_text_as_after_validate_delete_button_function(String string) {
		logger.info("Admin view confirmation  Window");
	}
		

	@Then("Admin Clicks on Yes  button for Delete Row")
	public void admin_clicks_on_yes_button_for_delete_row() {
	    BDFn.clickYesConfirm();
	}

	@Then("Admin see Success message {string} after verify Delete button function")
	public void admin_see_success_message_after_verify_delete_button_function(String string) {
		
		logger.info("confirmatiom msg:"+BDFn.getConfirmationMSg());
		
		}

	@When("Admin Clicks on any Delete button located on the right side of specificRow")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side_of_specific_row() {
		 BDFn.clickDelete1();
	}

	@Then("Admin see header text as {string} for verify No case")
	public void admin_see_header_text_as_for_verify_no_case(String string) {
		logger.info("Admin view confirmation the Window");
	}
	
	@Then("Admin Clicks on No  button for delete functionality verification")
	public void admin_clicks_on_no_button_for_delete_functionality_verification() {
		BDFn.clickNoConfirm();
		
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
		logger.info("Admin view confirmationWindow is closed");
	}
	
	@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {
		logger.info("Admin\\\\/User\\\\/Staff enter the Deleted name in seachBox");
	}

	@Then("Admin\\/User\\/Staff finds no results for verify Delete Funtionality")
	public void admin_user_staff_finds_no_results_for_verify_delete_funtionality() {
		logger.info("\"Admin\\\\/User\\\\/Staff not see the deleted program name on the table");
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
	    BDFn.clickDelete1();
	}

	@Then("User\\/Staff see a Error message {string} after validate Delete  button Function")
	public void user_staff_see_a_error_message_after_validate_delete_button_function(String string) {
		String ErrorMSg = "Only Admin have an Access";
		String ConfirmMSg =BDFn.getConfirmationMSg();
		if (ErrorMSg.equalsIgnoreCase(ConfirmMSg)) {
logger.info(BDFn.getSuggestionBox());
		}
	}

}
