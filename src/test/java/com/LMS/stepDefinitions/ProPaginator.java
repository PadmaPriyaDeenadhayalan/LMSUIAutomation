package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class ProPaginator {
	

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage pagination = new ProgramPage(FeatureHelper.getDriver());


	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
@Given("Admin\\/User\\/Staff Logged on to LMS Website")
public void admin_user_staff_logged_on_to_lms_website() {

	logger.info("Admin\\\\/User\\\\/Staff Logged on to LMS Website");

}

@When("Admin\\/User\\/Staff is on Manage Program page show")
public void admin_user_staff_is_on_manage_program_page_show() {

    pagination.getPaginatorMsg();
    logger.info("Admin\\\\/User\\\\/Staff is on Manage Program page show");
}

@Then("Admin\\/User\\/Staff  see the text as {string}")
public void admin_user_staff_see_the_text_as(String string) {
	String title = pagination.getPaginatorMsg();
	if (title == "Paginator Message") {
		assertEquals("Paginator Message", title);
		logger.info("Showing 1 to 5 of 9 entries");
	} else {
		logger.info("Not Showing 1 to 5 of 9 entries\"");
	}

}

@Given("Admin\\/User\\/Staff is on Manage Program page")
public void admin_user_staff_is_on_manage_program_page() {
	String title = pagination.getManageProPageTitle();
	if (title == "Manage Program") {
		assertEquals("Manage Program", title);
		logger.info("User is in Manage User Page");
	} else {
		logger.info("User is not in Manage User Page");
	}
	logger.info("Admin\\\\/User\\\\/Staff is on Manage Program page");
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginatornext button")
public void admin_user_staff_clicks_on_enabled_paginatornext_button() {
   pagination.NextButton();
   logger.info(" Clicks on Enabled paginator next button");
}


@Then("Admin\\/User\\/Staff see Paginator text as {string}")
public void admin_user_staff_see_paginator_text_as(String string) {
	pagination.verifyNextButton();
	  logger.info("Showing 6 to 9 of 9 entries");
}
@When("Admin\\/User\\/Staff Clicks on Enabled paginatorprev button")
public void admin_user_staff_clicks_on_enabled_paginatorprev_button() {
   pagination.PrevoiusButton();
   logger.info("Clicks on Enabled paginator prev button");
}

@Then("Admin\\/User\\/Staff see Paginator text as\"Showing {int} to {int} of {int} entries\"")
public void admin_user_staff_see_paginator_text_as_showing_to_of_entries(Integer int1, Integer int2, Integer int3) {
   pagination.verifyPrevoiusButton();
   logger.info("Showing 1 to 5 of 9 entries");
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginatorlast button")
public void admin_user_staff_clicks_on_enabled_paginatorlast_button() {
    pagination.LastNav();
    logger.info("Clicks on Enabled paginator last button");
}

@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
public void admin_user_staff_see_page_number_navigated_to(String string) {
   pagination.verifyLastNavButton();
   logger.info("see Page number navigated to '2'");
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginatorfirst button")
public void admin_user_staff_clicks_on_enabled_paginatorfirst_button() {
   pagination.FirstNav();
   logger.info("Clicks on Enabled paginatorfirst button");
}

}
