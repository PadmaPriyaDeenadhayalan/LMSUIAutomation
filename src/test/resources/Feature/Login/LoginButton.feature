
@tag
Feature: Login button 
 
  Background: Admin/User/Staff opens the LMS website
	@tag1
  Scenario: Validates the login url
    Given Admin/User/Staff is on Browser
    When Admin/User/Staff opens the LMS website
    Then Admin/user/Staff should be navigated to login page


