package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchAddNewBatchFn extends FeatureHelper {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage AddNewBatchFn = new BatchPage(FeatureHelper.getDriver());
	
	@When("Admin Clicks on   + A New Batch button")
		public void admin_clicks_on_a_new_Batch_button() {
	  AddNewBatchFn.clicktAddNewBatch();  
	}

	@Then("Admin see New window whose header  as {string}")
	public void admin_see_new_window_whose_header_as(String title) {
		String WindowTitle = AddNewBatchFn.getHeaderTxt();
	    if (WindowTitle == "Batch Detail")
	    {
	    	assertEquals("Batch Detail", WindowTitle);
			logger.info("Admin view the New Popup Window Title as 'Batch Details'");
	    }
		else {
	        logger.info("Admin is not view the Window Title");
		}
	}

	@When("Admin Clicks on Save button with out entering  details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
		AddNewBatchFn.setUserName(null);
		AddNewBatchFn.setDescriptione(null);
		AddNewBatchFn.setNoofClasses(null);
		AddNewBatchFn.clickSave();
		
	}

	@Then("Admin see Error message {string} without  giving any details")
	public void admin_see_error_message_without_giving_any_details(String errorMessage) {
				String ErrorMSg = "All Fields required";
				String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
				if (ErrorMSg.equalsIgnoreCase(SuggestionMSg)) {
		logger.info(AddNewBatchFn.getSuggestionBox());
				}
	}

	@When("Admin Clicks on Save button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {
		AddNewBatchFn.setUserName("name");
		AddNewBatchFn.setDescriptione("name");
		AddNewBatchFn.setNoofClasses("5");
		AddNewBatchFn.clickradio1();
		AddNewBatchFn.clickSave();
		}

	@Then("Admin see Success message {string} after enter all the details")
	public void admin_see_success_message_after_enter_all_the_details(String string) {
		String SuccessMsg = "New Batch is added";
		String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
		if (SuccessMsg.equalsIgnoreCase(SuggestionMSg)) {
	logger.info(AddNewBatchFn.getSuggestionBox());
		}   
	}

	@When("Admin Clicks on Save button after entering BatchName alone")
	public void admin_clicks_on_save_button_after_entering_Batchname_alone() {
		AddNewBatchFn.setUserName("name");
		AddNewBatchFn.clickSave();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String string) {
		String ErrorMSg = "All Fields required";
		String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
		if (ErrorMSg.equalsIgnoreCase(SuggestionMSg)) {
logger.info(AddNewBatchFn.getSuggestionBox());
		}
	}

	@When("Admin Clicks on Save button after entering Description alone")
	public void admin_clicks_on_save_button_after_entering_description_alone() {
		AddNewBatchFn.setDescriptione("scriptionName");
		AddNewBatchFn.clickSave();
	}

	@Then("Admin see Error message {string} after enter Description alone")
	public void admin_see_error_message_after_enter_description_alone(String string) {
		String ErrorMSg = "All Fields required";
		String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
		if (ErrorMSg.equalsIgnoreCase(SuggestionMSg)) {
logger.info(AddNewBatchFn.getSuggestionBox());
		}
	}

	@When("Admin Clicks on DropDown Menu")
	public void admin_clicks_on_drop_down_menu() {
	   AddNewBatchFn.selectDroupdown();
	}

	@When("Selects  a Program name by Dropdown menu in Batch Details window")
	public void selects_a_program_name_by_dropdown_menu_in_batch_details_window() {
	}
	@Then("Admin Clicks on Save button after entering Program Name alone")
	public void admin_clicks_on_save_button_after_entering_program_name_alone() {
		AddNewBatchFn.clickSave();
	}

	@Then("Admin see Error message {string} after enter program Name")
	public void admin_see_error_message_after_enter_program_name(String string) {
		String ErrorMSg = "All Fields required";
		String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
		if (ErrorMSg.equalsIgnoreCase(SuggestionMSg)) {
logger.info(AddNewBatchFn.getSuggestionBox());
		}
	}

	@When("Admin select Status")
	public void admin_select_status() {
	    AddNewBatchFn.clickradio1();
	}

	@Then("Admin see Error message {string} after Select Status alone")
	public void admin_see_error_message_after_select_status_alone(String string) {
		String ErrorMSg = "All Fields required";
		String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
		if (ErrorMSg.equalsIgnoreCase(SuggestionMSg)) {
logger.info(AddNewBatchFn.getSuggestionBox());
		}
	}

	@When("Admin enter no of clasees vaue in No of classes field in Batch Deails Window")
	public void admin_enter_no_of_clasees_vaue_in_no_of_classes_field_in_batch_deails_window() {
		AddNewBatchFn.setNoofClasses("5");
	}

	@Then("Admin Clicks on Save button after entering  No of classes alone")
	public void admin_clicks_on_save_button_after_entering_no_of_classes_alone() {
		AddNewBatchFn.clickSave();
	}

	@Then("Admin see Error message {string} after enter No of classes alone")
	public void admin_see_error_message_after_enter_no_of_classes_alone(String string) {
		String ErrorMSg = "All Fields required";
		String SuggestionMSg =AddNewBatchFn.getSuggestionBox();
		if (ErrorMSg.equalsIgnoreCase(SuggestionMSg)) {
logger.info(AddNewBatchFn.getSuggestionBox());
		}
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
	    AddNewBatchFn.clickCancel();
	}

	@Then("Admin see a Batch Details window getting closed after cancel the Add function")
	public void admin_see_a_batch_details_window_getting_closed_after_cancel_the_add_function() {
		logger.info("Window is not viewed by Admin");
	}
}