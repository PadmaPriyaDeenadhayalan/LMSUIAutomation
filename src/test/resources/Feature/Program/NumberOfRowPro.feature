@tag
Feature: Number of rows in a Table

   Background: Admin/User/Staff Logged on to LMS Website 
 @tag1
  Scenario: Validate Number of rows in a table
    Given  Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Program page for noofrows
    Then Admin/User/Staff counts number of rows as 5 in a table