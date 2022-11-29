package com.LMS.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProAsecending {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage order= new ProgramPage(FeatureHelper.getDriver());

	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		order.AscProName();
		logger.info(" Clicks on Program Name Ascending Arrow");
	   
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
	   logger.info("The Program Name displayed in Ascending order");
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	public void admin_user_staff_clicks_on_program_description_ascending_arrow() {
	   order.AscProDes();
	   logger.info("Clicks on Program Description Ascending Arrow");
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
	public void admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
	    logger.info("The Program Description displayed in Ascending order");
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
	public void admin_user_staff_clicks_on_program_status_ascending_arrow() {
	   order.AscProStatus();
	   logger.info("Clicks on Program Status Ascending Arrow");
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
	public void admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
	    logger.info("the Program Status displayed in Ascending order");
	}

}
