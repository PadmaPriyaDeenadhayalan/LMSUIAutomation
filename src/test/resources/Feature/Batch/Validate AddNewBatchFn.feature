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
Feature: Validate  Batch Add Newfunction
 @tag1
  Scenario: Verify Added New Batch Name
  Given Admin/User/Staff is on Manage Batch page 
  When Admin/User/Staff Enters newly added  Batch Name in Search Box
  Then Entry for the newly added Batch Name is shown 
  
  
  @tag2
  Scenario: User/Staff Validate Add A New Batch button
  Given User/Staff is on Manage Batch page
  When User/Staff Clicking on  " + A New Batch" button
  Then User/Staff see a Error message "Only Admin have Access" in the Ad NewProgram function