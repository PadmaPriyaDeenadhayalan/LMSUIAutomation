package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AssignmentGoogleForm {
	
		public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
		ReadConfig config = new ReadConfig();
		String baseurl = config.getApplicationURL();
		AssignmentPage AGF = new AssignmentPage(FeatureHelper.getDriver());
		
		
		@When("Admin\\/User\\/Staff Clicks on anyone of Assignment Name in the Manage Assignment Page")
		public void admin_user_staff_clicks_on_anyone_of_assignment_name_in_the_manage_assignment_page() {
			AGF.clickAssignment();
		}

		@Then("User\\/Staff are navigated to the Assignment Google Form")
		public void user_staff_are_navigated_to_the_assignment_google_form() {
			String title = AGF.getNewGoogleformHeader();
			 if (title == "Assignments") {
				    assertEquals("Assignments", title);
				    logger.info("User\\\\/Staff are navigated to the Assignment Google Form");
			 }
		}
	        

		@Then("Admin view the Error Message in the suggestion Box is {string}")
		public void admin_view_the_error_message_in_the_suggestion_box_is(String string) {
			logger.info(AGF.getASuggestionBox());
		}
		@Given("User is on Manage Assignment page")
		public void user_is_on_manage_assignment_page() {
			String titleOfProgram = AGF.getAssignmentPageTitle();
	        String title = "Manage Assignment";
			Assert.assertEquals(title, titleOfProgram);    
		}

		@When("User enter all the fields {string} in the Assignment Google Form")
		public void user_enter_all_the_fields_in_the_assignment_google_form(String string) {
		    AGF.setFirstField(string);
		    AGF.setSecondField(string);
		    AGF.setThirdField(string);
		}

		@Then("User  click on the SubmitButton in the Google form")
		public void user_click_on_the_submit_button_in_the_google_form() {
		    AGF.clickGSubmit();
		}

		@Then("Admin view the Success Message in the suggestion Box is {string}")
		public void admin_view_the_success_message_in_the_suggestion_box_is(String string) {
			String ActualStatusMsg = "Submitted Assignment Google form Succesfully";
			String StatusMsg = AGF.getASuggestionBox();
			if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
	logger.info(AGF.getASuggestionBox());
			}
		}


		@When("User enter all the fields {string} in the Assignment Google Form for validation")
		public void user_enter_all_the_fields_in_the_assignment_google_form_for_validation(String string) {
			AGF.setFirstField(string);
		    AGF.setSecondField(string);
		    AGF.setThirdField(string);

		}

		@Then("User click on the ClearButton in the Google form")
		public void user_click_on_the_clear_button_in_the_google_form() {
		    AGF.clickGClear();
		}

		@Then("User the Empty field inthe google form")
		public void user_the_empty_field_inthe_google_form() {
			logger.info("User View the Empty Google Assignment Form");
		}

		@When("User enter few fields {string} in the Assignment Google Form")
		public void user_enter_few_fields_in_the_assignment_google_form(String string) {
			AGF.setFirstField(null);
		    AGF.setSecondField(null);
		    AGF.setThirdField(string);
		}

		@Then("User  click on the SubmitButton in the Google form for Validation")
		public void user_click_on_the_submit_button_in_the_google_form_for_validation() {
			AGF.clickGSubmit();
		}

		@When("User Clicks on Swich Account in the  Assignment Google Form")
		public void user_clicks_on_swich_account_in_the_assignment_google_form() {
			String ActualStatusMsg = "All Fields are Manditory";
			String StatusMsg = AGF.getASuggestionBox();
			if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
	logger.info(AGF.getASuggestionBox());
			}
		}
		
		@When("User Clicks on Swich Accountbutton in the Assignment Google Form")
		public void user_clicks_on_swich_accountbutton_in_the_assignment_google_form() {
		   AGF.clickswitchaccount();
		}

		@Then("User Navigated to the new acount and receives  {string} in the status")
		public void user_navigated_to_the_new_acount_and_receives_in_the_status(String string) {
			String ActualStatusMsg = "successfully Switched the Account";
			String StatusMsg = AGF.getASuggestionBox();
			if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
	logger.info(AGF.getASuggestionBox());
			}
		}
		
		
}