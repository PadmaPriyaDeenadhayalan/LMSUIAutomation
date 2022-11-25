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
Feature: Submit button

  @tag1
  Scenario: Verify the presence of Submit button in User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a button with text as Submit in user details window
 
@tag2
  Scenario: Validating the User Details window with all fields empty
    Given Admin/User/Staff is on User Detailswindow
    When Admin/User/Staff clicks submit button with all details empty
    Then Admin/User/Staff should see a Error message Mandatory Fields cannot be empty
    
    @tag3
  Scenario: Adding new User
    Given Admin/User/Staff is on User Detailswindow
    When Admin/User/Staff clicks Submit button by entering all valid values in required fields
    Then Admin/User/Staff  see Success message  New User Created  is  Should be Saved.

