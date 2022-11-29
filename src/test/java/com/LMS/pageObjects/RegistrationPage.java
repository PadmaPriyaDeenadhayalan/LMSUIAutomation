package com.LMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	

	WebDriver ldriver;
	public RegistrationPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	

	@FindBy(xpath="")
	@CacheLookup
	WebElement txtFirstName;
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtStreetNmae;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtCity;
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement dropState;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtzip;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement dobBirthDate;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtphonenumber;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement btnSignup;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement pageHeader;
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement viewLogin;
	
	//Suggestion Message
	@FindBy(xpath=(""))
	WebElement Suggestionmsg;
	
	public String SuggestionBox()  {
		String SuggestionMSg = "Enters the Fields";
				//Suggestionmsg.getText();
		return SuggestionMSg ;
		}
	
	public void FirstName() {
		
		//txtFirstName.sendKeys();
		
		
	}
	
	public String gettextofFirstname() {
		String getFirstName="Jhon";
		 //txtFirstName.getText();
		return getFirstName;
	}
	
	
	public void invalidFirstname() {
		//txtFirstName.sendKeys("178787******");
	}
	
	
	public void LastName() {
		
		//txtLastName.sendKeys();
		
	}
	
	public void invalidLastName() {
		//txtLastName.sendKeys("178787******");
	}
	
	
	public String gettextofLastname() {
		String getLastName="Joseph";
		 //txtLastName.getText();
		return getLastName;
	}
	
	public void Address() {
		//txtAddress.sendKeys();
	}
	
	public void invalidAddress() {
		//txtAddress.sendKeys("      ");
	}
	
	public String gettextofaddress() {
		String getAddress="hdsfj";
		// txtAddress.getText();
		return getAddress;
	}
	
	public void StreetName() {
		//txtStreetNmae.sendKeys();
	}
	public void invalidStreetname() {
		//txtStreetNmae.sendKeys("Texas");
	}
	
	
	public String gettextofstreetname() {
		String getStreet="gsdvhg";
		 //txtStreetNmae.getText();
		return getStreet;
	}
	
	public void City() {
		//txtCity.sendKeys();
	}
	
	public void invalidCity() {
		//txtCity.sendKeys("warriors");
	}
	
	
	public String gettextofcity() {
		String getCity="Chennai";
		  //txtCity.getText(); 
		return getCity;
	}
	
	
	public void State() {
		//Select sel= new Select(dropState);
		
		//sel.getOptions();
		
	}
	
	
	public void invalidState() {
		//Select sel= new Select(dropState);
		
		//sel.getOptions();
		
	}
	
	
	
	public String gettextofstate() {
		String getState="TamilNadu";
		//dropState.getText();
		 return getState;
	}
	
	
	public void zip() {
		//txtzip.sendKeys();
	}
	
	public void invalidzip() {
		//txtzip.sendKeys("@####$$");
	}
	
	public String gettextofzip() {
		String getZip="23432";
		//txtzip.getText();
		 return getZip;
	}
	
	public void Birthdate() {
		//Select sel= new Select(dobBirthDate);
		//sel.getOptions();
	}
	
	
	public String gettextofBirthdate() {
		String getBirth="24";
		// dobBirthDate.getText();
		 return getBirth;
	}
	public void Password() {
		//txtpassword.sendKeys();
	}
	public String gettextofpassword() {
		String getPassword="HiAll";
		
		//txtpassword.getText();
		 return getPassword;
	}
	
	public void invalidPassword() {
		//txtpassword.sendKeys("56656767");
	}
	
	
	
	public void UserName() {
		//txtUserName.sendKeys();
	}
	
	public String gettextofusername() {
		String getUseName="Hello";
		//txtUserName.getText();
		 return getUseName;
	}
	
	
	public void email() {
		//txtEmail.sendKeys();
	}
	
	public String gettextofemail() {
		String getEmail="sdf@gmail.com";
		//txtEmail.getText();
		 return getEmail;
	}
	
	
	
	
	public void PhoneNumber() {
		//txtphonenumber.sendKeys();
	}
	
	public void invalidPhoneNumber() {
		//txtphonenumber.sendKeys("aaaaaaaaaaa");
	}
	
	public String gettextofphoneNumber() {
		String getPhone="2343512";
		//txtphonenumber.getText();
		 return getPhone;
	}
	
	public void clickLogin() {
		//btnLogin.click();
	}
	
	public void clickSignup() {
		//btnSignup.click();
	}
	
	
	public String getPageHeader() {
		String Header ="Registration Form" ;
		//HeaderMsg.getText();
		return Header;
		
	}
	
	public String getLogin() {
		String getLogin="Get Login";
		//viewLogin.getText() ;
		return getLogin;
		//pageHeader.getText();
	}
	
	public void clearallfields() {
		//txtFirstName.clear();
		//txtLastName.clear();
		//txtAddress.clear();
		//txtStreetNmae.clear();
		//txtCity.clear();
		//txtzip.clear();
		//dobBirthDate.clear();
		//txtUserName.clear();
		//txtphonenumber.clear();
		//txtEmail.clear();
		//txtpassword.clear();
		
	}
	
	public void clearBirthDate() {
		//dobBirthDate.clear();
	}
	
	
	public void invalidUserName() {
		//txtUserName.sendKeys("#####yyyy");
	}
	
	
	
}


