package com.LMS.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProCheckbox {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage selectAllCheck= new ProgramPage(FeatureHelper.driver);

	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
@Given("Admin\\/User\\/Staff is on Manage Program page to check checkbox")
public void admin_user_staff_is_on_manage_program_page_to_check_checkbox() {
  logger.info("Admin/User/Staff is on Manage Program page to check checkbox");
}

@When("Admin\\/User\\/Staff Selects First checkbox left to Program Name")
public void admin_user_staff_selects_first_checkbox_left_to_program_name() {
   selectAllCheck.ClickCheckAll();
   logger.info("Selects First checkbox left to Program Name");
}

@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
public void admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected() {
   logger.info(" All the checkboxes in the Program page get selected");
}
}
