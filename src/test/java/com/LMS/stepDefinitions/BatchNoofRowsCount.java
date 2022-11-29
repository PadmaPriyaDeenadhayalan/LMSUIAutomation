package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchNoofRowsCount {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage CountRow = new BatchPage(FeatureHelper.getDriver());
	
	@When("Admin\\/User\\/Staff counts number of rows in a table")
	public void admin_user_staff_counts_number_of_rows_in_a_table() {
		logger.info("Admin\\\\/User\\\\/Staff is on Manage Program page for noofrows");
 
	}

	@Then("Admin\\/User\\/Staff get the result for count the number of rows in a tableas'{int}'")
	public void admin_user_staff_get_the_result_for_count_the_number_of_rows_in_a_tableas(Integer int1) {
		 
		 logger.info(CountRow.getrows());
	}
}
