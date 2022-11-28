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
Feature: Batch PageHeader/Footer Validation
Background: Admin/User/Staff Logged on to LMS website 
 
  Scenario: Validate Admin/user/staff landing in Manage page
    Given Admin/User/Staff is on one page after Login
    When Admin/User/Staff clicks the Batch option
    Then Admin/User/Staff should see the Manage Batch page
    Then Admin/User/Staff see header text as "Manage Batch "
     Then Admin/User/Staff see Footer text as "In total there are 21 batches "
