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
Feature: Page,Header and Footer Validation

Background: Admin/User/Staff Logged on to LMS website

  @tag1
  Scenario: Validate landing in Manage page
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff clicks the Tab User
    Then Admin/User/Staff should see the Manage user page
    
   
  @tag2
  Scenario: Validate the Manage page heading
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the page heading as Manage User
    
     @tag3
  Scenario: Validating table footer
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff lands on Manage User page
    Then Admin/User/Staffshould see the table footer as "In total there are 4 users".
