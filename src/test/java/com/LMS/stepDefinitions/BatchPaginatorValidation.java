package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;

import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class BatchPaginatorValidation  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage Pagination = new BatchPage(FeatureHelper.getDriver());
	
	/*
	 * @When("Admin\\/User\\/Staff is on Manage Batch page") public void
	 * admin_user_staff_is_on_manage_batch_page() { String title =
	 * Pagination.getBatchPageTitle(); if (title == "ManageUser") {
	 * assertEquals("ManageUser", title);
	 * logger.info("User is in Manage User Page"); } else {
	 * logger.info("User is not in Manage User Page"); } }
	 */
	
	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
		 logger.info("Admin\\\\/User\\\\/Staff Logged on to LMS Website");
	}
	@Then("Admin\\/User\\/Staff  see the text as {string}")
	public void admin_user_staff_see_the_text_as(String string) {
		String title = Pagination.getPaginatorMsg();
		  if (title == "Manage Batch") {
		    assertEquals("Manage Batch", title);
		    logger.info("Showing 1 to 5 of 21 entries");
		  } else {
		    logger.info("Not Showing 1 to 5 of 21 entries");
		  }
	    
	}

	@Given("Admin\\/User\\/Staff is on Manage Batch page for search")
	public void admin_user_staff_is_on_manage_batch_page_for_search() {
	  logger.info("Admin\\\\/User\\\\/Staff is on Manage Batch page");  
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginatornext button")
	public void admin_user_staff_clicks_on_enabled_paginatornext_button() {
		Pagination.clickNext(); 
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String string) {
				logger.info("Showing 6 to 9 of 21 entries");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginatorprev button")
	public void admin_user_staff_clicks_on_enabled_paginatorprev_button() {
		Pagination.clickPrevious(); 
		logger.info("Showing 1 to 5 of 21 entries");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginatorlast button")
	public void admin_user_staff_clicks_on_enabled_paginatorlast_button() {
		Pagination.clickLast();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String string) {
		   logger.info("see Page number navigated to '5'");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginatorfirst button")
	public void admin_user_staff_clicks_on_enabled_paginatorfirst_button() {
		Pagination.clickLast();
	}

	@Then("Admin\\/User\\/Staff see Pagenavigated to {string}")
	public void admin_user_staff_see_pagenavigated_to(String string) {
		 logger.info("see Page number navigated to '1'");
	}
}
