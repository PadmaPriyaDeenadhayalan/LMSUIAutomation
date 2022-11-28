package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AssignDeleteFn {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage ADFn = new AssignmentPage(FeatureHelper.getDriver());
	
	@When("Staff Clicks on any  Row Delete button located on the right side of specificRow for Validate Delte Fn")
	public void staff_clicks_on_any_row_delete_button_located_on_the_right_side_of_specific_row_for_validate_delte_fn() {
	   ADFn.clickADelete();
	}

	@Then("Staff see header text as {string}  after validate Delete button Function for Assignment Page")
	public void staff_see_header_text_as_after_validate_delete_button_function_for_assignment_page(String string) {
		logger.info("Delete button is visible");
	}

	@Then("Staff Clicks on Yes  button to   Delete  that Row in the confirmation window")
	public void staff_clicks_on_yes_button_to_delete_that_row_in_the_confirmation_window() {
		ADFn.clickAYesConfirm();
	}

	@Then("Staff view the  Success message as {string} in the Assignment Page Confirmation popup window")
	public void staff_view_the_success_message_as_in_the_assignment_page_confirmation_popup_window(String string) {
	    logger.info("confirmatiom msg:"+ADFn.getAConfirmationMSg());
	}

	@When("Staff Clicks on any  Row  Delete button located on the right side of specificRow for Validate  No  buttonDelte Fn")
	public void staff_clicks_on_any_row_delete_button_located_on_the_right_side_of_specific_row_for_validate_no_button_delte_fn() {
		ADFn.clickANoConfirm();
	}

	@Then("Staff Clicks on No  button to   Delete  that Row in the confirmation window")
	public void staff_clicks_on_no_button_to_delete_that_row_in_the_confirmation_window() {
		ADFn.clickANoConfirm();
		logger.info(" view confirmation the Window");
	}

	@Then("Staff view the confirmation window is closed Successfully")
	public void staff_view_the_confirmation_window_is_closed_successfully() {
		logger.info("Staff view confirmationWindow is closed");
	}

	@When("Admin\\/User Clicks on any Assignment Row Delete buttton")
	public void admin_user_clicks_on_any_assignment_row_delete_buttton() {
	    ADFn.clickADelete();
	}

	@Then("Admin\\/User view  a Error message {string} in the Assignment page confirmation window")
	public void admin_user_view_a_error_message_in_the_assignment_page_confirmation_window(String string) {
		String ActualStatusMsg = "Only Admin have an Access";
		String StatusMsg = ADFn.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
				logger.info(ADFn.getASuggestionBox());
	}
	
	}
	
}

