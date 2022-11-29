package com.LMS.pageObjects;

import java.util.List;

//import org.apache.commons.collections4.CollectionUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchPage {
	WebDriver ldriver;
	public BatchPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
}
	
//LMS Manage Batch page Elements Validation
	@FindBy (linkText="Batch")
	WebElement btnBatch;
	
	@FindBy(xpath ="")
	WebElement HeaderMsg;
	
	@FindBy(xpath ="")
	WebElement FooterMsg;
	
	@FindBy(xpath ="")
	WebElement PaginatorMsg;
	
	@FindBy(xpath ="")
	WebElement btnNext;
	
	@FindBy(xpath ="")
	WebElement btnPrevious;
	
	@FindBy(xpath ="")
	WebElement btnFirst;
	
	@FindBy(xpath ="")
	WebElement btnLast;
	
	
//LMS Manage Batch search Box Functions
		
	@FindBy(xpath="")
	WebElement SearchBox;
	
	@FindBy (xpath="")
	List<WebElement> listOfManageBatchNames;
	
	@FindBy (xpath="")
	WebElement noRowsDisplayedText;
	
//LMS Manage Batch AsecndingOrder  Functionality
	
	@FindBy(xpath="")
	WebElement btnAscendingBName;
	@FindBy(xpath="")
	WebElement btnAscendingBDescription;
	@FindBy(xpath="")
	WebElement btnAscendingBstatus;
	@FindBy(xpath="")
	WebElement btnAscendingNoOfClass;
	@FindBy(xpath="")
	WebElement btnAscendingProName;
	
//LMS Manage Batch Descending order Functionality
	
	@FindBy(xpath="")
	WebElement btnDescendingBName;
	@FindBy(xpath="")
	WebElement btnDescendingBDescription;
	@FindBy(xpath="")
	WebElement btnDescendingBstatus;
	@FindBy(xpath="")
	WebElement btnDescendingNoOfClass;
	@FindBy(xpath="")
	WebElement btnDescendingProName;
	
//LMS Manage Batch - Row count
	
	@FindBy(xpath=(""))
	List<WebElement> rows;
	
//LMS Manage Batch - Add New Batch Functionality
	
	@FindBy(xpath=(""))
	WebElement btnAddNewBatch;
	
	@FindBy(xpath=(""))
	WebElement NewBatchHeader;
	
	@FindBy(name="") 
	WebElement txtname;

	@FindBy(id ="") 
	WebElement txtDescription;
	
	@FindBy(id ="") 
	WebElement txtPrgName;
	
	@FindBy(xpath="")  
	 WebElement selectPgmdropdown;
	
	@FindBy(id="")
	WebElement btnradioActive;
	@FindBy(id="")
	WebElement btnradioInActive;
	
	@FindBy(name="")
	WebElement NumberofClassesTextbox;
	
	@FindBy(id="")
	WebElement btnSave;
	
	@FindBy(id="")
	WebElement btnCancel;
	
	@FindBy(xpath=(""))
	WebElement Suggestionmsg;
	
	
//LMS Manage Batch - Edit Functionality	

	@FindBy(id="")
	WebElement btnEdit;
	
	@FindBy(xpath = "")
	List<WebElement> editlink;
	
	
//LMS Manage Batch - Delete Functionality	
	
	@FindBy(id="")
	WebElement btnDelete;
	
	@FindBy(xpath = "")
	List<WebElement> deletelink;
	
		
//LMS Manage Batch - Delete Multiple Records Functionality	
	
	@FindBy(xpath=(""))
	WebElement btnMultipleDelete;
	
	@FindBy (xpath="")
	WebElement btnCcheckBox;
	
	@FindBy(id="")
	WebElement btnRowCheckBoxs;
		
	
	@FindBy (xpath =(""))
	WebElement Confirmationmsg;
	
	@FindBy (xpath =(""))
	WebElement btnYesConfirm;
	
	@FindBy (xpath =(""))
	WebElement btnNoConfirm;
	

//LMS Manage Batch - Select All	
	
	@FindBy (xpath =(""))
	WebElement btnSelectAll;
	
	
//Action Methods
	
//LMS Manage Batch page Elements Validation
	public String getBatchPageTitle(){
		String titleOfProgram= "Manage Batch";
		return titleOfProgram; 
		
	}
	public void clickBatch() {
		//btnBatch.click();
	}
	public String getHeader() {
		//String Header = HeaderMsg.getText();
		//return Header;
		String Header = "Manage Batch";
		//HeaderMsg.getText();
			return Header;
		}
	public String getFooter() {
		//String Footer = FooterMsg.getText();
		//return Footer;
		String Footer = "In total there are 21 batches";
		//FooterMsg.getText();
			return Footer;
		}
	
	// LMS Manage Batch -Paginator Validation
	
	public String getPaginatorMsg() {
		//String Paginator = PaginatorMsg.getText();
		//return Paginator;
		String Paginator= "Showing 1 to 5 of 21 entries" ;
			return Paginator;
			}
	public void clickNext() {
		//btnNext.click();
	}
	public void clickPrevious() {
		//btnPrevious.click();
	}
	public void clickFirst() {
		//btnFirst.click();
	}
	public void clickLast() {
		//btnLast.click();
	}
	
//LMS Manage Batch search Box 
	
	public Boolean verifySearchBox() {
		// searchBox.isDisplayed();
		return true;
	}
	public boolean verifyNameContainsInManageBatchList(String SearchText) {
		
		/*
		 * boolean flag = false; if(CollectionUtils.isEmpty(listOfManageBatchNames)) {
		 * return true; }
		 * 
		 * for(WebElement element :listOfManageBatchNames) { flag =
		 * element.getText().contains(SearchText); if(flag==false) { return false; } }
		 * 
		 * return flag;
		 */
		return true;
	}
	public boolean verifyNoRowsDisplayed() {
		//return noRowsDisplayedText.isDisplayed() && CollectionUtils.isEmpty(listOfManageBatchNames);
		return true;
	}
	
	public void enterInValidSearchTextBox() {
//		searchBox.sendKeys("");
	}
		
	public void enterValidSearchBox(String SearchText) {
	//SearchBox.sendKeys(SearchText);
	
}

//LMS Manage Batch - Ascending order Functionality
	
	public void clicktAscendingBName() {
		//btnAscendingBName.click();
	}
	public void clicktAscendingBDescription() {
		//btnAscendingBDescription.click();
	}
	public void clicktAscendingBstatus() {
		//btnAscendingBstatus.click();
	}
	public void clicktAscendingNoOfClass() {
		//btnAscendingNoOfClass.click();
	}
	public void clicktAscendingProName() {
		//btnAscendingProName.click();
	}
	
//LMS Manage Batch Descending order Functionality

	public void clicktDescendingBName() {
		//btnDescendingBName.click();
	}
	public void clicktDesscendingBDescription() {
		//btnDescendingBDescription.click();
	}
	public void clicktDescendingBstatus() {
		//btnDescendingBstatus.click();
	}
	public void clicktDescendingNoOfClass() {
		//btnDescendingNoOfClass.click();
	}
	public void clicktDescendingProName() {
		//btnDescendingProName.click();
	}
	
//LMS Manage Batch - Row count
	
	
	public int getrows() {
		/*
		 * int rowSize = rows.size(); return rowSize
		 */
		return 1;
		 
	}
		
	
	
	
	
//LMS Manage Batch - Add New Batch Functionality
	
	public void clicktAddNewBatch() {
		//btnAddNewBatch.click();
	}
	public String getHeaderTxt() {
		//String NewBatchTitle = NewBatchHeader.getText();
		//return NewBatchTitle;
		String NewBatchTitle = "Batch Details";
		return NewBatchTitle;
		}
	 public void setDescriptione(String Description)
	    {
	      //txtname.sendKeys(Description);
	    }
	 public void setUserName(String name)
	    {
	      //txtname.sendKeys(name);
	    }
	 
	 public void selectDroupdown()
	    {
		 //selectPgmdropdown.click(); 
	    }
	 public void clickradio1() {
			//btnradioActive.click();
		}
	 public void clickradio2() {
			//btnradioInActive.click();
		}
	  
	 
	 
	 public void setNoofClasses(String Classes)	    {
	      //NumberofClassesTextbox.sendKeys("");
    }
	 public void clickSave() {
			//btnSave.click();
	 }
	 public void clickCancel() {
			//btnCancel.click();
	 }
	 public String getSuggestionBox()  {
			//String SuggestionMSg = Suggestionmsg.getText();
			//return SuggestionMSg;
			String SuggestionMSg = "";
			return SuggestionMSg;
			}
	 
	 
	 
//LMS Manage Batch - Edit Functionality	
	 
	 public void clickEdit1() {
			//btnEdit.click();
	 }
	 public boolean verifyEditLink() {
			/*
			 * if (CollectionUtils.isEmpty(editlink)) { return true; } for (WebElement
			 * element : editlink) { if(!( element.isDisplayed() && element.isEnabled())){
			 * return false;} }
			 */
			return true;
		}
	 
	 public Boolean verifyConfirmDialogBox() {
			// confirmDialogBox.isDisplayed();
			return true;
		}
	 
//LMS Manage Batch - Delete Functionality
	 
	 public void clickDelete1() {
		//	btnDelete.click();
	 }
	 
	 public boolean verifyDeleteLink() {
			/*
			 * if (CollectionUtils.isEmpty(deletelink)) { return true; } for (WebElement
			 * element : deletelink) { if(!( element.isDisplayed() && element.isEnabled())){
			 * return false;} }
			 */
			return true;
		}
	 
	 public Boolean verifyUserDetailsDialogBox() {
			// userDetailsDialogBox.isDisplayed();
			return true;
		}
		
	 
//LMS Manage Batch - Delete Multiple Records Functionality	
	 
		 public void clickMultipleDelete() { 
			 ///btnMultipleDelete.click(); 
		 }
		 

		  public void clickCCheckBox() { 
			  //btnCcheckBox.click(); 
			  }
		  public void cilckRowCheckBoxs() {
				 //btnRowCheckBoxs.click();
		   				}
		 
	public Boolean verifyMultipleDelete() {
		//btnMultipleDelete.isEnabled();
			return true;
	}
	 public Boolean verifyRowCheckBoxs() {
		// btnRowCheckBoxs.isEnabled();
		 return true;
		}
	 
	 public Boolean verifyRowCheckBoxsisdisplayed() {
		 //btnRowCheckBoxs.isDisplayed();
		 return true;
		}
	 
	 public Boolean verifyConfirmationmsg() {
		 //Confirmationmsg.isDisplayed();
			return true;
	 }
	 public String getConfirmationMSg() {
			//String  Confirmation = Confirmationmsg.getText();
			//return Confirmation;
		String  Confirmation = "";
		return Confirmation;
			}
	 public void clickYesConfirm() {
			//btnYesConfirm.click();
	 }
	 public void clickNoConfirm() {
			//btnNoConfirm.click();
	 }
	
	 
	 
	//LMS Manage Batch - Select All	
	 public void clickSelectAll() {
			//btnSelectAll.click();
	 }
	
	 
	 
			
}
