package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.Attendance;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendanceDeleteFunctionality extends FeatureHelper{


	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	Attendance attendance = new Attendance(FeatureHelper.getDriver());
	
	@When("User\\/Staff Clicks on DeleteButton")
	public void user_staff_clicks_on_delete_button() {
	    
		attendance.clickDeleteIcon();
		logger.info("Clicking on Delete Button");
	}

	@Then("Admin see header text as Delete Confirm")
	public void admin_see_header_text_as_delete_confirm() {
	    
		String header = attendance.getDeleteHeaderText();
		if (header == "Delete Confirm") {
			assertEquals("Delete Confirm", header);
			logger.info("User can see Delete Confirm");
		} else {
			logger.info("User cannot see Delete Confirm");
		}
	}

	@Given("User\\/Staff Clickks on DeleteButton")
	public void user_staff_clickks_on_delete_button(){
	    
		attendance.clickDeleteIcon();
		logger.info("Clicking on Delete Button");
	}

	@When("User\\/Staff  Clicks on  Yes  button")
	public void user_staff_clicks_on_yes_button() {
	    
		attendance.clickDeleteYesButton();
		logger.info("Clicking on Yes Button");
	}

	@Then("User\\/Staff  see Success message Program Deleted Succesfully")
	public void user_staff_see_success_message_program_deleted_succesfully() {
	    
		if(attendance.verifyDeleteSuccessMsg()) {
			logger.info("Deleted Successfully message is displayed");
		}
		else {
			logger.info("Deleted Successfully message is not displayed");
		}
	}

	@When("User\\/Staff  Clicks on No button")
	public void user_staff_clicks_on_no_button() {
	    
		attendance.clickDeleteNoButton();
		logger.info("Clicking on No Button");
	}

	@Then("User\\/Staff can see Program Name not deleted")
	public void user_staff_can_see_program_name_not_deleted() {
	    
		if(attendance.verifyProgramName()) {
			logger.info("Program Name is not deleted");
		}
		else {
			logger.info("Program Name is deleted");
		}
			
	}

	@When("Admin Clicks on DeleteButton")
	public void admin_clicks_on_delete_button() {
	    
		attendance.clickDeleteIcon();
		logger.info("Clicking on Delete Button");
	}
}
