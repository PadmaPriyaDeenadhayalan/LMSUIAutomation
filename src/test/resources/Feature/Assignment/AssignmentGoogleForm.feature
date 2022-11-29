#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Assignment Google Form Validation 
 BackGroung: 
 Given Admin/User/Staff Logged on to LMS Website for Assignment

  @tag1
  Scenario: Admin/User/Staff enter  Assignment  Google Form
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff Clicks on anyone of Assignment Name in the Manage Assignment Page
    Then User/Staff are navigated to the Assignment Google Form
    Then  Admin view the Error Message in the suggestion Box is "Admin Don't have this Access"
  
  
@tag2  
Scenario: User Submit Assignment Google Form after entering all the fields in the form
    Given User is on Manage Assignment page
    When User enter all the fields "Fields" in the Assignment Google Form
    Then User  click on the SubmitButton in the Google form
    Then  Admin view the Success Message in the suggestion Box is "Submitted Assignment Google form Succesfully"
   
    
   @tag3  
  Scenario: User Clear all Fields int the Assignment Google Form after entering all the fields in the form
    Given User is on Manage Assignment page
    When User enter all the fields "Fields" in the Assignment Google Form for validation
    Then User click on the ClearButton in the Google form
    Then User the Empty field inthe google form 
    
    @tag4  
Scenario: User Submit Assignment Google Form without entering all the fields in the form
    Given User is on Manage Assignment page
    When User enter few fields "Fields" in the Assignment Google Form
    Then User  click on the SubmitButton in the Google form for Validation
    Then  Admin view the Error Message in the suggestion Box is "All Fields are Manditaory"
    
    @tag5  
Scenario: Admin/User/Staff clicks Switch account
    Given User is on Manage Assignment page
    When User Clicks on Swich Accountbutton in the Assignment Google Form
    Then User Navigated to the new acount and receives  "successfully Switched the Account" in the status
   
    

  