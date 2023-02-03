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
 
Feature: user registration page
 

 
  Scenario: Getting register into page with username and password
  
     Given user open the register page
     
     When The user clicks "Register" button after entering <Username>, <Password> and <confirm_Password>
     Then User get message "Username is not correct"
       
     And It should go to homepage and get message  "New account created.You are logged in as Username"
     
      
    
      
   
   Examples:
   
      | Username       | Password    | confirm_Password | status |
       
      
      | username       | sdet94batch | sdet94batch      | Fail   |
      
      
      | Numpysdet94    | sdet94batch | sdet94batch      | pass   |
     
  
