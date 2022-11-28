package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AssignMulyipleDeleteFn {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage AMDFn = new AssignmentPage(FeatureHelper.getDriver());
	
	
	@When("Admin\\/User\\/Staff select Manage Management page")
	public void admin_user_staff_select_manage_management_page() {
		AMDFn.clickAssignment();
	}

	@Then("Admin\\/User\\/Staff check the status of the Delete  button on the top left hand side is Disabled or not in the Manage Assignment")
	public void admin_user_staff_check_the_status_of_the_delete_button_on_the_top_left_hand_side_is_disabled_or_not_in_the_manage_assignment() {
		AMDFn.verifyAMultipleDelete();
		logger.info("Delete button is visible");
	}

	@When("Staff selects more than one Batch Name using checkbox")
	public void staff_selects_more_than_one_batch_name_using_checkbox() {
		AMDFn.clickACCheckBox();
	}

	@Then("Staff check the status Delete button on the top left hand side is Enabled or not")
	public void staff_check_the_status_delete_button_on_the_top_left_hand_side_is_enabled_or_not() {
		AMDFn.verifyRowACheckBoxs();
		logger.info("Checking row Check Box is enabled");
	}

	@When("Staff selects more than one Assignment Name using checkbox in the Assignment Page")
	public void staff_selects_more_than_one_assignment_name_using_checkbox_in_the_assignment_page() {
		AMDFn.cilckARowCheckBoxs();
	}

	@When("Staff Clicks on Enabled Delete button on the top left hand side of the Assignment Page")
	public void staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side_of_the_assignment_page() {
		AMDFn.clickAMultipleDelete();
	}

	@Then("Staff receives the confirmation Message as {string} on the Confirmation window")
	public void staff_receives_the_confirmation_message_as_on_the_confirmation_window(String string) {
		logger.info(AMDFn.getAConfirmationMSg());
	}

	@Then("Staff Clicks on Yes  button for Delete Assignment")
	public void staff_clicks_on_yes_button_for_delete_assignment() {
		AMDFn.clickAYesConfirm();
	}

	@Then("Staff view the  Success message  {string} in the Assignment  Confirmation window")
	public void staff_view_the_success_message_in_the_assignment_confirmation_window(String string) {
		logger.info(AMDFn.getAConfirmationMSg());
	}

	@When("Staff selects more than one Assignment Name using checkbox")
	public void staff_selects_more_than_one_assignment_name_using_checkbox() {
	    AMDFn.clickACCheckBox();
	}

	@Then("Staff receives the confirmation Message as {string} on the Assignment Confirmation window")
	public void staff_receives_the_confirmation_message_as_on_the_assignment_confirmation_window(String string) {
		logger.info(AMDFn.getAConfirmationMSg());
	}

	@Then("Staff Clicks on No  button for cancel the  Delete function")
	public void staff_clicks_on_no_button_for_cancel_the_delete_function() {
		AMDFn.clickANoConfirm();
	}

	@Then("Staff verify selected Assignment Names are not deleted in the Manage Assignment")
	public void staff_verify_selected_assignment_names_are_not_deleted_in_the_manage_assignment() {
		AMDFn.verifyNameContainsInManagegeAssignmentList("");
		logger.info("Verify search text matching with Manager Assginment name in the list.");
	}	
	
	@When("Admin\\/User\\/Staff Enters deleted  Assignment Names in Search")
	public void admin_user_staff_enters_deleted_assignment_names_in_search() {
		AMDFn.verifyNameContainsInManagegeAssignmentList("");
	}

	@Then("Admin\\/User\\/Staff did not see the Deleted Assignment name on the Table.")
	public void admin_user_staff_did_not_see_the_deleted_assignment_name_on_the_table() {
		
		logger.info("\"Admin\\\\/User\\\\/Staff not see the deleted program name on the table");
	}
	@When("Admin\\/User selects more than one Assignment  Name using checkbox")
	public void admin_user_selects_more_than_one_assignment_name_using_checkbox() {
		 AMDFn.clickACCheckBox();
	}

	@When("Admin\\/User Cicks on Enabled Delete button on the top left hand side of the Assignment Page")
	public void admin_user_cicks_on_enabled_delete_button_on_the_top_left_hand_side_of_the_assignment_page() {
		 AMDFn.clickAMultipleDelete();
			}
	
	@Then("Admin\\/User see a Error message {string} in the Assignmet Confirmation window")
	public void admin_user_see_a_error_message_in_the_assignmet_confirmation_window(String string) {
		String ErrorMSg = "only Admin Access";
		String ConfirmMSg = AMDFn.getAConfirmationMSg();
		if (ErrorMSg.equalsIgnoreCase(ConfirmMSg)) {
logger.info(AMDFn.getASuggestionBox());
		}
	}
}
	

