package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLabelTextFunctionality {

	
	WebDriver ldriver;
	public UserLabelTextFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (id="firstNameWithPlaceholder")
	WebElement firstNamePlaceholder;
	
	@FindBy (id="lastNameWithPlaceholder")
	WebElement lastNamePlaceholder;
	
	@FindBy (id="middleNameWithPlaceholder")
	WebElement middleNamePlaceholder;
	
	@FindBy (id="emailAddressWithPlaceholder")
	WebElement emailPlaceholder;
	
	@FindBy (id="phoneNoWithPlaceholder")
	WebElement phonePlaceholder;
	
	@FindBy (id="addressWithPlaceholder")
	WebElement addressPlaceholder;
	
	@FindBy (id="cityWithPlaceholder")
	WebElement cityPlaceholder;
	
	@FindBy (id="postalCodeWithPlaceholder")
	WebElement postalPlaceholder;
	
	@FindBy (id="programWithPlaceholder")
	WebElement programPlaceholder;
	
	@FindBy (id="ugProgramWithPlaceholder")
	WebElement ugProgramPlaceholder;
	
	@FindBy (id="pgProgramWithPlaceholder")
	WebElement pgProgramPlaceholder;
	
	@FindBy (id="skillWithPlaceholder")
	WebElement skillPlaceholder;
	
	@FindBy (id="experienceWithPlaceholder")
	WebElement experiencePlaceholder;
	
	@FindBy (id="visaWithPlaceholder")
	WebElement visaPlaceholder;
	
	@FindBy (id="batchWithPlaceholder")
	WebElement batchPlaceholder;
	
	@FindBy (id="commentsWithPlaceholder")
	WebElement commentsPlaceholder;
	
	
	public Boolean verifyLastNamePlaceholder() {
		// lastNamePlaceholder.isDisplayed();
		lastNamePlaceholder.getAttribute("placeholder");
		return true;
	}
	public Boolean verifyFirstNamePlaceholder() {
		// firstNamePlaceholder.isDisplayed();
		firstNamePlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifymiddleNamePlaceholder() {
		// middleNamePlaceholder.isDisplayed();
		middleNamePlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyEmailAddressPlaceholder() {
		// emailAddressPlaceholder.isDisplayed();
		emailPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyphonePlaceholder() {
		// phonePlaceholder.isDisplayed();
		phonePlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyAddressPlaceholder() {
		// addressPlaceholder.isDisplayed();
		addressPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyCityPlaceholder() {
		// cityPlaceholder.isDisplayed();
		cityPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyPostalPlaceholder() {
		// postalPlaceholder.isDisplayed();
		postalPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyProgramPlaceholder() {
		// programPlaceholder.isDisplayed();
		programPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyUGPlaceholder() {
		// ugProgramPlaceholder.isDisplayed();
		ugProgramPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyPGPlaceholder() {
		// pgProgramPlaceholder.isDisplayed();
		pgProgramPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifySkillPlaceholder() {
		// skillPlaceholder.isDisplayed();
		skillPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyExperiencePlaceholder() {
		// experiencePlaceholder.isDisplayed();
		experiencePlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyVisaPlaceholder() {
		// visaPlaceholder.isDisplayed();
		visaPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyBatchPlaceholder() {
		// batchPlaceholder.isDisplayed();
		batchPlaceholder.getAttribute("placeholder");
		return true;
	}
	
	public Boolean verifyCommentsPlaceholder() {
		// commentsPlaceholder.isDisplayed();
		commentsPlaceholder.getAttribute("placeholder");
		return true;
	}
	}
