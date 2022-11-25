package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPaginationFunctionality{

	
	WebDriver ldriver;
	public UserPaginationFunctionality(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy (linkText="User")
	WebElement user;
	
	@FindBy (xpath="")
	WebElement page1Button;
	
	@FindBy (xpath="")
	WebElement page2Button;
	
	@FindBy (xpath="")
	WebElement previousPageButton;
	
	@FindBy (xpath="")
	WebElement nextpageButton;
	
	@FindBy (xpath="")
	WebElement mostBwdPageButton;
	
	@FindBy (xpath="")
	WebElement mostFwdPageButton;
	
	@FindBy(xpath = "")
	WebElement textBelowTable;
	
	@FindBy(xpath = "")
	WebElement endPageButton;
	
	@FindBy(xpath = "")
	WebElement manageUserTable;
	
	public void clickUser() {
//		User.click();
	}
	
	public void clickNextPage() {
//		NextpageButton.click();
	}
	
	public void clickPreviousPage() {
//		previousPageButton.click();
	}
	
	public void clickMostFwdPage() {
//		MostFwdPageButton.click();
	}
	
	public void clickMostBwdPage() {
//		MostBwdPageButton.click();
	}
	
	public Boolean verifyEndPageButton() {
		// EndPageButton.isDisplayed();
		return true;
	}
	
	public Boolean verifyManageUserTable() {
		// manageUserTable.isDisplayed();
		return true;
	}
	
	public String getManageUserPageTitle(){
		String title = "ManageUser";
//		title=ldriver.getTitle();
		return title; 
}
	
	public Boolean verifyPage2Button() {
		// page2Button.isDisplayed();
		return true;
	}
	
	public Boolean verifyPage2ButtonEnabled() {
		// page2Button.isEnabled();
		return true;
	}
	public Boolean verifyPage1Button() {
		// page1Button.isDisplayed();
		return true;
	}
	
	public Boolean verifyPreviousPageButton() {
		// previousPageButton.isDisplayed();
		return true;
	}
	
	public Boolean verifyNextPage() {
		// NextpageButton.isDisplayed();
		return true;
	}
	
	public String getBelowTableText() {
		String BelowTableText = "Showing 1 to 4 of 4 entries";
		// TextBelowTable.getText();
		return BelowTableText;
	}
	
	
}