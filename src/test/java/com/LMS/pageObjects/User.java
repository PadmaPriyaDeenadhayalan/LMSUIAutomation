package com.LMS.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User {

	WebDriver ldriver;
	public User(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	//Add New User Function
	
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
	
	//User Cancel Button Functionality
	
	@FindBy (xpath="")
	WebElement cancelButton;
	
	public Boolean verifyCancelButton() {
		// cancelButton.isDisplayed();
		return true;
	}
	
	
	public void clickcancelButton() {
//		cancelButton.click();
	}
	
	public String getManageUserPageTitle(){
		String title = "Manage User";
//		title=ldriver.getTitle();
		return title; 
	}
	
	// User Cancel Icon Functionality
	
	@FindBy(xpath = "")
	WebElement cancelIcon;
	
	public Boolean verifycancelIcon() {
		// cancelIcon.isDisplayed();
		return true;
	}
	
	public String getUserDetailsWindowTitle(){
		String title = "User Details";
//		title=ldriver.getTitle();
		return title; 
	}
	public void clickcancelIcon() {
//		cancelIcon.click();
	}

	// Delete Functionality
	
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
	
	//User Details Window Box
	
	@FindBy (xpath="")
	WebElement addNewUserButton1;
	
	@FindBy (xpath="")
	WebElement userDetails;
	
	
	
	public void clickAddNewUserButton() {
//		addNewUserButton1.click;
	}
	
	public Boolean verifyUserDetailsHeading() {
		// userDetails.isDisplayed();
		return true;
	}
	
	//Edit Delete Icon Each row


	@FindBy(xpath = "")
	WebElement editButton;

	@FindBy(xpath = "")
	List<WebElement> editlink ;
	
	@FindBy(xpath = "")
	List<WebElement> deletelink;
	
	public boolean verifyEditLink() {
		this.editlink = new ArrayList<>();
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
		this.deletelink = new ArrayList<>();
		if (CollectionUtils.isEmpty(deletelink)) {
			return true;
		}
		for (WebElement element : deletelink) {
			if(!( element.isDisplayed() && element.isEnabled())){
				return false;}
		}
		return true;
	}


	public void clickEditButton() {
//		editButton.click();
	}

	public Boolean verifyUserDetailsDialogBox() {
		// userDetailsDialogBox.isDisplayed();
		return true;
	}
	
	//DropDown Functionality
	
	@FindBy(xpath = "")
	WebElement stateDropDownIcon;
	
	@FindBy(xpath = "")
	WebElement stateDropDownSelect;
	
	
	@FindBy (xpath="")
	WebElement userRoleDropDown;
	
	@FindBy(xpath = "")
	WebElement userRoleDropDownSelect;
	
	public void verifyStateDropDownIcon() {
//		 stateDropDownIcon.click();
	}
	
	public void verifyUserRoleDropDown() {
//		 userRoleDropDown.click();
	}
	public void verifyStateDropDownSelect() {
		// stateDropDownSelect.click();
	}
	
	public void VerifyuserRoleDropDownSelect() {
		// userRoleDropDownSelect.click();
	}
	
	//User Id Functionality
	
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
	
	// User Input Field Functionality
	
	@FindBy(xpath = "")
	WebElement firstName;
	
	@FindBy(xpath = "")
	WebElement lastName;
	
	@FindBy(xpath = "")
	WebElement emailAddress;
	
	@FindBy(xpath = "")
	WebElement phoneNo;
	
	@FindBy(xpath = "")
	WebElement address;
	
	@FindBy(xpath = "")
	WebElement city;
	
	@FindBy(xpath = "")
	WebElement state;
	
	@FindBy(xpath = "")
	WebElement postalCode;
	
	@FindBy(xpath = "")
	WebElement ugProgram;
	
	@FindBy(xpath = "")
	WebElement pgProgram;
	
	@FindBy(xpath = "")
	WebElement skill;
	
	@FindBy(xpath = "")
	WebElement experience;
	
	@FindBy(xpath = "")
	WebElement userRole;
	
	@FindBy(xpath = "")
	WebElement adminRole;
	
	@FindBy(xpath = "")
	WebElement staffRole;
	
	@FindBy(xpath = "")
	WebElement visaStatus;
	
	@FindBy(xpath = "")
	WebElement batch;
	
	@FindBy(xpath = "")
	WebElement comments;
	
	@FindBy(xpath = "")
	WebElement submitButton;
	
	@FindBy(xpath = "")
	WebElement errorMsgName;
	
	@FindBy(xpath = "")
	WebElement errorMsgEmail;
	
	@FindBy(xpath = "")
	WebElement errorInvalidInput;
	
	@FindBy(xpath = "")
	WebElement addAptSuiteButton;
	
	@FindBy(xpath = "")
	WebElement address2Button;
	
	@FindBy(xpath="")
	WebElement singleSelectTagDropdownWebElement;
	
	public boolean validateDropDownOptions() {

		  //  Select dropdown = new Select(singleSelectTagDropdownWebElement);
		    // Get all options
		    List<WebElement> allOptionsWebElement = new ArrayList<>();
		    		//dropdown.getOptions();
		    // Creating a list to store drop down options
		    List <String> optionsAsIs = new ArrayList<>();
		    for(WebElement optionElement : allOptionsWebElement){
		    	optionsAsIs.add(optionElement.getText());
		    }
		    // Removing "Please select" option as it is not actual option
		    optionsAsIs.remove("Please select");
		    // Creating a sortedOptions list to sort
		    List<String> sortedOptions = new ArrayList<>(optionsAsIs);
		    Collections.sort(sortedOptions);
		    return optionsAsIs.equals(sortedOptions);
	      }
	
	public Boolean verifyErrorMsgName() {
		// errorMsgName.isDisplayed();
		return true;
	}
	
	public Boolean verifyAddress2Button() {
		// address2Button.isDisplayed();
		return true;
	}
	
	public Boolean verifyErrorInvalidInput() {
		// errorInvalidInput.isDisplayed();
		return true;
	}
	
	public Boolean verifyAddAptSuiteButton() {
		// addAptSuiteButton.isDisplayed();
		return true;
	}
	
	public Boolean verifyErrorMsgEmail() {
		// errorMsgEmail.isDisplayed();
		return true;
	}
	
	public Boolean verifyFirstName() {
		// firstName.isEnabled();
		return true;
	}
	
	public void clickFirstName() {
		// firstName.sendKeys("");
		
	}
	
	public void clickAddAptSuiteButton() {
		// addAptSuiteButton.click();
		
	}
	
	public Boolean verifyLastName() {
		// lastName.isEnabled();
		return true;
	}
	
	public void clickLastName() {
		// lastName.sendKeys("");
		
	}
	
	public Boolean verifyEmailAddress() {
		// emailAddress.isEnabled();
		return true;
	}
	
	public void clickEmailAddress() {
		// emailAddress.sendKeys("");
		
	}
	
	public void clickInValidEmailAddress() {
		// emailAddress.sendKeys("");
		
	}
	
	public Boolean verifyPhoneNo() {
		// phoneNo.isEnabled();
		return true;
	}
	
	public void clickPhoneNo() {
		// phoneNo.sendKeys("");
		
	}
	
	public void clickInvalidPhoneNo() {
		// phoneNo.sendKeys("");
		
	}
	
	public Boolean verifyAddress() {
		// address.isEnabled();
		return true;
	}
	
	public void clickaddress() {
		// address.sendKeys("");
		
	}
	
	public void clickSubmitButton() {
		// submitButton.click();
		
	}
	
	public Boolean verifyCity() {
		// city.isEnabled();
		return true;
	}
	
	public void clickCity() {
		// city.sendKeys("");
	}
	
	public Boolean verifyState() {
		// state.isEnabled();
		return true;
	}
	
	public void clickstate() {
		// state.sendKeys("");
	}
	
	public Boolean verifyPostalCode() {
		// postalCode.isEnabled();
		return true;
	}
	
	public void clickPostalCode() {
		// postalCode.sendKeys("");
	}
	
	public void clickInvalidPostalCode() {
		// postalCode.sendKeys("");
	}
	
	public Boolean verifyUgProgram() {
		// ugProgram.isEnabled();
		return true;
	}
	
	public void clickUgProgram() {
		// ugProgram.sendKeys("");
	}
	
	public Boolean verifyPgProgram() {
		// pgProgram.isEnabled();
		return true;
	}
	
	public void clickPgProgram() {
		// pgProgram.sendKeys("");
	}
	
	public Boolean verifySkill() {
		// skill.isEnabled();
		return true;
	}
	
	public void clickSkill() {
		// skill.sendKeys("");
	}
	
	public Boolean verifyExperience() {
		// experience.isEnabled();
		return true;
	}
	
	public void clickExperience() {
		// experience.sendKeys("");
	}
	
	public Boolean verifyUserRole() {
		// userRole.isEnabled();
		return true;
	}
	
	public Boolean verifyAdminRole() {
		// adminRole.isEnabled();
		return true;
	}
	
	public Boolean verifyStaffRole() {
		// staffRole.isEnabled();
		return true;
	}
	
	public Boolean verifyVisaStatus() {
		// visaStatus.isEnabled();
		return true;
	}
	
	public void clickVisaStatus() {
		// visaStatus.sendKeys("");
	}
	
	public Boolean verifyBatch() {
		// batch.isEnabled();
		return true;
	}
	
	public void clickBatch() {
		// batch.sendKeys("");
	}
	
	public Boolean verifyComments() {
		// comments.isEnabled();
		return true;
	}
	
	public void clickComments() {
		// comments.sendKeys("");
	}

    // User Label Text Functionality
	
	@FindBy (id="firstNameWithPlaceholder")
	WebElement firstNamePlaceholder;
	
	@FindBy (id="lastNameWithPlaceholder")
	WebElement lastNamePlaceholder;
	
	@FindBy (id="middleNameWithPlaceholder")
	WebElement middleNamePlaceholder;
	
	@FindBy (id="emailAddressWithPlaceholder")
	WebElement emailPlaceholder;
	
	@FindBy (id="phoneNoWithPlaceholder")
	WebElement phonePlaceholder;
	
	@FindBy (id="addressWithPlaceholder")
	WebElement addressPlaceholder;
	
	@FindBy (id="cityWithPlaceholder")
	WebElement cityPlaceholder;
	
	@FindBy (id="postalCodeWithPlaceholder")
	WebElement postalPlaceholder;
	
	@FindBy (id="programWithPlaceholder")
	WebElement programPlaceholder;
	
	@FindBy (id="ugProgramWithPlaceholder")
	WebElement ugProgramPlaceholder;
	
	@FindBy (id="pgProgramWithPlaceholder")
	WebElement pgProgramPlaceholder;
	
	@FindBy (id="skillWithPlaceholder")
	WebElement skillPlaceholder;
	
	@FindBy (id="experienceWithPlaceholder")
	WebElement experiencePlaceholder;
	
	@FindBy (id="visaWithPlaceholder")
	WebElement visaPlaceholder;
	
	@FindBy (id="batchWithPlaceholder")
	WebElement batchPlaceholder;
	
	@FindBy (id="commentsWithPlaceholder")
	WebElement commentsPlaceholder;
	
	
	public boolean verifyLastNamePlaceholder() {
		
		 try {
			if(lastNamePlaceholder!=null && lastNamePlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(lastNamePlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyFirstNamePlaceholder() {
		 try {
			if(firstNamePlaceholder!=null && firstNamePlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(firstNamePlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifymiddleNamePlaceholder() {
		try {
			if(middleNamePlaceholder!=null && middleNamePlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(middleNamePlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyEmailAddressPlaceholder() {
		try {
			if(emailPlaceholder!=null && emailPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(emailPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyphonePlaceholder() {
		try {
			if(phonePlaceholder!=null && phonePlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(phonePlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyAddressPlaceholder() {
		try {
			if(addressPlaceholder!=null && addressPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(addressPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyCityPlaceholder() {
		try {
			if(cityPlaceholder!=null && cityPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(cityPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyPostalPlaceholder() {
		try {
			if(postalPlaceholder!=null && postalPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(postalPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyProgramPlaceholder() {
		try {
			if(programPlaceholder!=null && programPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(programPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyUGPlaceholder() {
		try {
			if(ugProgramPlaceholder!=null && ugProgramPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(ugProgramPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyPGPlaceholder() {
		try {
			if(pgProgramPlaceholder!=null && pgProgramPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(pgProgramPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifySkillPlaceholder() {
		try {
			if(skillPlaceholder!=null && skillPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(skillPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyExperiencePlaceholder() {
		try {
			if(experiencePlaceholder!=null && experiencePlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(experiencePlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyVisaPlaceholder() {
		try {
			if(visaPlaceholder!=null && visaPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(visaPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyBatchPlaceholder() {
		try {
			if(batchPlaceholder!=null && batchPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(batchPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyCommentsPlaceholder() {
		try {
			if(commentsPlaceholder!=null && commentsPlaceholder.isDisplayed()) {
				 return StringUtils.isNotBlank(commentsPlaceholder.getAttribute("placeholder"));
			 }
			 else {
				 return false;
			 }
		} catch (Exception e) {
			return false;
		}
	}
	//******************************************************************
	//Page Validation
	
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
	
	
	public String getFooterText() {
		String footerText = "In total there are 4 users";
		// footerText.getText();
		return footerText;
	}
	
	//*******************************************************************
	//Pagination Validation
	
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
	
	//****************************************************************************
	// Search Icon
	
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
	
	public void enterValidSearchTextBox(String searchText) {
//		searchTextBox.sendKeys(searchText);
	}
	
	public boolean verifyNameContainsInManageUserList(String searchText) {
		try {
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
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyNoRowsDisplayed() {
//		return noRowsDisplayedText.isDisplayed() && CollectionUtils.isEmpty(listOfManageUserNames);
		return true;
	}
	
	public void enterInValidSearchTextBox() {
//		searchTextBox.sendKeys("");
	}
	
	//*****************************************************************************************************
	// Submit Button Functionality
	
	@FindBy(xpath = "")
	WebElement submitText;
	
//	@FindBy(xpath = "")
//	WebElement submitButton;
//	
//	@FindBy (xpath="")
//	WebElement userDetails;
//	
//	@FindBy (xpath="")
//	WebElement errorMsg;
//	
//	@FindBy(xpath = "")
//	WebElement firstName;
//	
//	@FindBy(xpath = "")
//	WebElement lastName;
//	
//	@FindBy(xpath = "")
//	WebElement emailAddress;
	
//	@FindBy(xpath = "")
//	WebElement phoneNo;
//	
//	@FindBy(xpath = "")
//	WebElement address;
//	
//	@FindBy(xpath = "")
//	WebElement city;
//	
//	@FindBy(xpath = "")
//	WebElement state;
//	
//	@FindBy(xpath = "")
//	WebElement postalCode;
//	
//	@FindBy(xpath = "")
//	WebElement ugProgram;
//	
//	@FindBy(xpath = "")
//	WebElement pgProgram;
//	
//	@FindBy(xpath = "")
//	WebElement skill;
//	
//	@FindBy(xpath = "")
//	WebElement experience;
//	
//	@FindBy(xpath = "")
//	WebElement userRole;
//	
//	@FindBy(xpath = "")
//	WebElement adminRole;
//	
//	@FindBy(xpath = "")
//	WebElement staffRole;
//	
//	@FindBy(xpath = "")
//	WebElement visaStatus;
//	
//	@FindBy(xpath = "")
//	WebElement batch;
//	
//	@FindBy(xpath = "")
//	WebElement comments;
	
	@FindBy(xpath = "")
	WebElement newUser;
	
	public Boolean verifySubmitButton() {
		// submitText.isDisplayed();
		return true;
	}
	
	public Boolean verifyNewUser() {
		// newUser.isDisplayed();
		return true;
	}
	
//	public Boolean verifyUserDetailsHeading() {
//		// userDetails.isDisplayed();
//		return true;
//	}
	
	public void clicksubmitButton() {
//		submitButton.click();
	}
	
	public Boolean verifyErrorMsg() {
		// errorMsg.isDisplayed();
		return true;
	}
	
//	public void verifyFirstName() {
//		// firstName.sendKeys("");
//		
//	}
//	
//	public void verifyLastName() {
//		// lastName.sendKeys("");
//		
//	}
//	
//	public void verifyEmailAddress() {
//		// emailAddress.sendKeys("");
//		
//	}
//	
//	public void verifyPhoneNo() {
//		// phoneNo.sendKeys("");
//		
//	}
//	
//	public void verifyAddress() {
//		// address.sendKeys("");
//		
//	}
//	
//	public void verifyCity() {
//		// city.sendKeys("");
//		
//	}
//	
//	public void verifyState() {
//		// state.sendKeys("");
//		
//	}
//	
//	public void verifyPostalCode() {
//		// postalCode.sendKeys("");
//		
//	}
//	
//	public void verifyUgProgram() {
//		// ugProgram.sendKeys("");
//		
//	}
//	
//	public void verifyPgProgram() {
//		// pgProgram.sendKeys("");
//		
//	}
//	
//	public void verifySkill() {
//		// skill.sendKeys("");
//		
//	}
//	
//	public void verifyExperience() {
//		// experience.sendKeys("");
//		
//	}
//	
//	public void verifyUserRole() {
//		// userRole.sendKeys("");
//		
//	}
//	
//	public void verifyAdminRole() {
//		// adminRole.sendKeys("");
//		
//	}
//	
//	public void verifyStaffRole() {
//		// staffRole.sendKeys("");
//		
//	}
//	
//	public void verifyVisaStatus() {
//		// visaStatus.sendKeys("");
//		
//	}
//	
//	public void verifyBatch() {
//		// batch.sendKeys("");
//		
//	}
//	
//	public void verifyComments() {
//		// comments.sendKeys("");
//		
//	}
	//*********************************************************************************
	//Table Header Functionality
	
	@FindBy(xpath = "")
	WebElement checkBox;

	@FindBy(xpath = "")
	WebElement id;

	@FindBy(xpath = "")
	WebElement idSortIcon;

	@FindBy(xpath = "")
	WebElement name;

	@FindBy(xpath = "")
	WebElement nameSortIcon;

//	@FindBy(xpath = "")
//	WebElement emailAddress;

	@FindBy(xpath = "")
	WebElement emailAddressSortIcon;

	@FindBy(xpath = "")
	WebElement contactNumber;

	@FindBy(xpath = "")
	WebElement contactNumberSortIcon;

//	@FindBy(xpath = "")
//	WebElement batch;

	@FindBy(xpath = "")
	WebElement batchSortIcon;

//	@FindBy(xpath = "")
//	WebElement skill;

	@FindBy(xpath = "")
	WebElement skillSortIcon;

	@FindBy(xpath = "")
	WebElement edit;

	@FindBy(xpath = "")
	WebElement delete;

	@FindBy(className = "")
	List<WebElement> allCheckBoxes;

	@FindBy(xpath = "")
	List<WebElement> tableRows;

	public void verifyTableRows() {

		this.tableRows = new ArrayList<>();
		List<String> obtainedList = new ArrayList<>();
		for (WebElement we : tableRows) {
			obtainedList.add(we.getText());
		}
		List<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
	}

	public boolean verifyAllCheckBoxes() {
		this.allCheckBoxes=new ArrayList<>();
		if (CollectionUtils.isEmpty(allCheckBoxes)) {
			return true;
		}
		for (WebElement element : allCheckBoxes) {
			if (!(element.isSelected())) {
				return false;
			}
		}
		return true;
	}

	public boolean verifyAllUnCheckedBoxes() {
		this.allCheckBoxes=new ArrayList<>();
		if (CollectionUtils.isEmpty(allCheckBoxes)) {
			return true;
		}
		for (WebElement element : allCheckBoxes) {
			if (element.isSelected()) {
				return false;
			}
		}
		return true;
	}


	public Boolean verifyid() {
		// id.isDisplayed();
		return true;
	}

	public Boolean verifyidSortIcon() {
		// idSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyname() {
		// name.isDisplayed();
		return true;
	}

	public Boolean verifynameSortIcon() {
		// nameSortIcon.isDisplayed();
		return true;
	}

//	public Boolean verifyEmailAddress() {
//		// emailAddress.isDisplayed();
//		return true;
//	}

	public Boolean verifyEmailAddressSortIcon() {
		// emailAddressSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyContactNumber() {
		// contactNumber.isDisplayed();
		return true;
	}

	public Boolean verifyContactNumberSortIcon() {
		// contactNumberSortIcon.isDisplayed();
		return true;
	}

//	public Boolean verifyBatch() {
//		// batch.isDisplayed();
//		return true;
//	}

	public Boolean verifyBatchSortIcon() {
		// batchSortIcon.isDisplayed();
		return true;
	}

//	public Boolean verifySkill() {
//		// skill.isDisplayed();
//		return true;
//	}

	public Boolean verifySkillSortIcon() {
		// skillSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyEdit() {
		// edit.isDisplayed();
		return true;
	}

	public Boolean verifyDelete() {
		// delete.isDisplayed();
		return true;
	}

	public void clickIdSortIcon() {
//		idSortIcon.click();
	}

	public void clickNameSortIcon() {
//		nameSortIcon.click();
	}

	public void clickEmailAddressSortIcon() {
//		emailAddressSortIcon.click();
	}

	public void clickContactNumberSortIcon() {
//		contactNumberSortIcon.click();
	}

	public void clickBatchSortIcon() {
//		batchSortIcon.click();
	}

	public void clickSkillSortIcon() {
//		skillSortIcon.click();
	}

	public void clickCheckBoxIcon() {
//		checkBox.click();
	}
}
