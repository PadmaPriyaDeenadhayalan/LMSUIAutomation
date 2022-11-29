package com.LMS.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.RegistrationPage;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps{
	
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	RegistrationPage rp= new RegistrationPage(FeatureHelper.getDriver());
	public static final Logger logger = LogManager.getLogger(FeatureHelper.class.getName());
	//Header Validation
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		logger.info("Admin/User/Staff Logged on to LMS website");
	}

	@When("Admin\\/User\\/Staff lands on Registration page")
	public void admin_user_staff_lands_on_registration_page() {
		Assert.assertEquals("Registration Form", rp.getPageHeader());
		logger.info("Admin/User/Staff lands on Registration page");
	
	}

	@Then("Admin\\/User\\/Staff sees the heading on the form as {string}")
	public void admin_user_staff_sees_the_heading_on_the_form_as(String string) {
		Assert.assertEquals(string, rp.getPageHeader());
		logger.info("Admin/User/Staff sees the heading on the form as Registration Form");
	  
	}
	
	//Registration Page Login button

@Then("Admin\\/User\\/Staff sees a button with text {string} on the form")
public void admin_user_staff_sees_a_button_with_text_on_the_form(String string) {
	//String str = driver.getPageSource();
	//Assert.assertEquals(string, str);
	logger.info("Admin/User/Staff sees a button with text {string} on the form");

}

@Given("Admin\\/User\\/Staff is on the Registeration Page")
public void admin_user_staff_is_on_the_registeration_page() {
	//String str = driver.getPageSource();
			//Assert.assertEquals("Registration Form", str);
	logger.info("Admin/User/Staff is on the Registeration Page");
			
}
@When("Admin\\/User\\/Staff selects the Log in button")
public void admin_user_staff_selects_the_log_in_button() {
	rp.clickLogin();
	logger.info("Admin/User/Staff selects the Log in button");
}

@Then("Admin\\/User\\/Staff lands on Log in page")
public void admin_user_staff_lands_on_log_in_page() {

	//String str = driver.getPageSource();
			//Assert.assertEquals("please login to LMS application", str);
	logger.info("Admin/User/Staff lands on Log in page");
}

//SIGNUP BUTTON

@Given("Admin\\/User\\/Staff is on LMS website")
public void admin_user_staff_is_on_lms_website() {
    logger.info("Admin/User/Staff is on LMS website");
}

//Validating the text fields on the Registration page


@When("Admin\\/User\\/Staff Enters the First Name in Alphabets only")
public void admin_user_staff_enters_the_first_name_in_alphabets_only() {

	//String str1=rp.FirstName();
	//assert.assertTrue(true,(str1.matches("[a-zA-Z0-9]+"));
	rp.FirstName();
	logger.info("Admin\\\\/User\\\\/Staff Enters the First Name in Alphabets only");
}

@Then("The First Name will be displayed")
public void the_first_name_will_be_displayed() {
	rp.gettextofFirstname();
	logger.info("The First Name will be displayed");
}

@When("Admin\\/User\\/Staff Enters the Last Name in Alphabets only")
public void admin_user_staff_enters_the_last_name_in_alphabets_only() {
	 //String str2=rp.LastName();
	//assert.assertTrue(true,(str2.matches("[a-zA-Z0-9]+"));
	rp.LastName();
	logger.info("Admin\\\\/User\\\\/Staff Enters the Last Name in Alphabets only");
}

@Then("The Last Name will be displayed")
public void the_last_name_will_be_displayed() {
	rp.gettextofLastname();
	logger.info("The Last Name will be displayed");
}

@When("Admin\\/User\\/Staff Enters the Address Field using Alpha Numerics and \\/or Symbols")
public void admin_user_staff_enters_the_address_field_using_alpha_numerics_and_or_symbols() {
	rp.Address();
	logger.info("Admin/User/Staff Enters the Address Field using Alpha Numerics and /or Symbols");
}

@Then("The Address will be displayed")
public void the_address_will_be_displayed() {
	rp.gettextofaddress();
	logger.info("The Address will be displayed");
}

@When("Admin\\/User\\/Staff Enters the Street name Field using Alpha Numerics and or Symbols")
public void admin_user_staff_enters_the_street_name_field_using_alpha_numerics_and_or_symbols() {
	rp.StreetName();
	logger.info("Admin/User/Staff Enters the Street name Field using Alpha Numerics and or Symbols");
}

@Then("The Street Name will be displayed")
public void the_street_name_will_be_displayed() {
	rp.gettextofstreetname();
	logger.info("The Street Name will be displayed");
}

@When("Admin\\/User\\/Staff Enters the {int} digit Zip code using Numbers only")
public void admin_user_staff_enters_the_digit_zip_code_using_numbers_only(Integer int1) {
	rp.zip();
	logger.info("Admin\\\\/User\\\\/Staff Enters the {int} digit Zip code using Numbers only");
}

@Then("The Zip code will be displayed")
public void the_zip_code_will_be_displayed() {
	rp.gettextofzip();
	logger.info("The Zip code will be displayed");
}

@When("Admin\\/User\\/Staff Enters the City Name in Alphabets only")
public void admin_user_staff_enters_the_city_name_in_alphabets_only() {
	rp.City();
	logger.info("Admin/User/Staff Enters the City Name in Alphabets only");
}

@Then("The City will be displayed")
public void the_city_will_be_displayed() {
	rp.gettextofcity();
	logger.info("The City will be displayed");
}

@When("Admin\\/User\\/Staff selects the respective State Name from the DropBox")
public void admin_user_staff_selects_the_respective_state_name_from_the_drop_box() {
	rp.State();
	logger.info("Admin/User/Staff selects the respective State Name from the DropBox");
}

@Then("The State Name will be displayed")
public void the_state_name_will_be_displayed() {
	rp.gettextofstate();
	logger.info("The State Name will be displayed");
}

@When("Admin\\/User\\/Staff Enters the valid {int} digit Mobile number in Numerics")
public void admin_user_staff_enters_the_valid_digit_mobile_number_in_numerics(Integer int1) {
	rp.PhoneNumber();
	logger.info("Admin/User/Staff Enters the valid {int} digit Mobile number in Numerics");
}

@Then("The Mobile Number will be displayed")
public void the_mobile_number_will_be_displayed() {
	rp.gettextofphoneNumber();
	logger.info("The Mobile Number will be displayed");
}

@When("Admin\\/User\\/Staff Selects the Date of Birth from the Calender")
public void admin_user_staff_selects_the_date_of_birth_from_the_calender() {
	rp.Birthdate();
	logger.info("Admin/User/Staff Selects the Date of Birth from the Calender");
}

@Then("Birth Date will be Displayed")
public void birth_date_will_be_displayed() {
	rp.gettextofBirthdate();
	logger.info("Birth Date will be Displayed");
}

@When("Admin\\/User\\/Staff  Enters the valid Password with {int} Upper case, {int} Numeric , {int} special charecter , {int} charecters")
public void admin_user_staff_enters_the_valid_password_with_upper_case_numeric_special_charecter_charecters(Integer int1, Integer int2, Integer int3, Integer int4) {
	rp.Password();
	logger.info("Admin/User/Staff  Enters the valid Password with 1 Upper case, 1 Numeric , 1 special charecter , 8 charecters");
}

@Then("Admin\\/User\\/Staff Password will be displayed")
public void admin_user_staff_password_will_be_displayed() {
	rp.gettextofpassword();
	logger.info("Admin/User/Staff Password will be displayed");
}

@When("Admin\\/User\\/Staff Enters the valid UserName")
public void admin_user_staff_enters_the_valid_user_name() {
	rp.UserName();
	logger.info("Admin/User/Staff Enters the valid UserName");
}

@Then("Admin\\/User\\/Staff UsesrName will be displayed")
public void admin_user_staff_usesr_name_will_be_displayed() {
	rp.gettextofusername();
	logger.info("Admin/User/Staff UsesrName will be displayed");
}

@When("Admin\\/User\\/Staff Enters the valid Email")
public void admin_user_staff_enters_the_valid_email() {
	rp.email();
	logger.info("Admin/User/Staff Enters the valid Email");
}

@Then("Admin\\/User\\/Staff Email will be displayed")
public void admin_user_staff_email_will_be_displayed() {
	rp.gettextofemail();
	logger.info("Admin/User/Staff Email will be displayed");
}

@When("Admin\\/User\\/Staff enters submit button with all fields empty")
public void admin_user_staff_enters_submit_button_with_all_fields_empty() {
	rp.clearallfields();
	rp.clickSignup();
	logger.info("Admin\\\\/User\\\\/Staff enters submit button with all fields empty");
}

@Then("Admin\\/User\\/Staff should get a message {string}")
public void admin_user_staff_should_get_a_message(String string) {
	//String str = driver.getPageSource();
		//Assert.assertEquals(string, str);
	rp.SuggestionBox();
	logger.info("Admin/User/Staff should get a message Enters all fields");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid First Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_first_name() {
	rp.invalidFirstname();
	logger.info("Admin\\\\/User\\\\/Staff clicks Sign Up button with invalid First Name");
}

@Then("Admin\\/User\\/Staff should get a message\"Enter valid First Name \"")
public void admin_user_staff_should_get_a_message_enter_valid_first_name() {
	//String str = driver.getPageSource();
	//Assert.assertEquals("Enter valid First Name", str);
	rp.SuggestionBox();
	logger.info("Admin/User/Staff should get a message Enter valid First Name");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Last Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_last_name() {
	rp.invalidLastName();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid Last Name");
}

@Then("Admin\\/User\\/Staff should get a message\"Enter valid Last Name\"")
public void admin_user_staff_should_get_a_message_enter_valid_last_name() {
	//String str = driver.getPageSource();
	//Assert.assertEquals("Enter valid Last Name", str);
	rp.SuggestionBox();
	logger.info("Admin/User/Staff should get a message Enter valid Last Name");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Address by not Providing House Number")
public void admin_user_staff_clicks_sign_up_button_with_invalid_address_by_not_providing_house_number() {
	rp.invalidAddress();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid Address by not Providing House Number");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Street Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_street_name() {
	rp.invalidStreetname();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid Street Name");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Zip")
public void admin_user_staff_clicks_sign_up_button_with_invalid_zip() {
	rp.invalidzip();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid Zip");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid City")
public void admin_user_staff_clicks_sign_up_button_with_invalid_city() {
	rp.invalidCity();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid City");
}

@When("Admin\\/User\\/Staff clicks Sign Up button without selecting State")
public void admin_user_staff_clicks_sign_up_button_without_selecting_state() {
	rp.invalidState();
	logger.info("Admin/User/Staff clicks Sign Up button without selecting State");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Phone Number")
public void admin_user_staff_clicks_sign_up_button_with_invalid_phone_number() {
	rp.invalidPhoneNumber();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid Phone Number");
}

@When("Admin\\/User\\/Staff clicks Sign Up button without selecting BirthDate")
public void admin_user_staff_clicks_sign_up_button_without_selecting_birth_date() {
	rp.clearBirthDate();
		rp.clickSignup();
		logger.info("Admin/User/Staff clicks Sign Up button without selecting BirthDate");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Admin\\/User\\/Staff Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_admin_user_staff_name() {
	rp.invalidUserName();
	logger.info("Admin/User/Staff clicks Sign Up button with invalid Admin/User/Staff Name");
}

@Then("Admin\\/User\\/Staff should get a message\"Please Enter valid Admin\\/User\\/Staff Name \"")
public void admin_user_staff_should_get_a_message_please_enter_valid_admin_user_staff_name() {

	//String str = driver.getPageSource();
	//Assert.assertEquals("please enter valid Admin,User,Staffname", str);
	rp.SuggestionBox();
	logger.info("Admin/User/Staff should get a message Please Enter valid Admin/User/Staff Name ");
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Password")
public void admin_user_staff_clicks_sign_up_button_with_invalid_password() {
	rp.invalidPassword();
	logger.info("Admin\\\\/User\\\\/Staff clicks Sign Up button with invalid Password");
}

@When("User clicks Sign Up button with existing Admin\\/User\\/Staff name")
public void user_clicks_sign_up_button_with_existing_admin_user_staff_name() {
	rp.UserName();
	logger.info("User clicks Sign Up button with existing Admin\\\\/User\\\\/Staff name");
}

@Then("Admin\\/User\\/Staff should see the message {string}")
public void admin_user_staff_should_see_the_message(String string) {
	//String str = driver.getPageSource();
			//Assert.assertEquals(string, str);
	rp.SuggestionBox();
	logger.info("Admin/User/Staff should see the message Admin/User/Staff name already exist");
}

@When("Admin\\/User\\/Staff Clicks on {string} button after entering all valid details.")
public void admin_user_staff_clicks_on_button_after_entering_all_valid_details(String string) {
	rp.clickSignup();
	logger.info("Admin/User/Staff Clicks on Sign Up button after entering all valid details.");
}

@Then("Admin\\/User\\/Staff should get a message\"Registeration successful\"")
public void admin_user_staff_should_get_a_message_registeration_successful() {
	//String str = driver.getPageSource();
	//Assert.assertEquals("Registeration successful", str);
	rp.SuggestionBox();
	logger.info("Admin/User/Staff should get a message Registeration successful");
}

}
