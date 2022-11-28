package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProSearchBox  {
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage search= new ProgramPage(FeatureHelper.getDriver());
	
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	@Given("Admin\\/User\\/Staff Loggedon to LMS Website")
	public void admin_user_staff_loggedon_to_lms_website() {
		logger.info("Admin\\/User\\/Staff Loggedon to LMS Website");
	    
	}

	@When("Admin\\/User\\/Staff is on Manage Program Page for search")
	public void admin_user_staff_is_on_manage_program_page_for_search() {
		
	   logger.info("Admin/User/Staff is on Manage Program Page for search");
	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {
	   logger.info("Admin/User/Staff see the Search Text box has text as {string}");
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
		search.EnterSearch("Program Name");
		logger.info("Admin/User/Staff enters Program Name to be searched");
	   
	}

	@Then("Entries for the searched Program Name are shown.")
	public void entries_for_the_searched_program_name_are_shown() {
	   logger.info("Entries for the searched Program Name are shown.");
	}

	@When("Admin\\/User\\/Staff enters Program Description to be searched")
	public void admin_user_staff_enters_program_description_to_be_searched() {
		search.EnterSearch("Program Description");
		logger.info("Admin/User/Staff enters Program Description to be searched");
	}

	@Then("Entries for the searched Program Description are shown.")
	public void entries_for_the_searched_program_description_are_shown() {
	    logger.info("Entries for the searched Program Description are shown.");
	}

	@When("Admin\\/User\\/Staff enters Program Status to be searched")
	public void admin_user_staff_enters_program_status_to_be_searched() {
		search.EnterSearch("Program Status");
		logger.info("Admin/User/Staff enters Program Status to be searched");
	}

	@Then("Entries for the searched Program Status are shown.")
	public void entries_for_the_searched_program_status_are_shown() {
	  logger.info("Entries for the searched Program Status are shown.");
	}



}
