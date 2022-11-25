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
Feature: Pagination

  @tag1
  Scenario: Validate the presence of pagination
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the pagination controls below data table
    
     @tag2
  Scenario: Validate the Pagination control with less rows
    Given Admin/User/Staff is on Manage user page
    When Manage user table has less than or equal to 5 rows
    Then Pagination control should be disabled
    
    @tag3
  Scenario: Validate the Pagination control with more than 5 rows
    Given Admin/User/Staff is on Manage user page
    When Manage user table has more than 5 rows
    Then Pagination control should be enabled
    
    @tag4
  Scenario: Verify pagination next link
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks next link of pagination
    Then Next page should be displayed
    
     @tag5
  Scenario: Verify pagination next link after last record of user table
    Given last page of Admin/User/Staff records are displayed
    When Admin/User/Staff clicks next link of pagination
    Then Next link of pagination should be disabled

 @tag6
  Scenario: Verify pagination Previous link
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks previous link of pagination
    Then previous page should be displayed
    
    @tag7
  Scenario: Verify pagination previous link in first page of user table
    Given First page of user table is displayed
    When Admin/User/Staff clicks previous link of pagination
    Then Previous link of pagination should be disabled
    
    @tag8
  Scenario: Verify button with << icon
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks << icon in pagination
    Then Admin/User/Staff clicks should see the First page of the table
    
    @tag9
  Scenario: Verify button with >> icon
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks >> icon in pagination
    Then Admin/User/Staff clicks should see the last page of the table
    
    @tag10
  Scenario: Verifiy the entry details below data table
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff lands on Manage User page
    Then Admin/User/Staff should see the text "Showing 1 to 4 of 4 entries" beow the user table.
