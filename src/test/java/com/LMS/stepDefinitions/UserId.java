package com.LMS.stepDefinitions;

import com.LMS.base.BaseClass;
import com.LMS.pageObjects.UserIdFunctionality;
import com.LMS.pageObjects.UserSearchIcon;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserId extends BaseClass{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	UserIdFunctionality userId = new UserIdFunctionality(driver);
	
	
	@When("Admin\\/User\\/Staff clicks ID in any row")
	public void admin_user_staff_clicks_id_in_any_row() {
	   
		userId.clickIdLink();
		logger.info("Clicking on Id");
	}

	@Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	public void admin_user_staff_see_dialog_box_displayed_with_user_information() {
	    
		if(userId.verifyUserInfoDialogBox()) {
			
			logger.info("Dialog Box is displayed");
		}
		else {
			logger.info("Dialog Box is not displayed");
			
		}
	}
}
