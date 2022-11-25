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
Feature: Drop down

  @tag1
  Scenario: Verify drop down menu for state
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks the drop down icon for state
    Then Admin/User/Staff should select from the drop down menu for state
    
    @tag2
  Scenario: Verify drop down menu for user role
    Given Admin/User/Staff is on User details window
    When Admin/User/Staff clicks the drop down icon for User Role
    Then Admin/User/Staff should select from the drop down menu for user role
