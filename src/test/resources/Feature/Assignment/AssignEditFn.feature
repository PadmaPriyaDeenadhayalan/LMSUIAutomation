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
Feature: AssignmentEdit Functionality

@tag1
Scenario: Validates AssignmentPageEdit button in Batch Details window

Given Staff is on Manage Assignment page
When Staff Clicks  AssignmentEdit buttton  
Then Staff see Assignmenheader text as "Assignment Details"

@tag2
Scenario: Staff Edit AssignmentName in Assignment Details window

Given Staff is on Manage Assignment page
When Staff Clicks AssignmentEdit button for Edit AssignmentName 
And Staff update the "AssignmentName" for Assignment Name Update
Then  Staff Clicks Assignment window Save  button after update the AssignmentName
Then Staff view the Assignment Success message as "AssignmentName is Updated" after Updater the Assignment Name

@tag3
Scenario: Staff Edit AssignmentDescription in Assignment Details window

Given Staff is on Manage Assignment page
When Staff Clicks AssignmentEdit button for Edit AssignmentDescription 
And Staff update the "AssignmentDescription"  for Assignment Description Update
Then  Staff Clicks Assignment window Save  button after update the AssignmentDescription
Then Staff view the Assignment Success message as " AssignmentDesceiption is Updated "after Assignment Description Update 



@tag4
Scenario: Staff Edit AssignmentDuedate in Assignment Details window

Given Staff is on Manage Assignment page
When Staff Clicks AssignmentEdit button for Edit AssignmentDuedate 
And Staff update the "AssignmentDuedate"  Assignment Duedate Update
Then  Staff Clicks Assignment window Save  button after update the AssignmentDuedate 
Then Staff view the Assignment Success message as "AssignmentDuedate  is Updated " Assignment Duedate Update

@tag5
Scenario: Staff Edit AssignmentGrade in Assignment Details window

Given Staff is on Manage Assignment page
When Staff Clicks AssignmentEdit button for Edit AssignmentGrade
And Staff update the "AssignmentGrade" Assignment Grade Update
Then  Staff Clicks Assignment window Save  button after update the AssignmentGrade
Then Staff view the Assignment Success message as " AssignmentGrade is Updated" Assignment grade Update


@tag6
Scenario:  Staff  Click on Cancel button in Assignment Details window
Given  Staff is on Manage Assignment page
When  Staff  Clicks  AssignmentEdit button for verify Assignmentcancel function
And Staff  Clicks on AssignmentCancel button to verify its function
Then  Staff  View the Assignment Details window got closed

@tag7
Scenario: Staff Verify Edited Assignment Details
Given Staff is on Manage Assignment page
When Staff  Enters edited "Assignment detail" in Assignment page SearchBox
Then Staff view the edited  Assignment detail in the Manage Assignment Table

@tag8
  Scenario: Admin/User Validate Assignment page Edit button
  Given Admin/User is on Manage Assignment page
  When Admin/User Clicks on Assignment Edit buttton for Validate Edit button  
  Then Admin/User see a Assignment page Error message  "Only Staff have  this Access"
  
