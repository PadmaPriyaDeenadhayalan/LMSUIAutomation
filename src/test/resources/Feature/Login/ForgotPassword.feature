@tag
Feature: Forgot Password

  Background: Admin/User/Staff opens the LMS website
	
	@tag1
  Scenario: Validate forgot password with  email id
    Given Admin/User/Staff is on Forgot Password Page
    When Admin/User/Staff  clicks continue after entering valid email address
    Then Admin/User/Staff should be redirected to enter verification code page and verification code will be sent to email
	
	@tag2
  Scenario: Validate verifiction code
    Given Admin/User/Staff is on Enter verification code Page
    When Admin/User/Staff  clicks continue after entering verification code
    Then Admin/User/Staff should be redirected reset password page
	
	@tag3
  Scenario: Validate click here link in verification code page
    Given Admin/User/Staff is on the enter verification code Page
    When Admin/User/Staff clicks Click here link to resend
    Then The verification code should be resend to email