package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.Attendance;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendanceHeaderFooterPaginator extends FeatureHelper{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	Attendance attendance = new Attendance(FeatureHelper.getDriver());
	
	@Given("Admin\\/User\\/Staff Logging on to LMS Website")
	public void admin_user_staff_logging_on_to_lms_website() {
	    
		String title = attendance.getManageProgramPageTitle();
		if (title == "Manage Program") {
			assertEquals("Manage Program", title);
			logger.info("User is in Manage Program Page");
		} else {
			logger.info("User is not in Manage Program Page");
		}
	}

	@When("Admin\\/User\\/Staff Clicks on Attendance button")
	public void admin_user_staff_clicks_on_attendance_button() {
	    
		attendance.clickAttendanceIcon();
		logger.info("User is clicking on Attendance Icon");
	}

	@Then("Admin\\/User\\/Staff see header text as Manage Attendance")
	public void admin_user_staff_see_header_text_as_manage_attendance() {
	  
		attendance.verifyAttendanceHeader();
		logger.info("verifying Attendance Page Header");
	}

	@When("Admin\\/User\\/Staff is on Manage Attendance page")
	public void admin_user_staff_is_on_manage_attendance_page() {
	   
				String title = attendance.getManageAttendanceTitle();
				if (title == "Manage Attendance") {
					assertEquals("Manage Attendance", title);
					logger.info("User is in Manage Attendance Page");
				} else {
					logger.info("User is not in Manage Attendance Page");
				}
	}

	@Then("Admin\\/User\\/Staff see Footer text as In total there are5entries.")
	public void admin_user_staff_see_footer_text_as_in_total_there_are5entries() {
	    
		String getFooterText = attendance.getFooterText();
		if (getFooterText == "In total there are 5 entries.") {
			assertEquals(getFooterText, "In total there are 5 entries.");
			logger.info("Text is Visible");
		} else {
			
			logger.info("Text is not visibile");
		}
	}

	@Then("Admin\\/User\\/Staff see the text as Showing1 to5 of5 entries.")
	public void admin_user_staff_see_the_text_as_showing1_to5_of5_entries() {
	    
		String getPaginationText = attendance.getPaginationText();
		if (getPaginationText == "Showing 1 to 5 of 5 entries") {
			assertEquals(getPaginationText, "Showing 1 to 5 of 5 entries");
			logger.info("Text is Visible");
		} else {
			
			logger.info("Text is not visibile");
		}
	}

	@Then("Admin\\/User\\/Staff see all paginator buttons are Disabled")
	public void admin_user_staff_see_all_paginator_buttons_are_disabled() {
	    
		
	}

}
