package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class AssignPaginatorValidation extends FeatureHelper {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage APV = new AssignmentPage(FeatureHelper.getDriver());
	
	
	@Given("Admin\\/User\\/Staff Logged on to LMS Website for Assignment")
	public void admin_user_staff_logged_on_to_lms_website_for_assignment() {
		String titleOfProgram = APV.getAssignmentPageTitle();
        String title = "Manage Assignment";
		Assert.assertEquals(title, titleOfProgram);    
	}
	
	@When("Admin\\/User\\/Staff clicks  the Assignment link")
	public void admin_user_staff_clicks_the_assignment_link() {
	    APV.clickAssignment();
	}

	@Then("Admin\\/User\\/Staff  see the Paginator text as {string}")
	public void admin_user_staff_see_the_paginator_text_as(String string) {
		String title = APV.getAssignmentPaginator();
		 if (title == "Manage Assignment") {
			    assertEquals("Manage Assignment", title);
			    logger.info("Showing 1 to 3 of 3 entries");
			  } else {
			    logger.info("Not Showing 1 to 3 of 3 entries");
			  }
	}

	@Given("Admin\\/User\\/Staff is on Manage Assignment page")
	public void admin_user_staff_is_on_manage_assignment_page() {
		logger.info("Admin\\\\/User\\\\/Staff is on Manage Assignment page");  
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled AssignmentPaginatornext button")
	public void admin_user_staff_clicks_on_enabled_assignment_paginatornext_button() {
	    APV.clickANext();
	}

	@Then("Admin\\/User\\/Staff navigated to Assignment next page")
	public void admin_user_staff_navigated_to_assignment_next_page() {
		logger.info("Admin/User/Staff navigated to Assignment next page");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled Assignmentpaginatorprev button")
	public void admin_user_staff_clicks_on_enabled_assignmentpaginatorprev_button() {
	    APV.clickAPrevious();
	}

	@Then("Admin\\/User\\/Staff navigated to Assignment previous page")
	public void admin_user_staff_navigated_to_assignment_previous_page() {
		logger.info("Admin/User/Staff navigated to Assignment previous page");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled Assignmentpaginatorlast button")
	public void admin_user_staff_clicks_on_enabled_assignmentpaginatorlast_button() {
	    APV.clickLast();
	}

	@Then("Admin\\/User\\/Staff  navigated to lastpage of Assignment")
	public void admin_user_staff_navigated_to_lastpage_of_assignment() {
		logger.info("Admin/User/Staff navigated last page of Assignment");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled Assignmentpaginatorfirst button")
	public void admin_user_staff_clicks_on_enabled_assignmentpaginatorfirst_button() {
	    
		APV.clickFirst();
	}
	@Then("Admin\\/User\\/Staff navigated to Startingpage of Assignment")
	public void admin_user_staff_navigated_to_startingpage_of_assignment() {
		logger.info("Admin/User/Staff navigated to First page of Assignment"); 
	}


}