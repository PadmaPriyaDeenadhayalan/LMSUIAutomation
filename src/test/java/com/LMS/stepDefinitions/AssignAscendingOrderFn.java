
package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;

import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AssignAscendingOrderFn  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
		ReadConfig config = new ReadConfig();
		String baseurl = config.getApplicationURL();
		AssignmentPage AAFn = new AssignmentPage(FeatureHelper.getDriver());
		
		@When("Admin\\/User\\/Staff Clicks on  Assignment Name Ascending Arrow")
		public void admin_user_staff_clicks_on_assignment_name_ascending_arrow() {
			AAFn.clicktAAscendingAName();
		}

		@Then("Admin\\/User\\/Staff view the Assignment Names are displayed in Ascending order")
		public void admin_user_staff_view_the_assignment_names_are_displayed_in_ascending_order() {
			logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Ascending order of Assignment Name from 'A' to 'Z'");
		}

		@When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
		public void admin_user_staff_clicks_on_assignment_description_ascending_arrow() {
			AAFn.clicktAAscendingADescription();
		}

		@Then("Admin\\/User\\/Staff view the Assignment Descriptions are displayed in Ascending order")
		public void admin_user_staff_view_the_assignment_descriptions_are_displayed_in_ascending_order() {
			logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the ascending order of Assignment Description from  'A' to 'Z'");
		}

		@When("Admin\\/User\\/Staff Clicks on Assignment Duedate Ascending Arrow")
		public void admin_user_staff_clicks_on_assignment_duedate_ascending_arrow() {
			AAFn.clicktAAscendingADuedate();
		}

		@Then("Admin\\/User\\/Staff view the Assignment Duedates are displayed in Ascending order")
		public void admin_user_staff_view_the_assignment_duedates_are_displayed_in_ascending_order() {
			logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Assignment Duedate");
		}

		@When("Admin\\/User\\/Staff Clicks on Assignment Grade Ascending  Arrow")
		public void admin_user_staff_clicks_on_assignment_grade_ascending_arrow() {
			AAFn.clicktAAscendingAGrades();
		}

		@Then("Admin\\/User\\/Staff view the Assignment Grades are displayed in Ascending order")
		public void admin_user_staff_view_the_assignment_grades_are_displayed_in_ascending_order() {
			logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on Assignment Grades grom low to high ");
		}
		
}
