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
Feature: Delete Functionality
@tag1
Scenario: Verify Delete Functionality with Yes Select
    Given Admin is on Manage Batch page 
    When Admin Clicks on any Delete button located on the right side of specificRow for Validate Delte Fn
    Then Admin see header text as "Delete Confirm"  after validate Delete button Function
    Then Admin Clicks on Yes  button for Delete Row
    And Admin see Success message "Program Deleted Succesfully" after verify Delete button function
  
 @tag2 
 Scenario: Verify Delete Functionality with No Select
    Given Admin Clicks on any Delete button located on the right side of specificRow 
    Then Admin see header text as "Delete Confirm" for verify No case
    Then Admin Clicks on No  button for delete functionality verification
    Then Admin can see Program Name not deleted
 
@tag3
 Scenario: Validate Deleted Batch Name after delete by using RowDelete 
    Given  Admin/User/Staff is on Manage Batch page  
    When Admin/User/Staff Enters deleted  Program Name in Search
    Then Admin/User/Staff finds no results for verify Delete Funtionality
    
 @tag4    
    Scenario: User/Staff Validates Delete button
    Given User/Staff is on Manage Batch page 
    When User/Staff Clicks on Delete buttton  
    Then User/Staff see a Error message "Only Admin have Access" after validate Delete  button Function
