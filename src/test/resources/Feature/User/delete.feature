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
@tag
Feature: Delete Icon

  @tag1
  Scenario: Verify the presence of Delete icon in manage user page
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staffis on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the delete icon at the top left corner of the user table

@tag2
  Scenario: Behaviour of Delete icon when no rows unchecked
    Given Admin/User/Staff table is displayed in manage user page
    When No rows is checked
    Then Delete icon at the top left corner of the user table disabled
    
    @tag3
  Scenario: Behaviour of Delete icon when rows checked
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff checking the rows in user table
    Then Delete icon at the top left corner of the user table enabled
    
    @tag4
  Scenario: Behaviour of Delete icon when rows checked
    Given Admin/User/Staff checks the rows in user table
    When Admin/User/Staff clicks the delete icon at the top left corner of user table
    Then Confirm dialog box should be displayed with Text Are you sure you want to delete the selected Admin/User/Staffs? , button with text No , the button with text yes and close(X) icon
    
     @tag5
  Scenario: Validating Confirm dialog box by selecting No
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks button with text No
    Then Selected rows should not be deleted and dialog box should be closed
    
    @tag6
  Scenario: Validating Confirm dialog box by selecting Yes
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks button with text Yes
    Then Selected rows should be deleted and popup should be shown with success message User deleted
    
    @tag7
  Scenario: Validating Confirm dialog box by clicking close(x) icon
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks the close(x) icon
    Then Confirm dialog box should be closed
