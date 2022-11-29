package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.ProgramPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProgramHeader {
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ProgramPage page= new ProgramPage(FeatureHelper.getDriver());
	
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
@Given("Admin\\/User\\/Staff  Logged on to LMS Website")
public void admin_user_staff_logged_on_to_lms_website() {
	
	
	logger.info("Logged on to LMS Website Header");
	
   
}

@When("Admin\\/User\\/Staff  is on Manage Program page")
public void admin_user_staff_is_on_manage_program_page() {
	String expectedPage= page.getHeader();

	String actualURL= "Manage Program";

	Assert.assertEquals(expectedPage, actualURL);


}

@Then("Admin\\/User\\/Staff see header text as {string}")
public void admin_user_staff_see_header_text_as(String string) {
	String title = page.getHeader();
 
	if (title == "ManageProgram")
    {
    	assertEquals("ManageProgram", title);
		logger.info("User is in Manage Program Page");
    }
	else {
        logger.info("User is not in Manage Program Page");
	}

}


@Given("Admin\\/User\\/Staff Logged on to LMS Website Footer")
public void admin_user_staff_logged_on_to_lms_website_footer() {
	
	logger.info(" Logged on to LMS Website Footer");
	
}

@When("Admin\\/User\\/Staff is on Manage Program")
public void admin_user_staff_is_on_manage_program() {
	String expectedPage= page.getFooter();

	String actualURL= "In total there are 9 programs.";

	Assert.assertEquals(expectedPage, actualURL);

}


@Then("Admin\\/User\\/Staff see  Footer text as {string}")
public void admin_user_staff_see_footer_text_as(String  footerText) {
	   
			String footerText1 = page.getFooter();
			if (footerText1 == footerText) {
				assertEquals(footerText1, footerText);
				logger.info("In total there are 9 programs.");
			} else {
				
				logger.info("In total there are 9 programs.Is not Visible");
			}
		}

    
}



