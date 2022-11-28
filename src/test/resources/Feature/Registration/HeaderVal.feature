@tag
Feature: Registrationpage Header Validation
 
  @tag1
   Scenario: Validating the heading of registration form
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees the heading on the form as "Registration Form"