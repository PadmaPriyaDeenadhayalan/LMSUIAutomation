package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.Attendance;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AttendanceCheckboxPresentAbsent {
	public static final Logger logger = LogManager.getLogger(AttendanceCheckboxPresentAbsent.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	Attendance attendance = new Attendance(FeatureHelper.getDriver());
	
	@When("Admin\\/User\\/Staff Clicks on Checkbox")
	public void admin_user_staff_clicks_on_checkbox() {
		attendance.clickCheckBoxButton();
		logger.info("clicking on CheckBox button");
		
	}

	@Then("Admin\\/User\\/Staff  see list of Users in that Program")
	public void admin_user_staff_see_list_of_users_in_that_program() {
		if(attendance.verifyAllUsers()) {
			logger.info("All users are displayed");
		}
		else {
			logger.info("All users are not displayed");
		}
		
		
	}

	@When("Admin\\/User\\/Staff  Clicks on Present")
	public void admin_user_staff_clicks_on_present() {
		
		attendance.clickPresentButton();
		logger.info("clicking on present button");
		
	}

	@Then("Admin\\/User\\/Staff  see the list of  User Name who are Present")
	public void admin_user_staff_see_the_list_of_user_name_who_are_present() {
	    
		if(attendance.verifyPresentUsers()) {
			logger.info("Present users are displayed");
		}
		else {
			logger.info("Present users are not displayed");
		}
	}

	@When("Admin\\/User\\/Staff  Clicks on Absent")
	public void admin_user_staff_clicks_on_absent() {
	    
		attendance.clickAbsentButton();
		logger.info("clicking on absent button");
	}

	@Then("Admin\\/User\\/Staff  see the list of  User Name who are Absent")
	public void admin_user_staff_see_the_list_of_user_name_who_are_absent() {
	    
		if(attendance.verifyAbsentUsers()) {
			logger.info("Absent users are displayed");
		}
		else {
			logger.info("Absent users are not displayed");
		}
	}

}
