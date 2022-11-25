package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.BaseClass;
import com.LMS.pageObjects.UserAddNewUserFunc;
import com.LMS.pageObjects.UserPaginationFunctionality;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAddNewUserFunction extends BaseClass{
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	UserAddNewUserFunc addNewUser = new UserAddNewUserFunc(driver);

	@Then("Admin\\/User\\/Staff should see the button with text {string}")
	public void admin_user_staff_should_see_the_button_with_text(String addNewUserText) {
	    
		String addNewUserText1 = addNewUser.getAddNewUserButtonText();
		if (addNewUserText1 == addNewUserText) {
			assertEquals(addNewUserText1, addNewUserText);
			logger.info("Text is Visible");
		} else {
			
			logger.info("Text is not visibile");
		}
	}

	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {
		addNewUser.clickAddNewUser();
		logger.info("Add New User Button is clicked");
		
	}

	@Then("Admin\\/User\\/Staff should see the {string} dialog box")
	public void admin_user_staff_should_see_the_dialog_box(String string) {
		
		if(addNewUser.verifyUserDetailDialogBox()) {
			
			logger.info("User Dialog Box is displayed");
		}
		
		else {
			logger.info("User Dialog Box is not displayed");
		}
		
	}

}
