package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDelete {

	WebDriver ldriver;
	public UserDelete(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement deleteButton;
	
	
	@FindBy (xpath="")
	WebElement checkBoxButton;
	
	@FindBy (xpath="")
	WebElement rowCheckBoxButton;
	
	@FindBy (xpath="")
	WebElement confirmDialogBox;
	
	@FindBy (xpath="")
	WebElement buttonNo;
	
	@FindBy (xpath="")
	WebElement buttonYes;
	
	@FindBy (xpath="")
	WebElement buttonClose;
	
	public String getManageUserPageTitle(){
		String title = "ManageUser";
//		title=ldriver.getTitle();
		return title; 
}
	public Boolean verifyDeleteButton() {
		// deleteButton.isDisplayed();
		return true;
	}
	
	public Boolean verifyRowCheckBoxButton() {
		// rowCheckBoxButton.isEnabled();
		return true;
	}
	
	public Boolean verifyRowCheckBoxButtondisplayed() {
		// rowCheckBoxButton.isDisplayed();
		return true;
	}
	public void clickNoButton() {
//		buttonNo.click();
	}
	
	public void clickYesButton() {
//		buttonYes.click();
	}
	
	public void clickCloseButton() {
//		buttonClose.click();
	}
	public void clickCheckBoxButton() {
//		checkBoxButton.click();
	}
	
	public void clickDeleteButton() {
//		deleteButton.click();
	}
	
	public Boolean verifyConfirmDialogBox() {
		// confirmDialogBox.isDisplayed();
		return true;
	}
	
	public String getconfirmDialogBoxTitle(){
		String title = "Confirm";
//		title=ldriver.getTitle();
		return title; 
}
}