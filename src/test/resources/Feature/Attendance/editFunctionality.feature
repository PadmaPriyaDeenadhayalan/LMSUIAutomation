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
Feature: Edit Functionality

 @tag1
  Scenario: Verify the Edit Button
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Edit Button
    Then Admin see header text as Attendance Details

 @tag2
  Scenario: Edit ProgramName in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see the success message Updated Successfully
    
    @tag3
  Scenario: Edit User Name Attendance Details window
    Given User/Staffclicks on Edit Button
    When User/Staff clicks on Save button after changing User name
    Then User/Staff see the success message Updated Successfully

    @tag4
  Scenario: Edit Present in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after disabling Present details 
    Then User/Staff see the success message Updated Successfully
    
    @tag5
  Scenario: Edit Absent in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff see the success message Updated Successfully
    
     @tag6
  Scenario: Click on Cancel button in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Cancel button after entering details 
    Then User/Staff see a Attendance Details window getting closed
    
     @tag7
  Scenario: Admin Verify the Edit Button
    Given Admin is on Manage Attendance page
    When Admin Clicks on Edit Button
    Then Admin see Error Message Admin Has View Only Permission