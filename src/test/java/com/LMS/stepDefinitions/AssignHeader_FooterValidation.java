package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.AssignmentPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;


public class AssignHeader_FooterValidation  {

	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
		ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	AssignmentPage APage = new AssignmentPage(FeatureHelper.getDriver());
	
	@Given("Admin\\/User\\/Staff is on one page after Login for Assignment")
	public void admin_user_staff_is_on_one_page_after_login_for_assignment() {
		String titleOfProgram = APage.getAssignmentPageTitle();
        String title = "Manage Assignment";
		Assert.assertEquals(title, titleOfProgram);    
	}
		
	@When("Admin\\/User\\/Staff clicks the Assignment link")
	public void admin_user_staff_clicks_the_assignment_link() {
	    APage.clickAssignment();
	}

	@Then("Admin\\/User\\/Staff should see the Manage assignment page")
	public void admin_user_staff_should_see_the_manage_assignment_page() {
		String title = APage.getAssignmentHeader();
	    if (title == "Manage Asignment")
	    {
	    	assertEquals("Manage Assignment", title);
			logger.info("Admin\\\\/User\\\\/Staffis on the Manage Assignment Page");
	    }
		else {
	        logger.info("Admin\\\\/User\\\\/Staff is not in Manage Assignment Page");
		}
	}
	
	@Then("Admin\\/User\\/Staff see AssignmentHeader text as {string}")
	public void admin_user_staff_see_assignment_header_text_as(String string) {
		String AHeader =APage.getAssignmentHeader();
	    if (AHeader == "Manage Batch")
	    {
	    	assertEquals("Manage Batch", AHeader);
			logger.info("Admin\\\\/User\\\\/Staff see the Header text as 'Manage Assignment'");
	    }
		else {
	        logger.info("Admin\\\\/User\\\\/Staff is not viewing the Header text ' Manage Assignment'");
	}
	}

	
	@Then("Admin\\/User\\/Staff see AssignmentFooter text as {string}")
	public void admin_user_staff_see_assignment_footer_text_as(String string) {
		String AFooter = APage.getAssignmentFooter();
	    if (AFooter == "In total there are ")
	    {
	    	assertEquals("In total there are 3 Assignments", AFooter);
			logger.info("Admin\\\\/User\\\\/Staff see the Footer text as 'In total there are 3 Assignments' ");
	    }
		else {
	        logger.info("Admin\\\\/User\\\\/Staff is not viewing Footer text as 'In total there are 3 Assignments'");
		}
	} 
	}

	
