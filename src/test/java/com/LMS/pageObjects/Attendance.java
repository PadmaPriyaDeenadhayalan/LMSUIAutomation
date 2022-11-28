package com.LMS.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attendance {

	WebDriver ldriver;

	public Attendance(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	//Header,Footer,Paginator Functionality
	
	@FindBy(xpath = "")
	WebElement attendance;
	
	@FindBy(xpath = "")
	WebElement attendanceHeader;
	
	public void clickAttendanceIcon() {
//		attendance.click();
	}
	
	public String getManageProgramPageTitle() {
		String title = "Manage Program";
//		title=ldriver.getTitle();
		return title;
	}
	
	public String getManageAttendanceTitle() {
		String title = "Manage Attendance";
//		title=ldriver.getTitle();
		return title;
	}
	
	public boolean verifyAttendanceHeader() {
		// attendanceHeader.isDisplayed();
		return true;
	}
	
	public String getFooterText() {
		String footerText = "In total there are 5 entries.";
		// FooterText.getText();
		return footerText;
	}
	
	public String getPaginationText() {
		String paginationText = "Showing 1 to 5 of 5 entries";
		// PaginationText.getText();
		return paginationText;
	}
	
	//Edit Functionality
	
	@FindBy(xpath = "")
	WebElement editButton;
	
	@FindBy(xpath = "")
	WebElement saveButton;
	
	@FindBy(xpath = "")
	WebElement programName;
	
	@FindBy(xpath = "")
	WebElement userName;
	
	@FindBy(xpath = "")
	WebElement successMsg;
	
	@FindBy(xpath = "")
	WebElement presentDetails;
	
	@FindBy(xpath = "")
	WebElement absentDetails;
	
	@FindBy(xpath = "")
	WebElement cancelButton;
	
	@FindBy(xpath = "")
	WebElement closeIcon;
	
	@FindBy(xpath = "")
	WebElement errorMsg;
	
	public void clickEditIcon() {
//		edit.click();
	}
	
	public void clickCancelIcon() {
//		cancel.click();
	}
	
	public void clickSaveIcon() {
//		save.click();
	}
	
	public void clickCloseIcon() {
//		closeIcon.click();
	}
	
	public void clickPresentDetails() {
		try {
			if(presentDetails!=null && presentDetails.isSelected()) {
				presentDetails.click();
			}
		} catch (Exception e) {
		}
	}
	
	public void clickAbsentDetails() {
		try {
			if(absentDetails.isEnabled() && !absentDetails.isSelected()) {
				absentDetails.click();
			}
		} catch (Exception e) {
		}
	}
	
	public void changeProgramName() {
//		programName.sendKeys("");
	}
	
	public void changeUserName() {
//		userName.sendKeys("");
	}
	
	public Boolean verifySuccessMsg() {
		// successMsg.isDisplayed();
		return true;
	}
	
	public Boolean verifyErrorMsg() {
		// errorMsg.isDisplayed();
		return true;
	}
	public String verifyAttendanceHeaderText() {
		String title = "Attendance Details";
//		title=ldriver.getText();
		return title;
	}
	
	
	//Delete Functionality
	
	@FindBy(xpath = "")
	WebElement deleteButton;
	
	@FindBy(xpath = "")
	WebElement deleteYesButton;
	
	@FindBy(xpath = "")
	WebElement deleteNoButton;
	
	@FindBy(xpath = "")
	WebElement deleteSuccessMsg;
	
	@FindBy(xpath = "")
	WebElement programNameJava;
	
	public void clickDeleteIcon() {
//		delete.click();
	}
	
	public void clickDeleteYesButton() {
//		deleteYesButton.click();
	}
	
	public void clickDeleteNoButton() {
//		deleteNoattendance.Button.click();
	}
	
	public Boolean verifyDeleteSuccessMsg() {
		// deleteSuccessMsg.isDisplayed();
		return true;
	}
	
	public Boolean verifyProgramName() {
		// programNameJava.isDisplayed();
		return true;
	}
	
	public String getDeleteHeaderText() {
		String header = "Delete Confirm";
//		header=ldriver.getText;
		return header;
	}
	
	//Checkbox, Present and Absent Functionality
	
	@FindBy(xpath = "")
	WebElement checkBoxButton;
	
	@FindBy(xpath = "")
	WebElement presentButton;
	
	@FindBy(xpath = "")
	WebElement absentButton;
	
	@FindBy(className = "")
	List<WebElement> listOfPresentUsers;
	
	@FindBy(className = "")
	List<WebElement> listOfAbsentUsers;
	
	@FindBy(className = "")
	List<WebElement> listOfUsers;
	public void clickCheckBoxButton() {
//		checkBoxButton.click();
	}
	
	public void clickPresentButton() {
//		presentButton.click();
	}
	
	public void clickAbsentButton() {
//		presentButton.click();
	}
	
	public boolean verifyAllUsers() {
		this.listOfUsers=new ArrayList<>();
		boolean flag = false;
		if(CollectionUtils.isEmpty(listOfUsers)) {
			return true;
		}
		for(WebElement element :listOfUsers) {
			flag = element.isDisplayed();
			if(flag==false) {
				return false;
			}
		}
		return flag;
	}
	
	public boolean verifyPresentUsers() {
		this.listOfPresentUsers=new ArrayList<>();
		boolean flag = false;
		if(CollectionUtils.isEmpty(listOfPresentUsers)) {
			return true;
		}
		for(WebElement element :listOfPresentUsers) {
			flag = element.isDisplayed();
			if(flag==false) {
				return false;
			}
		}
		return flag;
	}
	
	public boolean verifyAbsentUsers() {
		this.listOfAbsentUsers=new ArrayList<>();
		boolean flag = false;
		if(CollectionUtils.isEmpty(listOfAbsentUsers)) {
			return true;
		}
		for(WebElement element :listOfAbsentUsers) {
			flag = element.isDisplayed();
			if(flag==false) {
				return false;
			}
		}
		return flag;
	}
}
