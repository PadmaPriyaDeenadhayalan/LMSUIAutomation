Feature: Search TextBox Functionality

  Background: Admin/User/Staff Logged on to LMS Website
   
   @tag 
  Scenario: Validate Search Feature
    Given Admin/User/Staff Loggedon to LMS Website
    When Admin/User/Staff is on Manage Program Page for search
    Then Admin/User/Staff see the Search Text box has text as "Search"
@tag1
  Scenario: Search by  Program Name
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff enters Program Name to be searched
    Then Entries for the searched Program Name are shown.
@tag2
  Scenario: Search by Program Description
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff enters Program Description to be searched
    Then Entries for the searched Program Description are shown.
@tag3
  Scenario: Search by  Program Status
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff enters Program Status to be searched
    Then Entries for the searched Program Status are shown.