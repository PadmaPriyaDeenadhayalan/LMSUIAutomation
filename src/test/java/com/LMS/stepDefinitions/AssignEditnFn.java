package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignEditnFn {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage AEFn = new AssignmentPage(FeatureHelper.getDriver());
	
	@When("Staff Clicks  AssignmentEdit buttton")
	public void staff_clicks_assignment_edit_buttton() {
		AEFn.clickAEdit();
	}

	@Then("Staff see Assignmenheader text as {string}")
	public void staff_see_assignmenheader_text_as(String string) {
	    AEFn.verifyAEditLink();
	    logger.info("Verifying Edit  Links");
	}

	@When("Staff Clicks AssignmentEdit button for Edit AssignmentName")
	public void staff_clicks_assignment_edit_button_for_edit_assignment_name() {
		AEFn.clickAEdit();
	}
	@When("Staff update the {string} for Assignment Name Update")
	public void staff_update_the_for_assignment_name_update(String AName) {
		AEFn.setAssignmentName(AName);
	}

	
	@Then("Staff Clicks Assignment window Save  button after update the AssignmentName")
	public void staff_clicks_assignment_window_save_button_after_update_the_assignment_name() {
		AEFn.clickAsave();
	}
	
	@Then("Staff view the Assignment Success message as {string} after Updater the Assignment Name")
	public void staff_view_the_assignment_success_message_as_after_updater_the_assignment_name(String string) {
		String ActualStatusMsg = "Name is updated";
		String StatusMsg = AEFn.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
			logger.info(AEFn.getASuggestionBox());
		   	} 
	}

	@When("Staff Clicks AssignmentEdit button for Edit AssignmentDescription")
	public void staff_clicks_assignment_edit_button_for_edit_assignment_description() {
	   AEFn.clickAEdit();
	}
		
	@When("Staff update the {string}  for Assignment Description Update")
	public void staff_update_the_for_assignment_description_update(String ADescription) {
		AEFn.setADescription(ADescription);
	}
	@Then("Staff Clicks Assignment window Save  button after update the AssignmentDescription")
	public void staff_clicks_assignment_window_save_button_after_update_the_assignment_description() {
		AEFn.clickAsave();
	}

	@Then("Staff view the Assignment Success message as \" AssignmentDesceiption is Updated \"after Assignment Description Update")
	public void staff_view_the_assignment_success_message_as_assignment_desceiption_is_updated_after_assignment_description_update() {
		String ActualStatusMsg = "Description is updated";
		String StatusMsg = AEFn.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
			logger.info(AEFn.getASuggestionBox());
		   	} 
	}

	@When("Staff Clicks AssignmentEdit button for Edit AssignmentDuedate")
	public void staff_clicks_assignment_edit_button_for_edit_assignment_duedate() {
		AEFn.clickAEdit();
	}
	
	@When("Staff update the {string}  Assignment Duedate Update")
	public void staff_update_the_assignment_duedate_update(String ADuedate) {
		AEFn.setADuedate(ADuedate);
	}

	@Then("Staff Clicks Assignment window Save  button after update the AssignmentDuedate")
	public void staff_clicks_assignment_window_save_button_after_update_the_assignment_duedate() {
		AEFn.clickAsave();
	}
	
	@Then("Staff view the Assignment Success message as {string} Assignment Duedate Update")
	public void staff_view_the_assignment_success_message_as_assignment_duedate_update(String string) {
		String ActualStatusMsg = "Assignment Duedate is updated";
		String StatusMsg = AEFn.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
			logger.info(AEFn.getASuggestionBox());
		   	} 
	}

	@When("Staff Clicks AssignmentEdit button for Edit AssignmentGrade")
	public void staff_clicks_assignment_edit_button_for_edit_assignment_grade() {
		AEFn.clickAEdit();
	}
	@When("Staff update the {string} Assignment Grade Update")
	public void staff_update_the_assignment_grade_update(String AGrade) {
		AEFn.setAGrade(AGrade);
	}

	@Then("Staff Clicks Assignment window Save  button after update the AssignmentGrade")
	public void staff_clicks_assignment_window_save_button_after_update_the_assignment_grade() {
		AEFn.clickAsave();
	}

	@Then("Staff view the Assignment Success message as {string} Assignment grade Update")
	public void staff_view_the_assignment_success_message_as_assignment_grade_update(String string) {
		String ActualStatusMsg = "Assignment Grade is updated";
		String StatusMsg = AEFn.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
			logger.info(AEFn.getASuggestionBox());
		   	} 
	}
	@When("Staff  Clicks  AssignmentEdit button for verify Assignmentcancel function")
	public void staff_clicks_assignment_edit_button_for_verify_assignmentcancel_function() {
	    AEFn.clickAEdit();
	    }

	@When("Staff  Clicks on AssignmentCancel button to verify its function")
	public void staff_clicks_on_assignment_cancel_button_to_verify_its_function() {
		AEFn.clickACancel();
	}
	
	@Then("Staff  View the Assignment Details window got closed")
	public void staff_view_the_assignment_details_window_got_closed() {
		logger.info("Staff didnot see any success Msg");
	}
	
	@When("Staff  Enters edited {string} in Assignment page SearchBox")
	public void staff_enters_edited_in_assignment_page_search_box(String string) {
		AEFn.enterAValidSearchBox(string);
	}

	@Then("Staff view the edited  Assignment detail in the Manage Assignment Table")
	public void staff_view_the_edited_assignment_detail_in_the_manage_assignment_table() {
		logger.info("Staff  view the edited  Assignment page");
	}

	@Given("User\\/Staff is on Manage Assignment page")
	public void user_staff_is_on_manage_assignment_page() {
		String titleOfProgram = AEFn.getAssignmentPageTitle();
        String title = "Manage Assignment ";
		Assert.assertEquals(title, titleOfProgram);   
	}
	
	@When("Admin\\/User Clicks on Assignment Edit buttton for Validate Edit button")
	public void admin_user_clicks_on_assignment_edit_buttton_for_validate_edit_button() {
		AEFn.clickAEdit();
	}

	@Then("Admin\\/User see a Assignment page Error message  {string}")
	public void admin_user_see_a_assignment_page_error_message(String string) {
		String ActualStatusMsg = "Only Admin have an Access";
		String StatusMsg = AEFn.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
				logger.info(AEFn.getASuggestionBox());
	}
	
	}
	}

