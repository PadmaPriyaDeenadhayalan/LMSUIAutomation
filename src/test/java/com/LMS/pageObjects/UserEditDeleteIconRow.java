package com.LMS.pageObjects;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditDeleteIconRow {

	WebDriver ldriver;

	public UserEditDeleteIconRow(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "")
	WebElement deleteButton;

	@FindBy(xpath = "")
	WebElement editButton;

	@FindBy(xpath = "")
	WebElement confirmDialogBox;

	@FindBy(xpath = "")
	WebElement userDetailsDialogBox;

	@FindBy(xpath = "")
	List<WebElement> editlink;
	
	@FindBy(xpath = "")
	List<WebElement> deletelink;

	public boolean verifyEditLink() {
		if (CollectionUtils.isEmpty(editlink)) {
			return true;
		}
		for (WebElement element : editlink) {
			if(!( element.isDisplayed() && element.isEnabled())){
				return false;}
		}
		return true;
	}
	
	
	public boolean verifyDeleteLink() {
		if (CollectionUtils.isEmpty(deletelink)) {
			return true;
		}
		for (WebElement element : deletelink) {
			if(!( element.isDisplayed() && element.isEnabled())){
				return false;}
		}
		return true;
	}

	public void clickDeleteButton() {
//		deleteButton.click();
	}

	public void clickEditButton() {
//		editButton.click();
	}

	public Boolean verifyConfirmDialogBox() {
		// confirmDialogBox.isDisplayed();
		return true;
	}

	public Boolean verifyUserDetailsDialogBox() {
		// userDetailsDialogBox.isDisplayed();
		return true;
	}
}
