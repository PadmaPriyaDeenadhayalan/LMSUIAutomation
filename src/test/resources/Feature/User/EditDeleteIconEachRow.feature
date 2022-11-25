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
Feature: Edit/Delete icon in each row

  @tag1
  Scenario: Validate the presence of Edit/Delete icon
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the buttons with edit/delete icon in each row of Edit/Delete column

@tag2
  Scenario: Validate Functionality of delete button
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks delete button
    Then Confirm dialog box should be displayed with Text Are you sure you want to delete (selected user name) ? , button with text No , the button with text yes and close(X) icon
 
@tag3
  Scenario: Updating with Edit button
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks Edit button
    Then User Details dialog box should be displayed for editing