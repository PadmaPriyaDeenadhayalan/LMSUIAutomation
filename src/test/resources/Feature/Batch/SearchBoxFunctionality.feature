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
Feature: Search TextBox Functionality

  Background: Admin/User/Staff Logged on to LMS Website
    @tag1
  Scenario: Validate Search Feature
    Given Admin/User/Staff Logged on to LMS Website
    When  Admin/User/Staff is on Manage Batch page for search box
    Then  Admin/User/Staff see the Search Text box has text as "Search".
@tag2
  Scenario: Search by  Program Name
    Given  Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Batch Name to be searched 
    Then Entries for the searched BatchName are shown
@tag3
  Scenario: Search by Program Description
    Given  Admin/User/Staff is on Manage Batch page
    When  Admin/User/Staff enters Batch Description to be searched 
    Then Entries for the searched Batch Description are shown
@tag4
  Scenario: Search by  Program Status
    Given  Admin/User/Staff is on Manage Batch page
    When  Admin/User/Staff enters Batch Status to be searched 
    Then Entries for the searched Batch status are shown.
    
    @tag5
  Scenario: Search by  Program Status
    Given  Admin/User/Staff is on Manage Batch page
    When   Admin/User/Staff enters No Of Classes to be searched 
    Then Entries for the searched No Of Classes are shown.
    
    @tag6
  Scenario: Search by  Program Status
    Given  Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Program Name to be searched 
    Then Entries for the searched Program Name are shown.
    
