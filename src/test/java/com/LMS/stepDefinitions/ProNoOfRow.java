package com.LMS.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProNoOfRow {
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage NoOfRow= new ProgramPage(FeatureHelper.getDriver());
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	@When("Admin\\/User\\/Staff is on Manage Program page for noofrows")
	public void admin_user_staff_is_on_manage_program_page_for_noofrows() {
	  logger.info("Admin/User/Staff is on Manage Program page for noofrows");
	}

	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {
	   NoOfRow.getrows();
	   logger.info("Admin/User/Staff counts number of rows as {int} in a table");
	}

}
