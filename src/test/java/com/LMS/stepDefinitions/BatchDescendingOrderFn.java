package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchDescendingOrderFn  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage DescendingFn = new BatchPage(FeatureHelper.getDriver());
	
	@When("Admin\\/User\\/Staff Clicks on BatchNameDescending Arrow")
	public void admin_user_staff_clicks_on_batch_name_descending_arrow() {
	    DescendingFn.clicktDescendingBName();
	}

	@Then("Admin\\/User\\/Staff see the BatchNamedisplayed in Descending order")
	public void admin_user_staff_see_the_batch_namedisplayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Descending order of Batch Name from 'A' to 'Z'");
	}

	@When("Admin\\/User\\/Staff Clicks on BatchDescriptionDescending Arrow")
	public void admin_user_staff_clicks_on_batch_description_descending_arrow() {
		DescendingFn.clicktAscendingBDescription();
	}

	@Then("Admin\\/User\\/Staff see the BatchDescriptiondisplayedinDescending order")
	public void admin_user_staff_see_the_batch_descriptiondisplayedin_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Descending order of Batch Description from  'A' to 'Z'");
	}

	@When("Admin\\/User\\/Staff Clicks on BatchStatusDescending Arrow")
	public void admin_user_staff_clicks_on_batch_status_descending_arrow() {
		DescendingFn.clicktDescendingBstatus();
	}

	@Then("Admin\\/User\\/Staff see the BatchStatusdisplayed in Descending order")
	public void admin_user_staff_see_the_batch_statusdisplayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the Descending order of status ");  
	}

	@When("Admin\\/User\\/Staff Clicks on NoOfClassessDescending Arrow")
	public void admin_user_staff_clicks_on_no_of_classess_descending_arrow() {
		DescendingFn.clicktDescendingNoOfClass();
	}

	@Then("Admin\\/User\\/Staff see the NoOfClassesdisplayed in Descending order")
	public void admin_user_staff_see_the_no_of_classesdisplayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the no of class count from high to Low ");  
	}

	@When("Admin\\/User\\/Staff Clicks on ProgramNameDescending  Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
		DescendingFn.clicktDescendingProName();
	}

	@Then("Admin\\/User\\/Staff see the ProgramNamedisplayed in Descending order")
	public void admin_user_staff_see_the_program_namedisplayed_in_descending_order() {
		logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the ProgramName  from 'A' to 'Z' "); 
	}

}
