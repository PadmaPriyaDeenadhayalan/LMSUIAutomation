package com.LMS.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.BatchPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class BatchHeader_FooterValidate  {
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	BatchPage page = new BatchPage(FeatureHelper.getDriver());
	
	@Given("Admin\\/User\\/Staff is on one page after Login")
	public void admin_user_staff_is_on_one_page_after_login() {
		String titleOfProgram = page.getBatchPageTitle();
        String title = "Manage Batch";
		Assert.assertEquals(title, titleOfProgram);    
	}
	@When("Admin\\/User\\/Staff clicks the Batch option")
	public void admin_user_staff_clicks_the_batch_option() {
		page.clickBatch();   
	}

	@Then("Admin\\/User\\/Staff should see the Manage Batch page")
	public void admin_user_staff_should_see_the_manage_batch_page() {
		String title = page.getHeader();
	    if (title == "Manage Batch")
	    {
	    	assertEquals("Manage Batch", title);
			logger.info("User is on the Manage Batch Page");
	    }
		else {
	        logger.info("User is not in Manage Batch Page");
		}
	}

		@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String string) {
		String Header = page.getHeader();
	    if (Header == "Manage Batch")
	    {
	    	assertEquals("Manage Batch", Header);
			logger.info("Admin\\\\/User\\\\/Staff see the Header text as Manage Batch ");
	    }
		else {
	        logger.info("Admin\\\\/User\\\\/Staff is not viewing the Header text 'Manage Batch'");
		}
	}

	@Then("Admin\\/User\\/Staff see Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String string) {
		String Footer = page.getFooter();
	    if (Footer == "In total there are 21 batches")
	    {
	    	assertEquals("In total there are 21 batches", Footer);
			logger.info("Admin\\\\/User\\\\/Staff see the Footer text as 'In total there are 21 batches'");
	    }
		else {
	        logger.info("Admin\\\\/User\\\\/Staff is not viewing the Footer text as 'In total there are 21 batches'");
		}
	}
}
