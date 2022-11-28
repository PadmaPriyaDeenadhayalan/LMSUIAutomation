
@tag
Feature: Reset Password

  Background: Admin/User/Staff opens the LMS website
 When Admin/User/Staff clicks submit button after entering new password and retype password 
 
  @tag1
  Scenario: Validate Reset password
    Given Admin/User/Staff is on Reset Password Page
   #When Admin/User/Staff clicks submit button after entering new password and retype password 
    Then Admin/User/Staff  should be redirected to login page
  
  @tag2  
  Scenario: Validate Reset password on mismatch
    Given Admin/User/Staff is on Reset Password Page
   # When Admin/User/Staff  clicks submit button after entering new password and retype password 
    Then Admin/User/Staff  should see an error message "password and retype password are mismatched"
  
  @tag3  
  Scenario: Validate Reset password with lessthan 8 characters
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering password  with less than 8 characters
    Then It should display an error message "The password must contain 8 characters"
	
	@tag4
  Scenario: Validate Reset password without capital letter
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering password without Capital letter 
    Then It should display an error message "The password must contain one Capital letter"
	
	@tag5
  Scenario: Validate Reset password without number
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering  password without Number
    Then It should display an error message "The password must contain one Number"
 	
 	@tag6   
  Scenario: Validate Reset password without special character
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering password without Special character
    Then It should display an error message "The password must contain one Special character"
	
	@tag7
  Scenario: Validate Reset password with cancel button
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks cancel button after entering new password and retype password 
    Then Admin/User/Staff  should see a refreshed reset password page with empty fields