package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AssignDescendingOrderFn  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage ADFn = new AssignmentPage(FeatureHelper.getDriver());
	
	
	@When("Admin\\/User\\/Staff Clicks on  Assignment Name Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_descending_arrow() {
	  ADFn.clicktADescendingAName();
	}

	@Then("Admin\\/User\\/Staff view the Assignment Names are displayed in Descending order")
	public void admin_user_staff_view_the_assignment_names_are_displayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Decending order of  Assignment Name from 'Z' to 'A'");
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_descending_arrow() {
		ADFn.clicktADescendingADescription();
	}

	@Then("Admin\\/User\\/Staff view the Assignment Descriptions are displayed in Descending order")
	public void admin_user_staff_view_the_assignment_descriptions_are_displayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Descending order of Assignment Description from  'Z' to 'A'");
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Duedate Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_duedate_descending_arrow() {
		ADFn.clicktADescendingADuedate();
	    
	}

	@Then("Admin\\/User\\/Staff view the Assignment Duedates are displayed in Descending order")
	public void admin_user_staff_view_the_assignment_duedates_are_displayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Assignment Duedate");
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending  Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
		ADFn.clicktADescendingAGrades();
	}

	@Then("Admin\\/User\\/Staff view the Assignment Grades are displayed in Descending order")
	public void admin_user_staff_view_the_assignment_grades_are_displayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on Assignment Grades grom low to high ");
	}

	
}
