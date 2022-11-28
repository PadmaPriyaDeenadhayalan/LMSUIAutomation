package com.LMS.stepDefinitions;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetailsWindow extends FeatureHelper{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	User user = new User(FeatureHelper.getDriver());
	
	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
		
		user.clickAddNewUserButton();
		logger.info("clicking Add New user Button");
	}

	@Then("Admin\\/User\\/Staff should see User Details window with text as User Details")
	public void admin_user_staff_should_see_user_details_window_with_text_as_user_details() {
	    
		if(user.verifyUserDetailsHeading()) {
			logger.info("User Details window is displayed");
		}
		else {
			logger.info("User Details window is not displayed");
		}
	}
}
