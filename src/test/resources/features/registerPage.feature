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
@register
Feature: user registration page
  
   @TS_register_01
   Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error message "Please fill out this field." below Username textbox

  @TS_register_02
  Scenario: The user is presented with error message for empty fields below Password textbox
    Given The user opens Register Page
    When The user  enters "username" with other fields empty and user clicks register button 
       | username       | 
       | Numphysdet94NN |		 
    Then It should display an error message "Please fill out this field." below Password textbox

  @TS_register_03
  Scenario: The user is presented with error message for empty fields below confirm Password textbox
    Given The user opens Register Page
    When The user  enters "username" and "password" with Password Confirmation field empty and user clicks register button
       | username       | password 		| 
       | Numphysdet94NN | sdet94batchNN |	   	      	   
    Then It should display an error message "Please fill out this field." below Password Confirmation textbox

  @TS_register_04
  Scenario: The user is presented with error message for invalid username
    Given The user opens Register Page
    When The user enters a "username" with characters other than Letters, digits and @/./+/-/_   with "password" and "confirm_password" and user clicks register button
      | username | password       | confirm_password |
      | &**&**&  | sdet94batchNN  | sdet94batchNN    |
    Then It should display an error message "Please enter a valid username"

  @TS_register_05
  Scenario: The user is presented with error message for password mismatch
    Given The user opens Register Page
    When The user enters "username" and different passwords in "password" and "confirm_password" fields and user clicks register button
      | username       | password      | confirm_password |
      | Numphysdet94NN | sdet94batchNN | password         |
    Then It should display an error message "password_mismatch:The two password fields didn’t match."

  @TS_register_06
  Scenario: The user is presented with error message for password with characters less than 8
    Given The user opens Register Page
    When The user enters "username" and "password" with characters less than eight and "confirm_password" and user clicks register button
      | username       | password | confirm_password |
      | Numphysdet94NN | sdet94   | sdet94           |
    Then It should display an error message "Password should contain at least 8 characters"

  @TS_register_07
  Scenario: The user is presented with error message for password with only numbers
    Given The user opens Register Page
    When The user enters "username" and   "password" with only numbers and "confirm_password" and user clicks register button
      | username       | password | confirm_password |
      | Numphysdet94NN | 12345678 |   12345678       |
    Then It should display an error message "Password can’t be entirely numeric."

     @TS_register_8 
   Scenario Outline: Getting register into page with username and password 
     Given The user opens Register Page
     When The user clicks Register button after entering "<username>", "<password>" and "<confirm_password>"     
     Then It should go to homepage and get message  "New account created.You are logged in as Username"
  	 Examples:   
      | username        | password      | confirm_password |
      | user94name      | sdet		    | sdet94batch      |              
      | Numphysdet94NN  | sdet94batchNN | sdet94batchNN    | 

  @TS_register_9
  Scenario: The user is presented with error message for existing username
    Given The user opens Register Page
    When The user enters a valid existing "username" with "password" and "confirm_password"
      | username       | password      | confirm_password |
      | Numphysdet94NN | sdet94batchNN | sdet94batchNN    |
    Then It should display an error message "Username already exists"
 
 
     
  
