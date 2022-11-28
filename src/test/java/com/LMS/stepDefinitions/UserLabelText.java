package com.LMS.stepDefinitions;


import com.LMS.base.FeatureHelper;
import com.LMS.pageObjects.User;
import com.LMS.utilities.ReadConfig;

import io.cucumber.java.en.Then;

public class UserLabelText extends FeatureHelper{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	User labelText = new User(FeatureHelper.getDriver());
	
	@Then("Admin\\/User\\/Staff should see the placeholders with Text As First name,Middle name, Last name,Email adress,Phone no, Address,City, State,Postal Code.Program,UG Program,PG Program,Skill,Experience,Admin\\/User\\/Staff Role,Visa status,Batch,Comments")
	public void admin_user_staff_should_see_the_placeholders_with_text_as_first_name_middle_name_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status_batch_comments() {
		
		labelText.verifyLastNamePlaceholder();
		labelText.verifyAddressPlaceholder();
		labelText.verifyBatchPlaceholder();
		labelText.verifyCommentsPlaceholder();
		labelText.verifyEmailAddressPlaceholder();
		labelText.verifyExperiencePlaceholder();
		labelText.verifyFirstNamePlaceholder();
		labelText.verifyLastNamePlaceholder();
		labelText.verifymiddleNamePlaceholder();
		labelText.verifyPGPlaceholder();
		labelText.verifyphonePlaceholder();
		labelText.verifyPostalPlaceholder();
		labelText.verifyProgramPlaceholder();
		labelText.verifySkillPlaceholder();
		labelText.verifyUGPlaceholder();
		labelText.verifyVisaPlaceholder();
		
		logger.info("Placeholders are verified");
		
	}
}