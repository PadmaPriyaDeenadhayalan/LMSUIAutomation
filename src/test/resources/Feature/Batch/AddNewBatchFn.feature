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
Feature: Add A New Program Functionality

Background: 
	

@tag1
  Scenario: Validate Add A New Batch button
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  Then Admin see New window whose header  as "Batch Details"
  
  @tag2
  Scenario: No details Entered in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When Admin Clicks on Save button with out entering  details 
  Then Admin see Error message "All Fields requiredd" without  giving any details
  
  
  @tag3
  Scenario: Enters  All details in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When  Admin Clicks on Save button after entering all details
  Then Admin see Success message "New Batch is added" after enter all the details
  
  @tag4
  Scenario: Enters Only Name in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When Admin Clicks on Save button after entering BatchName alone
  Then Admin see Error message "All Fields required"
  
  @tag5
  Scenario: Enters Only Description in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When Admin Clicks on Save button after entering Description alone
  Then Admin see Error message "All Fields required" after enter Description alone
  
  @tag6
  Scenario: Selects only a Program name from Dropdown in Batch Details window 
 Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When Admin Clicks on DropDown Menu 
  And Selects  a Program name by Dropdown menu in Batch Details window 
  Then Admin Clicks on Save button after entering Program Name alone
  Then  Admin see Error message "All Fields required" after enter program Name
  
  @tag7
  Scenario: Selects Status only in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When  Admin select Status 
  Then Admin Clicks on Save button after entering Program Name alone
  Then  Admin see Error message "All Fields required" after Select Status alone
  
  @tag8
  Scenario: Enters Only Number Of Classes in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When  Admin enter no of clasees vaue in No of classes field in Batch Deails Window 
  Then Admin Clicks on Save button after entering  No of classes alone
  Then  Admin see Error message "All Fields required" after enter No of classes alone
  
   @tag9
  Scenario: Click on Cancel button in Batch Details window
  Given Admin is on Manage Batch page
  When Admin Clicks on   + A New Batch button
  When Admin Clicks on Cancel button
  Then Admin see a Batch Details window getting closed after cancel the Add function
  
   
  