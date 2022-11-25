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
Feature: Table header

 @tag1
  Scenario: Validating Table header
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User
    Then Admin/User/Staff should see the table header as Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon, Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names

    @tag2
  Scenario: Verify the functionality of sort icon present in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks sort icon in table header
    Then Table rows should be sorted
    
     @tag3
  Scenario: Check box in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff checks empty checkbox in header
    Then Check box in all the rows of user table should be checked
    
     @tag4
  Scenario: Check box in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff unchecks checkbox in header
    Then Check box in all the rows of user table should be unchecked