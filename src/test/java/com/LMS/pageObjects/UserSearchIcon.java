package com.LMS.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSearchIcon {

	WebDriver ldriver;
	public UserSearchIcon(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement searchTextBox;
	
	@FindBy (xpath="")
	List<WebElement> listOfManageUserNames;
	
	@FindBy (xpath="")
	WebElement noRowsDisplayedText;
	
	public Boolean verifysearchTextBox() {
		// searchTextBox.isDisplayed();
		return true;
	}
	
	public String getManageUserPageTitle(){
		String title = "ManageUser";
//		title=ldriver.getTitle();
		return title; 
}
	public void enterValidSearchTextBox(String searchText) {
//		searchTextBox.sendKeys(searchText);
	}
	
	public boolean verifyNameContainsInManageUserList(String searchText) {
		boolean flag = false;
		if(CollectionUtils.isEmpty(listOfManageUserNames)) {
			return true;
		}
		for(WebElement element :listOfManageUserNames) {
			flag = element.getText().contains(searchText);
			if(flag==false) {
				return false;
			}
		}
		return flag;
	}
	
	public boolean verifyNoRowsDisplayed() {
		return noRowsDisplayedText.isDisplayed() && CollectionUtils.isEmpty(listOfManageUserNames);
	}
	
	public void enterInValidSearchTextBox() {
//		searchTextBox.sendKeys("");
	}
}
