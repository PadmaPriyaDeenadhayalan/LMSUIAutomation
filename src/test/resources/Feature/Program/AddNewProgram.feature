@tag
Feature: Add A New Program Functionality

Background: Admin Logged on to LMS Website
 Given Admin Clicks on the "A New Program" buttons

@tag1
  Scenario: Validate Add A New Program button
  Given Admin is on Manage Program page
  When Admin Clicks on the " A New Program" button
  Then Admin see header text as "Program Details"
  
  @tag2
  Scenario: No details Entered in Program Details window
 # Given Admin Clicks on "A New Program" button
  When Admin Clicks on Save Button with out entering  details 
  Then Admin see Error message "Name is required"
 
  
  @tag3
  Scenario: Enters  All details in Program Details window
 # Given Admin Clicks on "A New Program" button
  When Admin Clicks on Save Button after entering all details
	Then Admin see Success message "New Program Created"
	
	@tag4
	Scenario: Enters Only Name in Program Details window
	#Given Admin Clicks on "A New Program" button
	When Admin Clicks on Save Button after entering Name alone
	Then Admin see Error message "Description is required"
	
	@tag5
	Scenario: Admin see Error message "Description is required"
	#Given Admin Clicks on "A New Program" button
	When Admin Clicks on Save Button after entering Description alone
	Then Admin see Error message "Name is required"
	
	@tag6
	Scenario: Selects Only Status in Program Details window
	#Given Admin Clicks on "A New Program" button
	When Admin Clicks on Save Button after selecting Status alone 
	Then Admin see Error message "Name is required"
	
	@tag7
	Scenario: Click on Cancel button in Program Details window
	Given Admin Clicks on  "A New Program" button
	When Admin Clicks on Cancel button
	Then Admin see a Program Details window getting closed
	
	#Background: Admin/User/Staff Logged on to LMS Website
	
	@tag8
	Scenario: Verify Added New Program Name
	Given Admin/User/Staff is on Manage Program page 
	When Admin/User/Staff Enters newly added  Program Name in Search
	Then Entry for the newly added Program Name is shown
	
	#Background: User/Staff Logged on to LMS Website
	
	@tag9
	Scenario: User/Staff Validate Add A New Program button
	Given User/Staff is on Manage Program page
	When User/Staff Clicks on  " + A New Program" button
	Then User/Staff see a Error message "Only Admin have Access"











