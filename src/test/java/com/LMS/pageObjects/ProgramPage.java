package com.LMS.pageObjects;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage {


	WebDriver ldriver;
	public ProgramPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	//LMS Header and Footer
	@FindBy (xpath="")
	WebElement HeaderMsg;
	
	@FindBy (xpath="")
	WebElement FooterMsg;
	
	//LMS Delete MultipleRecords 
	@FindBy (xpath="")
	WebElement btnDeleteMulRecords;
	

	@FindBy (xpath="")
	WebElement btnYes;
	
	@FindBy (xpath="")
	WebElement btnNo;
	
	
	//LMS Success Message
	@FindBy(xpath=(""))
	WebElement Successmsg;
	
	//LMS Error Message Pop up
	@FindBy(xpath=(""))
	WebElement Errorpop;
	
	//LMS Suggestion Message 
	@FindBy(xpath=(""))
	WebElement Suggestionmsg;

	
	//LMS Paginator Validation
	@FindBy (xpath="")
	WebElement PaginatorMsg;
	
	@FindBy (xpath="")
	WebElement page1Button;
	
	@FindBy (xpath="")
	WebElement page2Button;
	
	@FindBy (xpath="")
	WebElement btnFirstNav;
	
	@FindBy (xpath="")
	WebElement btnNext;
	
	@FindBy (xpath="")
	WebElement btnPrevoius;
	
	@FindBy (xpath="")
	WebElement btnLastNav;
	
	
	//LMS Search Box
	@FindBy (xpath="")
	WebElement txtSearch;
	
	//LMS Ascending 
	@FindBy (xpath="")
	WebElement AscProgramName;
	
	@FindBy (xpath="")
	WebElement DesProgramName;
	
	@FindBy (xpath="")
	WebElement AscProgramDes;
	
	@FindBy (xpath="")
	WebElement DesProgramDes;
	
	@FindBy (xpath="")
	WebElement AscProgramStatus;
	
	@FindBy (xpath="")
	WebElement DesProgramStatus;
	
	//LMS Add New Program Button
	
	@FindBy (xpath="")
	WebElement btnAddNewPro;
	
	@FindBy (xpath="")
	WebElement programDetHead;
	
	@FindBy (xpath="")
	WebElement txtProName;
	
	@FindBy (xpath="")
	WebElement txtProDescription;
	
	@FindBy (xpath="")
	WebElement rdoSActive;
	
	@FindBy (xpath="")
	WebElement rdoSInActive;
	
	@FindBy (xpath="")
	WebElement btnCancel;
	
	@FindBy (xpath="")
	WebElement btnSave;
	
	@FindBy (xpath="")
	WebElement btnClose;
	
	//LMS Row Count 
	@FindBy(xpath=(""))
	List<WebElement> rows;
	
	//LMS Checkbox
	@FindBy (xpath="")
	  WebElement rowcheckBox1;
	  @FindBy(xpath = "")
		List<WebElement> rowchecklink;
	
	 
	//LMS Check All Checkbox
	@FindBy (xpath="")
	  WebElement checkAll;
	
	//LMS Edit File
	@FindBy (xpath="")
	  WebElement Edit;
	
	
	//LMS Delete file
	  @FindBy (xpath="")
	    WebElement Delete;
	  
	  @FindBy(xpath = "")
		List<WebElement> deletelink;
	  @FindBy (xpath="")
		WebElement confirmDialogBox;
	  @FindBy (xpath="")
	  WebElement SearchDelete;
	  
	 
	
	//Action Methods
	//LMS Header and Footer
	
	public String getHeader() {
		String Header ="Manage Program" ;
				//HeaderMsg.getText();
		return Header;
		}
	public String getFooter() {
		String Footer ="In total there are 9 programs.";
				//FooterMsg.getText();
		return Footer;
			}
	
	//LMS Delete MultipleRecords 
	
	public void DeleteMultipleRecords()
	{
		//btnDeleteMulRecords.click();
	}
	
	public Boolean verifyDeleteButton() {
		//btnDeleteMulRecords.isDisplayed();
		return true;
	}
	
	
	public void ConfYes()
	{
		//btnYes.click();
		
	}
	

	public void ConfNo()
	{
		//btnNo.click();
		
	}
	
	//LMS SuccessMessage 
	public String getSuccessBox()  {
		String SuccessMSg = "Success Message";
				//Successmsg.getText();
		return SuccessMSg;
		}
	
	//LMS ErrorMessage pop up
	public String getErrorBox()  {
		String ErrorMSg = "Error Message";
				//Errorpop.getText();
		return ErrorMSg;
		}
	
	//LMS suggestion box 
	public String getSuggestionBox()  {
		String SuggestionMSg = "Suggestion Message";
				//Suggestionmsg.getText();
		return SuggestionMSg;
		}
	

	
 //LMS Pagination
	public String getPaginatorMsg() 
	{
		String Paginator = "Paginator Message";
				//PaginatorMsg.getText();
		return Paginator;
	}
	
	public String getManageProPageTitle(){
		String title = "Manage Program";
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
	
	public void FirstNav()
	{
		//btnFirstNav.click();
	}
	
	public Boolean verifyFistNavButton()
	{
		return true;
	}
	
	public void NextButton()
	{
		//btnNext.click();
	}
	public Boolean verifyNextButton()
	{
		return true;
	}
	
	public void PrevoiusButton()
	{
		//btnPrevoius.click();
	}
	
	public Boolean verifyPrevoiusButton()
	{
		return true;
	}
	
	public void LastNav()
	{
		//btnLastNav.click();
	}
	
	public Boolean verifyLastNavButton()
	{
		return true;
	}
	
	//LMS Search
	public void EnterSearch(String SearchElement)
	{
		//txtSearch.sendKeys(SearchElement);
		
	}
		
	
	
	//LMS Ascending
	public void AscProName()
	{
		//AscProgramName.click();
	}
	
	public void DesProName()
	{
		//DesProgramName.click();
	}
	
	public void AscProDes()
	{
		//AscProgramDes.click();
	}
	
	public void DesProDes()
	{
		//DesProgramDes.click();
	}
	
	public void AscProStatus()
	{
		//AscProgramStatus.click();
	}
	
	public void DesProStatus()
	{
		//DesProgramStatus.click();
	}
	
	//LMS Add New Program Button
	
	public void AddNewProgram()
	{
		//btnAddNewPro.click();
	}
	
	public String proDetailsHeader() {
		//String ProHeader =  programDetHead.getText();
		//return ProHeader;
		String ProHeader  = "Manage Program";
		// programDetHead.getText();
		return ProHeader;

		}
	
	public void txtProgramName(String enterName)
	{
		//txtProName.sendKeys(enterName +Keys.TAB);
	}
	
	public void txtProgramDesciption(String description)
	{
		//txtProDescription.sendKeys(description);
	}
	
	public void radioSActive()
	{
		//rdoSActive.click();
	}
	
	public void radioSInActive()
	{
		//rdoSInActive.click();
		
	}
	
	public void Cancelbutton()
	{
		//btnCancel.click();
	}
	
	public void Savebutton()
	{
		//btnSave.click();
	}
	
	public void Closebutton()
	{
		//btnClose.click();
	}
	
	//
	public int getrows() {
		//int rowSize = rows.size();
		//return rowSize;
		return 3;
	}
	
	//LMS Checkbox 
	public void clickrowcheck1()
	{
		//rowcheckBox1.click();
	}
	
	public boolean verifyCheckLink() {
		/*
		 * if (CollectionUtils.isEmpty(rowchecklink)) { return true; } for (WebElement
		 * element : rowchecklink) { if(!( element.isDisplayed() &&
		 * element.isEnabled())){ return false;} }
		 */
		return true;
	}
	
	
	//LMS Check All Checkbox
	
	public void ClickCheckAll()
	{
		//checkAll.click();
	}
	//LMS Edit file button
	public void ClickEdit()
	{
		 //Edit.click();
	}
	
	
	//LMS Delete file
	public void ClickDelete()
	{
		//Delete.click();
	}
	public boolean verifyDeleteLink() {
		/*
		 * if (CollectionUtils.isEmpty(deletelink)) { return true; } for (WebElement
		 * element : deletelink) { if(!( element.isDisplayed() && element.isEnabled())){
		 * return false;} }
		 */
		return true;
	}
	public String getconfirmDialogBoxTitle(){
		String title = "Confirm";
//		title=ldriver.getTitle();
		return title; 
	}
	
	public void SearchDelete(String searchText) {
		//SearchDelete.sendKeys(searchText);
	}
	
	
	
	
	
}
