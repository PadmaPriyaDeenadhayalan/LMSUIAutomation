package com.LMS.stepDefinitions;


import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignAddNewAssignmentValidation  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage AAddVFn = new AssignmentPage(FeatureHelper.getDriver());
	
	@Then("Staff view New window whose header  as {string}")
	public void staff_view_new_window_whose_header_as(String string) {
		String TableTitle = AAddVFn.getAHeaderTxt();
	    if (TableTitle == "Asignment Detail")
	    {
	    	assertEquals("Assignment Detail", TableTitle);
			logger.info("Staff view the New Popup Window Title as 'Assignment Details'");
	    }
		else {
	        logger.info("Staff is not view the Window Title");
		}
	}

	@Then("Staff Clicks on Cancel button")
	public void staff_clicks_on_cancel_button() {
		AAddVFn.clickACancel();
	}

	@Then("Staff Viewe a Assignment Details window getting closed after cancel the Add function")
	public void staff_viewe_a_assignment_details_window_getting_closed_after_cancel_the_add_function() {
		logger.info("Window is not viewed by Staff");
		}

	@When("Admin\\/User\\/Staff Enters newly added {string} in Search Box")
	public void admin_user_staff_enters_newly_added_in_search_box(String string) {
		AAddVFn.enterAValidSearchBox(null);
	}

	@Then("Admin\\/User\\/Staff view the newly added Assignment Name")
	public void admin_user_staff_view_the_newly_added_assignment_name() {
		logger.info("\"Admin\\\\/User\\\\/Staff  view the newly added Assignment Name");
	}

	@Given("Admin\\/User is on Manage Assignment page")
	public void admin_user_is_on_manage_assignment_page() {
		String titleOfProgram =AAddVFn.getAssignmentHeader();
        String title = "Manage Assignment";
		Assert.assertEquals(title, titleOfProgram);   
	}

	@When("Admin\\/User Clicks on  {string} button")
	public void admin_user_clicks_on_button(String string) {
		AAddVFn.clicktAddNewAssignment();
	}

	@Then("Admin\\/User get a Error message {string} in the SuggestionBox of MAnage Assignment Page")
	public void admin_user_get_a_error_message_in_the_suggestion_box_of_m_anage_assignment_page(String string) {
			
			String ActualStatusMsg = "Only Staff have this Access";
			String StatusMsg = AAddVFn.getASuggestionBox();
			if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
	logger.info(AAddVFn.getASuggestionBox());
			}
				
	}

	@When("Staff Clicks on  Grade Manage on Assignment Page")
	public void staff_clicks_on_grade_manage_on_assignment_page() {
		AAddVFn.clickManageEdit();
	}

	@Then("Staff view New Grade window whose header  is {string}")
	public void staff_view_new_grade_window_whose_header_is(String string) {
		String titleOfProgram =AAddVFn.getAssignmentHeader();
        String title = "Manage Assignment";
		Assert.assertEquals(title, titleOfProgram);  
	
	}
	@When("Staff Clicks on   + A New Assignment button")
	public void staff_clicks_on_a_new_assignment_button() {
	    AAddVFn.clicktAddNewAssignment();
	}
}
