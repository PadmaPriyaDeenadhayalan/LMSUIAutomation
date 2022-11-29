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
Feature: Ascending order Functionality

Background: Admin/User/Staff Logged on to LMS Website


   @tag1
  Scenario:   Verify Batch Name are displayed in Ascending order
  Given   Admin/User/Staff is on Manage Batch page
  When  Admin/User/Staff Clicks on Batch Name Ascending Arrow
  Then  Admin/User/Staff see the Batch Name displayed in Ascending order
  
  @tag2
  Scenario: Verify Batch Description are displayed in Ascending order
  Given  Admin/User/Staff is on Manage Batch page
  When Admin/User/Staff Clicks on Batch Description Ascending Arrow
  Then  Admin/User/Staff see the Batch Description displayed in Ascending order
  
  @tag3
  Scenario:  Verify Batch Status are displayed in Ascending order
  Given Admin/User/Staff is on Manage Batch page
  When  Admin/User/Staff Clicks on Batch Status Ascending Arrow
  Then  Admin/User/Staff see the Batch Status displayed in Ascending order
  
   @tag4
  Scenario: Verify No Of Classess are displayed in Ascending order
  Given  Admin/User/Staff is on Manage Batch page
  When Admin/User/Staff Clicks on No Of Classess Ascending  Arrow
  Then Admin/User/Staff see the No Of Classes displayed in Ascending order
  
  @tag5
  Scenario:  Verify Program Name are displayed in Ascending order
  	Given Admin/User/Staff is on Manage Batch page
   	When Admin/User/Staff Clicks on Program Name Aescending  Arrow
 		Then AAdmin/User/Staff see the Program Name displayed in Aescending  order
  
  
  
  
    
