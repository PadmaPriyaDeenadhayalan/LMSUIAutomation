package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProEdit {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage Edit= new ProgramPage(FeatureHelper.getDriver());
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());

@When("Admin Clicks on Edit buttton")
public void admin_clicks_on_edit_buttton() {
   Edit.ClickEdit();
   logger.info("Admin Clicks on Edit buttton");
}

@Given("Admin Clicks on {string} button")
public void admin_clicks_on_button(String string) {
   
    logger.info("Admin Clicks on Edit button");
}

@When("Admin Clicks on Save Button after updating Name")
public void admin_clicks_on_save_button_after_updating_name() {
	 Edit.Savebutton();
	 logger.info("Admin Clicks on Save Button after updating Name");
}

@When("Admin  Clicks on Save Button after updating  Description")
public void admin_clicks_on_save_button_after_updating_description() {
	Edit.Savebutton();
	logger.info("Admin  Clicks on Save Button after updating  Descriptio");
}

@Then("Admin see Success message\"Updated Description\"")
public void admin_see_success_message_updated_description() {
   Edit.getSuccessBox();
   logger.info("Admin see Success message Updated Description ");
}

@When("Admin  Clicks on Save Button after Changing  status")
public void admin_clicks_on_save_button_after_changing_status() {
   Edit.Savebutton();
   logger.info("Admin  Clicks on Save Button after Changing  status");
}

@Given("Admin  Clicks on {string} button record edit")
public void admin_clicks_on_button_record_edit(String string) {
	Edit.ClickEdit();
	logger.info("Admin  Clicks on Edit button record edit");
    
}

@Given("User\\/Staff is on Manage Program page for edit")
public void user_staff_is_on_manage_program_page_for_edit() {
	logger.info("User\\\\/Staff is on Manage Program page for edit");
}

@When("User\\/Staff Clicks on Edit buttton")
public void user_staff_clicks_on_edit_buttton() {
	Edit.ClickEdit();
	logger.info("User\\\\/Staff Clicks on Edit buttton");
}

@Then("User\\/Staff see a Error message  {string} aspopup")
public void user_staff_see_a_error_message_aspopup(String string) {
   Edit.getErrorBox();
   logger.info("User\\\\/Staff see a Error message Edit as popup");
}

@Given("Admin\\/User\\/Staff is on Manage Program page edit3")
public void admin_user_staff_is_on_manage_program_page_edit3() {
logger.info("Admin/User/Staff is on Manage Program page edit3");
}

@When("Admin\\/User\\/Staff Enters edited Program Name in Search")
public void admin_user_staff_enters_edited_program_name_in_search() {
	Edit.EnterSearch("");
	logger.info("Admin/User/Staff Enters edited Program Name in Search");
 
}

@Then("Entry for the edited  Program Name is shown")
public void entry_for_the_edited_program_name_is_shown() {
  logger.info("Entry for the edited  Program Name is shown");
}



}
