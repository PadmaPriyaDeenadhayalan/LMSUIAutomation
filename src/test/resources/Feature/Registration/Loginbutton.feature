@tag
Feature: Registration page Login button
 

  @tag1
  Scenario: Validating the Login button visibility
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees a button with text "Log in" on the form


  @tag2
  Scenario: Validating the Login button functionality
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff selects the Log in button
    Then Admin/User/Staff lands on Log in page
