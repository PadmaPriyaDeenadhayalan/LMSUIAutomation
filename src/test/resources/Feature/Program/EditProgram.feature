@tag
Feature: Edit Functionality

  @tag1
  Scenario: Validates Edit button in Program Details window
    Given Admin is on Manage Program page
    When Admin Clicks on Edit buttton
    Then Admin see header text as "Program Details"

  @tag2
  Scenario: Edit Program Name in Program Details window
    Given Admin Clicks on "Edit" button
    When Admin Clicks on Save Button after updating Name
    Then Admin see Success message "Updated Program Name"

  @tag3
  Scenario: Edit Program Description in Program Details window
    Given Admin Clicks on "Edit" button
    When Admin  Clicks on Save Button after updating  Description
    Then Admin see Success message"Updated Description"

  @tag4
  Scenario: Edit Program Status in Program Details window
    Given Admin Clicks on "Edit" button
    When Admin  Clicks on Save Button after Changing  status
    Then Admin see Success message "Updated Status"

  @tag5
  Scenario: Click on Cancel button in Program Details window
    Given Admin  Clicks on "Edit" button record edit
    When Admin Clicks on Cancel button
    Then Admin see a Program Details window getting closed

  @tag6
  Scenario: User/Staff Validate Edit button
    Given User/Staff is on Manage Program page for edit
    When User/Staff Clicks on Edit buttton
    Then User/Staff see a Error message  "Only Admin have Access" aspopup

  @tag7
  Scenario: Verifys Edited Program Name/Program Description
    Given Admin/User/Staff is on Manage Program page edit3
    When Admin/User/Staff Enters edited Program Name in Search
    Then Entry for the edited  Program Name is shown