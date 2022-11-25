package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsWindowBox {

	WebDriver ldriver;
	public UserDetailsWindowBox(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement addNewUserButton;
	
	@FindBy (xpath="")
	WebElement userDetails;
	
	
	
	public void clickAddNewUserButton() {
//		addNewUserButton.click;
	}
	
	public Boolean verifyUserDetailsHeading() {
		// userDetails.isDisplayed();
		return true;
	}
	
	
}
