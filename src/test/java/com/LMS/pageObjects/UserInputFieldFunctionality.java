package com.LMS.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserInputFieldFunctionality {

	
	WebDriver ldriver;
	public UserInputFieldFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
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
	WebElement submitButton;
	
	@FindBy(xpath = "")
	WebElement errorMsgName;
	
	@FindBy(xpath = "")
	WebElement errorMsgEmail;
	
	@FindBy(xpath = "")
	WebElement errorInvalidInput;
	
	@FindBy(xpath = "")
	WebElement addAptSuiteButton;
	
	@FindBy(xpath = "")
	WebElement address2Button;
	
	@FindBy(xpath="")
	WebElement singleSelectTagDropdownWebElement;
	
	public boolean validateDropDownOptions() {
		    Select dropdown = new Select(singleSelectTagDropdownWebElement);
		    // Get all options
		    List<WebElement> allOptionsWebElement = dropdown.getOptions();
		    // Creating a list to store drop down options
		    List <String> optionsAsIs = new ArrayList<>();
		    for(WebElement optionElement : allOptionsWebElement){
		    	optionsAsIs.add(optionElement.getText());
		    }
		    // Removing "Please select" option as it is not actual option
		    optionsAsIs.remove("Please select");
		    // Creating a sortedOptions list to sort
		    List<String> sortedOptions = new ArrayList<>(optionsAsIs);
		    Collections.sort(sortedOptions);
		    return optionsAsIs.equals(sortedOptions);
	      }
	
	public Boolean verifyErrorMsgName() {
		// errorMsgName.isDisplayed();
		return true;
	}
	
	public Boolean verifyAddress2Button() {
		// address2Button.isDisplayed();
		return true;
	}
	
	public Boolean verifyErrorInvalidInput() {
		// errorInvalidInput.isDisplayed();
		return true;
	}
	
	public Boolean verifyAddAptSuiteButton() {
		// addAptSuiteButton.isDisplayed();
		return true;
	}
	
	public Boolean verifyErrorMsgEmail() {
		// errorMsgEmail.isDisplayed();
		return true;
	}
	
	public Boolean verifyFirstName() {
		// firstName.isEnabled();
		return true;
	}
	
	public void clickFirstName() {
		// firstName.sendKeys("");
		
	}
	
	public void clickAddAptSuiteButton() {
		// addAptSuiteButton.click();
		
	}
	
	public Boolean verifyLastName() {
		// lastName.isEnabled();
		return true;
	}
	
	public void clickLastName() {
		// lastName.sendKeys("");
		
	}
	
	public Boolean verifyEmailAddress() {
		// emailAddress.isEnabled();
		return true;
	}
	
	public void clickEmailAddress() {
		// emailAddress.sendKeys("");
		
	}
	
	public void clickInValidEmailAddress() {
		// emailAddress.sendKeys("");
		
	}
	
	public Boolean verifyPhoneNo() {
		// phoneNo.isEnabled();
		return true;
	}
	
	public void clickPhoneNo() {
		// phoneNo.sendKeys("");
		
	}
	
	public void clickInvalidPhoneNo() {
		// phoneNo.sendKeys("");
		
	}
	
	public Boolean verifyAddress() {
		// address.isEnabled();
		return true;
	}
	
	public void clickaddress() {
		// address.sendKeys("");
		
	}
	
	public void clickSubmitButton() {
		// submitButton.click();
		
	}
	
	public Boolean verifyCity() {
		// city.isEnabled();
		return true;
	}
	
	public void clickCity() {
		// city.sendKeys("");
	}
	
	public Boolean verifyState() {
		// state.isEnabled();
		return true;
	}
	
	public void clickstate() {
		// state.sendKeys("");
	}
	
	public Boolean verifyPostalCode() {
		// postalCode.isEnabled();
		return true;
	}
	
	public void clickPostalCode() {
		// postalCode.sendKeys("");
	}
	
	public void clickInvalidPostalCode() {
		// postalCode.sendKeys("");
	}
	
	public Boolean verifyUgProgram() {
		// ugProgram.isEnabled();
		return true;
	}
	
	public void clickUgProgram() {
		// ugProgram.sendKeys("");
	}
	
	public Boolean verifyPgProgram() {
		// pgProgram.isEnabled();
		return true;
	}
	
	public void clickPgProgram() {
		// pgProgram.sendKeys("");
	}
	
	public Boolean verifySkill() {
		// skill.isEnabled();
		return true;
	}
	
	public void clickSkill() {
		// skill.sendKeys("");
	}
	
	public Boolean verifyExperience() {
		// experience.isEnabled();
		return true;
	}
	
	public void clickExperience() {
		// experience.sendKeys("");
	}
	
	public Boolean verifyUserRole() {
		// userRole.isEnabled();
		return true;
	}
	
	public Boolean verifyAdminRole() {
		// adminRole.isEnabled();
		return true;
	}
	
	public Boolean verifyStaffRole() {
		// staffRole.isEnabled();
		return true;
	}
	
	public Boolean verifyVisaStatus() {
		// visaStatus.isEnabled();
		return true;
	}
	
	public void clickVisaStatus() {
		// visaStatus.sendKeys("");
	}
	
	public Boolean verifyBatch() {
		// batch.isEnabled();
		return true;
	}
	
	public void clickBatch() {
		// batch.sendKeys("");
	}
	
	public Boolean verifyComments() {
		// comments.isEnabled();
		return true;
	}
	
	public void clickComments() {
		// comments.sendKeys("");
	}

}
