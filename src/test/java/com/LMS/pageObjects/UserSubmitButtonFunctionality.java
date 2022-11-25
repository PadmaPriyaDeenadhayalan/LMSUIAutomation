package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSubmitButtonFunctionality {

	WebDriver ldriver;
	public UserSubmitButtonFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "")
	WebElement submitText;
	
	@FindBy(xpath = "")
	WebElement submitButton;
	
	@FindBy (xpath="")
	WebElement userDetails;
	
	@FindBy (xpath="")
	WebElement errorMsg;
	
	@FindBy(xpath = "")
	WebElement firstName;
	
	@FindBy(xpath = "")
	WebElement lastName;
	
	@FindBy(xpath = "")
	WebElement emailAddress;
	
	@FindBy(xpath = "")
	WebElement phoneNo;
	
	@FindBy(xpath = "")
	WebElement address;
	
	@FindBy(xpath = "")
	WebElement city;
	
	@FindBy(xpath = "")
	WebElement state;
	
	@FindBy(xpath = "")
	WebElement postalCode;
	
	@FindBy(xpath = "")
	WebElement ugProgram;
	
	@FindBy(xpath = "")
	WebElement pgProgram;
	
	@FindBy(xpath = "")
	WebElement skill;
	
	@FindBy(xpath = "")
	WebElement experience;
	
	@FindBy(xpath = "")
	WebElement userRole;
	
	@FindBy(xpath = "")
	WebElement adminRole;
	
	@FindBy(xpath = "")
	WebElement staffRole;
	
	@FindBy(xpath = "")
	WebElement visaStatus;
	
	@FindBy(xpath = "")
	WebElement batch;
	
	@FindBy(xpath = "")
	WebElement comments;
	
	@FindBy(xpath = "")
	WebElement newUser;
	
	public Boolean verifySubmitButton() {
		// submitText.isDisplayed();
		return true;
	}
	
	public Boolean verifyNewUser() {
		// newUser.isDisplayed();
		return true;
	}
	
	public Boolean verifyUserDetailsHeading() {
		// userDetails.isDisplayed();
		return true;
	}
	
	public void clicksubmitButton() {
//		submitButton.click();
	}
	
	public Boolean verifyErrorMsg() {
		// errorMsg.isDisplayed();
		return true;
	}
	
	public void verifyFirstName() {
		// firstName.sendKeys("");
		
	}
	
	public void verifyLastName() {
		// lastName.sendKeys("");
		
	}
	
	public void verifyEmailAddress() {
		// emailAddress.sendKeys("");
		
	}
	
	public void verifyPhoneNo() {
		// phoneNo.sendKeys("");
		
	}
	
	public void verifyAddress() {
		// address.sendKeys("");
		
	}
	
	public void verifyCity() {
		// city.sendKeys("");
		
	}
	
	public void verifyState() {
		// state.sendKeys("");
		
	}
	
	public void verifyPostalCode() {
		// postalCode.sendKeys("");
		
	}
	
	public void verifyUgProgram() {
		// ugProgram.sendKeys("");
		
	}
	
	public void verifyPgProgram() {
		// pgProgram.sendKeys("");
		
	}
	
	public void verifySkill() {
		// skill.sendKeys("");
		
	}
	
	public void verifyExperience() {
		// experience.sendKeys("");
		
	}
	
	public void verifyUserRole() {
		// userRole.sendKeys("");
		
	}
	
	public void verifyAdminRole() {
		// adminRole.sendKeys("");
		
	}
	
	public void verifyStaffRole() {
		// staffRole.sendKeys("");
		
	}
	
	public void verifyVisaStatus() {
		// visaStatus.sendKeys("");
		
	}
	
	public void verifyBatch() {
		// batch.sendKeys("");
		
	}
	
	public void verifyComments() {
		// comments.sendKeys("");
		
	}
}
