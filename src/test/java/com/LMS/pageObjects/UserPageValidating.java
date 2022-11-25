package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPageValidating {
	
	WebDriver ldriver;
	public UserPageValidating(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (linkText="User")
	WebElement User;
	
	@FindBy(xpath = "")
	WebElement footerText;
	
	public void clickUser() {
//		User.click();
	}
	
	public String getProgramPageTitle(){
		String titleProgram = "ManageProgram";
		return titleProgram; 
	}
	
	public String getManageUserPageTitle(){
		String title = "ManageUser";
//		title=ldriver.getTitle();
		return title; 
	}
	
	public String getFooterText() {
		String footerText = "In total there are 4 users";
		// footerText.getText();
		return footerText;
	}
}
