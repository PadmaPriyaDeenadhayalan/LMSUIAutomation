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
Feature: Edit Functionality


Background:
Given Admin is on Manage Batch page
When Admin Clicks  Edit buttton  


@tag1
Scenario: Validates Edit button in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks  Edit buttton  
Then Admin see header text as "Batch Details"

@tag2
Scenario: Edit Name in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks Edit button for Edit Name 
And Admin update the Name
Then  Admin Clicks Save  button after update the Name
Then Admin sshould see Success message "Updated Name" for Name Update 

@tag3
Scenario: Edit Description in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks  Edit button for Edit Description
And Admin select different Program Name By Scroll down
Then  Admin Clicks  Save  button after update Description 
Then Admin should see Success message"Updated Description" for Description Update

@tag4
Scenario: Edit Program Name from Dropdown in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks  Edit button for Edit Program Name
And Admin update the Description
Then  Admin Clicks Save  button after update Program Name
Then Admin seeing Success message "Updated Program Name" for Programname Update

@tag5
Scenario: Edit Status in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks  Edit button for Edit Status 
And Admin update the Status
Then  Admin Clicks Save  button after update  Status 
Then Admin see Success mmessage "Updated Status" for Status Update
@tag6
Scenario: Edit Number Of Classes in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks Edit button for Edit Number Of Classes
And Admin update No Of Classes
Then Admin Clicks Save  button after update Number Of Classes
Then Adminn see Success message "Updated No of Classes" for Class Update

@tag7
Scenario: Click on Cancel button in Batch Details window
Given Admin is on Manage Batch page
When Admin Clicks  Edit button for verify cancel function
And Admin Clicks on Cancel button to verify its function
Then Admin see a Batch Details window getting closed

@tag8
Scenario: Verify Edited Batch Name/BatchDescription 
Given Admin/User/Staff is on Manage Batch page 
When Admin/User/Staff  Enters edited Batch Name/Batch Description in Search
Then Entry for the edited  Batch Name/Batch Description is shown

@tag9
  Scenario:User/Staff Validate Edit button
  Given User/Staff is on Manage Batch page
  When User/Staff Clicks on Edit buttton for Validate Edit buttonn  
  Then User/Staff see a Error message  "Only Admin have Access"
  
