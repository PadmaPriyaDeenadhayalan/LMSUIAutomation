package com.LMS.stepDefinitions;

import com.LMS.base.BaseClass;
import com.LMS.pageObjects.UserDetailsWindowBox;
import com.LMS.pageObjects.UserSearchIcon;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetailsWindow extends BaseClass{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	UserDetailsWindowBox userDetails = new UserDetailsWindowBox(driver);
	
	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
		
		userDetails.clickAddNewUserButton();
		logger.info("clicking Add New user Button");
	}

	@Then("Admin\\/User\\/Staff should see User Details window with text as User Details")
	public void admin_user_staff_should_see_user_details_window_with_text_as_user_details() {
	    
		if(userDetails.verifyUserDetailsHeading()) {
			logger.info("User Details window is displayed");
		}
		else {
			logger.info("User Details window is not displayed");
		}
	}
}
