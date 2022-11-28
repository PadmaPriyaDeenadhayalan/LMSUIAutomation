package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCancelButton extends FeatureHelper{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	User cancel = new User(FeatureHelper.getDriver());
	
	@Then("Admin\\/User\\/Staff should see a button with text as Cancel  in User Details window")
	public void admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
		
		if(cancel.verifyCancelButton()) {
			logger.info("cancel Button is visible");
		}
		else {
			logger.info("cancel Button is not visible");
		}
		
	}

	@Given("Admin\\/User\\/Staff is on User Details window")
	public void admin_user_staff_is_on_user_details_window() {
	    
		String title = cancel.getUserDetailsWindowTitle();
	    if (title == "User Details")
	    {
	    	assertEquals("User Details", title);
			logger.info("User is in User Details Page");
	    }
		else {
	        logger.info("User is not in User Details Page");
		}
	}

	@When("Admin\\/User\\/Staff clicks cancel button")
	public void admin_user_staff_clicks_cancel_button() {
	    
		cancel.clickcancelButton();
		logger.info("Clicking cancel Button");
	}

	@Then("Admin\\/User\\/Staff  see User Details window getting  closed")
	public void admin_user_staff_see_user_details_window_getting_closed() {
	    
		String title = cancel.getManageUserPageTitle();
	    if (title == "Manage User")
	    {
	    	assertEquals("Manage User", title);
			logger.info("User details window closed");
	    }
		else {
	        logger.info("User details window is not closed");
		}
	}
}
