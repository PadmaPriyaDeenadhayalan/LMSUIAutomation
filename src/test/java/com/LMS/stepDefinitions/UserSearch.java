package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSearch extends FeatureHelper{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	User search = new User(FeatureHelper.getDriver());
	
	@Then("Admin\\/User\\/Staff see the Search Text box has text as Search.")
	public void admin_user_staff_see_the_search_text_box_has_text_as_search() {
	    
		search.verifysearchTextBox();
		logger.info("Search text is visible");
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking UserTab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
	    
		String title = search.getManageUserPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}
	}

	@Then("Admin\\/User\\/Staff should see the search input field with search icon and text as\" Search…\"")
	public void admin_user_staff_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
	    
		search.verifysearchTextBox();
		logger.info("Search text is visible");
	}

	@When("Admin\\/User\\/Staff types Name to {string}")
	public void admin_user_staff_types_name_to(String text) {
		
		search.enterValidSearchTextBox(text);
		logger.info("Entering Valid Name in the Search input field");
	}

	@Then("Rows with the {string} should be displayed")
	public void rows_with_the_should_be_displayed(String text) {
		
		search.verifyNameContainsInManageUserList(text);
		logger.info("Verify search text matching with Manager user name list.");
	}

	@When("Admin\\/User\\/Staff types random text in search field which has no matching entry")
	public void admin_user_staff_types_random_text_in_search_field_which_has_no_matching_entry() {
	    
		search.enterInValidSearchTextBox();
		logger.info("Entering Invalid Name in the Search input field");
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
		
		logger.info("Verify no rows displayed in Manager user table.");
		search.verifyNoRowsDisplayed();
	}


}
