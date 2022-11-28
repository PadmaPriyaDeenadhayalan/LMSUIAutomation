@tag
Feature: Sign Up button
  

  @tag1
  Scenario: Validating the Sign Up button visibility
    Given Admin/User/Staff is on LMS website
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees a button with text "Sign Up" on the form