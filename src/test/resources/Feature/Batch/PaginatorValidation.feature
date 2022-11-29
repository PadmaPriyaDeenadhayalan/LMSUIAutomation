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
Background: Admin/User/Staff Logged on to LMS Website 

@tag1
  Scenario: Validating the Manage Batch Paginator
    Given Admin/User/Staff Logged on to LMS Website 
    When Admin/User/Staff is on Manage Batch page
    Then  Admin/User/Staff  see the text as "Showing 1 to 5 of 21 batches." 

  @tag2
  Scenario: Verify paginatornext button  on the Batch page
    Given  Admin/User/Staff is on Manage Batch page for search
    When Admin/User/Staff Clicks on Enabled paginatornext button
    Then  Admin/User/Staff see Paginator text as "Showing 6 to 10 of 21 batches."
    
    @tag3
  Scenario: Verify paginatorprevoius button on the Batch page 
    Given  Admin/User/Staff is on Manage Batch page for search
    When Admin/User/Staff Clicks on Enabled paginatorprev button
    Then Admin/User/Staff  see the text as "Showing 1 to 5 of 21 batches." 
    
    @tag4
  Scenario: Verify paginatorlast button on the Batch page 
    Given  Admin/User/Staff is on Manage Batch page for search
    When Admin/User/Staff Clicks on Enabled paginatorlast button
    Then  Admin/User/Staff see Page number navigated to '5'
    
        
    @tag5
  Scenario: Verify paginatorfirst button on the Batch page 
    Given Admin/User/Staff is on Manage Batch page for search
    When Admin/User/Staff Clicks on Enabled paginatorfirst button
    Then Admin/User/Staff see Pagenavigated to '1'

   