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
Feature: Delete Multiple Records Functionality
Validate the Multiple Delete button action
Delete multiple Batches at a time and confirm the delete function


  @tag1
  Scenario: Verify the state of Delete button on left hand side
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff select Manage Batch page 
    Then Admin/User/Staff check the status of the Delete  button on the top left hand side is Disabled or not 
   
 @tag2
  Scenario: Validates Multiple Program Selection
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff selects more than one Batch Name using checkbox
    Then Admin/User/Staff check the status Delete button on the top left hand side is Enabled or not
   
   @tag3
  Scenario: Verify Deletion of Multiple Records
    Given Admin/User/Staff is on Manage Batch page
    When Admin selects more than one Batch Name using checkbox
    And Admin Clicks on Enabled Delete button on the top left hand side
    Then Admin receives the confirmation Message as "Delete Confirm"
    Then  Admin Clicks on Yes  button
    And  Admin see Success message as "Program Deleted Succesfully"
   
  @tag4
   Scenario: Click on No button in Delete Confirm window
    Given Admin/User/Staff is on Manage Batch page
    When Admin selects more than one Batch Name using checkbox
    And Admin Clicks on Enabled Delete button on the top left hand side
    Then Admin receives the confirmation Message as "Delete Confirm"
    Then  Admin Clicks on No  button
    And  Admin verify selected Program Names are not deleted
    
   @tag5
   Scenario: Verify Deleted Batch Names
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Enters deleted  Program Names in Search
   	Then Admin/User/Staff did not see the name on the Table.
   	
   	
   	@tag6
   Scenario: User/Staff Verify Deletion of Multiple Records
    Given Admin/User/Staff is on Manage Batch page
    When User/Staff selects more than one Batch  Name using checkbox
    And User/Staff Cicks on Enabled Delete button on the top left hand side
   	Then User/Staff see a Error message "Only Admin have Access"
    
    
          
