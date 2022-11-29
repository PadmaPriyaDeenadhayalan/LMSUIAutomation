package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProDescending {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage order= new ProgramPage(FeatureHelper.getDriver());

	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
public void admin_user_staff_clicks_on_program_name_descending_arrow() {
    order.DesProName();
    logger.info("Clicks on Program Name Descending Arrow");
}

@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
	logger.info("the Program Name displayed in Descending order");
}

@When("Admin\\/User\\/Staff Clicks on Program Description Descending  Arrow")
public void admin_user_staff_clicks_on_program_description_descending_arrow() {
   order.DesProDes();
   logger.info("Clicks on Program Description Descending  Arrow");
}

@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending  orderr")
public void admin_user_staff_see_the_program_description_displayed_in_descending_orderr() {
  logger.info("the Program Description displayed in Descending  orderr");
}

@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
public void admin_user_staff_clicks_on_program_status_descending_arrow() {
    order.DesProStatus();
    logger.info("Clicks on Program Status Descending Arrow");
}

@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order")
public void admin_user_staff_see_the_program_status_displayed_in_descending_order() {
   logger.info("the Program Status displayed in Descending order");
}


}
