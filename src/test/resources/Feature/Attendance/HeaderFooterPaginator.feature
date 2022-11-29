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
Feature: Header,Footer and Paginator Validation

 @tag1
  Scenario: Validating the Attendance Header
    Given Admin/User/Staff Logging on to LMS Website
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text as Manage Attendance

 @tag2
  Scenario: Validating the Attendance Footer
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see Footer text as In total there are5entries.
    
     @tag3
  Scenario: Validating the Attendance Paginator
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as Showing1 to5 of5 entries.
    
    @tag4
  Scenario: Verify All paginator button on the Attendance page
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled