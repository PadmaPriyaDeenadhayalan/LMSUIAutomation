package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;

import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class BatchEditFn  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage BEFn = new BatchPage(FeatureHelper.getDriver());
	
	
	@Given("Admin is on Manage Batch page")
	public void admin_is_on_manage_batch_page() {
			String title = BEFn.getHeader();
		    if (title == "Manage Batch")
		    {
		    	assertEquals("Manage Batch", title);
				logger.info("Admin is on the Manage Batch Page");
		    }
			else {
		        logger.info("Admin is not in Manage Batch Page");
			}
	}

	@When("Admin Clicks  Edit buttton")
	public void admin_clicks_edit_buttton() {
		BEFn.clickEdit1();
		
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String string) {
		BEFn.verifyEditLink();
		logger.info("Verifying Edit  Links");
	}

	@When("Admin Clicks Edit button for Edit Name")
	public void admin_clicks_edit_button_for_edit_name() {
		BEFn.clickEdit1();
		
	}

	@When("Admin update the Name")
	public void admin_update_the_name() {
		BEFn.setUserName("name");
		//logger.info("Clicking on Delete Button");
	}
	

	@Then("Admin Clicks Save  button after update the Name")
	public void admin_clicks_save_button_after_updte_the_name() {
	    BEFn.clickSave();
	}
	@Then("Admin see Success message {string} for Name Update")
	public void admin_see_success_message_for_name_update(String string) {
		String SuccessMsg = "Name is updated";
		String SuggestionMSg =BEFn.getSuggestionBox();
		if (SuccessMsg.equalsIgnoreCase(SuggestionMSg)) {
	logger.info(BEFn.getSuggestionBox());
		}    
	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String string) {
		 
	}

	@When("Admin Clicks  Edit button for Edit Description")
	public void admin_clicks_edit_button_for_edit_description() {
		BEFn.clickEdit1();
		
	}
	
	@When("Admin update the Description")
	public void admin_update_the_description() {
		BEFn.setDescriptione("name");
	}



	@Then("Admin Clicks  Save  button after update Description")
	public void admin_clicks_save_button_after_update_description() {
		  BEFn.clickSave();
	}
	
	@Then("Admin see Success message\"Updated Description\" for Description Update")
	public void admin_see_success_message_updated_description_for_description_update() {
		String SuccessMsg = "Batch Description is updated";
		String SuggestionMSg =BEFn.getSuggestionBox();
		if (SuccessMsg.equalsIgnoreCase(SuggestionMSg)) {
	logger.info(BEFn.getSuggestionBox());
		}  
	}
	

	@When("Admin Clicks  Edit button for Edit Program Name")
	public void admin_clicks_edit_button_for_edit_program_name() {
		BEFn.clickEdit1();
	}
	
	@When("Admin select different Program Name By Scroll down")
	public void admin_select_different_program_name_by_scroll_down() {
	    BEFn.selectDroupdown();
	}
	
	@Then("Admin Clicks Save  button after update Program Name")
	public void admin_clicks_save_button_after_update_program_name() {
		BEFn.clickSave(); 
	}
	@Then("Admin see Success message {string} for Programname Update")
	public void admin_see_success_message_for_programname_update(String string) {
		String SuccessMsg = "ProgramName is updated";
		String SuggestionMSg =BEFn.getSuggestionBox();
		if (SuccessMsg.equalsIgnoreCase(SuggestionMSg)) {
	logger.info(BEFn.getSuggestionBox());
		}   
	}
	@When("Admin Clicks  Edit button for Edit Status")
	public void admin_clicks_edit_button_for_edit_status() {
		BEFn.clickEdit1();
	}

	@When("Admin update the Status")
	public void admin_update_the_status() {
		BEFn.clickradio1();
	}

	@Then("Admin Clicks Save  button after update  Status")
	public void admin_clicks_save_button_after_update_status() {
		BEFn.clickSave(); 
	}
	
	@Then("Admin see Success message {string} for Status Update")
	public void admin_see_success_message_for_status_update(String string) {
		String SuccessMsg = "Status is updated";
		String SuggestionMSg =BEFn.getSuggestionBox();
		if (SuccessMsg.equalsIgnoreCase(SuggestionMSg)) {
	logger.info(BEFn.getSuggestionBox());
		}   
	}
	
	@When("Admin Clicks Edit button for Edit Number Of Classes")
	public void admin_clicks_edit_button_for_edit_number_of_classes() {
		BEFn.clickEdit1();
	}

	@When("Admin update No Of Classes")
	public void admin_update_no_of_classes() {
		BEFn.setNoofClasses("5");
	}

	@Then("Admin Clicks Save  button after update Number Of Classes")
	public void admin_clicks_save_button_after_update_number_of_classes() {
		BEFn.clickSave(); 
	}
	
	@Then("Admin see Success message {string} for Class Update")
	public void admin_see_success_message_for_class_update(String string) {
		String SuccessMsg = "Class is updated";
		String SuggestionMSg =BEFn.getSuggestionBox();
		if (SuccessMsg.equalsIgnoreCase(SuggestionMSg)) {
	logger.info(BEFn.getSuggestionBox());
		}  
	}

	@When("Admin Clicks  Edit button for verify cancel function")
	public void admin_clicks_edit_button_for_verify_cancel_function() {
		BEFn.clickEdit1(); 
	}

	@When("Admin Clicks on Cancel button to verify its function")
	public void admin_clicks_on_cancel_button_to_verify_its_function() {
		BEFn.clickCancel(); 
			}  
	

	@Then("Admin see a Batch Details window getting closed")
	public void admin_see_a_batch_details_window_getting_closed() {
		logger.info("Admin didnot see any success Msg");
	}

	@When("Admin\\/User\\/Staff  Enters edited Batch Name\\/Batch Description in Search")
	public void admin_user_staff_enters_edited_batch_name_batch_description_in_search() {
		BEFn.enterValidSearchBox("Batchname");
		logger.info("\"Admin\\\\/User\\\\/Staff  enter edited BatchName edited page");
			}
	@Then("Entry for the edited  Batch Name\\/Batch Description is shown")
	public void entry_for_the_edited_batch_name_batch_description_is_shown() {
		logger.info("\"Admin\\\\/User\\\\/Staff  view the edited page");
	}
	

	@Given("User\\/Staff is on Manage Batch page")
	public void user_staff_is_on_manage_batch_page() {
		String titleOfProgram = BEFn.getBatchPageTitle();
        String title = "Manage Batch";
		Assert.assertEquals(title, titleOfProgram);   
	}

	@When("User\\/Staff Clicks on Edit buttton for Validate Edit buttonn")
	public void user_staff_clicks_on_edit_buttton_for_validate_edit_button() {
		BEFn.clickEdit1(); 
	}

	@Then("User\\/Staff see a Error message  {string}")
	public void user_staff_see_a_error_message(String string) {
		String ErrorMSg = "only Admin Access";
		String ConfirmMSg =BEFn.getConfirmationMSg();
		if (ErrorMSg.equalsIgnoreCase(ConfirmMSg)) {
			logger.info(BEFn.getSuggestionBox());
		}
	
	}
}
