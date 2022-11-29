#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Add A New Assignment in a Manage Assignment Table

  
 Scenario Outline:  Verify ADD New Assignment Function
  Given Staff is on Manage Assignment page
  When Staff Clicks on   + A New Assignment button  for Validation
  And Staff enters AssignmentName as "<AssginmentName>"  and AssignmentDescription as "<ADescription>" and AssignmentDuedate as "<ADuedate>" and AssignmentGrade as "<AGrade>"
  When Staff Clicks on Assignment Save button  
  Then Staff see Error  Status message "Status Message" on the Manage Assignment Page
      
       Examples:
   
      | AssignmentName  | ADescription 		| ADuedate 	 |AGrade	| 
      | AssignName  		| DescriptionName | AssDuedate |AGrade 	|  
      | AssignName      |  		      |        |    |
      |             | ADescription    |        |    |  
      |           |             |    ADuedate |   | 
      |            |           |         |AGrade |
      |             |          |         |     |  