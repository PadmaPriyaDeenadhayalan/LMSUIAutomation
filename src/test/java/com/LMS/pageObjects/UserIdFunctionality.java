package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserIdFunctionality {

	
	WebDriver ldriver;
	public UserIdFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement idLink;
	
	@FindBy (xpath="")
	WebElement userInfoDialogBox;
	
	public void clickIdLink() {
//		idLink.click;
	}
	
	public Boolean verifyUserInfoDialogBox() {
		// userInfoDialogBox.isDisplayed();
		return true;
	}
}
