package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver ldriver;
	public LogoutPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement logoutbutton;
	
	public void btnLogout()
	{
		//logoutbutton.click();
	}


}
