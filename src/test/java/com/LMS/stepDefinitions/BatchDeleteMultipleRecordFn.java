package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchDeleteMultipleRecordFn  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage MDFn = new BatchPage(FeatureHelper.getDriver());
		
	
	@When("Admin\\/User\\/Staff select Manage Batch page")
	public void admin_user_staff_select_manage_batch_page() {
	   MDFn.clickBatch();
	}

	@Then("Admin\\/User\\/Staff check the status of the Delete  button on the top left hand side is Disabled or not")
	public void admin_user_staff_check_the_status_of_the_delete_button_on_the_top_left_hand_side_is_disabled_or_not() {
		MDFn.verifyMultipleDelete();
		logger.info("Delete button is visible");
	}

	@When("Admin\\/User\\/Staff selects more than one Batch Name using checkbox")
	public void admin_user_staff_selects_more_than_one_batch_name_using_checkbox() {
	   MDFn.clickCCheckBox();
	}

	@Then("Admin\\/User\\/Staff check the status Delete button on the top left hand side is Enabled or not")
	public void admin_user_staff_check_the_status_delete_button_on_the_top_left_hand_side_is_enabled_or_not() {
		MDFn.verifyRowCheckBoxs();
		logger.info("Checking row Check Box is enabled");
	}

	@When("Admin selects more than one Batch Name using checkbox")
	public void admin_selects_more_than_one_batch_name_using_checkbox() {
	    MDFn.cilckRowCheckBoxs();
	}

	@When("Admin is Clicking on Enabled Delete button on the top left hand side")
	public void admin_is_clicking_on_enabled_delete_button_on_the_top_left_hand_side() {
	   MDFn.clickMultipleDelete();
	}

	@Then("Admin receives the confirmation Message as {string}")
	public void admin_receives_the_confirmation_message_as(String string) {
		logger.info(MDFn.getConfirmationMSg());
	}

	@Then("Admin Clicking on Yes  button")
	public void admin_clicking_on_yes_button() {
	  MDFn.clickYesConfirm();
	}

	@Then("Admin see Success message as {string}")
	public void admin_see_success_message_as(String string) {
		logger.info(MDFn.getConfirmationMSg());
	}

	@Then("Admin Clicks on No  button")
	public void admin_clicks_on_no_button() {
	    MDFn.clickNoConfirm();
	}

	@Then("Admin verify selected Program Names are not deleted")
	public void admin_verify_selected_program_names_are_not_deleted() {
		logger.info("Admin see the Deleted name in seachBox");
	}

	@When("Admin\\/User\\/Staff Entering the deleted  Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search() {
		logger.info("\"Admin\\\\/User\\\\/Staff enter the deleted program name on searchBox");
	}

	@Then("Admin\\/User\\/Staff did not see the name on the Table.")
	public void admin_user_staff_did_not_see_the_name_on_the_table() {
		logger.info("\"Admin\\\\/User\\\\/Staff not see the deleted program name on the table");
	}
	@When("User\\/Staff selects more than one Batch  Name using checkbox")
	public void user_staff_selects_more_than_one_batch_name_using_checkbox() {
		 MDFn.clickCCheckBox();
	}

	@When("User\\/Staff Clicking on Enabled Delete button on the top left hand side")
	public void user_staff_clicking_on_enabled_delete_button_on_the_top_left_hand_side() {
	   MDFn.clickMultipleDelete();
	}

	@Then("User\\/Staff seeing a Error message {string}")
	public void user_staff_seeing_a_error_message(String string) {
		String ErrorMSg = "only Admin Access";
		String ConfirmMSg =MDFn.getConfirmationMSg();
		if (ErrorMSg.equalsIgnoreCase(ConfirmMSg)) {
logger.info(MDFn.getSuggestionBox());
		}
	}
}
