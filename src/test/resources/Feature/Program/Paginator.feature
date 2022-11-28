
@tag
Feature: Paginator Validation


  @tag1
  Scenario:  Validating the Manage Program Paginator
    Given  Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Program page show
    Then Admin/User/Staff  see the text as "Showing 1 to 5 of 9 entries" 
    
	  
  @tag2
  Scenario: Verify paginator -next button  on the Program page
    Given   Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Clicks on Enabled paginatornext button
    Then Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries"
   
   @tag3
   Scenario:  Verify paginator -prevoius button on the Program page
   Given  Admin/User/Staff is on Manage Program page
   When Admin/User/Staff Clicks on Enabled paginatorprev button	
   Then Admin/User/Staff see Paginator text as"Showing 1 to 5 of 9 entries"
   
   @tag4
   Scenario: Verify  paginator -last button  on the Program page
	 Given 	 Admin/User/Staff is on Manage Program page
	 When 	Admin/User/Staff Clicks on Enabled paginatorlast button
	 Then  Admin/User/Staff see Page number navigated to '2'
	 
	 @tag5
	 Scenario: Verify  paginator -first button  on the Program page
	 Given  Admin/User/Staff is on Manage Program page
	 When  Admin/User/Staff Clicks on Enabled paginatorfirst button	
	 Then 	Admin/User/Staff see Page number navigated to '1'

   