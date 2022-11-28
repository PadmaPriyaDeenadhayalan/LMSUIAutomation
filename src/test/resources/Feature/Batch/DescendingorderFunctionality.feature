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
Feature: Descending order Functionality

Background: Admin/User/Staff Logged on to LMS Website


   @tag1
  Scenario:   Verify Batch Name are displayed in Descending order
  Given  Admin/User/Staff is on Manage Batch page
  When  Admin/User/Staff Clicks on BatchNameDescending Arrow
  Then  Admin/User/Staff see the BatchNamedisplayed in Descending order
  
  @tag2
  Scenario: Verify Batch Description are displayed in Descending order
  Given  Admin/User/Staff is on Manage Batch page
  When   Admin/User/Staff Clicks on BatchDescriptionDescending Arrow
  Then   Admin/User/Staff see the BatchDescriptiondisplayedinDescending order
  
  @tag3
  Scenario:  Verify Batch Status are displayed in Descending order
  Given  Admin/User/Staff is on Manage Batch page
   When  Admin/User/Staff Clicks on BatchStatusDescending Arrow
  Then  Admin/User/Staff see the BatchStatusdisplayed in Descending order
  
  @tag4
Scenario:  Verify No Of Classess are displayed in Descending order
  Given  Admin/User/Staff is on Manage Batch page
  When  Admin/User/Staff Clicks on NoOfClassessDescending Arrow
  Then  Admin/User/Staff see the NoOfClassesdisplayed in Descending order
 
 @tag5
Scenario:  Verify Program Name are displayed in Descending order
  Given  Admin/User/Staff is on Manage Batch page
   When   Admin/User/Staff Clicks on ProgramNameDescending  Arrow
  Then   Admin/User/Staff see the ProgramNamedisplayed in Descending order

   