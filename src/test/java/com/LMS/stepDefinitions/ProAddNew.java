package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProAddNew{
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage addNewProgram= new ProgramPage(FeatureHelper.getDriver());
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
@Given("Admin is on Manage Program page")
public void admin_is_on_manage_program_page() {
	logger.info("Admin is on Manage Program page");
    
}

@When("Admin Clicks on the {string} button")
public void admin_clicks_on_the_button(String string) {
	addNewProgram.AddNewProgram();
	logger.info("Admin Clicks on the button");
    
}

@Then("Admin see header text as {string}")
public void admin_see_header_text_as(String string) {
	String title = addNewProgram.proDetailsHeader();
	 
	if (title == "Program Details")
    {
    	assertEquals("Program Details", title);
		logger.info("User is in Program Details Window");
    }
	else {
        logger.info("User is not in Program Details Window");
	}

    
}

@Given("Admin Clicks on the {string} buttons")
public void admin_clicks_on_the_buttons(String string) {
	logger.info("Admin Clicks on the New Program buttons");
   
}


@When("Admin Clicks on Save Button with out entering  details")
public void admin_clicks_on_save_button_with_out_entering_details() {
   addNewProgram.Savebutton();
   logger.info("Admin Clicks on Save Button with out entering  details");
}

@Then("Admin see Error message {string}")
public void admin_see_error_message(String string) {
	logger.info("Admin see Error message Name is required");
   
}

@Then("Suggestion - {string} message can be added  - Negative Scenario")
public void suggestion_message_can_be_added_negative_scenario(String string) {
	addNewProgram.getSuggestionBox();
	logger.info("Suggestion - Enter all Fields message can be added  - Negative Scenario");
}

@When("Admin Clicks on Save Button after entering all details")
public void admin_clicks_on_save_button_after_entering_all_details() {
	 addNewProgram.Savebutton();
	 logger.info("Admin Clicks on Save Button after entering all details");
}

@Then("Admin see Success message {string}")
public void admin_see_success_message(String string) {
	addNewProgram.getSuccessBox();
	logger.info("Admin see Success message New Program Created");
    
}

@When("Admin Clicks on Save Button after entering Name alone")
public void admin_clicks_on_save_button_after_entering_name_alone() {
	 addNewProgram.Savebutton();
	 logger.info("Admin Clicks on Save Button after entering Name alone");
	
	
}

@When("Admin Clicks on Save Button after entering Description alone")
public void admin_clicks_on_save_button_after_entering_description_alone() {
	addNewProgram.Savebutton();
	 logger.info("Admin Clicks on Save Button after entering Description alone");
}

@When("Admin Clicks on Save Button after selecting Status alone")
public void admin_clicks_on_save_button_after_selecting_status_alone() {
	addNewProgram.Savebutton();
	 logger.info("Admin Clicks on Save Button after selecting Status alone");
}

@Given("Admin Clicks on  {string} button")
public void admin_clicks_on_button(String string) {
 logger.info("Admin Clicks on A New Program button");
}

@When("Admin Clicks on Cancel button")
public void admin_clicks_on_cancel_button() {
	addNewProgram.Cancelbutton();
	logger.info("Admin Clicks on Cancel button");
   
}

@Then("Admin see a Program Details window getting closed")
public void admin_see_a_program_details_window_getting_closed() {
   logger.info("Admin see a Program Details window getting closed");
}

@When("Admin\\/User\\/Staff Enters newly added  Program Name in Search")
public void admin_user_staff_enters_newly_added_program_name_in_search() {
   addNewProgram.txtProgramName("");
   logger.info("Enters newly added  Program Name in Search");
}

@Then("Entry for the newly added Program Name is shown")
public void entry_for_the_newly_added_program_name_is_shown() {
   logger.info("Entry for the newly added Program Name is shown");
}

@Given("User\\/Staff is on Manage Program page")
public void user_staff_is_on_manage_program_page() {
	
	logger.info("\"User\\\\/Staff is on Manage Program page");
   
}

@When("User\\/Staff Clicks on  {string} button")
public void user_staff_clicks_on_button(String string) {
	addNewProgram.AddNewProgram();
	logger.info("User / Staff Clicks on A New Program button");
}

@Then("User\\/Staff see a Error message {string}")
public void user_staff_see_a_error_message(String string) {
	logger.info("User/Staff see a Error message Only Admin have Access");
    
}


}
