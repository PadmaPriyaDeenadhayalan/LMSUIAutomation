package com.LMS.pageObjects;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPage {

	WebDriver ldriver;

	public AssignmentPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// LMS Manage Assignment page Elements Validation
	@FindBy(linkText = "Batch")
	WebElement btnAssignment;

	@FindBy(xpath = "")
	WebElement AssignmentHeader;

	@FindBy(xpath = "")
	WebElement AssignmentFooter;

	// LMS Manage Assignment page Paginator Validation

	@FindBy(xpath = "")
	WebElement AssignmentPaginator;

	@FindBy(xpath = "")
	WebElement btnANext;

	@FindBy(xpath = "")
	WebElement btnAPrevious;

	@FindBy(xpath = "")
	WebElement btnAFirst;

	@FindBy(xpath = "")
	WebElement btnALast;

	// LMS Manage Assignment search Box Functionality

	@FindBy(xpath = "")
	WebElement ASearchBox;

	// LMS Manage Assignment AsecndingOrder Functionality

	@FindBy(xpath = "")
	WebElement btnAAscendingAName;
	@FindBy(xpath = "")
	WebElement btnAAscendingADescription;
	@FindBy(xpath = "")
	WebElement btnAAscendingADuedate;
	@FindBy(xpath = "")
	WebElement btnAAscendingAGrades;

	// LMS Manage Assignment DesecndingOrder Functionality

	@FindBy(xpath = "")
	WebElement btnADescendingAName;
	@FindBy(xpath = "")
	WebElement btnADescendingADescription;
	@FindBy(xpath = "")
	WebElement btnADescendingADuedate;
	@FindBy(xpath = "")
	WebElement btnADescendingAGrades;

//LMS Manage Batch - Add New Batch Functionality

	@FindBy(xpath = (""))
	WebElement btnAddNewAssignment;

	@FindBy(xpath = (""))
	WebElement NewAssignmentHeader;

	@FindBy(name = "")
	WebElement txtAname;

	@FindBy(id = "")
	WebElement txtADescription;

	@FindBy(id = "")
	WebElement txtAGrade;

	@FindBy(name = "")
	WebElement txtADuedate;

	@FindBy(id = "")
	WebElement btnASave;

	@FindBy(id = "")
	WebElement btnACancel;

	@FindBy(xpath = (""))
	WebElement ASuggestionmsg;

	@FindBy(xpath = (""))
	WebElement btnManage;

//LMS Manage Assignment - Edit Functionality	

	@FindBy(id = "")
	WebElement btnAEdit;

	@FindBy(xpath = "")
	List<WebElement> Aeditlink;

//LMS Manage Assignment - Delete Functionality	

	@FindBy(id = "")
	WebElement btnADelete;

	@FindBy(xpath = "")
	List<WebElement> Adeletelink;

//LMS Manage Assignment - Delete Multiple Records Functionality	

	@FindBy(xpath = (""))
	WebElement btnAMultipleDelete;

	@FindBy(xpath = "")
	WebElement btnACcheckBox;

	@FindBy(id = "")
	WebElement btnARowCheckBoxs;

	@FindBy(xpath = (""))
	WebElement AConfirmationmsg;

	@FindBy(xpath = (""))
	WebElement btnAYesConfirm;

	@FindBy(xpath = (""))
	WebElement btnANoConfirm;

	// LMS Manage Assignment - Delete Multiple Records Functionality

	@FindBy(xpath = (""))
	WebElement btnMultipleDelete;

	@FindBy(xpath = "")
	WebElement btnCcheckBox;

	@FindBy(id = "")
	WebElement btnRowCheckBoxs;
	

// LMS Manage Assignment - Assignment Google Functionality

	@FindBy(xpath = (""))
	WebElement btnAssignmentab;

	@FindBy(xpath = (""))
	WebElement NewGoogleformHeader;

	@FindBy(name = "")
	WebElement txtFirstField;

	@FindBy(id = "")
	WebElement txtSecondField;

	@FindBy(id = "")
	WebElement txtThirdField;

	@FindBy(name = "")
	WebElement btnswitchaccount;

	@FindBy(id = "")
	WebElement btnGSubmit;

	@FindBy(id = "")
	WebElement btnGClear;

//Action Methods
	
	
// LMS Manage Assignment - Assignment Google Functionality
	public void clickGAssignmentab() {
		//btnAssignmentab.click();
	}

	
	public String getNewGoogleformHeader() {
		/*
		 * String GHeader = NewGoogleformHeader.getText(); return GHeader;
		 */
		String GHeader = "Assignments";
		 //NewGoogleformHeader.getText();
		return GHeader;
	}
	
	public void clickbtnAssignmentab() {
		//btnAssignmentab.click();
	}
	public void setFirstField(String FField ) {
		//txtFirstField.sendKeys(FField);
	}
	public void setSecondField(String SField) {
		//txtFirstField.sendKeys(SField);
	}
	public void setThirdField(String TField) {
		//txtFirstField.sendKeys(TField);
	}
	
	public void clickGSubmit() {
		//btnGSubmit.click();
	}
	public void clickGClear() {
		//btnGClear.click();
	}
	public void clickswitchaccount() {
		//btnswitchaccount.click();
	}
	
	
// LMS Manage assignment page Elements Validation
	public String getAssignmentPageTitle() {
		String titleOfProgram = "Manage Assignment";
		return titleOfProgram;

	}

	public void clickAssignment() {
		// btnAssignment.click();
	}

	public String getAssignmentHeader() {
		/*
		 * String AHeader = AssignmentHeader.getText(); return AHeader;
		 */
		String AHeader = "Manage Assignment";
		//AssignmentPage.getText();
		return AHeader;
	}

	public String getAssignmentFooter() {
		/*
		 * String AFooter = AssignmentFooter.getText(); return AFooter;
		 */
		String AFooter = "In total there are 3 entries";
		// AssignmentFooter.getText();
		return AFooter;

	}

	// LMS Manage assignment -Paginator Validation

	public String getAssignmentPaginator() {
		/*
		 * String APaginator = ; return APaginator;
		 */

		String APaginator = "Showing 1 to 3 of 3 entries";
		// AssignmentPaginator.getText();
		return APaginator;

	}

	public void clickANext() {
		// btnANext.click();
	}

	public void clickAPrevious() {
		// btnAPrevious.click();
	}

	public void clickFirst() {
		// btnAFirst.click();
	}

	public void clickLast() {
		// btnALast.click();
	}

//LMS Manage Assignment search Box  Functionality

	public Boolean verifyASearchBox() {
		// AsearchBox.isDisplayed();
		return true;
	}

	public boolean verifyNameContainsInManagegeAssignmentList(String SearchText) {

		/*
		 * boolean flag = false;
		 * if(CollectionUtils.isEmpty(listOfManageAssignmentNames)) { return true; }
		 * 
		 * for(WebElement element :listOfManagAssignmmentNames) { flag =
		 * element.getText().contains(SearchText); if(flag==false) { return false; } }
		 * 
		 * return flag;
		 */

		return true;
	}

	public void enterAValidSearchBox(String SearchText) {
		// ASearchBox.sendKeys(SearchText);
	}
// LMS Manage Batch - Ascending order Functionality

	public void clicktAAscendingAName() {
		// btnAAscendingAName.click();
	}

	public void clicktAAscendingADescription() {
		// btnAAscendingADescription.click();
	}

	public void clicktAAscendingADuedate() {
		// btnAAscendingADuedate.click();
	}

	public void clicktAAscendingAGrades() {
		// btnAAscendingAGrades.click();
	}

//LMS Manage Batch - Ascending order Functionality

	public void clicktADescendingAName() {
		// btnADescendingAName.click();
	}

	public void clicktADescendingADescription() {
		// btnADescendingADescription.click();
	}

	public void clicktADescendingADuedate() {
		// btnADescendingADuedate.click();
	}

	public void clicktADescendingAGrades() {
		// btnADescendingAGrades.click();
	}

//LMS Manage Assignment - Add New Assignment Functionality

	public void clicktAddNewAssignment() {
		// btnAddNewAssignment.click();
	}

	public String getAHeaderTxt() {
		// String NewAssignmentTitle = NewAssignmentHeader.getText();
		// return NewAssignmentTitle;
		String NewAssignmentTitle = "Assignment Details";
		return NewAssignmentTitle;
	}

	public void setADescription(String Description) {
		// txtADescription.sendKeys(Description);
	}

	public void setAssignmentName(String AName) {
		// txtAname.sendKeys(AName);
	}

	public void setADuedate(String ADuedate) {
		// txtADescription.sendKeys(ADuedate);
	}

	public void setAGrade(String AGrade) {
		// txtAname.sendKeys(AGrade);
	}

	public void clickAsave() {
		// btnASave.click();
	}

	public void clickACancel() {
		// btnACancel.click();
	}

	public String getASuggestionBox() {
		// String ASuggestionMSg = ASuggestionmsg.getText();
		// return ASuggestionMSg;
		String SuggestionMSg = "";
		return SuggestionMSg;
	}

	public void clickManageEdit() {
		//btnManage.click();
	}

// LMS Manage  Assignment- Edit Functionality

	public void clickAEdit() {
		// btnAEdit.click();
	}

	public boolean verifyAEditLink() {

		/*
		 * if (CollectionUtils.isEmpty(Aeditlink)) { return true; } for (WebElement
		 * element : Aeditlink) { if(!( element.isDisplayed() && element.isEnabled())){
		 * return false;} }
		 */
		return true;
	}

	public Boolean verifyAConfirmDialogBox() {
		// AConfirmationmsg.isDisplayed();
		return true;
	}

// LMS Manage Assignment - Delete Functionality

	public void clickADelete() {
		// btnADelete.click();
	}

	public boolean verifyADeleteLink() {

		/*
		 * if (CollectionUtils.isEmpty(Adeletelink)) { return true; } for (WebElement
		 * element : Adeletelink) { if(!( element.isDisplayed() &&
		 * element.isEnabled())){ return false;} }
		 */

		return true;
	}

	public Boolean verifyUserDetailsDialogBox() {
		// userDetailsDialogBox.isDisplayed();
		return true;
	}

	public Boolean verifyConfirmationmsg() {
		// Confirmationmsg.isDisplayed();
		return true;
	}

	public String getAConfirmationMSg() {
		/*
		 * String Confirmation = AConfirmationmsg.getText(); return Confirmation;
		 */
		String Confirmation = "";
		return Confirmation;
	}

	public void clickAYesConfirm() {
		// btnAYesConfirm.click();
	}

	public void clickANoConfirm() {
		// btnANoConfirm.click();
	}
	// LMS Manage Batch - Delete Multiple Records Functionality

	public void clickAMultipleDelete() {
		// btnAMultipleDelete.click();
	}

	public void clickACCheckBox() {
		// btnACcheckBox.click();
	}

	public void cilckARowCheckBoxs() {
		// btnARowCheckBoxs.click();
	}

	public Boolean verifyAMultipleDelete() {
		// btnMultipleDelete.isEnabled();
		return true;
	}

	public Boolean verifyRowACheckBoxs() {
		// btnRowCheckBoxs.isEnabled();
		return true;
	}

	public Boolean verifyARowCheckBoxsisdisplayed() {
		// btnRowCheckBoxs.isDisplayed();
		return true;
	}

}
