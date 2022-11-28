package com.LMS.stepDefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.*;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class BatchAscendingOrderFn  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
		String baseurl = config.getApplicationURL();
		BatchPage AscendingFn = new BatchPage(FeatureHelper.getDriver());
	
@When("Admin\\/User\\/Staff Clicks on Batch Name Ascending Arrow")
public void admin_user_staff_clicks_on_batch_name_ascending_arrow() {
	AscendingFn.clicktAscendingBName();
}

@Then("Admin\\/User\\/Staff see the Batch Name displayed in Ascending order")
public void admin_user_staff_see_the_batch_name_displayed_in_ascending_order() {
	logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the ascending order of Batch Name from 'A' to 'Z'");
}

@When("Admin\\/User\\/Staff Clicks on Batch Description Ascending Arrow")
public void admin_user_staff_clicks_on_batch_description_ascending_arrow() {
	AscendingFn.clicktAscendingBDescription();
}

@Then("Admin\\/User\\/Staff see the Batch Description displayed in Ascending order")
public void admin_user_staff_see_the_batch_description_displayed_in_ascending_order() {
	logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the ascending order of Batch Description from  'A' to 'Z'");
}

@When("Admin\\/User\\/Staff Clicks on Batch Status Ascending Arrow")
public void admin_user_staff_clicks_on_batch_status_ascending_arrow() {
	AscendingFn.clicktAscendingBstatus();
}


@Then("Admin\\/User\\/Staff see the Batch Status displayed in Ascending order")
public void admin_user_staff_see_the_batch_status_displayed_in_ascending_order() {
	logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the ascending order of status ");
}

@When("Admin\\/User\\/Staff Clicks on No Of Classess Ascending  Arrow")
public void admin_user_staff_clicks_on_no_of_classess_ascending_arrow() {
	AscendingFn.clicktAscendingNoOfClass();
}

@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Ascending order")
public void admin_user_staff_see_the_no_of_classes_displayed_in_ascending_order() {
	logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the no of class fcount from low to high ");
}

@When("Admin\\/User\\/Staff Clicks on Program Name Aescending  Arrow")
public void admin_user_staff_clicks_on_program_name_aescending_arrow() {
	AscendingFn.clicktAscendingProName();
}

@Then("AAdmin\\/User\\/Staff see the Program Name displayed in Aescending  order")
public void a_admin_user_staff_see_the_program_name_displayed_in_aescending_order() {
	logger.info("Admin\\\\/User\\\\/Staff  view  all the Rows are rearranged based on the ProgramName  from 'A' to 'Z' ");
}
	}
