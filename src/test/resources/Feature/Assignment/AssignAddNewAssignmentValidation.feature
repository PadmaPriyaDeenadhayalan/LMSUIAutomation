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
Feature: Assignment Add A New Assignment Functionality Validation

Background: 
	

@tag1
  Scenario: Validate Assignment Add A New Assignment button
  Given Staff is on Manage Assignment page 
  When Staff Clicks on   + A New Assignment button
  Then Staff view New window whose header  as "Assignment Details"
  
   @tag2
  Scenario: Click on Cancel button in Assignment Details Table
  Given  Staff is on Manage Assignment page
  When  Staff Clicks on   + A New Assignment button
  Then Staff Clicks on Cancel button
  Then  Staff Viewe a Assignment Details window getting closed after cancel the Add function
  
  @tag3
  Scenario: Verify Added New Assignment in the AssignmenPage
  Given Admin/User/Staff is on Manage Assignment page 
  When Admin/User/Staff Enters newly added "Assignment  Name " in Search Box
  Then Admin/User/Staff view the newly added Assignment Name  
  
  
  @tag4
  Scenario: Admin/Userf Validate Add A New Assignment button
  Given Admin/User is on Manage Assignment page
  When Admin/User Clicks on  " + A New Asssignment" button
  Then Admin/User get a Error message "Only Staff have this Access" in the SuggestionBox of MAnage Assignment Page
  
  @tag1
  Scenario: Validate Manage button on Assignment page
  Given Staff is on Manage Assignment page 
  When Staff Clicks on  Grade Manage on Assignment Page
  Then Staff view New Grade window whose header  is "Assignment Grade"
  
  
  
  
  
  
   