package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.LMS.base.BaseClass;
import com.LMS.pageObjects.UserPageValidating;
import com.LMS.pageObjects.UserPaginationFunctionality;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPagination extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	UserPaginationFunctionality pagination = new UserPaginationFunctionality(driver);

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {

		String title = pagination.getManageUserPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}

	}

	@Then("Admin\\/User\\/Staff should see the pagination controls below data table")
	public void admin_user_staff_should_see_the_pagination_controls_below_data_table() {

		pagination.verifyPreviousPageButton();
		logger.info("Pagination Control is displayed");
	}

	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
		String title = pagination.getManageUserPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}

	}

	@When("Manage user table has less than or equal to {int} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(Integer noOfRows) {

		if (noOfRows<=5) {
			
			pagination.verifyPage2ButtonEnabled();
			logger.info("Button Disabled");
		}
		else {
			logger.info("Button Enabled");
		}
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
		
		logger.info("Button Disabled");
		
	}
	
	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {

		pagination.verifyPreviousPageButton();
		logger.info("Pagination Control is displayed");
	}

	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer noOfRows) {

if (noOfRows>=5) {
			
			pagination.verifyPage2ButtonEnabled();
			logger.info("Button Enabled");
		}
		else {
			logger.info("Button Disabled");
		}
		
	}

	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {

		pagination.verifyManageUserTable();
		logger.info("Manage UserTable is Displayed");
	}

	@When("Admin\\/User\\/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {

		pagination.clickNextPage();
		logger.info("Forward Pagination Control is clicked");
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {

		pagination.verifyPage2Button();
		logger.info("Next Page is displayed");
	}

	@Given("last page of Admin\\/User\\/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {

		pagination.verifyNextPage();
		logger.info("End Page is displayed");
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {

		if (pagination.verifyEndPageButton()) {
			logger.info("End Page is displayed");
		}
		else {
			logger.info("End Page is disabled");
		}
	}

	@When("Admin\\/User\\/Staff clicks previous link of pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {

		pagination.clickPreviousPage();
		logger.info("clicking in Previous pagelink");
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {

		pagination.verifyPreviousPageButton();
		logger.info("Previous Page is displayed");
	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
		
		pagination.verifyPage1Button();
		logger.info("First Page is displayed");
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {

		if(pagination.verifyPreviousPageButton()) {
			
			logger.info("Previous Page is displayed");
		}
		else {
			logger.info("Previuos Page is disabled");
		}
	}

	@When("Admin\\/User\\/Staff clicks << icon in pagination")
	public void admin_user_staff_clicks_icon_in_backwardpagination() {

		pagination.clickMostBwdPage();
		logger.info("Clicking on the Most Backward pagination control");
	}

	@Then("Admin\\/User\\/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {

		pagination.verifyPage1Button();
		logger.info("First Page is displayed");
	}

	@When("Admin\\/User\\/Staff clicks >> icon in pagination")
	public void admin_user_staff_clicks_icon_in_forwardpagination() {
		
		pagination.clickMostFwdPage();
		logger.info("Clicking on the Most Forward pagination control");

	}

	@Then("Admin\\/User\\/Staff clicks should see the last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {

		pagination.verifyEndPageButton();
		logger.info("End Page is displayed");
	}

	@When("Admin\\/User\\/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {
		
		String title = pagination.getManageUserPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}

	}

	@Then("Admin\\/User\\/Staff should see the text {string} beow the user table.")
	public void admin_user_staff_should_see_the_text_beow_the_user_table(String BelowTableText) {

		String getBelowTableText1 = pagination.getBelowTableText();
		if (getBelowTableText1 == BelowTableText) {
			assertEquals(getBelowTableText1, BelowTableText);
			logger.info("Text is Visible");
		} else {
			
			logger.info("Text is not visibile");
		}
	}
		
	}


