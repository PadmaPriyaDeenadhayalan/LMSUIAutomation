@tag
Feature: Ascending order Functionality

Background: Admin/User/Staff Logged on to LMS Website


	 @tag1
  Scenario:   Verify Program Name are displayed in Ascending order
  Given  Admin/User/Staff is on Manage Program page
  When  Admin/User/Staff Clicks on Program Name Ascending Arrow
  Then  Admin/User/Staff see the Program Name displayed in Ascending order
  
  @tag2
  Scenario: Verify Program Description are displayed in Ascending order
  Given  Admin/User/Staff is on Manage Program page
  When  Admin/User/Staff Clicks on Program Description Ascending Arrow
  Then   Admin/User/Staff see the Program Description displayed in Ascending order
  
  @tag3
  Scenario:  Verify Program Status are displayed in Ascending order
  Given  Admin/User/Staff is on Manage Program page
 	When Admin/User/Staff Clicks on Program Status Ascending Arrow
  Then Admin/User/Staff see the Program Status displayed in Ascending order