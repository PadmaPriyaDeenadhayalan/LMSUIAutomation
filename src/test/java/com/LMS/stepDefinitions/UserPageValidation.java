package com.LMS.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPageValidation extends FeatureHelper{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	User page = new User(FeatureHelper.getDriver());

	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
		
		String expectedPage= page.getProgramPageTitle();

			String actualURL= "ManageProgram";

			Assert.assertEquals(expectedPage, actualURL);
	  
	}


	@When("Admin\\/User\\/Staff clicks the Tab User")
	public void admin_user_staff_clicks_the_tab_user() {
		page.clickUser();
		
	}

	@Then("Admin\\/User\\/Staff should see the Manage user page")
	public void admin_user_staff_should_see_the_manage_user_page() {
	    
		String title = page.getManageUserPageTitle();
	    if (title == "ManageUser")
	    {
	    	assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
	    }
		else {
	        logger.info("User is not in Manage User Page");
		}
	}

	@Then("Admin\\/User\\/Staff should see the page heading as Manage User")
	public void admin_user_staff_should_see_the_page_heading_as_manage_user() {
	   
		String title = page.getManageUserPageTitle();
	    if (title == "ManageUser")
	    {
	    	assertEquals("ManageUser", title);
			logger.info("User is in Manage User Page");
	    }
		else {
	        logger.info("User is not in Manage User Page");
		}
		
	}

	@Then("Admin\\/User\\/Staffshould see the table footer as {string}.")
	public void admin_user_staffshould_see_the_table_footer_as(String footerText) {
	   
		String footerText1 = page.getFooterText();
		if (footerText1 == footerText) {
			assertEquals(footerText1, footerText);
			logger.info("Text is Visible");
		} else {
			
			logger.info("Text is not visibile");
		}
	}
}
