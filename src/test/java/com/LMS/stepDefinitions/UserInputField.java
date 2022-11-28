package com.LMS.stepDefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserInputField extends FeatureHelper {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	User inputField = new User(FeatureHelper.getDriver());

	@Then("Admin\\/User\\/Staff should see the input fields for First name,Middle name, Last name,Email adress,Phone no, Address,City, State,Postal Code.Program,UG Program,PG Program,Skill,Experience,Admin\\/User\\/Staff Role,Visa status,Batch,Comments corresponding to their labels")
	public void admin_user_staff_should_see_the_input_fields_for_first_name_middle_name_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status_batch_comments_corresponding_to_their_labels() {

		inputField.verifyAddress();
		inputField.verifyBatch();
		inputField.verifyCity();
		inputField.verifyComments();
		inputField.verifyEmailAddress();
		inputField.verifyExperience();
		inputField.verifyFirstName();
		inputField.verifyLastName();
		inputField.verifyPgProgram();
		inputField.verifyPhoneNo();
		inputField.verifyPostalCode();
		inputField.verifySkill();
		inputField.verifyState();
		inputField.verifyUgProgram();
		inputField.verifyUserRole();
		inputField.verifyVisaStatus();
		inputField.verifyAdminRole();
		inputField.verifyStaffRole();

		logger.info("All input fields are visible in User Details Window");
	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering  Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details() {

		inputField.clickaddress();
		inputField.clickBatch();
		inputField.clickComments();
		inputField.clickEmailAddress();

		logger.info("Entering only few fields");
	}

	@Then("Admin\\/User\\/Staff see error message Name is required")
	public void admin_user_staff_see_error_message_name_is_required() {

		inputField.verifyErrorMsgName();
		logger.info("Error msg is displayed");

	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering wrong email address")
	public void admin_user_staff_clicks_on_submit_button_after_entering_wrong_email_address() {

		inputField.clickInValidEmailAddress();
		inputField.clickSubmitButton();
		logger.info("Entering Invalid Email Address and clicking Submit Button");

	}

	@Then("Admin\\/User\\/Staff see error message Invalid Email address")
	public void admin_user_staff_see_error_message_invalid_email_address() {

		inputField.verifyErrorMsgEmail();
		logger.info("Error msg is displayed");
	}

	@Then("Admin\\/User\\/Staff should see the button with text + Add C\\/O, Apt, Suite, Unit")
	public void admin_user_staff_should_see_the_button_with_text_add_c_o_apt_suite_unit() {

		inputField.verifyAddAptSuiteButton();
		logger.info("Button is displayed");
	}

	@When("Admin\\/User\\/Staff Enters more than Ten digits")
	public void admin_user_staff_enters_more_than_ten_digits() {

		inputField.clickInvalidPhoneNo();
		logger.info("Entering Phone Number with more than 10 digits");
	}

	@When("Admin\\/User\\/Staff Enters more than five digits")
	public void admin_user_staff_enters_more_than_five_digits() {

		inputField.clickInvalidPostalCode();
		logger.info("Entering Phone Number with more than 5 digits");
	}

	@Then("Admin\\/User\\/Staff see error message Invalid Input")
	public void admin_user_staff_see_error_message_invalid_input() {

		inputField.verifyErrorInvalidInput();
		logger.info("Error msg is displayed");
	}

	@When("Admin\\/User\\/Staff clicks on state dropdown")
	public void admin_user_staff_clicks_on_state_dropdown() {
		inputField.clickstate();

		logger.info("clicking on state dropdown button");
	}

	@Then("Admin\\/User\\/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {
		inputField.validateDropDownOptions();
		logger.info("Validating the DropDown Lists");

	}

	@When("Admin\\/User\\/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {

		inputField.verifyUgProgram();
		logger.info("UG Program is displayed");
	}

	@Then("Admin\\/User\\/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {

		inputField.clickUgProgram();

		logger.info("Entering UG Program Details");
	}

	@When("Admin\\/User\\/Staff clicks the button + Add C\\/O, Apt, Suite, Unit")
	public void admin_user_staff_clicks_the_button_add_c_o_apt_suite_unit() {

		inputField.clickAddAptSuiteButton();
		logger.info("Clicking on the add Address2 Button");
	}

	@Then("Admin\\/User\\/Staff should see the input field with Label New Address2")
	public void admin_user_staff_should_see_the_input_field_with_label_new_address2() {

		inputField.verifyAddress2Button();
		logger.info(" Address2 input fields is displayed");
	}
}
