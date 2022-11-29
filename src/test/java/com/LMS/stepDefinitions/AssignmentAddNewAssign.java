package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentAddNewAssign {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage AAF = new AssignmentPage(FeatureHelper.getDriver());
	
	
	@Given("Staff is on Manage Assignment page")
	public void staff_is_on_manage_assignment_page() {
		String titleOfProgram = AAF.getAssignmentPageTitle();
        String title = "Manage Assignment";
		Assert.assertEquals(title, titleOfProgram);    
	}
	
	@When("Staff Clicks on   + A New Assignment button  for Validation")
	public void staff_clicks_on_a_new_assignment_button_for_validation() {
	    AAF.clickAssignment();
	}

	@When("Staff enters AssignmentName as {string}  and AssignmentDescription as {string} and AssignmentDuedate as {string} and AssignmentGrade as {string}")
	public void staff_enters_assignment_name_as_and_assignment_description_as_and_assignment_duedate_as_and_assignment_grade_as(String string, String string2, String string3, String string4) {
	    AAF.setAssignmentName(null);
	    AAF.setADescription(null);
	    AAF.setADuedate(null);
	    AAF.setAGrade(null);
	    
	}

	@When("Staff Clicks on Assignment Save button")
	public void staff_clicks_on_assignment_save_button() {
		AAF.clickAsave();
	}

	@Then("Staff see Error  Status message {string} on the Manage Assignment Page")
	public void staff_see_error_status_message_on_the_manage_assignment_page(String string) {
		String ActualStatusMsg = "All Fields required";
		String StatusMsg = AAF.getASuggestionBox();
		if (ActualStatusMsg.equalsIgnoreCase( StatusMsg)) {
logger.info(AAF.getASuggestionBox());
		}else 
	logger.info("New Assignment is added");		
		}
	
	}

