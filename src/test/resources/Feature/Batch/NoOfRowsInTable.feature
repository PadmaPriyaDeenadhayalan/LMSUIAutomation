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
Feature: Number of rows in a Table

   Background: Admin/User/Staff Logged on to LMS Website 
 @tag1
  Scenario: Validate Number of rows in a table
    Given  Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff counts number of rows in a table
    Then Admin/User/Staff get the result for count the number of rows in a tableas'5'