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
Feature: input fields

  @tag1
  Scenario: Verify the presence of input fields
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the input fields for First name,Middle name, Last name,Email adress,Phone no, Address,City, State,Postal Code.Program,UG Program,PG Program,Skill,Experience,Admin/User/Staff Role,Visa status,Batch,Comments corresponding to their labels

@tag2
  Scenario: Validating the User Details window with few fields empty
    Given Admin/User/Staff is on User Detailswindow
    When Admin/User/Staff clicks on Submit button after entering  Few Field details 
    Then Admin/User/Staff see error message Name is required
    
   @tag3
  Scenario: Validating the Email address
    Given Admin/User/Staff is on User Detailswindow
    When Admin/User/Staff clicks on Submit button after entering wrong email address
    Then Admin/User/Staff see error message Invalid Email address

  @tag4
  Scenario: Validating the presence of Address2 button
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the button with text + Add C/O, Apt, Suite, Unit
    
    @tag5
  Scenario: Validating the Phone number
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters more than Ten digits
    Then Admin/User/Staff see error message Invalid Input
    
    @tag6
  Scenario: Validating Postal Code
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters more than five digits
    Then Admin/User/Staff see error message Invalid Input

  @tag7
  Scenario: Validating State dropdown
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks on state dropdown
    Then Admin/User/Staff see list of states in Alphabetical Order
    
   @tag8
  Scenario: Validating UG Program Dropdown 
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks on UG Program dropdown
    Then Admin/User/Staff see list of UG Program 
    
    @tag9
  Scenario: Validating Address line  in User Details window
    Given Admin/User/Staff is on User Detailswindow
    When Admin/User/Staff clicks the button + Add C/O, Apt, Suite, Unit
    Then Admin/User/Staff should see the input field with Label New Address2 
