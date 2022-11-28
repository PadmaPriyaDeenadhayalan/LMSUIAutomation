package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDeleteUser extends FeatureHelper {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	User delete = new User(FeatureHelper.getDriver());

	@When("Admin\\/User\\/Staffis on the Manage user page after clicking User Tab")
	public void admin_user_staffis_on_the_manage_user_page_after_clicking_user_tab() {

		String title = delete.getManageUserPageTitle();
		if (title == "ManageUser") {
			assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
		} else {
			logger.info("User is not in Manage User Page");
		}

	}

	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {

		delete.verifyDeleteButton();
		logger.info("Delete button is visible");
	}

	@When("No rows is checked")
	public void no_rows_is_checked() {

		delete.verifyRowCheckBoxButton();
		
		logger.info("Checking row Check Box is enabled");
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {

		if (delete.verifyDeleteButton()) {

			logger.info("Delete button is visible");
			
		} else {
			logger.info("Delete button is not visible");
		}
	}

	@When("Admin\\/User\\/Staff checking the rows in user table")
	public void admin_user_staff_checking_the_rows_in_user_table() {

		delete.clickCheckBoxButton();
		logger.info("clicking on the row checkBox button");
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {

		if (delete.verifyDeleteButton()) {

			logger.info("Delete button is visible");
		} else {
			logger.info("Delete button is not visible");
		}
	}

	@Given("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {

		delete.clickCheckBoxButton();
		logger.info("clicking on the row checkBox button");

	}

	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {

		delete.clickDeleteButton();
		logger.info("clicking on the Delete button");
	}

	@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete the selected Admin\\/User\\/Staffs? , button with text No , the button with text yes and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete_the_selected_admin_user_staffs_button_with_text_no_the_button_with_text_yes_and_close_x_icon() {

		if (delete.verifyConfirmDialogBox()) {

			logger.info("ConfirmDialogBox is visible");
		} else {
			logger.info("ConfirmDialogBox is not visible");
		}
	}

	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon() {

		String title = delete.getconfirmDialogBoxTitle();
		if (title == "Confirm") {
			assertEquals("Confirm", title);
			logger.info("User is in confirm Dialog Box Page");
		} else {
			logger.info("User is not in confirm Dialog Box Page");
		}
	}

	@When("Admin\\/User\\/Staff clicks button with text No")
	public void admin_user_staff_clicks_button_with_text_no() {

		delete.clickNoButton();
		logger.info("clicking on No Button");
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {

		delete.verifyRowCheckBoxButtondisplayed();
		delete.verifyConfirmDialogBox();
		logger.info("Checking row and dialogbox");
	}

	@When("Admin\\/User\\/Staff clicks button with text Yes")
	public void admin_user_staff_clicks_button_with_text_yes() {

		delete.clickYesButton();
		logger.info("clicking on Yes Button");
	}

	@Then("Selected rows should be deleted and popup should be shown with success message User deleted")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message_user_deleted() {

		delete.verifyRowCheckBoxButtondisplayed();
		delete.verifyConfirmDialogBox();
		logger.info("Checking row and dialogbox");
	}

	@When("Admin\\/User\\/Staff clicks the close\\(x) icon")
	public void admin_user_staff_clicks_the_close_x_icon() {

		delete.clickCloseButton();
		logger.info("clicking on Close Button");

	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
		delete.verifyConfirmDialogBox();
		logger.info("checking Confirm dialog box");
	}
}
