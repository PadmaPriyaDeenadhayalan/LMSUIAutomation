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
Feature: Search

  @tag1
  Scenario: Verify the presence of Input field for searching
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then  Admin/User/Staff see the Search Text box has text as Search.

@tag2
  Scenario: Verify the presence of search icon and text in the search input filed
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking UserTab
    Then  Admin/User/Staff should see the search input field with search icon and text as" Search…"
 
@tag3
  Scenario: Verify the functionality of search
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff types Name to "search"
    Then  Rows with the "name" should be displayed
    
    @tag4
  Scenario: Verify the functionality of search
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff types random text in search field which has no matching entry
    Then  No rows is displayed