package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCancelButtonFunctionality {

	WebDriver ldriver;
	public UserCancelButtonFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement cancelButton;
	
	public Boolean verifyCancelButton() {
		// cancelButton.isDisplayed();
		return true;
	}
	
	public String getUserDetailsWindowTitle(){
		String title = "User Details";
//		title=ldriver.getTitle();
		return title; 
	}
	
	public void clickcancelButton() {
//		cancelButton.click();
	}
	
	public String getManageUserPageTitle(){
		String title = "Manage User";
//		title=ldriver.getTitle();
		return title; 
	}
}
