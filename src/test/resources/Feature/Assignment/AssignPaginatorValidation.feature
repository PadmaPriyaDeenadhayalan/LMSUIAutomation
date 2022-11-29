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
Feature: Paginator Validation


@tag1
  Scenario: Validating the Manage Assignmentpage Paginator
    Given Admin/User/Staff Logged on to LMS Website for Assignment
    When Admin/User/Staff clicks  the Assignment link
    Then  Admin/User/Staff  see the Paginator text as "Showing 1 to 3 of 3 entries" 

  @tag2
  Scenario: Verify paginatornext button  on the Assignment page
    Given  Admin/User/Staff is on Manage Assignment page 
    When Admin/User/Staff Clicks on Enabled AssignmentPaginatornext button
    Then  Admin/User/Staff navigated to Assignment next page
    
    @tag3
  Scenario: Verify paginatorprevoius button on the Batch page 
    Given  Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff Clicks on Enabled Assignmentpaginatorprev button
    Then Admin/User/Staff navigated to Assignment previous page  
    
    @tag4
  Scenario: Verify paginatorlast button on the Assignment page 
    Given  Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff Clicks on Enabled Assignmentpaginatorlast button
    Then  Admin/User/Staff  navigated to lastpage of Assignment
    
        
    @tag5
  Scenario: Verify paginatorfirst button on the Assignment page 
    Given Admin/User/Staff is on Manage Assignment page 
    When Admin/User/Staff Clicks on Enabled Assignmentpaginatorfirst button
    Then Admin/User/Staff navigated to Startingpage of Assignment
