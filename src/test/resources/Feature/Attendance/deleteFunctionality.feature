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
# (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Delete Functionality

 @tag1
  Scenario: Verify the Delete Functionality
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on DeleteButton
    Then Admin see header text as Delete Confirm

 @tag2
  Scenario: Click on Yes button in Delete Confirm window
    Given User/Staff Clickks on DeleteButton
    When User/Staff  Clicks on  Yes  button
    Then User/Staff  see Success message Program Deleted Succesfully

    @tag3
  Scenario: Click on No button in Delete Confirm window
    Given User/Staff Clickks on DeleteButton
    When User/Staff  Clicks on No button
    Then User/Staff can see Program Name not deleted
    
    @tag4
  Scenario: Admin Verify the Delete Functionality
    Given Admin is on Manage Attendance page
    When Admin Clicks on DeleteButton
    Then Admin see Error Message Admin Has View Only Permission