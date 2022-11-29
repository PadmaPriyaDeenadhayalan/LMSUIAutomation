package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.LMS.base.BaseClass;
import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.LoginPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{
	

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	LoginPage lp= new LoginPage(FeatureHelper.getDriver());
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
//Login Button
	
	@Given("Admin\\/User\\/Staff is on Browser")
	public void admin_user_staff_is_on_browser() {
		//driver.get(browser);
		logger.info("Admin\\\\/User\\\\/Staff is on Browser");
	}

	@When("Admin\\/User\\/Staff opens the LMS website")
	public void admin_user_staff_opens_the_lms_website() {
		  // driver.get(FeatureHelper);
		     logger.info("LMS WEB SITE OPENED");
	}

	@Then("Admin\\/user\\/Staff should be navigated to login page")
	public void admin_user_staff_should_be_navigated_to_login_page() {
	    logger.info("Admin/user/Staff should be navigated to login page");
	}
	
	//Login-Valid Credentials
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	 logger.info("User is on Login Page");
	}

	@When("User clicks login button after entering name and Password")
	public void user_clicks_login_button_after_entering_name_and_password() {
		 //lp.loginbutton();
		logger.info("User clicks login button after entering name and Password");
	}

	@Then("User see header text as {string}")
	public void user_see_header_text_as(String string) {
		  lp.loginsuccess();
		     logger.info("User see header text as  login success");
	}

	@Given("Admin\\/staff is on Login Page")
	public void admin_staff_is_on_login_page() {
	   logger.info("Admin\\\\/staff is on Login Page");
	}

	@When("Admin\\/Staff  clicks login Button after entering  Username as {string} and Password as {string} and code as {string}")
	public void admin_staff_clicks_login_button_after_entering_username_as_and_password_as_and_code_as(String username, String password, String code) {
		 lp.username(username);
	      lp.password(password);
	      lp.code(code);
	    lp.loginbutton();
	    
	}
	
	@Then("Admin\\/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String string) {
		lp.loginsuccess();
	}
	
	//Login -Invalid Credentials


@When("User clicks login button after entering valid Username and invalid Password")
public void user_clicks_login_button_after_entering_valid_username_and_invalid_password() {
	 lp.username("Hi");
     lp.password("Hello");
 
   lp.loginbutton();
   logger.info("User clicks login button after entering valid Username and invalid Password");
}

@Then("User should see a error message {string}")
public void user_should_see_a_error_message(String string) {
	 lp.loginerror();
	 logger.info("User should see a error message \"Entered invalid password\"");
}

@When("User clicks login button after entering  Invalid username and valid Password")
public void user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
    lp.username("hello");
    lp.password("Hello");

  lp.loginbutton();
  logger.info("User clicks login button after entering  Invalid username and valid Password");
}

@When("User clicks login button after entering Invalid username and invalid Password")
public void user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {
	  lp.username("hhh");
      lp.password("ooo");
  
    lp.loginbutton();
    logger.info("User clicks login button after entering Invalid username and invalid Password");
}

@Given("User  is on the Login Page")
public void user_is_on_the_login_page() {
   logger.info("User  is on the Login Page");
}

@When("User clicks login button after entering valid username and leaves Password field empty")
public void user_clicks_login_button_after_entering_valid_username_and_leaves_password_field_empty() {
	   lp.username("Hi");
	      lp.password(" ");
	  
	    lp.loginbutton();
	    logger.info("User clicks login button after entering valid username and leaves Password field empty");
}

@Then("It should show error message {string}")
public void it_should_show_error_message(String string) {
	   lp.loginerror();
	   logger.info("It should show error message \"enter valid password\"");
}

@Given("Admin\\/Staff is on the Login Page")
public void admin_staff_is_on_the_login_page() {
 logger.info("Admin\\\\/Staff is on the Login Page");
}

@When("Admin\\/Staff  clicks login button after entering  valid username invalid Password and code")
public void admin_staff_clicks_login_button_after_entering_valid_username_invalid_password_and_code() {
	  lp.username("Hi");
      lp.password("ooo");
      lp.code("aaa");
    lp.loginbutton();
    logger.info("Admin/Staff  clicks login button after entering  valid username invalid Password and code");
}

@Then("Admin\\/Staff should see a error message {string}")
public void admin_staff_should_see_a_error_message(String string) {
	   lp.loginerror();
	   logger.info("Admin/Staff should see a error message Entered invalid password");
}

@When("Admin\\/Staff  clicks login button after entering invalid username,valid Password and code")
public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_code() {
	  lp.username("hhh");
      lp.password("Hello");
      lp.code("aaa");
    lp.loginbutton();
    logger.info("Admin/Staff  clicks login button after entering invalid username,valid Password and code");
}

@When("Admin\\/Staff  clicks login button after entering invalid username,valid Password  and without code")
public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_without_code() {
    lp.username("hhh");
    lp.password("Hello");
    lp.code(" ");
  lp.loginbutton();
}


//Forgot Password


@Given("Admin\\/User\\/Staff is on Forgot Password Page")
public void admin_user_staff_is_on_forgot_password_page() {
   logger.info("Admin/User/Staff is on Forgot Password Page");
}

@When("Admin\\/User\\/Staff  clicks continue after entering valid email address")
public void admin_user_staff_clicks_continue_after_entering_valid_email_address() {
	  lp.email("Jhon@gmail.com");
	    lp.loginbutton();
	    logger.info("Admin/User/Staff  clicks continue after entering valid email address");
}

@Then("Admin\\/User\\/Staff should be redirected to enter verification code page and verification code will be sent to email")
public void admin_user_staff_should_be_redirected_to_enter_verification_code_page_and_verification_code_will_be_sent_to_email() {
   logger.info("Admin/User/Staff should be redirected to enter verification code page and verification code will be sent to email");
}

@Given("Admin\\/User\\/Staff is on Enter verification code Page")
public void admin_user_staff_is_on_enter_verification_code_page() {
 logger.info("Admin/User/Staff is on Enter verification code Page");
}

@When("Admin\\/User\\/Staff  clicks continue after entering verification code")
public void admin_user_staff_clicks_continue_after_entering_verification_code() {
	 lp.verificode("1234");
	    lp.continuelog();
	    logger.info("Admin/User/Staff  clicks continue after entering verification code");
}

@Then("Admin\\/User\\/Staff should be redirected reset password page")
public void admin_user_staff_should_be_redirected_reset_password_page() {
   logger.info("Admin/User/Staff should be redirected reset password page");
}

@Given("Admin\\/User\\/Staff is on the enter verification code Page")
public void admin_user_staff_is_on_the_enter_verification_code_page() {
   logger.info("Admin/User/Staff is on the enter verification code Page");
}

@When("Admin\\/User\\/Staff clicks Click here link to resend")
public void admin_user_staff_clicks_click_here_link_to_resend() {
	   lp.resend();
	   logger.info("Admin/User/Staff clicks Click here link to resend");
}

@Then("The verification code should be resend to email")
public void the_verification_code_should_be_resend_to_email() {
  logger.info("The verification code should be resend to email");
}


//Reset Password

@Given("Admin\\/User\\/Staff is on Reset Password Page")
public void admin_user_staff_is_on_reset_password_page() {
    logger.info("Admin/User/Staff is on Reset Password Page");
}

@When("Admin\\/User\\/Staff clicks submit button after entering new password and retype password")
public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password() {
    lp.newpassword("pass");
    lp.retypepass("pass");
   lp.submit();
   logger.info("Admin/User/Staff clicks submit button after entering new password and retype password");
}

@Then("Admin\\/User\\/Staff  should be redirected to login page")
public void admin_user_staff_should_be_redirected_to_login_page() {
   logger.info("Admin/User/Staff  should be redirected to login page");
}



@Then("Admin\\/User\\/Staff  should see an error message {string}")
public void admin_user_staff_should_see_an_error_message(String string) {
	   lp.loginerror();
	   logger.info("Admin/User/Staff  should see an error message password and retype password are mismatched");
}

@When("Admin\\/User\\/Staff clicks submit button after entering password  with less than {int} characters")
public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_characters(Integer int1) {
    lp.password("pass");
    lp.submit();
    logger.info("Admin/User/Staff clicks submit button after entering password  with less than 8 characters");
}

@Then("It should display an error message {string}")
public void it_should_display_an_error_message(String string) {
	 lp.loginerror();
	 logger.info("It should display an error message The password must contain 8 characters");
}

@When("Admin\\/User\\/Staff clicks submit button after entering password without Capital letter")
public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter() {
	  lp.password("aaa");
      lp.submit();
      logger.info("Admin/User/Staff clicks submit button after entering password without Capital letter");
}

@When("Admin\\/User\\/Staff clicks submit button after entering  password without Number")
public void admin_user_staff_clicks_submit_button_after_entering_password_without_number() {
    lp.password("aaa");
    lp.submit();
    logger.info("Admin/User/Staff clicks submit button after entering  password without Number");
}

@When("Admin\\/User\\/Staff clicks submit button after entering password without Special character")
public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character() {
    lp.password("aaa");
    lp.submit();
   logger.info("Admin/User/Staff clicks submit button after entering password without Special character");
}

@When("Admin\\/User\\/Staff clicks cancel button after entering new password and retype password")
public void admin_user_staff_clicks_cancel_button_after_entering_new_password_and_retype_password() {
    lp.newpassword("www");
    lp.retypepass("www");
    lp.cancel();
    logger.info("Admin/User/Staff clicks cancel button after entering new password and retype password");
}

@Then("Admin\\/User\\/Staff  should see a refreshed reset password page with empty fields")
public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields() {
 logger.info("Admin/User/Staff  should see a refreshed reset password page with empty fields");
}


	

	

}
