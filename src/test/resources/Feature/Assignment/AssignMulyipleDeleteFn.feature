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
Feature: Delete Multiple Records Functionality Assignment
  
 Scenario: Admin/User/Staff Verify the state of Delete button on left hand side of the Assignment Page
    Given Admin/User/Staff Logged on to LMS Website for Assignment
    When Admin/User/Staff select Manage Management page 
    Then Admin/User/Staff check the status of the Delete  button on the top left hand side is Disabled or not in the Manage Assignment
   
 @tag2
  Scenario: Staff Validates Multiple Program Selection on the Manage aAssignment Page
    Given Staff is on Manage Assignment page
    When Staff selects more than one Batch Name using checkbox
    Then Staff check the status Delete button on the top left hand side is Enabled or not
   
   @tag3
  Scenario: Staff Verify Deletion of Multiple Records
    Given Staff is on Manage Assignment page
    When Staff selects more than one Assignment Name using checkbox in the Assignment Page
    And Staff Clicks on Enabled Delete button on the top left hand side of the Assignment Page
    Then Staff receives the confirmation Message as "Delete Confirm" on the Confirmation window
    Then  Staff Clicks on Yes  button for Delete Assignment
    And  Staff view the  Success message  "Program Deleted Succesfully" in the Assignment  Confirmation window
    
  @tag4
   Scenario: Staff Click on No button in Delete Confirm window
    Given Staff is on Manage Assignment page
    When Staff selects more than one Assignment Name using checkbox
    And Staff Clicks on Enabled Delete button on the top left hand side of the Assignment Page
    Then Staff receives the confirmation Message as "Delete Confirm" on the Assignment Confirmation window
    Then  Staff Clicks on No  button for cancel the  Delete function
    And Staff verify selected Assignment Names are not deleted in the Manage Assignment
    
   @tag5
   Scenario: Verify Deleted Assignment Names
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Enters deleted  Assignment Names in Search
   	Then Admin/User/Staff did not see the Deleted Assignment name on the Table.
   	
   	
   	@tag6
   Scenario: Admin/User Verify Deletion of Multiple Records
    Given Admin/User is on Manage Assignment page
    When Admin/User selects more than one Assignment  Name using checkbox
    And Admin/User Cicks on Enabled Delete button on the top left hand side of the Assignment Page
   	Then Admin/User see a Error message "Only Staff have Access" in the Assignmet Confirmation window
    