package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.LogoutPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class LogoutSteps {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	LogoutPage lo= new LogoutPage(FeatureHelper.getDriver());
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	
	
	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() {
	lo.btnLogout();
	logger.info("Admin/User/Staff  Clicks on LogOut button");
	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() {
		logger.info("Admin/User/Staff should be navigated to Login Screen");
	    
	}

}
