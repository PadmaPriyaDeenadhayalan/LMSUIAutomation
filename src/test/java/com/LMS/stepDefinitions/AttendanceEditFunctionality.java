package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.Attendance;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendanceEditFunctionality extends FeatureHelper{

	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	Attendance attendance = new Attendance(FeatureHelper.getDriver());
	
	
	@Given("User\\/Staff is on Manage Attendance page")
	public void user_staff_is_on_manage_attendance_page() {
	    
		String title = attendance.getManageAttendanceTitle();
		if (title == "Manage Attendance") {
			assertEquals("Manage Attendance", title);
			logger.info("User is in Manage Attendance Page");
		} else {
			logger.info("User is not in Manage Attendance Page");
		}
	}

	@When("User\\/Staff Clicks on Edit Button")
	public void user_staff_clicks_on_edit_button() {
	    
		attendance.clickEditIcon();
		logger.info("clicking on edit Icon");
	}

	@Then("Admin see header text as Attendance Details")
	public void admin_see_header_text_as_attendance_details() {
		
		attendance.verifyAttendanceHeaderText();
		logger.info("Verifying Attendance Page Header text");
	}

	@Given("User\\/Staffclicks on Edit Button")
	public void user_staffclicks_on_edit_button() {
	    
		attendance.clickEditIcon();
		logger.info("clicking on edit Icon");
		
	}

	@When("User\\/Staff clicks on Save button after changing Program Name")
	public void user_staff_clicks_on_save_button_after_changing_program_name() {
	    
		attendance.changeProgramName();
		attendance.clickSaveIcon();
		logger.info("Changing Program Name and clicks Save button");
	}

	@Then("User\\/Staff see the success message Updated Successfully")
	public void user_staff_see_the_success_message_updated_successfully() {
		
		if(attendance.verifySuccessMsg()) {
			logger.info("Success msg is displayed");
		}
		else {
			logger.info("Success msg is not displayed");
		}
	}

	@When("User\\/Staff clicks on Save button after changing User name")
	public void user_staff_clicks_on_save_button_after_changing_user_name() {
	    
		attendance.changeUserName();
		attendance.clickSaveIcon();
		logger.info("Changing UserName and clicks Save button");
	}

	@When("User\\/Staff clicks on Save button after disabling Present details")
	public void user_staff_clicks_on_save_button_after_disabling_present_details() {
		
		attendance.clickPresentDetails();
		attendance.clickSaveIcon();
		logger.info("Disabling Present details and clicks Save button");
	}

	@When("User\\/Staff clicks on Save button after enabling Absent details")
	public void user_staff_clicks_on_save_button_after_enabling_absent_details() {
	    
		attendance.clickAbsentDetails();
		attendance.clickSaveIcon();
		logger.info("Enabling Absent details and clicks Save button");
	}

	@When("User\\/Staff clicks on Cancel button after entering details")
	public void user_staff_clicks_on_cancel_button_after_entering_details() {
	    
		attendance.clickCancelIcon();
		logger.info("clicking on cancel button");
	}

	@Then("User\\/Staff see a Attendance Details window getting closed")
	public void user_staff_see_a_attendance_details_window_getting_closed() {
	    
		attendance.clickCancelIcon();
		logger.info("clicking on close Icon to close the window");
	}

	@Given("Admin is on Manage Attendance page")
	public void admin_is_on_manage_attendance_page() {
	    
		String title = attendance.getManageAttendanceTitle();
		if (title == "Manage Attendance") {
			assertEquals("Manage Attendance", title);
			logger.info("User is in Manage Attendance Page");
		} else {
			logger.info("User is not in Manage Attendance Page");
		}
	}

	@When("Admin Clicks on Edit Button")
	public void admin_clicks_on_edit_button() {
		
		attendance.clickEditIcon();
		logger.info("clicking on edit Icon");
	    
	}

	@Then("Admin see Error Message Admin Has View Only Permission")
	public void admin_see_error_message_admin_has_view_only_permission() {
	    
		if(attendance.verifyErrorMsg()) {
			logger.info("Error msg is displayed");
		}
		else {
			logger.info("Error msg is not displayed");
		}
		
	}
}
