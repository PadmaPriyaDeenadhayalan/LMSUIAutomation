package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDropDownFunctionality {

	WebDriver ldriver;
	public UserDropDownFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "")
	WebElement stateDropDownIcon;
	
	@FindBy(xpath = "")
	WebElement stateDropDownSelect;
	
	@FindBy (xpath="")
	WebElement userDetails;
	
	@FindBy (xpath="")
	WebElement userRoleDropDown;
	
	@FindBy(xpath = "")
	WebElement userRoleDropDownSelect;
	
	public void verifyStateDropDownIcon() {
		// stateDropDownIcon.click();
	}
	
	public void verifyUserRoleDropDown() {
		// userRoleDropDown.click();
	}
	public void verifyStateDropDownSelect() {
		// stateDropDownSelect.click();
	}
	
	public void VerifyuserRoleDropDownSelect() {
		// userRoleDropDownSelect.click();
	}
	
	public Boolean verifyUserDetailsHeading() {
		// userDetails.isDisplayed();
		return true;
	}
}
