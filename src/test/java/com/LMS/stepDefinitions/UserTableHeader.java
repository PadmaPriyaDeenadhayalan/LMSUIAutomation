package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTableHeader extends FeatureHelper {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	User table = new User(FeatureHelper.getDriver());

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user() {

		String title = table.getManageUserPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}
	}

	@Then("Admin\\/User\\/Staff should see the table header as Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon, Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void admin_user_staff_should_see_the_table_header_as_empty_checkbox_icon_id_with_sort_icon_name_with_sort_icon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {

		table.verifyid();
		table.verifyidSortIcon();
		table.verifyname();
		table.verifynameSortIcon();
		table.verifyEmailAddress();
		table.verifyEmailAddressSortIcon();
		table.verifyContactNumber();
		table.verifyContactNumberSortIcon();
		table.verifyBatch();
		table.verifyBatchSortIcon();
		table.verifySkill();
		table.verifySkillSortIcon();
		table.verifyEdit();
		table.verifyDelete();

		logger.info("Pagination Control is displayed");
	}

	@When("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {

		table.clickBatchSortIcon();
		table.clickContactNumberSortIcon();
		table.clickEmailAddressSortIcon();
		table.clickIdSortIcon();
		table.clickNameSortIcon();
		table.clickSkillSortIcon();

		logger.info("Clicking on Sort Icons");
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {

		table.verifyTableRows();
	logger.info("Table Rows Sorted in Ascending Order");
	}

	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {

		table.clickCheckBoxIcon();
		logger.info("Clicking on checkBox Icon");
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {

		table.verifyAllCheckBoxes();
		logger.info("verifying all the checkboxes are clicked");
	}

	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {

		table.clickCheckBoxIcon();
		logger.info("Check Boxes are unchecked");
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
		{
			table.verifyAllUnCheckedBoxes();
			logger.info("verifying all the checkboxes are unchecked");

		}
	}
}
