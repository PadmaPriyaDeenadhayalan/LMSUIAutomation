 	@tag
  Feature: Login-Valid Credentials
  
  Background: Admin/User/Staff opens the LMS website
	
	
  Scenario: Login with valid credentials
    Given User is on Login Page
    When User clicks login button after entering name and Password 
    Then User see header text as "Manage Program"
		

     Scenario Outline: Admin/Staff login with valid credentials
    Given Admin/staff is on Login Page
    When Admin/Staff  clicks login Button after entering  Username as "<username>" and Password as "<password>" and code as "<code>"  
    Then Admin/Staff see header text as "Manage Program"
    
        Examples:
    | username | password  | code  |
    | Hi			 | Hello     | aaa  | 
    |					 |					 |			|			
      
    