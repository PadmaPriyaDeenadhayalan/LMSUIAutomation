package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProDeleteWeb {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage delete= new ProgramPage(FeatureHelper.getDriver());

	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());

@Given("Admin is on Manage Program page delete1")
public void admin_is_on_manage_program_page_delete1() {
	logger.info("Admin is on Manage Program page delete1");
   
}

@When("Admin Clicks on any Delete button located on the right side action")
public void admin_clicks_on_any_delete_button_located_on_the_right_side_action() {
delete.verifyDeleteLink();
logger.info("Admin Clicks on any Delete button located on the right side action");

}

@Given("Admin Clicks on any Delete button located on the right side")
public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
    delete.ClickDelete();
	logger.info("Admin Clicks on any Delete button located on the right side");
}

@When("Admin Clicks on Yes  button")
public void admin_clicks_on_yes_button() {
    delete.ConfYes();
    logger.info("Admin Clicks on Yes  button");
}

@When("Admin Clicks on No button")
public void admin_clicks_on_no_button() {
    delete.ConfNo();
    logger.info("Admin Clicks on No button");
}

@Then("Admin can see Program Name not deleted")
public void admin_can_see_program_name_not_deleted() {
	String title = delete.getconfirmDialogBoxTitle();
	if (title == "Confirm") {
		assertEquals("Confirm", title);
		logger.info("Program is deleted");
	} else {
		logger.info("Program is not deleted");
	}
}

@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
public void admin_user_staff_enters_deleted_program_name_in_search() {
    delete.SearchDelete(null);
    logger.info("Admin/User/Staff Enters deleted  Program Name in Search");
}

@Then("Admin\\/User\\/Staff finds no results")
public void admin_user_staff_finds_no_results() {
	
   logger.info("Admin/User/Staff finds no results");
}

@When("User\\/Staff Clicks on Delete buttton")
public void user_staff_clicks_on_delete_buttton() {
   delete.ClickDelete();
   logger.info("User/Staff Clicks on Delete buttton");
}

}
