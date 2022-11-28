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
Feature: Assignment Delete Functionality
@tag1
Scenario: Verify Delete Functionality with Yes Select
    Given Staff is on Manage Assignment page 
    When Staff Clicks on any  Row Delete button located on the right side of specificRow for Validate Delte Fn
    Then Staff see header text as "Delete Confirm"  after validate Delete button Function for Assignment Page
    Then Staff Clicks on Yes  button to   Delete  that Row in the confirmation window 
    And Staff view the  Success message as " Selected Assignment Deleted Succesfully" in the Assignment Page Confirmation popup window
  
 @tag2 
 Scenario: Verify Delete Functionality with No Select
    Given Staff is on Manage Assignment page 
    When Staff Clicks on any  Row  Delete button located on the right side of specificRow for Validate  No  buttonDelte Fn
    Then Staff see header text as "Delete Confirm"  after validate Delete button Function for Assignment Page
    Then Staff Clicks on No  button to   Delete  that Row in the confirmation window 
    And Staff view the confirmation window is closed Successfully

@tag4    
    Scenario: Admin/User Validates Manage Assignment  Page Delete button
    Given Admin/User is on Manage Assignment page 
    When Admin/User Clicks on any Assignment Row Delete buttton  
    Then Admin/User view  a Error message "Only Admin have Access" in the Assignment page confirmation window
  
 