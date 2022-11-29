@tag
Feature: Delete Multiple Records Functionality

  @tag1
  Scenario: Verify the state of Delete button on left hand side
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff select Manage Program page 
    Then Admin/User/Staff see the Delete button on the top left hand side as Disabled  
   
 @tag2
  Scenario: Validates Multiple Program Selection
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff selects more than one Program Name using checkbox
    Then Admin/User/Staff see the Delete button on the top left hand side as Enabled
   
   @tag3
  Scenario: Verify Deletion of Multiple Records
    Given Admin selects more than one Program Name using checkbox
    When Admin Clicks on Enabled Delete button on the top left hand side
    Then Admin see header text as "Delete Confirm"
    
    @tag4
   Scenario: Click on Yes button in Delete Confirm window
  Given Admin Clicks on Enabled Delete button after selecting  more than one Program Name
   When Admin Clicks on Yes  button
   Then Admin see Success message "Program Deleted Succesfully""

  @tag5
   Scenario: Click on No button in Delete Confirm window
    Given Admin/User/Staff have access and Admin Clicks on Enabled Delete button after selecting  more than one Program Name
    When Admin Clicks on No button
    Then Admin can see Program Names not deleted
    
   @tag5
   Scenario: Verify Deleted program Names
    Given Admin/User/Staff is on Manage program page
    When Admin/User/Staff Enters deleted  Program Names in Search
    Then Admin/User/Staff finds no results
     
     @tag6
   Scenario: Deletion of Multiple Records
    Given User/Staff selects more than one Program Name using checkbox
    When User/Staff Clicks on Enabled Delete button on the top left hand side
    Then User/Staff see a Error message "Only Admin have Access"