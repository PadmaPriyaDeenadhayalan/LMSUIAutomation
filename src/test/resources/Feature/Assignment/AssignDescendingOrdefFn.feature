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
Feature: Assignment Page Descending order Functionality
Background: Admin/User/Staff Logged on to LMS Website for Assignment Page
  
   @tag1
  Scenario:   Verify Assignment Names are displayed in Descending order
  Given   Admin/User/Staff is on Manage Assignment page
  When  Admin/User/Staff Clicks on  Assignment Name Descending Arrow
  Then  Admin/User/Staff view the Assignment Names are displayed in Descending order
  
  @tag2
  Scenario: Verify Assignment Descriptions are displayed in Descending order
  Given  Admin/User/Staff is on Manage Assignment page
  When Admin/User/Staff Clicks on Assignment Description Descending Arrow
  Then  Admin/User/Staff view the Assignment Descriptions are displayed in Descending order
  
  @tag3
  Scenario:  Verify Assignment Duedates are displayed in Ascending order
  Given Admin/User/Staff is on Manage Assignment page
  When  Admin/User/Staff Clicks on Assignment Duedate Descending Arrow
  Then  Admin/User/Staff view the Assignment Duedates are displayed in Descending order
  
   @tag4
  Scenario: Verify Assignment Grades are displayed in Descending order
  Given  Admin/User/Staff is on Manage Assignment page
  When Admin/User/Staff Clicks on Assignment Grade Descending  Arrow
  Then Admin/User/Staff view the Assignment Grades are displayed in Descending order