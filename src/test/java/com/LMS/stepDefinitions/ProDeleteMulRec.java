package com.LMS.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProDeleteMulRec{

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage deleteAll= new ProgramPage(FeatureHelper.getDriver());
	
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
@When("Admin\\/User\\/Staff select Manage Program page")
public void admin_user_staff_select_manage_program_page() {
	
   logger.info("Admin/User/Staff select Manage Program page ");
}

@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {

	if (deleteAll.verifyDeleteButton()) {

		logger.info("Delete button is visible");
		
	} else {
		logger.info("Delete button is not visible");
	}
}

@When("Admin\\/User\\/Staff selects more than one Program Name using checkbox")
public void admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
   deleteAll.clickrowcheck1();
   logger.info("Admin/User/Staff selects more than one Program Name using checkbox");
   
}

@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
	if (deleteAll.verifyDeleteButton()) {

		logger.info("Delete button on the top left hand side as Enabled");
	} else {
		logger.info("Delete button on the top left hand side as not Enabled");
	}
}

@Given("Admin selects more than one Program Name using checkbox")
public void admin_selects_more_than_one_program_name_using_checkbox() {
    logger.info("Admin selects more than one Program Name using checkbox");
}

@When("Admin Clicks on Enabled Delete button on the top left hand side")
public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
   deleteAll.ClickDelete();
   logger.info("Admin Clicks on Enabled Delete button on the top left hand side");
}

@Given("Admin Clicks on Enabled Delete button after selecting  more than one Program Name")
public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
   logger.info("Admin Clicks on Enabled Delete button after selecting  more than one Program Name");
}

@Then("Admin see Success message {string}\"")
public void admin_see_success_message(String string) {
   deleteAll.getSuccessBox();
   logger.info("Program Deleted Succesfully");
}

@Given("Admin\\/User\\/Staff have access and Admin Clicks on Enabled Delete button after selecting  more than one Program Name")
public void admin_user_staff_have_access_and_admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
  logger.info("Admin/User/Staff have access and Admin Clicks on Enabled Delete button after selecting  more than one Program Name");
}

@Then("Admin can see Program Names not deleted")
public void admin_can_see_program_names_not_deleted() {
    logger.info("Admin can see Program Names not deleted");
}

@Given("Admin\\/User\\/Staff is on Manage program page")
public void admin_user_staff_is_on_manage_program_page() {
    logger.info("Admin\\\\/User\\\\/Staff is on Manage program page");
}

@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
public void admin_user_staff_enters_deleted_program_names_in_search() {
	deleteAll.SearchDelete("");
    logger.info("Admin/User/Staff Enters deleted  Program Name in Search");
}

@Given("User\\/Staff selects more than one Program Name using checkbox")
public void user_staff_selects_more_than_one_program_name_using_checkbox() {
	 deleteAll.clickrowcheck1();
	   logger.info("User/Staff selects more than one Program Name using checkbox");
}

@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side")
public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
  
	deleteAll.ClickDelete();
	   logger.info("User/Staff Clicks on Enabled Delete button on the top left hand side");
}

}
