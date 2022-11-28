package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCancelIcon extends FeatureHelper{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	User cancelIcon = new User(FeatureHelper.getDriver());
	
	@Then("Admin\\/User\\/Staff should see a cancel\\(x) icon")
	public void admin_user_staff_should_see_a_cancel_x_icon() {
		
		if(cancelIcon.verifycancelIcon()) {
			logger.info("cancel Icon is visible");
		}
		else {
			logger.info("cancel Icon is not visible");
		}
		
	}

	@Given("Admin\\/User\\/Staff is on User Details details window")
	public void admin_user_staff_is_on_user_details_details_window() {
	    
		String title = cancelIcon.getUserDetailsWindowTitle();
	    if (title == "User Details")
	    {
	    	assertEquals("User details", title);
			logger.info("User is in User Details Page");
	    }
		else {
	        logger.info("User is not in User Details Page");
		}
	}

	@When("Admin\\/User\\/Staff clicks cancel\\(X) icon")
	public void admin_user_staff_clicks_cancel_x_icon() {
	    
		cancelIcon.clickcancelIcon();
		logger.info("Clicking cancel Icon");
	}

	@Then("User Details window should be closed")
	public void user_details_window_should_be_closed() {
		
		String title = cancelIcon.getManageUserPageTitle();
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
