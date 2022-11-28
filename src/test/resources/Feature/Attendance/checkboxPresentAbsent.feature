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
Feature: CheckBox,Present,Absent Functionality
BackGround: Admin/User/Staff Logged on to LMS Website

 @tag1
  Scenario: Verifying the Checkbox functionality of a Program Name
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff Clicks on Checkbox 
    Then Admin/User/Staff  see list of Users in that Program

@tag2
  Scenario: Verifying the Functionality of a Present button
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff  Clicks on Present 
    Then Admin/User/Staff  see the list of  User Name who are Present
    
    @tag3
  Scenario: Verifying the Functionality of a Absent button
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff  Clicks on Absent 
    Then Admin/User/Staff  see the list of  User Name who are Absent
    
    
