Feature: Delete Functionality

  Background: Admin Logged on to LMS Website

  Scenario: Verify Delete Functionality
    Given Admin is on Manage Program page delete1 
    When Admin Clicks on any Delete button located on the right side action
    Then Admin see header text as "Delete Confirm"

    Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on any Delete button located on the right side 
    When Admin Clicks on Yes  button 
    Then Admin see Success message "Program Deleted Succesfully"

 Scenario: Click on No  button in Delete Confirm window
 Given Admin Clicks on any Delete button located on the right side 
 When Admin Clicks on No button
 Then Admin can see Program Name not deleted
 
 Scenario: Validate Deleted Program Name
    Given Admin/User/Staff  is on Manage Program page  
    When Admin/User/Staff Enters deleted  Program Name in Search
    Then Admin/User/Staff finds no results
    
    Scenario: User/Staff Validates Delete button
    Given User/Staff is on Manage Program page  
    When User/Staff Clicks on Delete buttton  
    Then User/Staff see a Error message "Only Admin have Access"