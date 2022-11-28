package com.LMS.stepDefinitions;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSubmitButton extends FeatureHelper{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	User submit = new User(FeatureHelper.getDriver());
	
	@Then("Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
		if(submit.verifySubmitButton()) {
			
			logger.info("Submit Button is Visible");
		}
		else {
			logger.info("Submit Button is not Visible");
		}
	}
	
	@Given("Admin\\/User\\/Staff is on User Detailswindow")
	public void admin_user_staff_is_on_user_detailswindow() {
	    
		if(submit.verifyUserDetailsHeading()) {
			logger.info("User Details window is displayed");
		}
		else {
			logger.info("User Details window is not displayed");
		}
	}

	@When("Admin\\/User\\/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {
	    
		submit.clicksubmitButton();
		logger.info("User/Admin/Staff clicked submit button");
	}

	@Then("Admin\\/User\\/Staff should see a Error message Mandatory Fields cannot be empty")
	public void admin_user_staff_should_see_a_error_message_mandatory_fields_cannot_be_empty() {
	    
		submit.verifyErrorMsg();
		logger.info("Error Message is Displayed");
	}

	@When("Admin\\/User\\/Staff clicks Submit button by entering all valid values in required fields")
	public void admin_user_staff_clicks_submit_button_by_entering_all_valid_values_in_required_fields() {
	    
		submit.verifyAddress();
		submit.verifyBatch();
		submit.verifyCity();
		submit.verifyComments();
		submit.verifyEmailAddress();
		submit.verifyExperience();
		submit.verifyFirstName();
		submit.verifyLastName();
		submit.verifyPgProgram();
		submit.verifyPhoneNo();
		submit.verifyPostalCode();
		submit.verifySkill();
		submit.verifyState();
		submit.verifyUgProgram();
		submit.verifyUserRole();
		submit.verifyVisaStatus();
		submit.verifyAdminRole();
		submit.verifyStaffRole();
		
		logger.info("Entered Valid Values in the input fields");
	}

	@Then("Admin\\/User\\/Staff  see Success message  New User Created  is  Should be Saved.")
	public void admin_user_staff_see_success_message_new_user_created_is_should_be_saved() {
	    
		submit.verifyNewUser();
		logger.info("New User is displayed");
	}

}
