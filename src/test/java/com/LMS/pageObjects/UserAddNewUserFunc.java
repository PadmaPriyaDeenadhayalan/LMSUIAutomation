package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAddNewUserFunc {
	
	WebDriver ldriver;
	public UserAddNewUserFunc(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy (linkText="Add New User")
	WebElement addNewUserButton;
	
	@FindBy (xpath="")
	WebElement userDetailsDialogBox;
	
	public void clickAddNewUser() {
//		addNewUserButton.click();
	}
	
	public String getAddNewUserButtonText() {
		String AddNewUserButtonText = "+AddNewUser";
		// addNewUserButton.getText();
		return AddNewUserButtonText;
}
	
	public Boolean verifyUserDetailDialogBox() {
		// userDetailsDialogBox.isDisplayed();
		return true;
	}
}
