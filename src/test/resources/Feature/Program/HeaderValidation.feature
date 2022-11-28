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
Feature: Header Validation / Footer Validation
  

  @tag1
  Scenario: Validating the Manage Program Header
    Given  Admin/User/Staff  Logged on to LMS Website
    When Admin/User/Staff  is on Manage Program page
    Then Admin/User/Staff see header text as "Manage Program"
    
   @tag2
  Scenario: Validating the Manage Program Footer
    Given  Admin/User/Staff Logged on to LMS Website Footer 
    When Admin/User/Staff is on Manage Program  
    Then Admin/User/Staff see  Footer text as "In total there are 9 programs."


