package com.LMS.stepDefinitions;

import com.LMS.base.BaseClass;
import com.LMS.pageObjects.UserDropDownFunctionality;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDropDown extends BaseClass{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	UserDropDownFunctionality dropDown = new UserDropDownFunctionality(driver);
	
	@When("Admin\\/User\\/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {
		
		dropDown.verifyStateDropDownIcon();
		logger.info("State DropDown Button is clicked");
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {
	    
		dropDown.verifyStateDropDownSelect();
		logger.info("Selected from State Drop Down Button");
	}

	@Given("Admin\\/User\\/Staff is on User details window")
	public void admin_user_staff_is_on_user_details_window() {
	    
		if(dropDown.verifyUserDetailsHeading()) {
			logger.info("User is on User details window");
		}
		else {
			logger.info("User is not in User details window");
		}
	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for User Role")
	public void admin_user_staff_clicks_the_drop_down_icon_for_user_role() {
	    
		dropDown.verifyUserRoleDropDown();
		logger.info("User Role DropDown is clicked");
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_user_role() {
	    
		dropDown.VerifyuserRoleDropDownSelect();
		logger.info("Selected from User Role Drop Down Button");
	}

	
}
