package com.LMS.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.LMS.base.BaseClass;
import com.LMS.pageObjects.UserEditDeleteIconRow;
import com.LMS.pageObjects.UserDelete;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserEditDeleteIconEachRow extends BaseClass{
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	UserEditDeleteIconRow delete = new UserEditDeleteIconRow(driver);

	@Then("Admin\\/User\\/Staff should see the buttons with edit\\/delete icon in each row of Edit\\/Delete column")
	public void admin_user_staff_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_column() {
		
		delete.verifyEditLink();
		delete.verifyDeleteLink();
		logger.info("Verifying Edit and Delete Links");
	}

	@When("Admin\\/User\\/Staff clicks delete button")
	public void admin_user_staff_clicks_delete_button() {
	    
		delete.clickDeleteButton();
		logger.info("Clicking on Delete Button");
	}

	@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete \\(selected user name) ? , button with text No , the button with text yes and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete_selected_user_name_button_with_text_no_the_button_with_text_yes_and_close_x_icon() {
	    
		if (delete.verifyConfirmDialogBox()) {

			logger.info("Confirm Dialog Box is visible");
		} else {
			logger.info("Confirm Dialog Box is not visible");
		}
	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
		delete.clickEditButton();
		logger.info("CLicking on Edit Button");
	}

	@Then("User Details dialog box should be displayed for editing")
	public void user_details_dialog_box_should_be_displayed_for_editing() {
	    
		if (delete.verifyUserDetailsDialogBox()) {

			logger.info("User Details Dialog Box is visible");
		} else {
			logger.info("User Details Dialog Box  is not visible");
		}
		
	}


	
}
