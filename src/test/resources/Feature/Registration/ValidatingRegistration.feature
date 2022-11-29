@tag
Feature: Validating the text fields on the Registration page
  
Background: 
Given Admin/User/Staff is on the Registeration Page

  @tag1
  Scenario: Enter the First Name field
    When Admin/User/Staff Enters the First Name in Alphabets only
    Then The First Name will be displayed
    
    @tag2
    Scenario: Enter the Last Name Field
    When Admin/User/Staff Enters the Last Name in Alphabets only
    Then The Last Name will be displayed
    
    @tag3
    Scenario: Enter the Address Field
    When Admin/User/Staff Enters the Address Field using Alpha Numerics and /or Symbols
    Then The Address will be displayed
    
    @tag4
    Scenario: Enter the Street Name Field
    When Admin/User/Staff Enters the Street name Field using Alpha Numerics and or Symbols
    Then The Street Name will be displayed
    
    @tag5
    Scenario: Enters the Zip field
    When Admin/User/Staff Enters the 5 digit Zip code using Numbers only
    Then The Zip code will be displayed
    
    @tag6
    Scenario: Enters the City field
    When Admin/User/Staff Enters the City Name in Alphabets only
    Then The City will be displayed
    
    @tag7
    Scenario: Selects the State field
    When Admin/User/Staff selects the respective State Name from the DropBox
    Then The State Name will be displayed
    
    @tag8
    Scenario: Enter the Phone Number
    When Admin/User/Staff Enters the valid 10 digit Mobile number in Numerics
    Then The Mobile Number will be displayed
    
    @tag9
    Scenario: Selects the Birth Date
    When Admin/User/Staff Selects the Date of Birth from the Calender
    Then Birth Date will be Displayed
    
    @tag10
    Scenario: Enter valid Password
    When Admin/User/Staff  Enters the valid Password with 1 Upper case, 1 Numeric , 1 special charecter , 8 charecters
    Then Admin/User/Staff Password will be displayed
    
    @tag11
    Scenario: Enter Valid UserName
    When Admin/User/Staff Enters the valid UserName
    Then Admin/User/Staff UsesrName will be displayed
    
    @tag12
    Scenario: Enter Valid Email
    When Admin/User/Staff Enters the valid Email
    Then Admin/User/Staff Email will be displayed
    
    @tag13
     Scenario: Validating the Sign Up form with all fields empty
    When Admin/User/Staff enters submit button with all fields empty
    Then Admin/User/Staff should get a message "Enters all fields"
    
    @tag14
     Scenario: Validating the First Name field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid First Name
    Then Admin/User/Staff should get a message"Enter valid First Name "
    
    @tag15
     Scenario: Validating the Last Name field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Last Name
    Then Admin/User/Staff should get a message"Enter valid Last Name"
    
    @tag16
     Scenario: Validating the Address field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Address by not Providing House Number
    Then Admin/User/Staff should get a message "Enter valid Address"
    
    @tag17
     Scenario: Validating the Street Name field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Street Name
    Then Admin/User/Staff should get a message "Enter valid Street Name"
    
    @tag18
     Scenario: Validating the Zip field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Zip
    Then Admin/User/Staff should get a message "Enter valid Zip"
    
    @tag19
     Scenario: Validating the City field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid City
    Then Admin/User/Staff should get a message "Enter valid City"
    
    @tag20
     Scenario: Validating the State field on Registeration Page
    When Admin/User/Staff clicks Sign Up button without selecting State
    Then Admin/User/Staff should get a message "State is required"
    
    @tag21
     Scenario: Validating the Phone Number field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Phone Number
    Then Admin/User/Staff should get a message "Enter valid Phone Number"
    
    @tag22
     Scenario: Validating the BirthDate field on Registeration Page
    When Admin/User/Staff clicks Sign Up button without selecting BirthDate
    Then Admin/User/Staff should get a message "BirthDate is required"
    
    @tag23
     Scenario: Validating the UserName field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Admin/User/Staff Name
    Then Admin/User/Staff should get a message"Please Enter valid Admin/User/Staff Name "
    
    @tag24
     Scenario: Validating the Password field on Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Password
    Then Admin/User/Staff should get a message "Enter valid Password"
    
    @tag25
     Scenario: Validating the signup form with existing name
    When User clicks Sign Up button with existing Admin/User/Staff name
    Then Admin/User/Staff should see the message "Admin/User/Staff name already exist"
    
    @tag26
     Scenario: Validating Sign Up form with valid data
    When Admin/User/Staff Clicks on "Sign Up" button after entering all valid details.
    Then Admin/User/Staff should get a message"Registeration successful"
    